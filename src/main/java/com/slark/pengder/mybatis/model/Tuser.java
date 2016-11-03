package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Tuser {
    private Integer id;

    private String loginname;

    private String password;

    private Integer userroleid;

    private Byte gender;

    private Date logintime;

    private Date lastlogintime;

    private Date lastsetpasswordtime;

    private Date lastresetpasswordtime;

    private Byte passwordattemptcount;

    private Byte locked;

    private Short userstate;

    private Date registertime;

    private Date approvedtime;

    private String firstname;

    private String lastname;

    private String useridentify;

    private String email1;

    private String email2;

    private String mobilephone1;

    private String mobilephone2;

    private String telephone1;

    private String telephone2;

    private Integer cardid;

    private Date lastsetcardidtime;

    private Integer usedcardid1;

    private Integer usedcardid2;

    private Integer usedcardid3;

    private Byte pi;

    private Short position;

    private Short attritiontype;

    private String photo;

    private Integer activedaccount;

    private Integer relateduserid;

    private String comment;

    private String address;

    private Date expireofblack;

    private Long jid;

    private Short credit;

    private String workorganization;

    private String researchgroup;

    private Long emailverificationkey;

    private Boolean isemailverified;

    private Byte privatemanager;

    private Integer ykttime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUserroleid() {
        return userroleid;
    }

    public void setUserroleid(Integer userroleid) {
        this.userroleid = userroleid;
    }

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public Date getLastsetpasswordtime() {
        return lastsetpasswordtime;
    }

    public void setLastsetpasswordtime(Date lastsetpasswordtime) {
        this.lastsetpasswordtime = lastsetpasswordtime;
    }

    public Date getLastresetpasswordtime() {
        return lastresetpasswordtime;
    }

    public void setLastresetpasswordtime(Date lastresetpasswordtime) {
        this.lastresetpasswordtime = lastresetpasswordtime;
    }

    public Byte getPasswordattemptcount() {
        return passwordattemptcount;
    }

    public void setPasswordattemptcount(Byte passwordattemptcount) {
        this.passwordattemptcount = passwordattemptcount;
    }

    public Byte getLocked() {
        return locked;
    }

    public void setLocked(Byte locked) {
        this.locked = locked;
    }

    public Short getUserstate() {
        return userstate;
    }

    public void setUserstate(Short userstate) {
        this.userstate = userstate;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Date getApprovedtime() {
        return approvedtime;
    }

    public void setApprovedtime(Date approvedtime) {
        this.approvedtime = approvedtime;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname == null ? null : firstname.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getUseridentify() {
        return useridentify;
    }

    public void setUseridentify(String useridentify) {
        this.useridentify = useridentify == null ? null : useridentify.trim();
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1 == null ? null : email1.trim();
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2 == null ? null : email2.trim();
    }

    public String getMobilephone1() {
        return mobilephone1;
    }

    public void setMobilephone1(String mobilephone1) {
        this.mobilephone1 = mobilephone1 == null ? null : mobilephone1.trim();
    }

    public String getMobilephone2() {
        return mobilephone2;
    }

    public void setMobilephone2(String mobilephone2) {
        this.mobilephone2 = mobilephone2 == null ? null : mobilephone2.trim();
    }

    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1 == null ? null : telephone1.trim();
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2 == null ? null : telephone2.trim();
    }

    public Integer getCardid() {
        return cardid;
    }

    public void setCardid(Integer cardid) {
        this.cardid = cardid;
    }

    public Date getLastsetcardidtime() {
        return lastsetcardidtime;
    }

    public void setLastsetcardidtime(Date lastsetcardidtime) {
        this.lastsetcardidtime = lastsetcardidtime;
    }

    public Integer getUsedcardid1() {
        return usedcardid1;
    }

    public void setUsedcardid1(Integer usedcardid1) {
        this.usedcardid1 = usedcardid1;
    }

    public Integer getUsedcardid2() {
        return usedcardid2;
    }

    public void setUsedcardid2(Integer usedcardid2) {
        this.usedcardid2 = usedcardid2;
    }

    public Integer getUsedcardid3() {
        return usedcardid3;
    }

    public void setUsedcardid3(Integer usedcardid3) {
        this.usedcardid3 = usedcardid3;
    }

    public Byte getPi() {
        return pi;
    }

    public void setPi(Byte pi) {
        this.pi = pi;
    }

    public Short getPosition() {
        return position;
    }

    public void setPosition(Short position) {
        this.position = position;
    }

    public Short getAttritiontype() {
        return attritiontype;
    }

    public void setAttritiontype(Short attritiontype) {
        this.attritiontype = attritiontype;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Integer getActivedaccount() {
        return activedaccount;
    }

    public void setActivedaccount(Integer activedaccount) {
        this.activedaccount = activedaccount;
    }

    public Integer getRelateduserid() {
        return relateduserid;
    }

    public void setRelateduserid(Integer relateduserid) {
        this.relateduserid = relateduserid;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getExpireofblack() {
        return expireofblack;
    }

    public void setExpireofblack(Date expireofblack) {
        this.expireofblack = expireofblack;
    }

    public Long getJid() {
        return jid;
    }

    public void setJid(Long jid) {
        this.jid = jid;
    }

    public Short getCredit() {
        return credit;
    }

    public void setCredit(Short credit) {
        this.credit = credit;
    }

    public String getWorkorganization() {
        return workorganization;
    }

    public void setWorkorganization(String workorganization) {
        this.workorganization = workorganization == null ? null : workorganization.trim();
    }

    public String getResearchgroup() {
        return researchgroup;
    }

    public void setResearchgroup(String researchgroup) {
        this.researchgroup = researchgroup == null ? null : researchgroup.trim();
    }

    public Long getEmailverificationkey() {
        return emailverificationkey;
    }

    public void setEmailverificationkey(Long emailverificationkey) {
        this.emailverificationkey = emailverificationkey;
    }

    public Boolean getIsemailverified() {
        return isemailverified;
    }

    public void setIsemailverified(Boolean isemailverified) {
        this.isemailverified = isemailverified;
    }

    public Byte getPrivatemanager() {
        return privatemanager;
    }

    public void setPrivatemanager(Byte privatemanager) {
        this.privatemanager = privatemanager;
    }

    public Integer getYkttime() {
        return ykttime;
    }

    public void setYkttime(Integer ykttime) {
        this.ykttime = ykttime;
    }
}