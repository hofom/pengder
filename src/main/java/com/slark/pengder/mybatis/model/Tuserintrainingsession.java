package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Tuserintrainingsession extends TuserintrainingsessionKey {
    private String userinfo;

    private Integer instrumentid;

    private Boolean manul;

    private Date deletedtime;

    private Integer deletedid;

    private Integer createdid;

    private Date createdtime;

    private Short userposition;

    public String getUserinfo() {
        return userinfo;
    }

    public void setUserinfo(String userinfo) {
        this.userinfo = userinfo == null ? null : userinfo.trim();
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public Boolean getManul() {
        return manul;
    }

    public void setManul(Boolean manul) {
        this.manul = manul;
    }

    public Date getDeletedtime() {
        return deletedtime;
    }

    public void setDeletedtime(Date deletedtime) {
        this.deletedtime = deletedtime;
    }

    public Integer getDeletedid() {
        return deletedid;
    }

    public void setDeletedid(Integer deletedid) {
        this.deletedid = deletedid;
    }

    public Integer getCreatedid() {
        return createdid;
    }

    public void setCreatedid(Integer createdid) {
        this.createdid = createdid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Short getUserposition() {
        return userposition;
    }

    public void setUserposition(Short userposition) {
        this.userposition = userposition;
    }
}