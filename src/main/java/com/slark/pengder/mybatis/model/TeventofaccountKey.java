package com.slark.pengder.mybatis.model;

import java.util.Date;

public class TeventofaccountKey {
    private Integer accountid;

    private Date time;

    private Long relevantrecord;

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Long getRelevantrecord() {
        return relevantrecord;
    }

    public void setRelevantrecord(Long relevantrecord) {
        this.relevantrecord = relevantrecord;
    }
}