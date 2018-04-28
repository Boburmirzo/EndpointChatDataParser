
package ru.task.snapengageEndpoint.datatransferobject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "widget_id",
    "url",
    "snapshot_image_url",
    "type",
    "requested_by",
    "requester_details",
    "description",
    "created_at_date",
    "created_at_seconds",
    "created_at_milliseconds",
    "proactive_chat",
    "page_url",
    "referrer_url",
    "entry_url",
    "ip_address",
    "user_agent",
    "browser",
    "os",
    "country_code",
    "country",
    "region",
    "city",
    "latitude",
    "longitude",
    "source_id",
    "chat_waittime",
    "chat_duration",
    "chat_ended_by",
    "language_code",
    "transcripts",
    "plugins",
    "javascript_variables",
    "operator_variables"
})
public class RequestDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("widget_id")
    private String widgetId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("snapshot_image_url")
    private String snapshotImageUrl;
    @JsonProperty("type")
    private String type;
    @JsonProperty("requested_by")
    private String requestedBy;
    @JsonProperty("requester_details")
    private RequesterDetailsDTO requesterDetailsDTO;
    @JsonProperty("description")
    private String description;
    @JsonProperty("created_at_date")
    private String createdAtDate;
    @JsonProperty("created_at_seconds")
    private Integer createdAtSeconds;
    @JsonProperty("created_at_milliseconds")
    private Integer createdAtMilliseconds;
    @JsonProperty("proactive_chat")
    private Boolean proactiveChat;
    @JsonProperty("page_url")
    private String pageUrl;
    @JsonProperty("referrer_url")
    private String referrerUrl;
    @JsonProperty("entry_url")
    private String entryUrl;
    @JsonProperty("ip_address")
    private String ipAddress;
    @JsonProperty("user_agent")
    private String userAgent;
    @JsonProperty("browser")
    private String browser;
    @JsonProperty("os")
    private String os;
    @JsonProperty("country_code")
    private String countryCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("region")
    private String region;
    @JsonProperty("city")
    private String city;
    @JsonProperty("latitude")
    private Double latitude;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("source_id")
    private Integer sourceId;
    @JsonProperty("chat_waittime")
    private Integer chatWaittime;
    @JsonProperty("chat_duration")
    private Integer chatDuration;
    @JsonProperty("chat_ended_by")
    private String chatEndedBy;
    @JsonProperty("language_code")
    private String languageCode;
    @JsonProperty("transcripts")
    private List<TranscriptDTO> transcripts = null;
    @JsonProperty("plugins")
    private List<PluginDTO> plugins = null;
    @JsonProperty("javascript_variables")
    private List<JavascriptVariableDTO> javascriptVariableDTOS = null;
    @JsonProperty("operator_variables")
    private List<OperatorVariableDTO> operatorVariableDTOS = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestDTO() {
    }

    /**
     *
     * @param region
     * @param plugins
     * @param userAgent
     * @param pageUrl
     * @param createdAtMilliseconds
     * @param type
     * @param sourceId
     * @param referrerUrl
     * @param city
     * @param id
     * @param description
     * @param browser
     * @param longitude
     * @param requesterDetailsDTO
     * @param snapshotImageUrl
     * @param createdAtDate
     * @param operatorVariableDTOS
     * @param requestedBy
     * @param ipAddress
     * @param os
     * @param javascriptVariableDTOS
     * @param countryCode
     * @param entryUrl
     * @param url
     * @param country
     * @param chatDuration
     * @param languageCode
     * @param transcripts
     * @param proactiveChat
     * @param widgetId
     * @param chatWaittime
     * @param latitude
     * @param chatEndedBy
     * @param createdAtSeconds
     */
    public RequestDTO(String id, String widgetId, String url, String snapshotImageUrl, String type, String requestedBy, RequesterDetailsDTO requesterDetailsDTO, String description, String createdAtDate, Integer createdAtSeconds, Integer createdAtMilliseconds, Boolean proactiveChat, String pageUrl, String referrerUrl, String entryUrl, String ipAddress, String userAgent, String browser, String os, String countryCode, String country, String region, String city, Double latitude, Double longitude, Integer sourceId, Integer chatWaittime, Integer chatDuration, String chatEndedBy, String languageCode, List<TranscriptDTO> transcripts, List<PluginDTO> plugins, List<JavascriptVariableDTO> javascriptVariableDTOS, List<OperatorVariableDTO> operatorVariableDTOS) {
        super();
        this.id = id;
        this.widgetId = widgetId;
        this.url = url;
        this.snapshotImageUrl = snapshotImageUrl;
        this.type = type;
        this.requestedBy = requestedBy;
        this.requesterDetailsDTO = requesterDetailsDTO;
        this.description = description;
        this.createdAtDate = createdAtDate;
        this.createdAtSeconds = createdAtSeconds;
        this.createdAtMilliseconds = createdAtMilliseconds;
        this.proactiveChat = proactiveChat;
        this.pageUrl = pageUrl;
        this.referrerUrl = referrerUrl;
        this.entryUrl = entryUrl;
        this.ipAddress = ipAddress;
        this.userAgent = userAgent;
        this.browser = browser;
        this.os = os;
        this.countryCode = countryCode;
        this.country = country;
        this.region = region;
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
        this.sourceId = sourceId;
        this.chatWaittime = chatWaittime;
        this.chatDuration = chatDuration;
        this.chatEndedBy = chatEndedBy;
        this.languageCode = languageCode;
        this.transcripts = transcripts;
        this.plugins = plugins;
        this.javascriptVariableDTOS = javascriptVariableDTOS;
        this.operatorVariableDTOS = operatorVariableDTOS;
    }

    @Override
    public String toString() {
        return "REQUEST [id=" + id +", widgetId=" + widgetId + ", url=" + url + ", requestedBy=" + requestedBy + ", requesterDetailsDTO=" + requesterDetailsDTO;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public RequestDTO withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("widget_id")
    public String getWidgetId() {
        return widgetId;
    }

    @JsonProperty("widget_id")
    public void setWidgetId(String widgetId) {
        this.widgetId = widgetId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public RequestDTO withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("snapshot_image_url")
    public String getSnapshotImageUrl() {
        return snapshotImageUrl;
    }

    @JsonProperty("snapshot_image_url")
    public void setSnapshotImageUrl(String snapshotImageUrl) {
        this.snapshotImageUrl = snapshotImageUrl;
    }

    public RequestDTO withSnapshotImageUrl(String snapshotImageUrl) {
        this.snapshotImageUrl = snapshotImageUrl;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public RequestDTO withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("requested_by")
    public String getRequestedBy() {
        return requestedBy;
    }

    @JsonProperty("requested_by")
    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public RequestDTO withRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
        return this;
    }

    @JsonProperty("requester_details")
    public RequesterDetailsDTO getRequesterDetailsDTO() {
        return requesterDetailsDTO;
    }

    @JsonProperty("requester_details")
    public void setRequesterDetailsDTO(RequesterDetailsDTO requesterDetailsDTO) {
        this.requesterDetailsDTO = requesterDetailsDTO;
    }

    public RequestDTO withRequesterDetails(RequesterDetailsDTO requesterDetailsDTO) {
        this.requesterDetailsDTO = requesterDetailsDTO;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public RequestDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("created_at_date")
    public String getCreatedAtDate() {
        return createdAtDate;
    }

    @JsonProperty("created_at_date")
    public void setCreatedAtDate(String createdAtDate) {
        this.createdAtDate = createdAtDate;
    }

    public RequestDTO withCreatedAtDate(String createdAtDate) {
        this.createdAtDate = createdAtDate;
        return this;
    }

    @JsonProperty("created_at_seconds")
    public Integer getCreatedAtSeconds() {
        return createdAtSeconds;
    }

    @JsonProperty("created_at_seconds")
    public void setCreatedAtSeconds(Integer createdAtSeconds) {
        this.createdAtSeconds = createdAtSeconds;
    }

    public RequestDTO withCreatedAtSeconds(Integer createdAtSeconds) {
        this.createdAtSeconds = createdAtSeconds;
        return this;
    }

    @JsonProperty("created_at_milliseconds")
    public Integer getCreatedAtMilliseconds() {
        return createdAtMilliseconds;
    }

    @JsonProperty("created_at_milliseconds")
    public void setCreatedAtMilliseconds(Integer createdAtMilliseconds) {
        this.createdAtMilliseconds = createdAtMilliseconds;
    }

    public RequestDTO withCreatedAtMilliseconds(Integer createdAtMilliseconds) {
        this.createdAtMilliseconds = createdAtMilliseconds;
        return this;
    }

    @JsonProperty("proactive_chat")
    public Boolean getProactiveChat() {
        return proactiveChat;
    }

    @JsonProperty("proactive_chat")
    public void setProactiveChat(Boolean proactiveChat) {
        this.proactiveChat = proactiveChat;
    }

    public RequestDTO withProactiveChat(Boolean proactiveChat) {
        this.proactiveChat = proactiveChat;
        return this;
    }

    @JsonProperty("page_url")
    public String getPageUrl() {
        return pageUrl;
    }

    @JsonProperty("page_url")
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public RequestDTO withPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
        return this;
    }

    @JsonProperty("referrer_url")
    public String getReferrerUrl() {
        return referrerUrl;
    }

    @JsonProperty("referrer_url")
    public void setReferrerUrl(String referrerUrl) {
        this.referrerUrl = referrerUrl;
    }

    public RequestDTO withReferrerUrl(String referrerUrl) {
        this.referrerUrl = referrerUrl;
        return this;
    }

    @JsonProperty("entry_url")
    public String getEntryUrl() {
        return entryUrl;
    }

    @JsonProperty("entry_url")
    public void setEntryUrl(String entryUrl) {
        this.entryUrl = entryUrl;
    }

    public RequestDTO withEntryUrl(String entryUrl) {
        this.entryUrl = entryUrl;
        return this;
    }

    @JsonProperty("ip_address")
    public String getIpAddress() {
        return ipAddress;
    }

    @JsonProperty("ip_address")
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public RequestDTO withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    @JsonProperty("user_agent")
    public String getUserAgent() {
        return userAgent;
    }

    @JsonProperty("user_agent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public RequestDTO withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    @JsonProperty("browser")
    public String getBrowser() {
        return browser;
    }

    @JsonProperty("browser")
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public RequestDTO withBrowser(String browser) {
        this.browser = browser;
        return this;
    }

    @JsonProperty("os")
    public String getOs() {
        return os;
    }

    @JsonProperty("os")
    public void setOs(String os) {
        this.os = os;
    }

    public RequestDTO withOs(String os) {
        this.os = os;
        return this;
    }

    @JsonProperty("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public RequestDTO withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public RequestDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    public RequestDTO withRegion(String region) {
        this.region = region;
        return this;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public RequestDTO withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public RequestDTO withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public RequestDTO withLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    @JsonProperty("source_id")
    public Integer getSourceId() {
        return sourceId;
    }

    @JsonProperty("source_id")
    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public RequestDTO withSourceId(Integer sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    @JsonProperty("chat_waittime")
    public Integer getChatWaittime() {
        return chatWaittime;
    }

    @JsonProperty("chat_waittime")
    public void setChatWaittime(Integer chatWaittime) {
        this.chatWaittime = chatWaittime;
    }

    public RequestDTO withChatWaittime(Integer chatWaittime) {
        this.chatWaittime = chatWaittime;
        return this;
    }

    @JsonProperty("chat_duration")
    public Integer getChatDuration() {
        return chatDuration;
    }

    @JsonProperty("chat_duration")
    public void setChatDuration(Integer chatDuration) {
        this.chatDuration = chatDuration;
    }

    public RequestDTO withChatDuration(Integer chatDuration) {
        this.chatDuration = chatDuration;
        return this;
    }

    @JsonProperty("chat_ended_by")
    public String getChatEndedBy() {
        return chatEndedBy;
    }

    @JsonProperty("chat_ended_by")
    public void setChatEndedBy(String chatEndedBy) {
        this.chatEndedBy = chatEndedBy;
    }

    public RequestDTO withChatEndedBy(String chatEndedBy) {
        this.chatEndedBy = chatEndedBy;
        return this;
    }

    @JsonProperty("language_code")
    public String getLanguageCode() {
        return languageCode;
    }

    @JsonProperty("language_code")
    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public RequestDTO withLanguageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    @JsonProperty("transcripts")
    public List<TranscriptDTO> getTranscripts() {
        return transcripts;
    }

    @JsonProperty("transcripts")
    public void setTranscripts(List<TranscriptDTO> transcripts) {
        this.transcripts = transcripts;
    }

    public RequestDTO withTranscripts(List<TranscriptDTO> transcripts) {
        this.transcripts = transcripts;
        return this;
    }

    @JsonProperty("plugins")
    public List<PluginDTO> getPlugins() {
        return plugins;
    }

    @JsonProperty("plugins")
    public void setPlugins(List<PluginDTO> plugins) {
        this.plugins = plugins;
    }

    public RequestDTO withPlugins(List<PluginDTO> plugins) {
        this.plugins = plugins;
        return this;
    }

    @JsonProperty("javascript_variables")
    public List<JavascriptVariableDTO> getJavascriptVariableDTOS() {
        return javascriptVariableDTOS;
    }

    @JsonProperty("javascript_variables")
    public void setJavascriptVariableDTOS(List<JavascriptVariableDTO> javascriptVariableDTOS) {
        this.javascriptVariableDTOS = javascriptVariableDTOS;
    }

    public RequestDTO withJavascriptVariables(List<JavascriptVariableDTO> javascriptVariableDTOS) {
        this.javascriptVariableDTOS = javascriptVariableDTOS;
        return this;
    }

    @JsonProperty("operator_variables")
    public List<OperatorVariableDTO> getOperatorVariableDTOS() {
        return operatorVariableDTOS;
    }

    @JsonProperty("operator_variables")
    public void setOperatorVariableDTOS(List<OperatorVariableDTO> operatorVariableDTOS) {
        this.operatorVariableDTOS = operatorVariableDTOS;
    }

    public RequestDTO withOperatorVariables(List<OperatorVariableDTO> operatorVariableDTOS) {
        this.operatorVariableDTOS = operatorVariableDTOS;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public RequestDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
