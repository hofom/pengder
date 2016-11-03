package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Tbookingrecord {
    private Long id;

    private Integer instrumentid;

    private Integer userid;

    private Short bookingpriorityid;

    private Short bookingmodelid;

    private Date starttime;

    private Date endtime;

    private String title;

    private Short sessiontypeid;

    private String comment;

    private Short bookingstatusid;

    private Long createdid;

    private Date createdtime;

    private Long modifiedid;

    private Date modifiedtime;

    private Integer receivesyntick;

    private Integer applysyntick;

    private Boolean isallowreg;

    private Short gaincredit;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Short getBookingpriorityid() {
        return bookingpriorityid;
    }

    public void setBookingpriorityid(Short bookingpriorityid) {
        this.bookingpriorityid = bookingpriorityid;
    }

    public Short getBookingmodelid() {
        return bookingmodelid;
    }

    public void setBookingmodelid(Short bookingmodelid) {
        this.bookingmodelid = bookingmodelid;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Short getSessiontypeid() {
        return sessiontypeid;
    }

    public void setSessiontypeid(Short sessiontypeid) {
        this.sessiontypeid = sessiontypeid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Short getBookingstatusid() {
        return bookingstatusid;
    }

    public void setBookingstatusid(Short bookingstatusid) {
        this.bookingstatusid = bookingstatusid;
    }

    public Long getCreatedid() {
        return createdid;
    }

    public void setCreatedid(Long createdid) {
        this.createdid = createdid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Long getModifiedid() {
        return modifiedid;
    }

    public void setModifiedid(Long modifiedid) {
        this.modifiedid = modifiedid;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
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

    public Boolean getIsallowreg() {
        return isallowreg;
    }

    public void setIsallowreg(Boolean isallowreg) {
        this.isallowreg = isallowreg;
    }

    public Short getGaincredit() {
        return gaincredit;
    }

    public void setGaincredit(Short gaincredit) {
        this.gaincredit = gaincredit;
    }
}