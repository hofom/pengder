package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Tchargingofcompensation extends TchargingofcompensationKey {
    private Boolean newest;

    private Integer accountid;

    private Integer user;

    private Date time;

    private String reason;

    private Integer instrumentid;

    private Short quantity;

    private BigDecimal price;

    private String fillbyuser;

    private Date filledtime;

    private String comment;

    private Byte partitionid;

    private Short gaincredit;

    private Integer researchgroupid;

    private Integer deletedid;

    private Date deletedtime;

    public Boolean getNewest() {
        return newest;
    }

    public void setNewest(Boolean newest) {
        this.newest = newest;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public Short getQuantity() {
        return quantity;
    }

    public void setQuantity(Short quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFillbyuser() {
        return fillbyuser;
    }

    public void setFillbyuser(String fillbyuser) {
        this.fillbyuser = fillbyuser == null ? null : fillbyuser.trim();
    }

    public Date getFilledtime() {
        return filledtime;
    }

    public void setFilledtime(Date filledtime) {
        this.filledtime = filledtime;
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

    public Integer getResearchgroupid() {
        return researchgroupid;
    }

    public void setResearchgroupid(Integer researchgroupid) {
        this.researchgroupid = researchgroupid;
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
}