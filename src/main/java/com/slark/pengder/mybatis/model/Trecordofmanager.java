package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Trecordofmanager {
    private Long id;

    private Date starttime;

    private Date endtime;

    private Integer boottime;

    private Integer userid;

    private Short type;

    private Boolean manualadd;

    private Integer createdid;

    private Date createdtime;

    private Integer modifiedid;

    private Date modifiedtime;

    private Integer deletedid;

    private Date deletedtime;

    private Byte partitionid;

    private Date syntime;

    private Integer cardid;

    private Integer instrumentid;

    private Long convertuserrecordid;

    private String content;

    private String comment;

    private String trainingpro;

    private Integer manageraveserv;

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public Boolean getManualadd() {
        return manualadd;
    }

    public void setManualadd(Boolean manualadd) {
        this.manualadd = manualadd;
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

    public Byte getPartitionid() {
        return partitionid;
    }

    public void setPartitionid(Byte partitionid) {
        this.partitionid = partitionid;
    }

    public Date getSyntime() {
        return syntime;
    }

    public void setSyntime(Date syntime) {
        this.syntime = syntime;
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

    public Long getConvertuserrecordid() {
        return convertuserrecordid;
    }

    public void setConvertuserrecordid(Long convertuserrecordid) {
        this.convertuserrecordid = convertuserrecordid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getTrainingpro() {
        return trainingpro;
    }

    public void setTrainingpro(String trainingpro) {
        this.trainingpro = trainingpro == null ? null : trainingpro.trim();
    }

    public Integer getManageraveserv() {
        return manageraveserv;
    }

    public void setManageraveserv(Integer manageraveserv) {
        this.manageraveserv = manageraveserv;
    }
}