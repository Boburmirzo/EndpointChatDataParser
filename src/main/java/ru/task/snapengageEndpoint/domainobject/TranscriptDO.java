package ru.task.snapengageEndpoint.domainobject;

import javax.persistence.*;
import java.util.Date;
/**
 * Created by bumurzaqov on 28.04.2018.
 */
@Entity
@Table(name = "transcript")
public class TranscriptDO {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String idOfTranscript;
    @Column
    private Date date;
    @Column
    private Integer dateSeconds;
    @Column
    private Integer dateMilliseconds;
    @Column
    private String alias;
    @Column
    private String message;
    @ManyToOne
    public RequestDO requestDO;

    public TranscriptDO() {
    }

    public TranscriptDO(String idOfTranscript, Date date, Integer dateSeconds, Integer dateMilliseconds, String alias, String message, RequestDO requestDO) {
        this.idOfTranscript = idOfTranscript;
        this.date = date;
        this.dateSeconds = dateSeconds;
        this.dateMilliseconds = dateMilliseconds;
        this.alias = alias;
        this.message = message;
        this.requestDO = requestDO;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdOfTranscript() {
        return idOfTranscript;
    }

    public void setIdOfTranscript(String idOfTranscript) {
        this.idOfTranscript = idOfTranscript;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDateSeconds() {
        return dateSeconds;
    }

    public void setDateSeconds(Integer dateSeconds) {
        this.dateSeconds = dateSeconds;
    }

    public Integer getDateMilliseconds() {
        return dateMilliseconds;
    }

    public void setDateMilliseconds(Integer dateMilliseconds) {
        this.dateMilliseconds = dateMilliseconds;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RequestDO getRequestDO() {
        return requestDO;
    }

    public void setRequestDO(RequestDO requestDO) {
        this.requestDO = requestDO;
    }
}
