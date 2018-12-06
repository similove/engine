package com.zjw.model;

import java.util.Date;

public class Discuss {
    private Integer id;

    private Integer ipSourceId;

    private Integer discussId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIpSourceId() {
        return ipSourceId;
    }

    public void setIpSourceId(Integer ipSourceId) {
        this.ipSourceId = ipSourceId;
    }

    public Integer getDiscussId() {
        return discussId;
    }

    public void setDiscussId(Integer discussId) {
        this.discussId = discussId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}