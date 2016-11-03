package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Taccount {
    private Integer id;

    private String accountname;

    private Integer createdid;

    private Date createdtime;

    private BigDecimal money;

    private Short accounttype;

    private BigDecimal newcredit;

    private Date inspiretime;

    private Short state;

    private Short attritiontype;

    private BigDecimal initcredit;

    private Integer researchgroupid;

    private Integer belongorganization;

    private Integer ownerid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
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

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Short getAccounttype() {
        return accounttype;
    }

    public void setAccounttype(Short accounttype) {
        this.accounttype = accounttype;
    }

    public BigDecimal getNewcredit() {
        return newcredit;
    }

    public void setNewcredit(BigDecimal newcredit) {
        this.newcredit = newcredit;
    }

    public Date getInspiretime() {
        return inspiretime;
    }

    public void setInspiretime(Date inspiretime) {
        this.inspiretime = inspiretime;
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Short getAttritiontype() {
        return attritiontype;
    }

    public void setAttritiontype(Short attritiontype) {
        this.attritiontype = attritiontype;
    }

    public BigDecimal getInitcredit() {
        return initcredit;
    }

    public void setInitcredit(BigDecimal initcredit) {
        this.initcredit = initcredit;
    }

    public Integer getResearchgroupid() {
        return researchgroupid;
    }

    public void setResearchgroupid(Integer researchgroupid) {
        this.researchgroupid = researchgroupid;
    }

    public Integer getBelongorganization() {
        return belongorganization;
    }

    public void setBelongorganization(Integer belongorganization) {
        this.belongorganization = belongorganization;
    }

    public Integer getOwnerid() {
        return ownerid;
    }

    public void setOwnerid(Integer ownerid) {
        this.ownerid = ownerid;
    }
}