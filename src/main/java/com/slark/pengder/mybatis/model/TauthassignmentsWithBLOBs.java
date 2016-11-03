package com.slark.pengder.mybatis.model;

public class TauthassignmentsWithBLOBs extends TauthassignmentsKey {
    private String bizrule;

    private String data;

    public String getBizrule() {
        return bizrule;
    }

    public void setBizrule(String bizrule) {
        this.bizrule = bizrule == null ? null : bizrule.trim();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data == null ? null : data.trim();
    }
}