package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.Date;

public class Tglobalconfig {
    private Integer id;

    private Short language;

    private Byte passwordtrial;

    private Short logouttimespan;

    private Short temporarycardtimespan;

    private String attachmentdirectory;

    private Integer timeinpunish;

    private Short invoice;

    private Integer punishtimeofblack;

    private String addroftimeserver;

    private Short blacklistrate;

    private Byte vipaccount;

    private Byte generalaccount;

    private Byte unauthorityaccount;

    private BigDecimal accountalert;

    private BigDecimal accountround;

    private BigDecimal vipstandard;

    private BigDecimal vipreward;

    private Short deductcreditmiss;

    private Short vipfloorcredit;

    private Short commonfloorcredit;

    private Short endpunishcredit;

    private Short annualgaincredit;

    private String worktime;

    private Short timelowerlimit;

    private Short occupydeductcredit;

    private Short trainingvalidtime;

    private Short levelofcentre;

    private Date modifiedtime;

    private Integer modifiedid;

    private Date starttime;

    private String comment;

    private Integer receivesyntick;

    private Integer applysyntick;

    private Short timelowercredit;

    private Short initcredit;

    private String billingformula;

    private Short singlereward;

    private Short singlededuct;

    private Short uppercredit;

    private Short deductcreditbookingcancel;

    private Integer activetimeofnewcredit;

    private Integer majororganizationid;

    private Integer otherorganizationid;

    private Short expgaincredit;

    private String clientsoftwareupdateurl;

    private Byte clientsoftwareautoupdate;

    private Integer verifydiff;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Short getLanguage() {
        return language;
    }

    public void setLanguage(Short language) {
        this.language = language;
    }

    public Byte getPasswordtrial() {
        return passwordtrial;
    }

    public void setPasswordtrial(Byte passwordtrial) {
        this.passwordtrial = passwordtrial;
    }

    public Short getLogouttimespan() {
        return logouttimespan;
    }

    public void setLogouttimespan(Short logouttimespan) {
        this.logouttimespan = logouttimespan;
    }

    public Short getTemporarycardtimespan() {
        return temporarycardtimespan;
    }

    public void setTemporarycardtimespan(Short temporarycardtimespan) {
        this.temporarycardtimespan = temporarycardtimespan;
    }

    public String getAttachmentdirectory() {
        return attachmentdirectory;
    }

    public void setAttachmentdirectory(String attachmentdirectory) {
        this.attachmentdirectory = attachmentdirectory == null ? null : attachmentdirectory.trim();
    }

    public Integer getTimeinpunish() {
        return timeinpunish;
    }

    public void setTimeinpunish(Integer timeinpunish) {
        this.timeinpunish = timeinpunish;
    }

    public Short getInvoice() {
        return invoice;
    }

    public void setInvoice(Short invoice) {
        this.invoice = invoice;
    }

    public Integer getPunishtimeofblack() {
        return punishtimeofblack;
    }

    public void setPunishtimeofblack(Integer punishtimeofblack) {
        this.punishtimeofblack = punishtimeofblack;
    }

    public String getAddroftimeserver() {
        return addroftimeserver;
    }

    public void setAddroftimeserver(String addroftimeserver) {
        this.addroftimeserver = addroftimeserver == null ? null : addroftimeserver.trim();
    }

    public Short getBlacklistrate() {
        return blacklistrate;
    }

    public void setBlacklistrate(Short blacklistrate) {
        this.blacklistrate = blacklistrate;
    }

    public Byte getVipaccount() {
        return vipaccount;
    }

    public void setVipaccount(Byte vipaccount) {
        this.vipaccount = vipaccount;
    }

    public Byte getGeneralaccount() {
        return generalaccount;
    }

    public void setGeneralaccount(Byte generalaccount) {
        this.generalaccount = generalaccount;
    }

    public Byte getUnauthorityaccount() {
        return unauthorityaccount;
    }

    public void setUnauthorityaccount(Byte unauthorityaccount) {
        this.unauthorityaccount = unauthorityaccount;
    }

    public BigDecimal getAccountalert() {
        return accountalert;
    }

    public void setAccountalert(BigDecimal accountalert) {
        this.accountalert = accountalert;
    }

    public BigDecimal getAccountround() {
        return accountround;
    }

    public void setAccountround(BigDecimal accountround) {
        this.accountround = accountround;
    }

    public BigDecimal getVipstandard() {
        return vipstandard;
    }

    public void setVipstandard(BigDecimal vipstandard) {
        this.vipstandard = vipstandard;
    }

    public BigDecimal getVipreward() {
        return vipreward;
    }

    public void setVipreward(BigDecimal vipreward) {
        this.vipreward = vipreward;
    }

    public Short getDeductcreditmiss() {
        return deductcreditmiss;
    }

    public void setDeductcreditmiss(Short deductcreditmiss) {
        this.deductcreditmiss = deductcreditmiss;
    }

