package ru.task.snapengageEndpoint.domainobject;


import javax.persistence.*;
import java.util.List;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
@Entity
@Table(name = "request")
public class RequestDO {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String idOfRequest;
    @Column
    private String widgetId;
    @Column
    private String url;
    @Column
    private String snapshotImageUrl;
    @Column
    private String type;
    @Column
    private String requestedBy;
    @OneToOne(cascade = CascadeType.ALL)
    private RequesterDetailsDO requesterDetailsDO;
    @Column
    private String description;
    @Column
    private String createdAtDate;
    @Column
    private Integer createdAtSeconds;
    @Column
    private Integer createdAtMilliseconds;
    @Column
    private Boolean proactiveChat;
    @Column
    private String pageUrl;
    @Column
    private String referrerUrl;
    @Column
    private String entryUrl;
    @Column
    private String ipAddress;
    @Column
    private String userAgent;
    @Column
    private String browser;
    @Column
    private String os;
    @Column
    private String countryCode;
    @Column
    private String country;
    @Column
    private String region;
    @Column
    private String city;
    @Column
    private Double latitude;
    @Column
    private Double longitude;
    @Column
    private Integer sourceId;
    @Column
    private Integer chatWaittime;
    @Column
    private Integer chatDuration;
    @Column
    private String chatEndedBy;
    @Column
    private String languageCode;

    @OneToMany(cascade = CascadeType.ALL)
    private
    List<TranscriptDO> transcriptDOList;

    @OneToMany(cascade = CascadeType.ALL)
    private
    List<PluginDO> pluginDOList;

    @OneToMany(cascade = CascadeType.ALL)
    private
    List<JavascriptVariableDO> javascriptVariableDOList;

    @OneToMany(cascade = CascadeType.ALL)
    private
    List<OperatorVariableDO> operatorVariableDOList;

    public RequestDO(){ }

    public RequestDO(String idOfRequest, String widgetId, String url, String snapshotImageUrl, String type, String requestedBy, RequesterDetailsDO requesterDetailsDO, String description, String createdAtDate, Integer createdAtSeconds, Integer createdAtMilliseconds, Boolean proactiveChat, String pageUrl, String referrerUrl, String entryUrl, String ipAddress, String userAgent, String browser, String os, String countryCode, String country, String region, String city, Double latitude, Double longitude, Integer sourceId, Integer chatWaittime, Integer chatDuration, String chatEndedBy, String languageCode) {
        this.idOfRequest = idOfRequest;
        this.widgetId = widgetId;
        this.url = url;
        this.snapshotImageUrl = snapshotImageUrl;
        this.type = type;
        this.requestedBy = requestedBy;
        this.requesterDetailsDO = requesterDetailsDO;
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
    }

    @Override
    public String toString() {
        return "RequestDO [id=" + id +", widgetId=" + widgetId + ", url=" + url + ", requestedBy=" + requestedBy + ", createdAtDate=" + createdAtDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdOfRequest() {
        return idOfRequest;
    }

    public void setIdOfRequest(String idOfRequest) {
        this.idOfRequest = idOfRequest;
    }

    public String getWidgetId() {
        return widgetId;
    }

    public void setWidgetId(String widgetId) {
        this.widgetId = widgetId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSnapshotImageUrl() {
        return snapshotImageUrl;
    }

    public void setSnapshotImageUrl(String snapshotImageUrl) {
        this.snapshotImageUrl = snapshotImageUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequestedBy() {
        return requestedBy;
    }

    public void setRequestedBy(String requestedBy) {
        this.requestedBy = requestedBy;
    }

    public RequesterDetailsDO getRequesterDetailsDO() {
        return requesterDetailsDO;
    }

    public void setRequesterDetailsDO(RequesterDetailsDO requesterDetailsDO) {
        this.requesterDetailsDO = requesterDetailsDO;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreatedAtDate() {
        return createdAtDate;
    }

    public void setCreatedAtDate(String createdAtDate) {
        this.createdAtDate = createdAtDate;
    }

    public Integer getCreatedAtSeconds() {
        return createdAtSeconds;
    }

    public void setCreatedAtSeconds(Integer createdAtSeconds) {
        this.createdAtSeconds = createdAtSeconds;
    }

    public Integer getCreatedAtMilliseconds() {
        return createdAtMilliseconds;
    }

    public void setCreatedAtMilliseconds(Integer createdAtMilliseconds) {
        this.createdAtMilliseconds = createdAtMilliseconds;
    }

    public Boolean getProactiveChat() {
        return proactiveChat;
    }

    public void setProactiveChat(Boolean proactiveChat) {
        this.proactiveChat = proactiveChat;
    }

    public String getPageUrl() {
        return pageUrl;
    }

    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl;
    }

    public String getReferrerUrl() {
        return referrerUrl;
    }

    public void setReferrerUrl(String referrerUrl) {
        this.referrerUrl = referrerUrl;
    }

    public String getEntryUrl() {
        return entryUrl;
    }

    public void setEntryUrl(String entryUrl) {
        this.entryUrl = entryUrl;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getChatWaittime() {
        return chatWaittime;
    }

    public void setChatWaittime(Integer chatWaittime) {
        this.chatWaittime = chatWaittime;
    }

    public Integer getChatDuration() {
        return chatDuration;
    }

    public void setChatDuration(Integer chatDuration) {
        this.chatDuration = chatDuration;
    }

    public String getChatEndedBy() {
        return chatEndedBy;
    }

    public void setChatEndedBy(String chatEndedBy) {
        this.chatEndedBy = chatEndedBy;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public List<TranscriptDO> getTranscriptDOList() {
        return transcriptDOList;
    }

    public void setTranscriptDOList(List<TranscriptDO> transcriptDOList) {
        this.transcriptDOList = transcriptDOList;
    }

    public List<PluginDO> getPluginDOList() {
        return pluginDOList;
    }

    public void setPluginDOList(List<PluginDO> pluginDOList) {
        this.pluginDOList = pluginDOList;
    }

    public List<JavascriptVariableDO> getJavascriptVariableDOList() {
        return javascriptVariableDOList;
    }

    public void setJavascriptVariableDOList(List<JavascriptVariableDO> javascriptVariableDOList) {
        this.javascriptVariableDOList = javascriptVariableDOList;
    }

    public List<OperatorVariableDO> getOperatorVariableDOList() {
        return operatorVariableDOList;
    }

    public void setOperatorVariableDOList(List<OperatorVariableDO> operatorVariableDOList) {
        this.operatorVariableDOList = operatorVariableDOList;
    }
}
