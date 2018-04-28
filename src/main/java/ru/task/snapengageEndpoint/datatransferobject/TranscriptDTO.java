
package ru.task.snapengageEndpoint.datatransferobject;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "date",
    "date_seconds",
    "date_milliseconds",
    "alias",
    "message"
})
public class TranscriptDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("date")
    private Date date;
    @JsonProperty("date_seconds")
    private Integer dateSeconds;
    @JsonProperty("date_milliseconds")
    private Integer dateMilliseconds;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("message")
    private String message;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TranscriptDTO() {
    }

    /**
     * 
     * @param message
     * @param id
     * @param alias
     * @param dateMilliseconds
     * @param date
     * @param dateSeconds
     */
    public TranscriptDTO(String id, Date date, Integer dateSeconds, Integer dateMilliseconds, String alias, String message) {
        super();
        this.id = id;
        this.date = date;
        this.dateSeconds = dateSeconds;
        this.dateMilliseconds = dateMilliseconds;
        this.alias = alias;
        this.message = message;
    }

    @Override
    public String toString() {
        return "TranscriptDTO [id=" + id +", date=" + date + ", dateSeconds=" + dateSeconds + ", dateMilliseconds=" + dateMilliseconds + ", alias=" + alias+ ", message=" + message;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public TranscriptDTO withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    public TranscriptDTO withDate(Date date) {
        this.date = date;
        return this;
    }

    @JsonProperty("date_seconds")
    public Integer getDateSeconds() {
        return dateSeconds;
    }

    @JsonProperty("date_seconds")
    public void setDateSeconds(Integer dateSeconds) {
        this.dateSeconds = dateSeconds;
    }

    public TranscriptDTO withDateSeconds(Integer dateSeconds) {
        this.dateSeconds = dateSeconds;
        return this;
    }

    @JsonProperty("date_milliseconds")
    public Integer getDateMilliseconds() {
        return dateMilliseconds;
    }

    @JsonProperty("date_milliseconds")
    public void setDateMilliseconds(Integer dateMilliseconds) {
        this.dateMilliseconds = dateMilliseconds;
    }

    public TranscriptDTO withDateMilliseconds(Integer dateMilliseconds) {
        this.dateMilliseconds = dateMilliseconds;
        return this;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    public TranscriptDTO withAlias(String alias) {
        this.alias = alias;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    public TranscriptDTO withMessage(String message) {
        this.message = message;
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

    public TranscriptDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
