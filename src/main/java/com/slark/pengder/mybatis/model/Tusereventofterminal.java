package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Tusereventofterminal {
    private Long id;

    private String terminalmac;

    private Integer instrumentid;

    private Integer cardserial;

    private Integer userid;

    private Date syntime;

    private String unknowncarduser;

    private String unknowncardno;

    private Short cardtype;

    private Integer groupid;

    private Short actiontypeid;

    private Short actionresultid;

    private String comment;

    private Date createdtime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTerminalmac() {
        return terminalmac;
    }

    public void setTerminalmac(String terminalmac) {
        this.terminalmac = terminalmac == null ? null : terminalmac.trim();
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public Integer getCardserial() {
        return cardserial;
    }

    public void setCardserial(Integer cardserial) {
        this.cardserial = cardserial;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getSyntime() {
        return syntime;
    }

    public void setSyntime(Date syntime) {
        this.syntime = syntime;
    }

    public String getUnknowncarduser() {
        return unknowncarduser;
    }

    public void setUnknowncarduser(String unknowncarduser) {
        this.unknowncarduser = unknowncarduser == null ? null : unknowncarduser.trim();
    }

    public String getUnknowncardno() {
        return unknowncardno;
    }

    public void setUnknowncardno(String unknowncardno) {
        this.unknowncardno = unknowncardno == null ? null : unknowncardno.trim();
    }

    public Short getCardtype() {
        return cardtype;
    }

    public void setCardtype(Short cardtype) {
        this.cardtype = cardtype;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Short getActiontypeid() {
        return actiontypeid;
    }

    public void setActiontypeid(Short actiontypeid) {
        this.actiontypeid = actiontypeid;
    }

    public Short getActionresultid() {
        return actionresultid;
    }

    public void setActionresultid(Short actionresultid) {
        this.actionresultid = actionresultid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }
}