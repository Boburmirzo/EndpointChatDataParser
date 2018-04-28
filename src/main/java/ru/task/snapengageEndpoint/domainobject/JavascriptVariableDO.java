package ru.task.snapengageEndpoint.domainobject;

import javax.persistence.*;
/**
 * Created by bumurzaqov on 28.04.2018.
 */

@Entity
@Table(name = "javascriptVariable")
public class JavascriptVariableDO {

    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String name;
    @Column
    private String value;

    @ManyToOne
    public RequestDO requestDO;

    public JavascriptVariableDO(String name, String value, RequestDO requestDO) {
        this.name = name;
        this.value = value;
        this.requestDO = requestDO;
    }

    public JavascriptVariableDO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public RequestDO getRequestDO() {
        return requestDO;
    }

    public void setRequestDO(RequestDO requestDO) {
        this.requestDO = requestDO;
    }
}
