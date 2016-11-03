package com.slark.pengder.mybatis.model;

import java.util.Date;

public class TuserintrainingsessionKey {
    private Long sessionid;

    private Integer userid;

    private Integer cardserial;

    private Date checkedintime;

    public Long getSessionid() {
        return sessionid;
    }

    public void setSessionid(Long sessionid) {
        this.sessionid = sessionid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCardserial() {
        return cardserial;
    }

    public void setCardserial(Integer cardserial) {
        this.cardserial = cardserial;
    }

    public Date getCheckedintime() {
        return checkedintime;
    }

    public void setCheckedintime(Date checkedintime) {
        this.checkedintime = checkedintime;
    }
}