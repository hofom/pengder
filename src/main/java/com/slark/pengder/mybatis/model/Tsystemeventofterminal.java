package com.slark.pengder.mybatis.model;

import java.util.Date;

public class Tsystemeventofterminal {
    private Long id;

    private String terminalmac;

    private Integer instrumentid;

    private Integer eventtypeid;

    private Date createdtime;

    private Long eventcontent;

    private Date syntime;

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

    public Integer getEventtypeid() {
        return eventtypeid;
    }

    public void setEventtypeid(Integer eventtypeid) {
        this.eventtypeid = eventtypeid;
    }

    public Date getCreatedtime() {
        return createdtime;
    }

    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    public Long getEventcontent() {
        return eventcontent;
    }

    public void setEventcontent(Long eventcontent) {
        this.eventcontent = eventcontent;
    }

    public Date getSyntime() {
        return syntime;
    }

    public void setSyntime(Date syntime) {
        this.syntime = syntime;
    }
}