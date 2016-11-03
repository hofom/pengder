package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Tinstrumentreservation {
    private Integer id;

    private Integer instrumentid;

    private Integer groupid;

    private Byte dayofweek;

    private String projectname;

    private String reason;

    private Date starttime;

    private Date endtime;

    private Date activetime;

    private Date expiretime;

    private Integer createdid;

    private Date createdtime;

    private Integer modifiedid;

    private Date modifiedtime;

    private Integer deletedid;

    private Date deletedtime;

    private Integer receivesyntick;

    private Integer applysyntick;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Byte getDayofweek() {
        return dayofweek;
    }

    public void setDayofweek(Byte dayofweek) {
        this.dayofweek = dayofweek;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getActivetime() {
        return activetime;
    }

    public void setActivetime(Date activetime) {
        this.activetime = activetime;
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
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

    public Integer getModifiedid() {
        return modifiedid;
    }

    public void setModifiedid(Integer modifiedid) {
        this.modifiedid = modifiedid;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getDeletedid() {
        return deletedid;
    }

    public void setDeletedid(Integer deletedid) {
        this.deletedid = deletedid;
    }

    public Date getDeletedtime() {
        return deletedtime;
    }

    public void setDeletedtime(Date deletedtime) {
        this.deletedtime = deletedtime;
    }

    public Integer getReceivesyntick() {
        return receivesyntick;
    }

    public void setReceivesyntick(Integer receivesyntick) {
        this.receivesyntick = receivesyntick;
    }

    public Integer getApplysyntick() {
        return applysyntick;
    }

    public void setApplysyntick(Integer applysyntick) {
        this.applysyntick = applysyntick;
    }
}