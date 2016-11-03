package com.slark.pengder.mybatis.model;

public class Teventofuser extends TeventofuserKey {
    private Integer operator;

    private String operatevalue1;

    private Integer operatevalue2;

    private Byte partitionid;

    private Long relaterecord;

    public Integer getOperator() {
        return operator;
    }

    public void setOperator(Integer operator) {
        this.operator = operator;
    }

    public String getOperatevalue1() {
        return operatevalue1;
    }

    public void setOperatevalue1(String operatevalue1) {
        this.operatevalue1 = operatevalue1 == null ? null : operatevalue1.trim();
    }

    public Integer getOperatevalue2() {
        return operatevalue2;
    }

    public void setOperatevalue2(Integer operatevalue2) {
        this.operatevalue2 = operatevalue2;
    }

    public Byte getPartitionid() {
        return partitionid;
    }

    public void setPartitionid(Byte partitionid) {
        this.partitionid = partitionid;
    }

    public Long getRelaterecord() {
        return relaterecord;
    }

    public void setRelaterecord(Long relaterecord) {
        this.relaterecord = relaterecord;
    }
}