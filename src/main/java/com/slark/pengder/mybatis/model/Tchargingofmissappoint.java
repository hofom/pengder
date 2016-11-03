package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Tchargingofmissappoint {
    private Integer id;

    private Integer user;

    private Integer belonggroup;

    private Integer accountid;

    private BigDecimal charge;

    private Date createdtime;

    private String comment;

    private Byte partitionid;

    private Short gaincredit;

    private Integer modifiedid;

    private Date modifiedtime;

    private Boolean representation;

    private Date representationtime;

    private String representationcontent;

    private String representationtype;

    private String representationrecontent;

    private Integer representationreplier;

    private Long bookingid;

    private Integer deletedid;

    private Date deletedtime;

    private Date representationretime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getBelonggroup() {
        return belonggroup;
    }

    public void setBelonggroup(Integer belonggroup) {
        this.belonggroup = belonggroup;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public BigDecimal getCharge() {
        return charge;
    }

    public void setCharge(BigDecimal charge) {
        this.charge = charge;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Byte getPartitionid() {
        return partitionid;
    }

    public void setPartitionid(Byte partitionid) {
        this.partitionid = partitionid;
    }

    public Short getGaincredit() {
        return gaincredit;
    }

    public void setGaincredit(Short gaincredit) {
        this.gaincredit = gaincredit;
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

    public Boolean getRepresentation() {
        return representation;
    }

    public void setRepresentation(Boolean representation) {
        this.representation = representation;
    }

    public Date getRepresentationtime() {
        return representationtime;
    }

    public void setRepresentationtime(Date representationtime) {
        this.representationtime = representationtime;
    }

    public String getRepresentationcontent() {
        return representationcontent;
    }

    public void setRepresentationcontent(String representationcontent) {
        this.representationcontent = representationcontent == null ? null : representationcontent.trim();
    }

    public String getRepresentationtype() {
        return representationtype;
    }

    public void setRepresentationtype(String representationtype) {
        this.representationtype = representationtype == null ? null : representationtype.trim();
    }

    public String getRepresentationrecontent() {
        return representationrecontent;
    }

    public void setRepresentationrecontent(String representationrecontent) {
        this.representationrecontent = representationrecontent == null ? null : representationrecontent.trim();
    }

    public Integer getRepresentationreplier() {
        return representationreplier;
    }

    public void setRepresentationreplier(Integer representationreplier) {
        this.representationreplier = representationreplier;
    }

    public Long getBookingid() {
        return bookingid;
    }

    public void setBookingid(Long bookingid) {
        this.bookingid = bookingid;
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

    public Date getRepresentationretime() {
        return representationretime;
    }

    public void setRepresentationretime(Date representationretime) {
        this.representationretime = representationretime;
    }
}