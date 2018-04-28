package ru.task.snapengageEndpoint.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.task.snapengageEndpoint.datatransferobject.RequestDTO;
import ru.task.snapengageEndpoint.domainobject.RequestDO;
import ru.task.snapengageEndpoint.exception.EntityNotFoundException;
import ru.task.snapengageEndpoint.mapper.RequestParser;
import ru.task.snapengageEndpoint.service.RequestChatEntityService;
import ru.task.snapengageEndpoint.utils.SampleJson;

/**
 * Created by bumurzaqov on 28.04.2018.
 */
@Controller
public class EndpointController {

    private final RequestChatEntityService requestChatEntityService;

    public EndpointController(final RequestChatEntityService requestChatEntityService) {
        this.requestChatEntityService = requestChatEntityService;
    }

    @RequestMapping("/") String index(Model model){
        RequestDTO requestDTO = RequestParser.makeRequestDTOFromJsonString(SampleJson.FULL_REQUEST_SAMPLE);
        RequestDO requestDO = RequestParser.makeRequestDO(requestDTO);
        requestChatEntityService.create(requestDO);
        model.addAttribute("entries", requestChatEntityService.listAllRequestChatEntity());
        return "index";
    }

    @RequestMapping("request/{id}")
    public String showRequest(@PathVariable Long id, Model model) throws EntityNotFoundException {
        RequestDO requestDO = requestChatEntityService.find(id);
        model.addAttribute("requestDetail", requestDO.getRequesterDetailsDO());
        model.addAttribute("transcripts", requestDO.getTranscriptDOList());
        model.addAttribute("plugins", requestDO.getPluginDOList());
        model.addAttribute("operatorVariables", requestDO.getOperatorVariableDOList());
        model.addAttribute("javascriptVariable", requestDO.getJavascriptVariableDOList());
        return "requestshow";
    }

}
