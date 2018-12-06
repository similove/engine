package com.zjw.model;

import java.util.Date;

public class IpType {
    private Integer id;

    private String typeName;

    private Integer createPersonId;

    private Date createTime;

    private Date lasteUpdateTime;

    private String historyUpdateTime;

    private String description;

    private String others;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getCreatePersonId() {
        return createPersonId;
    }

    public void setCreatePersonId(Integer createPersonId) {
        this.createPersonId = createPersonId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLasteUpdateTime() {
        return lasteUpdateTime;
    }

    public void setLasteUpdateTime(Date lasteUpdateTime) {
        this.lasteUpdateTime = lasteUpdateTime;
    }

    public String getHistoryUpdateTime() {
        return historyUpdateTime;
    }

    public void setHistoryUpdateTime(String historyUpdateTime) {
        this.historyUpdateTime = historyUpdateTime == null ? null : historyUpdateTime.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }
}