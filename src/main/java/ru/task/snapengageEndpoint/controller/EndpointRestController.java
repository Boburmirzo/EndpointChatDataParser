package ru.task.snapengageEndpoint.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.task.snapengageEndpoint.datatransferobject.RequestDTO;
import ru.task.snapengageEndpoint.domainobject.RequestDO;
import ru.task.snapengageEndpoint.mapper.RequestParser;
import ru.task.snapengageEndpoint.service.RequestChatEntityService;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by bumurzaqov on 28.04.2018.
 */
@RestController
@RequestMapping(path = "/request/v1")
public class EndpointRestController {

    private final RequestChatEntityService requestChatEntityService;

    public EndpointRestController(final RequestChatEntityService requestChatEntityService) {
        this.requestChatEntityService = requestChatEntityService;
    }
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    @PostMapping
    public void createEvent(@Valid @RequestBody String request) {
        RequestDO requestDO = RequestParser.makeRequestDO(RequestParser.makeRequestDTOFromJsonString(request));
        requestChatEntityService.create(requestDO);
    }

    @RequestMapping(value = "/newEntry", method = RequestMethod.POST)
    public void newEntry(@RequestBody String payload) {
        RequestDO requestDO = RequestParser.makeRequestDO(RequestParser.makeRequestDTOFromJsonString(payload));
        requestChatEntityService.create(requestDO);
    }

    @ResponseBody
    @GetMapping
    public List<RequestDTO> fetchEvents() {
        requestChatEntityService.listAllRequestChatEntity().forEach(System.out::println);
        return null;
    }
}
