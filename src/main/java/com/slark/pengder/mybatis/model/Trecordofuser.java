package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Trecordofuser {
    private Long id;

    private Date starttime;

    private Date endtime;

    private Integer boottime;

    private Integer record;

    private Integer accountid;

    private Integer groupid;

    private Integer discount;

    private Short invoice;

    private Short blacklist;

    private Boolean inblacklist;

    private Integer qualificationdiscount;

    private Integer apparatusdiscount;

    private Byte manualadd;

    private Byte partitionid;

    private Integer userid;

    private Integer groupdiscount;

    private BigDecimal shouldcharge;

    private BigDecimal havecharge;

    private Short credit;

    private Integer createdid;

    private Date createdtime;

    private Integer modifiedid;

    private Date modifiedtime;

    private Integer deletedid;

    private Date deletedtime;

    private Integer relevantprofile;

    private Integer cardid;

    private Integer instrumentid;

    private String comment;

    private Integer manageraveserv;

    private Integer userattritiontype;

    private String userorganization;

    private Short position;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getBoottime() {
        return boottime;
    }

    public void setBoottime(Integer boottime) {
        this.boottime = boottime;
    }

    public Integer getRecord() {
        return record;
    }

    public void setRecord(Integer record) {
        this.record = record;
    }

    public Integer getAccountid() {
        return accountid;
    }

    public void setAccountid(Integer accountid) {
        this.accountid = accountid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Short getInvoice() {
        return invoice;
    }

    public void setInvoice(Short invoice) {
        this.invoice = invoice;
    }

    public Short getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Short blacklist) {
        this.blacklist = blacklist;
    }

    public Boolean getInblacklist() {
        return inblacklist;
    }

    public void setInblacklist(Boolean inblacklist) {
        this.inblacklist = inblacklist;
    }

    public Integer getQualificationdiscount() {
        return qualificationdiscount;
    }

    public void setQualificationdiscount(Integer qualificationdiscount) {
        this.qualificationdiscount = qualificationdiscount;
    }

    public Integer getApparatusdiscount() {
        return apparatusdiscount;
    }

    public void setApparatusdiscount(Integer apparatusdiscount) {
        this.apparatusdiscount = apparatusdiscount;
    }

    public Byte getManualadd() {
        return manualadd;
    }

    public void setManualadd(Byte manualadd) {
        this.manualadd = manualadd;
    }

    public Byte getPartitionid() {
        return partitionid;
    }

    public void setPartitionid(Byte partitionid) {
        this.partitionid = partitionid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getGroupdiscount() {
        return groupdiscount;
    }

    public void setGroupdiscount(Integer groupdiscount) {
        this.groupdiscount = groupdiscount;
    }

    public BigDecimal getShouldcharge() {
        return shouldcharge;
    }

    public void setShouldcharge(BigDecimal shouldcharge) {
        this.shouldcharge = shouldcharge;
    }

    public BigDecimal getHavecharge() {
        return havecharge;
    }

    public void setHavecharge(BigDecimal havecharge) {
        this.havecharge = havecharge;
    }

    public Short getCredit() {
        return credit;
    }

    public void setCredit(Short credit) {
        this.credit = credit;
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

    public Integer getRelevantprofile() {
        return relevantprofile;
    }

    public void setRelevantprofile(Integer relevantprofile) {
        this.relevantprofile = relevantprofile;
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getManageraveserv() {
        return manageraveserv;
    }

    public void setManageraveserv(Integer manageraveserv) {
        this.manageraveserv = manageraveserv;
    }

    public Integer getUserattritiontype() {
        return userattritiontype;
    }

    public void setUserattritiontype(Integer userattritiontype) {
        this.userattritiontype = userattritiontype;
    }

    public String getUserorganization() {
        return userorganization;
    }

    public void setUserorganization(String userorganization) {
        this.userorganization = userorganization == null ? null : userorganization.trim();
    }

    public Short getPosition() {
        return position;
    }

    public void setPosition(Short position) {
        this.position = position;
    }
}