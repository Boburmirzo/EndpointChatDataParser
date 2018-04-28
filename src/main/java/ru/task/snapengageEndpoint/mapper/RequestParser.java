package ru.task.snapengageEndpoint.mapper;

import com.google.gson.*;
import ru.task.snapengageEndpoint.datatransferobject.*;
import ru.task.snapengageEndpoint.domainobject.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
public class RequestParser {

    private static final String REQUESTER_KEY = "requester_details";
    private static final String TRANSCRIPTS_KEY = "transcripts";
    private static final String PLUGINS_KEY = "plugins";
    private static final String JAVASCRIPT_VARIABLES_KEY = "javascript_variables";
    private static final String OPERATOR_VARIABLES_KEY = "operator_variables";

    public static RequestDO makeRequestDO (RequestDTO requestDTO){

        RequestDO requestDO = new RequestDO(requestDTO.getId(),
                requestDTO.getWidgetId(),
                requestDTO.getUrl(),
                requestDTO.getSnapshotImageUrl(),
                requestDTO.getType(),
                requestDTO.getRequestedBy(),
                makeRequestDetailsDO(requestDTO.getRequesterDetailsDTO()),
                requestDTO.getDescription(),
                requestDTO.getCreatedAtDate(),
                requestDTO.getCreatedAtSeconds(),
                requestDTO.getCreatedAtMilliseconds(),
                requestDTO.getProactiveChat(),
                requestDTO.getPageUrl(),
                requestDTO.getReferrerUrl(),
                requestDTO.getEntryUrl(),
                requestDTO.getIpAddress(),
                requestDTO.getUserAgent(),
                requestDTO.getBrowser(),
                requestDTO.getOs(),
                requestDTO.getCountryCode(),
                requestDTO.getCountry(),
                requestDTO.getRegion(),
                requestDTO.getCity(),
                requestDTO.getLatitude(),
                requestDTO.getLongitude(),
                requestDTO.getSourceId(),
                requestDTO.getChatWaittime(),
                requestDTO.getChatDuration(),
                requestDTO.getChatEndedBy(),
                requestDTO.getLanguageCode());
        requestDO.setTranscriptDOList(makeTranscriptDOList(requestDTO.getTranscripts(),requestDO));
        requestDO.setPluginDOList(makePluginDOList(requestDTO.getPlugins(),requestDO));
        requestDO.setJavascriptVariableDOList(makeJavascriptVariableDOList(requestDTO.getJavascriptVariableDTOS(),requestDO));
        requestDO.setOperatorVariableDOList(makeOperatorVariableDOList(requestDTO.getOperatorVariableDTOS(),requestDO));

        return requestDO;
    }

    public static RequestDTO makeRequestDTOFromJsonString(String request){
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        RequestDTO requestDTO = gson.fromJson(request, RequestDTO.class);
        requestDTO.setRequesterDetailsDTO(getRequesterDetailsDTO(request,gson));
        requestDTO.setTranscripts(getTranscriptDTO(request,gson));
        requestDTO.setPlugins(getPluginDTO(request,gson));
        requestDTO.setJavascriptVariableDTOS(getJavascriptVariableDTO(request,gson));
        requestDTO.setOperatorVariableDTOS(getOperatorVariableDTO(request,gson));
        return requestDTO;
    }

    private static RequesterDetailsDO makeRequestDetailsDO(RequesterDetailsDTO requesterDetailsDTO){
        if(requesterDetailsDTO!=null)
            return new RequesterDetailsDO(requesterDetailsDTO.getName(),
                    requesterDetailsDTO.getEmails(),
                    requesterDetailsDTO.getNameProfileLink(),
                    requesterDetailsDTO.getPhones(),
                    requesterDetailsDTO.getAddress(),
                    requesterDetailsDTO.getAddress2(),
                    requesterDetailsDTO.getCity(),
                    requesterDetailsDTO.getState(),
                    requesterDetailsDTO.getZip(),
                    requesterDetailsDTO.getCountry(),
                    requesterDetailsDTO.getCompanyName(),
                    requesterDetailsDTO.getCompanyProfileLink(),
                    requesterDetailsDTO.getEmployees(),
                    requesterDetailsDTO.getRevenue(),
                    requesterDetailsDTO.getTitle(),
                    requesterDetailsDTO.getWebsite(),
                    requesterDetailsDTO.getSocialProfileLinks(),
                    requesterDetailsDTO.getGender(),
                    requesterDetailsDTO.getAge(),
                    requesterDetailsDTO.getInfluencerScore(),
                    requesterDetailsDTO.getNotes(),
                    requesterDetailsDTO.getIndustry(),
                    requesterDetailsDTO.getAvatars(),
                    requesterDetailsDTO.getOtherData());
        else
            return null;
    }


