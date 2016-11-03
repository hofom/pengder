package com.slark.pengder.mybatis.model;

import java.util.Date;

public class TExperimentFile {
    private Integer id;

    private Integer userid;

    private Integer instrumentid;

    private Integer groupid;

    private Integer activedaccount;

    private String filename;

    private String fileabsolutepath;

    private Long filesize;

    private Date filecreatetime;

    private Date addtime;

    private Integer progress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public Integer getActivedaccount() {
        return activedaccount;
    }

    public void setActivedaccount(Integer activedaccount) {
        this.activedaccount = activedaccount;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public String getFileabsolutepath() {
        return fileabsolutepath;
    }

    public void setFileabsolutepath(String fileabsolutepath) {
        this.fileabsolutepath = fileabsolutepath == null ? null : fileabsolutepath.trim();
    }

    public Long getFilesize() {
        return filesize;
    }

    public void setFilesize(Long filesize) {
        this.filesize = filesize;
    }

    public Date getFilecreatetime() {
        return filecreatetime;
    }

    public void setFilecreatetime(Date filecreatetime) {
        this.filecreatetime = filecreatetime;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }
}