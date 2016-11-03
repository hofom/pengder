package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Tuserright extends TuserrightKey {
    private Short userrightid;

    private Short temporaryrightid;

    private Date expiretime;

    private Integer grantedid;

    private Date grantedtime;

    private Integer receivesyntick;

    private Integer applysyntick;

    public Short getUserrightid() {
        return userrightid;
    }

    public void setUserrightid(Short userrightid) {
        this.userrightid = userrightid;
    }

    public Short getTemporaryrightid() {
        return temporaryrightid;
    }

    public void setTemporaryrightid(Short temporaryrightid) {
        this.temporaryrightid = temporaryrightid;
    }

    public Date getExpiretime() {
        return expiretime;
    }

    public void setExpiretime(Date expiretime) {
        this.expiretime = expiretime;
    }

    public Integer getGrantedid() {
        return grantedid;
    }

    public void setGrantedid(Integer grantedid) {
        this.grantedid = grantedid;
    }

    public Date getGrantedtime() {
        return grantedtime;
    }

    public void setGrantedtime(Date grantedtime) {
        this.grantedtime = grantedtime;
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
}