    private static List<TranscriptDO> makeTranscriptDOList(List<TranscriptDTO> transcriptDTOList, RequestDO requestDO){
        return transcriptDTOList.stream().map(transcriptDTO -> new TranscriptDO(transcriptDTO.getId(),
                transcriptDTO.getDate(),
                transcriptDTO.getDateSeconds(),
                transcriptDTO.getDateMilliseconds(),
                transcriptDTO.getAlias(),
                transcriptDTO.getMessage(),
                requestDO)).collect(Collectors.toList());

    }

    private static List<PluginDO> makePluginDOList(List<PluginDTO> pluginDTOList, RequestDO requestDO){
        return pluginDTOList
                .stream()
                .filter(Objects::nonNull)
                .map(pluginDTO -> new PluginDO(pluginDTO.getName(),
                        pluginDTO.getValue(),
                        requestDO)).collect(Collectors.toList());
    }

    private static List<JavascriptVariableDO> makeJavascriptVariableDOList(List<JavascriptVariableDTO> javascriptVariableDTOList, RequestDO requestDO){
        return javascriptVariableDTOList
                .stream()
                .filter(Objects::nonNull)
                .map(javascriptVariableDTO -> new JavascriptVariableDO(javascriptVariableDTO.getName(),
                        javascriptVariableDTO.getValue(),
                        requestDO)).collect(Collectors.toList());
    }

    private static List<OperatorVariableDO> makeOperatorVariableDOList(List<OperatorVariableDTO> operatorVariableDTOList, RequestDO requestDO){
        return operatorVariableDTOList
                .stream()
                .filter(Objects::nonNull)
                .map(operatorVariableDTO -> new OperatorVariableDO(operatorVariableDTO.getName(),
                        operatorVariableDTO.getValue(),
                        requestDO)).collect(Collectors.toList());
    }

    public static RequesterDetailsDTO getRequesterDetailsDTO(String json, Gson gson) {
        JsonParser jp = new JsonParser();
        JsonElement element = jp.parse(json);
        RequesterDetailsDTO result = null;
        if (element.isJsonObject()) {
            JsonObject obj = element.getAsJsonObject();
            JsonElement candidate = obj.get(REQUESTER_KEY);
            result = gson.fromJson(candidate, RequesterDetailsDTO.class);
        }
        return result;
    }

    public static List<TranscriptDTO> getTranscriptDTO(String json, Gson gson) {

        JsonParser jp = new JsonParser();
        JsonElement element = jp.parse(json);

        List<TranscriptDTO> result = new ArrayList<>();
        if (element.isJsonObject()) {
            JsonObject obj = element.getAsJsonObject();
            JsonArray candidates = obj.getAsJsonArray(TRANSCRIPTS_KEY);
            if (candidates != null && candidates.size() > 0) {
                for (JsonElement e : candidates) {
                    TranscriptDTO transcript = gson.fromJson(e.toString(),TranscriptDTO.class);
                    result.add(transcript);
                }
            }
        }
        return result;
    }

    public static List<JavascriptVariableDTO> getJavascriptVariableDTO(String json, Gson gson) {

        JsonParser jp = new JsonParser();
        JsonElement element = jp.parse(json);

        List<JavascriptVariableDTO> result = new ArrayList<>();

        if (element.isJsonObject()) {
            JsonObject obj = element.getAsJsonObject();
            JsonArray candidates = obj.getAsJsonArray(JAVASCRIPT_VARIABLES_KEY);

            if (candidates != null && candidates.size() > 0) {
                for (JsonElement e : candidates) {
                    JavascriptVariableDTO javascriptVariableDTO = gson.fromJson(e.toString(),JavascriptVariableDTO.class);
                    result.add(javascriptVariableDTO);
                }
            }
        }
        return result;
    }

    public static List<PluginDTO> getPluginDTO(String json, Gson gson) {

        JsonParser jp = new JsonParser();
        JsonElement element = jp.parse(json);

        List<PluginDTO> result = new ArrayList<>();

        if (element.isJsonObject()) {
            JsonObject obj = element.getAsJsonObject();
            JsonArray candidates = obj.getAsJsonArray(PLUGINS_KEY);

            if (candidates != null && candidates.size() > 0) {
                for (JsonElement e : candidates) {
                    PluginDTO pluginDTO = gson.fromJson(e.toString(),PluginDTO.class);
                    result.add(pluginDTO);
                }
            }
        }
        return result;
    }

    public static List<OperatorVariableDTO> getOperatorVariableDTO(String json, Gson gson) {

        JsonParser jp = new JsonParser();
        JsonElement element = jp.parse(json);

        List<OperatorVariableDTO> result = new ArrayList<>();

        if (element.isJsonObject()) {
            JsonObject obj = element.getAsJsonObject();
            JsonArray candidates = obj.getAsJsonArray(OPERATOR_VARIABLES_KEY);

            if (candidates != null && candidates.size() > 0) {
                for (JsonElement e : candidates) {
                    OperatorVariableDTO operatorVariableDTO = gson.fromJson(e.toString(),OperatorVariableDTO.class);
                    result.add(operatorVariableDTO);
                }
            }
        }
        return result;
    }
}

