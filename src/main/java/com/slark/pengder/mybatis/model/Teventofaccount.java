package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;

public class Teventofaccount extends TeventofaccountKey {
    private Short event;

    private Integer operator;

    private BigDecimal earlycredit;

    private BigDecimal money;

    private BigDecimal earlymoney;

    private BigDecimal moneytransaction;

    private Integer instrumentid;

    private Integer relevantaccountid;

    private Byte partitionid;

    public Short getEvent() {
        return event;
    }

    public void setEvent(Short event) {
        this.event = event;
    }

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public BigDecimal getEarlycredit() {
        return earlycredit;
    }

    public void setEarlycredit(BigDecimal earlycredit) {
        this.earlycredit = earlycredit;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getEarlymoney() {
        return earlymoney;
    }

    public void setEarlymoney(BigDecimal earlymoney) {
        this.earlymoney = earlymoney;
    }

    public BigDecimal getMoneytransaction() {
        return moneytransaction;
    }

    public void setMoneytransaction(BigDecimal moneytransaction) {
        this.moneytransaction = moneytransaction;
    }

    public Integer getInstrumentid() {
        return instrumentid;
    }

    public void setInstrumentid(Integer instrumentid) {
        this.instrumentid = instrumentid;
    }

    public Integer getRelevantaccountid() {
        return relevantaccountid;
    }

    public void setRelevantaccountid(Integer relevantaccountid) {
        this.relevantaccountid = relevantaccountid;
    }

    public Byte getPartitionid() {
        return partitionid;
    }

    public void setPartitionid(Byte partitionid) {
        this.partitionid = partitionid;
    }
}