    public Short getVipfloorcredit() {
        return vipfloorcredit;
    }

    public void setVipfloorcredit(Short vipfloorcredit) {
        this.vipfloorcredit = vipfloorcredit;
    }

    public Short getCommonfloorcredit() {
        return commonfloorcredit;
    }

    public void setCommonfloorcredit(Short commonfloorcredit) {
        this.commonfloorcredit = commonfloorcredit;
    }

    public Short getEndpunishcredit() {
        return endpunishcredit;
    }

    public void setEndpunishcredit(Short endpunishcredit) {
        this.endpunishcredit = endpunishcredit;
    }

    public Short getAnnualgaincredit() {
        return annualgaincredit;
    }

    public void setAnnualgaincredit(Short annualgaincredit) {
        this.annualgaincredit = annualgaincredit;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime == null ? null : worktime.trim();
    }

    public Short getTimelowerlimit() {
        return timelowerlimit;
    }

    public void setTimelowerlimit(Short timelowerlimit) {
        this.timelowerlimit = timelowerlimit;
    }

    public Short getOccupydeductcredit() {
        return occupydeductcredit;
    }

    public void setOccupydeductcredit(Short occupydeductcredit) {
        this.occupydeductcredit = occupydeductcredit;
    }

    public Short getTrainingvalidtime() {
        return trainingvalidtime;
    }

    public void setTrainingvalidtime(Short trainingvalidtime) {
        this.trainingvalidtime = trainingvalidtime;
    }

    public Short getLevelofcentre() {
        return levelofcentre;
    }

    public void setLevelofcentre(Short levelofcentre) {
        this.levelofcentre = levelofcentre;
    }

    public Date getModifiedtime() {
        return modifiedtime;
    }

    public void setModifiedtime(Date modifiedtime) {
        this.modifiedtime = modifiedtime;
    }

    public Integer getModifiedid() {
        return modifiedid;
    }

    public void setModifiedid(Integer modifiedid) {
        this.modifiedid = modifiedid;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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

    public Short getTimelowercredit() {
        return timelowercredit;
    }

    public void setTimelowercredit(Short timelowercredit) {
        this.timelowercredit = timelowercredit;
    }

    public Short getInitcredit() {
        return initcredit;
    }

    public void setInitcredit(Short initcredit) {
        this.initcredit = initcredit;
    }

    public String getBillingformula() {
        return billingformula;
    }

    public void setBillingformula(String billingformula) {
        this.billingformula = billingformula == null ? null : billingformula.trim();
    }

    public Short getSinglereward() {
        return singlereward;
    }

    public void setSinglereward(Short singlereward) {
        this.singlereward = singlereward;
    }

    public Short getSinglededuct() {
        return singlededuct;
    }

    public void setSinglededuct(Short singlededuct) {
        this.singlededuct = singlededuct;
    }

    public Short getUppercredit() {
        return uppercredit;
    }

    public void setUppercredit(Short uppercredit) {
        this.uppercredit = uppercredit;
    }

    public Short getDeductcreditbookingcancel() {
        return deductcreditbookingcancel;
    }

    public void setDeductcreditbookingcancel(Short deductcreditbookingcancel) {
        this.deductcreditbookingcancel = deductcreditbookingcancel;
    }

    public Integer getActivetimeofnewcredit() {
        return activetimeofnewcredit;
    }

    public void setActivetimeofnewcredit(Integer activetimeofnewcredit) {
        this.activetimeofnewcredit = activetimeofnewcredit;
    }

    public Integer getMajororganizationid() {
        return majororganizationid;
    }

    public void setMajororganizationid(Integer majororganizationid) {
        this.majororganizationid = majororganizationid;
    }

    public Integer getOtherorganizationid() {
        return otherorganizationid;
    }

    public void setOtherorganizationid(Integer otherorganizationid) {
        this.otherorganizationid = otherorganizationid;
    }

    public Short getExpgaincredit() {
        return expgaincredit;
    }

    public void setExpgaincredit(Short expgaincredit) {
        this.expgaincredit = expgaincredit;
    }

    public String getClientsoftwareupdateurl() {
        return clientsoftwareupdateurl;
    }

    public void setClientsoftwareupdateurl(String clientsoftwareupdateurl) {
        this.clientsoftwareupdateurl = clientsoftwareupdateurl == null ? null : clientsoftwareupdateurl.trim();
    }

    public Byte getClientsoftwareautoupdate() {
        return clientsoftwareautoupdate;
    }

    public void setClientsoftwareautoupdate(Byte clientsoftwareautoupdate) {
        this.clientsoftwareautoupdate = clientsoftwareautoupdate;
    }

    public Integer getVerifydiff() {
        return verifydiff;
    }

    public void setVerifydiff(Integer verifydiff) {
        this.verifydiff = verifydiff;
    }
}