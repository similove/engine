package com.zjw.model;

import java.util.Date;

public class IpSource {
    private Integer id;

    private Integer typeId;

    private String name;

    private String picUrls;

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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPicUrls() {
        return picUrls;
    }

    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls == null ? null : picUrls.trim();
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