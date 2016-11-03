package com.slark.pengder.mybatis.model;

import java.util.Date;

public class TeventofuserKey {
    private Short eventtype;

    private Integer userid;

    private Date operationtime;

    public Short getEventtype() {
        return eventtype;
    }

    public void setEventtype(Short eventtype) {
        this.eventtype = eventtype;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}