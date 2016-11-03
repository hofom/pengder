package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Ttemporarycardbinding {
    private Integer id;

    private Integer cardnumberid;

    private Integer userid;

    private Date starttime;

    private Date endtime;

    private Date createdtime;

    private Integer operator;

    private Integer instrumentid;

    private Integer applysyntick;

    private Integer receivesyntick;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCardnumberid() {
        return cardnumberid;
    }

    public void setCardnumberid(Integer cardnumberid) {
        this.cardnumberid = cardnumberid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public Integer getApplysyntick() {
        return applysyntick;
    }

    public void setApplysyntick(Integer applysyntick) {
        this.applysyntick = applysyntick;
    }

    public Integer getReceivesyntick() {
        return receivesyntick;
    }

    public void setReceivesyntick(Integer receivesyntick) {
        this.receivesyntick = receivesyntick;
    }
}