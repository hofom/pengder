package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrecordofuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrecordofuserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andBoottimeIsNull() {
            addCriterion("BootTime is null");
            return (Criteria) this;
        }

        public Criteria andBoottimeIsNotNull() {
            addCriterion("BootTime is not null");
            return (Criteria) this;
        }

        public Criteria andBoottimeEqualTo(Integer value) {
            addCriterion("BootTime =", value, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeNotEqualTo(Integer value) {
            addCriterion("BootTime <>", value, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeGreaterThan(Integer value) {
            addCriterion("BootTime >", value, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BootTime >=", value, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeLessThan(Integer value) {
            addCriterion("BootTime <", value, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeLessThanOrEqualTo(Integer value) {
            addCriterion("BootTime <=", value, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeIn(List<Integer> values) {
            addCriterion("BootTime in", values, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeNotIn(List<Integer> values) {
            addCriterion("BootTime not in", values, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeBetween(Integer value1, Integer value2) {
            addCriterion("BootTime between", value1, value2, "boottime");
            return (Criteria) this;
        }

        public Criteria andBoottimeNotBetween(Integer value1, Integer value2) {
            addCriterion("BootTime not between", value1, value2, "boottime");
            return (Criteria) this;
        }

        public Criteria andRecordIsNull() {
            addCriterion("Record is null");
            return (Criteria) this;
        }

        public Criteria andRecordIsNotNull() {
            addCriterion("Record is not null");
            return (Criteria) this;
        }

        public Criteria andRecordEqualTo(Integer value) {
            addCriterion("Record =", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotEqualTo(Integer value) {
            addCriterion("Record <>", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThan(Integer value) {
            addCriterion("Record >", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordGreaterThanOrEqualTo(Integer value) {
            addCriterion("Record >=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThan(Integer value) {
            addCriterion("Record <", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordLessThanOrEqualTo(Integer value) {
            addCriterion("Record <=", value, "record");
            return (Criteria) this;
        }

        public Criteria andRecordIn(List<Integer> values) {
            addCriterion("Record in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotIn(List<Integer> values) {
            addCriterion("Record not in", values, "record");
            return (Criteria) this;
        }

        public Criteria andRecordBetween(Integer value1, Integer value2) {
            addCriterion("Record between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andRecordNotBetween(Integer value1, Integer value2) {
            addCriterion("Record not between", value1, value2, "record");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("AccountID is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("AccountID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(Integer value) {
            addCriterion("AccountID =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(Integer value) {
            addCriterion("AccountID <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(Integer value) {
            addCriterion("AccountID >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AccountID >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(Integer value) {
            addCriterion("AccountID <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(Integer value) {
            addCriterion("AccountID <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<Integer> values) {
            addCriterion("AccountID in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<Integer> values) {
            addCriterion("AccountID not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(Integer value1, Integer value2) {
            addCriterion("AccountID between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("AccountID not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNull() {
            addCriterion("GroupID is null");
            return (Criteria) this;
        }

        public Criteria andGroupidIsNotNull() {
            addCriterion("GroupID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupidEqualTo(Integer value) {
            addCriterion("GroupID =", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotEqualTo(Integer value) {
            addCriterion("GroupID <>", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThan(Integer value) {
            addCriterion("GroupID >", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GroupID >=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThan(Integer value) {
            addCriterion("GroupID <", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("GroupID <=", value, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidIn(List<Integer> values) {
            addCriterion("GroupID in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotIn(List<Integer> values) {
            addCriterion("GroupID not in", values, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidBetween(Integer value1, Integer value2) {
            addCriterion("GroupID between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("GroupID not between", value1, value2, "groupid");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("Discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("Discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Integer value) {
            addCriterion("Discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Integer value) {
            addCriterion("Discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Integer value) {
            addCriterion("Discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Integer value) {
            addCriterion("Discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Integer value) {
            addCriterion("Discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Integer> values) {
            addCriterion("Discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Integer> values) {
            addCriterion("Discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Integer value1, Integer value2) {
            addCriterion("Discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("Discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("Invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("Invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Short value) {
            addCriterion("Invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Short value) {
            addCriterion("Invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Short value) {
            addCriterion("Invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Short value) {
            addCriterion("Invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Short value) {
            addCriterion("Invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Short value) {
            addCriterion("Invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Short> values) {
            addCriterion("Invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Short> values) {
            addCriterion("Invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Short value1, Short value2) {
            addCriterion("Invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Short value1, Short value2) {
            addCriterion("Invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andBlacklistIsNull() {
            addCriterion("BlackList is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistIsNotNull() {
            addCriterion("BlackList is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistEqualTo(Short value) {
            addCriterion("BlackList =", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistNotEqualTo(Short value) {
            addCriterion("BlackList <>", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistGreaterThan(Short value) {
            addCriterion("BlackList >", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistGreaterThanOrEqualTo(Short value) {
            addCriterion("BlackList >=", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistLessThan(Short value) {
            addCriterion("BlackList <", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistLessThanOrEqualTo(Short value) {
            addCriterion("BlackList <=", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistIn(List<Short> values) {
            addCriterion("BlackList in", values, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistNotIn(List<Short> values) {
            addCriterion("BlackList not in", values, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistBetween(Short value1, Short value2) {
            addCriterion("BlackList between", value1, value2, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistNotBetween(Short value1, Short value2) {
            addCriterion("BlackList not between", value1, value2, "blacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistIsNull() {
            addCriterion("InBlackList is null");
            return (Criteria) this;
        }

        public Criteria andInblacklistIsNotNull() {
            addCriterion("InBlackList is not null");
            return (Criteria) this;
        }

        public Criteria andInblacklistEqualTo(Boolean value) {
            addCriterion("InBlackList =", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistNotEqualTo(Boolean value) {
            addCriterion("InBlackList <>", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistGreaterThan(Boolean value) {
            addCriterion("InBlackList >", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistGreaterThanOrEqualTo(Boolean value) {
            addCriterion("InBlackList >=", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistLessThan(Boolean value) {
            addCriterion("InBlackList <", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistLessThanOrEqualTo(Boolean value) {
            addCriterion("InBlackList <=", value, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistIn(List<Boolean> values) {
            addCriterion("InBlackList in", values, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistNotIn(List<Boolean> values) {
            addCriterion("InBlackList not in", values, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistBetween(Boolean value1, Boolean value2) {
            addCriterion("InBlackList between", value1, value2, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andInblacklistNotBetween(Boolean value1, Boolean value2) {
            addCriterion("InBlackList not between", value1, value2, "inblacklist");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountIsNull() {
            addCriterion("QualificationDiscount is null");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountIsNotNull() {
            addCriterion("QualificationDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountEqualTo(Integer value) {
            addCriterion("QualificationDiscount =", value, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountNotEqualTo(Integer value) {
            addCriterion("QualificationDiscount <>", value, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountGreaterThan(Integer value) {
            addCriterion("QualificationDiscount >", value, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("QualificationDiscount >=", value, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountLessThan(Integer value) {
            addCriterion("QualificationDiscount <", value, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountLessThanOrEqualTo(Integer value) {
            addCriterion("QualificationDiscount <=", value, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountIn(List<Integer> values) {
            addCriterion("QualificationDiscount in", values, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountNotIn(List<Integer> values) {
            addCriterion("QualificationDiscount not in", values, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountBetween(Integer value1, Integer value2) {
            addCriterion("QualificationDiscount between", value1, value2, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andQualificationdiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("QualificationDiscount not between", value1, value2, "qualificationdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountIsNull() {
            addCriterion("ApparatusDiscount is null");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountIsNotNull() {
            addCriterion("ApparatusDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountEqualTo(Integer value) {
            addCriterion("ApparatusDiscount =", value, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountNotEqualTo(Integer value) {
            addCriterion("ApparatusDiscount <>", value, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountGreaterThan(Integer value) {
            addCriterion("ApparatusDiscount >", value, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApparatusDiscount >=", value, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountLessThan(Integer value) {
            addCriterion("ApparatusDiscount <", value, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountLessThanOrEqualTo(Integer value) {
            addCriterion("ApparatusDiscount <=", value, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountIn(List<Integer> values) {
            addCriterion("ApparatusDiscount in", values, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountNotIn(List<Integer> values) {
            addCriterion("ApparatusDiscount not in", values, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountBetween(Integer value1, Integer value2) {
            addCriterion("ApparatusDiscount between", value1, value2, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andApparatusdiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("ApparatusDiscount not between", value1, value2, "apparatusdiscount");
            return (Criteria) this;
        }

        public Criteria andManualaddIsNull() {
            addCriterion("ManualAdd is null");
            return (Criteria) this;
        }

        public Criteria andManualaddIsNotNull() {
            addCriterion("ManualAdd is not null");
            return (Criteria) this;
        }

        public Criteria andManualaddEqualTo(Byte value) {
            addCriterion("ManualAdd =", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddNotEqualTo(Byte value) {
            addCriterion("ManualAdd <>", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddGreaterThan(Byte value) {
            addCriterion("ManualAdd >", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddGreaterThanOrEqualTo(Byte value) {
            addCriterion("ManualAdd >=", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddLessThan(Byte value) {
            addCriterion("ManualAdd <", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddLessThanOrEqualTo(Byte value) {
            addCriterion("ManualAdd <=", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddIn(List<Byte> values) {
            addCriterion("ManualAdd in", values, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddNotIn(List<Byte> values) {
            addCriterion("ManualAdd not in", values, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddBetween(Byte value1, Byte value2) {
            addCriterion("ManualAdd between", value1, value2, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddNotBetween(Byte value1, Byte value2) {
            addCriterion("ManualAdd not between", value1, value2, "manualadd");
            return (Criteria) this;
        }

        public Criteria andPartitionidIsNull() {
            addCriterion("PartitionID is null");
            return (Criteria) this;
        }

        public Criteria andPartitionidIsNotNull() {
            addCriterion("PartitionID is not null");
            return (Criteria) this;
        }

        public Criteria andPartitionidEqualTo(Byte value) {
            addCriterion("PartitionID =", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidNotEqualTo(Byte value) {
            addCriterion("PartitionID <>", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidGreaterThan(Byte value) {
            addCriterion("PartitionID >", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidGreaterThanOrEqualTo(Byte value) {
            addCriterion("PartitionID >=", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidLessThan(Byte value) {
            addCriterion("PartitionID <", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidLessThanOrEqualTo(Byte value) {
            addCriterion("PartitionID <=", value, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidIn(List<Byte> values) {
            addCriterion("PartitionID in", values, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidNotIn(List<Byte> values) {
            addCriterion("PartitionID not in", values, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidBetween(Byte value1, Byte value2) {
            addCriterion("PartitionID between", value1, value2, "partitionid");
            return (Criteria) this;
        }

        public Criteria andPartitionidNotBetween(Byte value1, Byte value2) {
            addCriterion("PartitionID not between", value1, value2, "partitionid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountIsNull() {
            addCriterion("GroupDiscount is null");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountIsNotNull() {
            addCriterion("GroupDiscount is not null");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountEqualTo(Integer value) {
            addCriterion("GroupDiscount =", value, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountNotEqualTo(Integer value) {
            addCriterion("GroupDiscount <>", value, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountGreaterThan(Integer value) {
            addCriterion("GroupDiscount >", value, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountGreaterThanOrEqualTo(Integer value) {
            addCriterion("GroupDiscount >=", value, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountLessThan(Integer value) {
            addCriterion("GroupDiscount <", value, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountLessThanOrEqualTo(Integer value) {
            addCriterion("GroupDiscount <=", value, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountIn(List<Integer> values) {
            addCriterion("GroupDiscount in", values, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountNotIn(List<Integer> values) {
            addCriterion("GroupDiscount not in", values, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountBetween(Integer value1, Integer value2) {
            addCriterion("GroupDiscount between", value1, value2, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andGroupdiscountNotBetween(Integer value1, Integer value2) {
            addCriterion("GroupDiscount not between", value1, value2, "groupdiscount");
            return (Criteria) this;
        }

        public Criteria andShouldchargeIsNull() {
            addCriterion("ShouldCharge is null");
            return (Criteria) this;
        }

        public Criteria andShouldchargeIsNotNull() {
            addCriterion("ShouldCharge is not null");
            return (Criteria) this;
        }

        public Criteria andShouldchargeEqualTo(BigDecimal value) {
            addCriterion("ShouldCharge =", value, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeNotEqualTo(BigDecimal value) {
            addCriterion("ShouldCharge <>", value, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeGreaterThan(BigDecimal value) {
            addCriterion("ShouldCharge >", value, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ShouldCharge >=", value, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeLessThan(BigDecimal value) {
            addCriterion("ShouldCharge <", value, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ShouldCharge <=", value, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeIn(List<BigDecimal> values) {
            addCriterion("ShouldCharge in", values, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeNotIn(List<BigDecimal> values) {
            addCriterion("ShouldCharge not in", values, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShouldCharge between", value1, value2, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andShouldchargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ShouldCharge not between", value1, value2, "shouldcharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeIsNull() {
            addCriterion("HaveCharge is null");
            return (Criteria) this;
        }

        public Criteria andHavechargeIsNotNull() {
            addCriterion("HaveCharge is not null");
            return (Criteria) this;
        }

        public Criteria andHavechargeEqualTo(BigDecimal value) {
            addCriterion("HaveCharge =", value, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeNotEqualTo(BigDecimal value) {
            addCriterion("HaveCharge <>", value, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeGreaterThan(BigDecimal value) {
            addCriterion("HaveCharge >", value, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("HaveCharge >=", value, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeLessThan(BigDecimal value) {
            addCriterion("HaveCharge <", value, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("HaveCharge <=", value, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeIn(List<BigDecimal> values) {
            addCriterion("HaveCharge in", values, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeNotIn(List<BigDecimal> values) {
            addCriterion("HaveCharge not in", values, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HaveCharge between", value1, value2, "havecharge");
            return (Criteria) this;
        }

        public Criteria andHavechargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("HaveCharge not between", value1, value2, "havecharge");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("Credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("Credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Short value) {
            addCriterion("Credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Short value) {
            addCriterion("Credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Short value) {
            addCriterion("Credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Short value) {
            addCriterion("Credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Short value) {
            addCriterion("Credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Short value) {
            addCriterion("Credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Short> values) {
            addCriterion("Credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Short> values) {
            addCriterion("Credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Short value1, Short value2) {
            addCriterion("Credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Short value1, Short value2) {
            addCriterion("Credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreatedidIsNull() {
            addCriterion("CreatedID is null");
            return (Criteria) this;
        }

        public Criteria andCreatedidIsNotNull() {
            addCriterion("CreatedID is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedidEqualTo(Integer value) {
            addCriterion("CreatedID =", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotEqualTo(Integer value) {
            addCriterion("CreatedID <>", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThan(Integer value) {
            addCriterion("CreatedID >", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreatedID >=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThan(Integer value) {
            addCriterion("CreatedID <", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThanOrEqualTo(Integer value) {
            addCriterion("CreatedID <=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidIn(List<Integer> values) {
            addCriterion("CreatedID in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotIn(List<Integer> values) {
            addCriterion("CreatedID not in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidBetween(Integer value1, Integer value2) {
            addCriterion("CreatedID between", value1, value2, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotBetween(Integer value1, Integer value2) {
            addCriterion("CreatedID not between", value1, value2, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNull() {
            addCriterion("CreatedTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIsNotNull() {
            addCriterion("CreatedTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeEqualTo(Date value) {
            addCriterion("CreatedTime =", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotEqualTo(Date value) {
            addCriterion("CreatedTime <>", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThan(Date value) {
            addCriterion("CreatedTime >", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedTime >=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThan(Date value) {
            addCriterion("CreatedTime <", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeLessThanOrEqualTo(Date value) {
            addCriterion("CreatedTime <=", value, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeIn(List<Date> values) {
            addCriterion("CreatedTime in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotIn(List<Date> values) {
            addCriterion("CreatedTime not in", values, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeBetween(Date value1, Date value2) {
            addCriterion("CreatedTime between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andCreatedtimeNotBetween(Date value1, Date value2) {
            addCriterion("CreatedTime not between", value1, value2, "createdtime");
            return (Criteria) this;
        }

        public Criteria andModifiedidIsNull() {
            addCriterion("ModifiedID is null");
            return (Criteria) this;
        }

        public Criteria andModifiedidIsNotNull() {
            addCriterion("ModifiedID is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedidEqualTo(Integer value) {
            addCriterion("ModifiedID =", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotEqualTo(Integer value) {
            addCriterion("ModifiedID <>", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidGreaterThan(Integer value) {
            addCriterion("ModifiedID >", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ModifiedID >=", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidLessThan(Integer value) {
            addCriterion("ModifiedID <", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidLessThanOrEqualTo(Integer value) {
            addCriterion("ModifiedID <=", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidIn(List<Integer> values) {
            addCriterion("ModifiedID in", values, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotIn(List<Integer> values) {
            addCriterion("ModifiedID not in", values, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidBetween(Integer value1, Integer value2) {
            addCriterion("ModifiedID between", value1, value2, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotBetween(Integer value1, Integer value2) {
            addCriterion("ModifiedID not between", value1, value2, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNull() {
            addCriterion("ModifiedTime is null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIsNotNull() {
            addCriterion("ModifiedTime is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeEqualTo(Date value) {
            addCriterion("ModifiedTime =", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotEqualTo(Date value) {
            addCriterion("ModifiedTime <>", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThan(Date value) {
            addCriterion("ModifiedTime >", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifiedTime >=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThan(Date value) {
            addCriterion("ModifiedTime <", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeLessThanOrEqualTo(Date value) {
            addCriterion("ModifiedTime <=", value, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeIn(List<Date> values) {
            addCriterion("ModifiedTime in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotIn(List<Date> values) {
            addCriterion("ModifiedTime not in", values, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeBetween(Date value1, Date value2) {
            addCriterion("ModifiedTime between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andModifiedtimeNotBetween(Date value1, Date value2) {
            addCriterion("ModifiedTime not between", value1, value2, "modifiedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedidIsNull() {
            addCriterion("DeletedID is null");
            return (Criteria) this;
        }

        public Criteria andDeletedidIsNotNull() {
            addCriterion("DeletedID is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedidEqualTo(Integer value) {
            addCriterion("DeletedID =", value, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidNotEqualTo(Integer value) {
            addCriterion("DeletedID <>", value, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidGreaterThan(Integer value) {
            addCriterion("DeletedID >", value, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("DeletedID >=", value, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidLessThan(Integer value) {
            addCriterion("DeletedID <", value, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidLessThanOrEqualTo(Integer value) {
            addCriterion("DeletedID <=", value, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidIn(List<Integer> values) {
            addCriterion("DeletedID in", values, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidNotIn(List<Integer> values) {
            addCriterion("DeletedID not in", values, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidBetween(Integer value1, Integer value2) {
            addCriterion("DeletedID between", value1, value2, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedidNotBetween(Integer value1, Integer value2) {
            addCriterion("DeletedID not between", value1, value2, "deletedid");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeIsNull() {
            addCriterion("DeletedTime is null");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeIsNotNull() {
            addCriterion("DeletedTime is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeEqualTo(Date value) {
            addCriterion("DeletedTime =", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeNotEqualTo(Date value) {
            addCriterion("DeletedTime <>", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeGreaterThan(Date value) {
            addCriterion("DeletedTime >", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DeletedTime >=", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeLessThan(Date value) {
            addCriterion("DeletedTime <", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeLessThanOrEqualTo(Date value) {
            addCriterion("DeletedTime <=", value, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeIn(List<Date> values) {
            addCriterion("DeletedTime in", values, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeNotIn(List<Date> values) {
            addCriterion("DeletedTime not in", values, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeBetween(Date value1, Date value2) {
            addCriterion("DeletedTime between", value1, value2, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andDeletedtimeNotBetween(Date value1, Date value2) {
            addCriterion("DeletedTime not between", value1, value2, "deletedtime");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileIsNull() {
            addCriterion("RelevantProfile is null");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileIsNotNull() {
            addCriterion("RelevantProfile is not null");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileEqualTo(Integer value) {
            addCriterion("RelevantProfile =", value, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileNotEqualTo(Integer value) {
            addCriterion("RelevantProfile <>", value, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileGreaterThan(Integer value) {
            addCriterion("RelevantProfile >", value, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileGreaterThanOrEqualTo(Integer value) {
            addCriterion("RelevantProfile >=", value, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileLessThan(Integer value) {
            addCriterion("RelevantProfile <", value, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileLessThanOrEqualTo(Integer value) {
            addCriterion("RelevantProfile <=", value, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileIn(List<Integer> values) {
            addCriterion("RelevantProfile in", values, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileNotIn(List<Integer> values) {
            addCriterion("RelevantProfile not in", values, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileBetween(Integer value1, Integer value2) {
            addCriterion("RelevantProfile between", value1, value2, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andRelevantprofileNotBetween(Integer value1, Integer value2) {
            addCriterion("RelevantProfile not between", value1, value2, "relevantprofile");
            return (Criteria) this;
        }

        public Criteria andCardidIsNull() {
            addCriterion("CardID is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("CardID is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(Integer value) {
            addCriterion("CardID =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(Integer value) {
            addCriterion("CardID <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(Integer value) {
            addCriterion("CardID >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CardID >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(Integer value) {
            addCriterion("CardID <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(Integer value) {
            addCriterion("CardID <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<Integer> values) {
            addCriterion("CardID in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<Integer> values) {
            addCriterion("CardID not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(Integer value1, Integer value2) {
            addCriterion("CardID between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(Integer value1, Integer value2) {
            addCriterion("CardID not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidIsNull() {
            addCriterion("InstrumentID is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentidIsNotNull() {
            addCriterion("InstrumentID is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentidEqualTo(Integer value) {
            addCriterion("InstrumentID =", value, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidNotEqualTo(Integer value) {
            addCriterion("InstrumentID <>", value, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidGreaterThan(Integer value) {
            addCriterion("InstrumentID >", value, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("InstrumentID >=", value, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidLessThan(Integer value) {
            addCriterion("InstrumentID <", value, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidLessThanOrEqualTo(Integer value) {
            addCriterion("InstrumentID <=", value, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidIn(List<Integer> values) {
            addCriterion("InstrumentID in", values, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidNotIn(List<Integer> values) {
            addCriterion("InstrumentID not in", values, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidBetween(Integer value1, Integer value2) {
            addCriterion("InstrumentID between", value1, value2, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andInstrumentidNotBetween(Integer value1, Integer value2) {
            addCriterion("InstrumentID not between", value1, value2, "instrumentid");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("Comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("Comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("Comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("Comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("Comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("Comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("Comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("Comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("Comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("Comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("Comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("Comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("Comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andManageraveservIsNull() {
            addCriterion("ManagerAveServ is null");
            return (Criteria) this;
        }

        public Criteria andManageraveservIsNotNull() {
            addCriterion("ManagerAveServ is not null");
            return (Criteria) this;
        }

        public Criteria andManageraveservEqualTo(Integer value) {
            addCriterion("ManagerAveServ =", value, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservNotEqualTo(Integer value) {
            addCriterion("ManagerAveServ <>", value, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservGreaterThan(Integer value) {
            addCriterion("ManagerAveServ >", value, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservGreaterThanOrEqualTo(Integer value) {
            addCriterion("ManagerAveServ >=", value, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservLessThan(Integer value) {
            addCriterion("ManagerAveServ <", value, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservLessThanOrEqualTo(Integer value) {
            addCriterion("ManagerAveServ <=", value, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservIn(List<Integer> values) {
            addCriterion("ManagerAveServ in", values, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservNotIn(List<Integer> values) {
            addCriterion("ManagerAveServ not in", values, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservBetween(Integer value1, Integer value2) {
            addCriterion("ManagerAveServ between", value1, value2, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andManageraveservNotBetween(Integer value1, Integer value2) {
            addCriterion("ManagerAveServ not between", value1, value2, "manageraveserv");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeIsNull() {
            addCriterion("UserAttritionType is null");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeIsNotNull() {
            addCriterion("UserAttritionType is not null");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeEqualTo(Integer value) {
            addCriterion("UserAttritionType =", value, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeNotEqualTo(Integer value) {
            addCriterion("UserAttritionType <>", value, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeGreaterThan(Integer value) {
            addCriterion("UserAttritionType >", value, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserAttritionType >=", value, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeLessThan(Integer value) {
            addCriterion("UserAttritionType <", value, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeLessThanOrEqualTo(Integer value) {
            addCriterion("UserAttritionType <=", value, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeIn(List<Integer> values) {
            addCriterion("UserAttritionType in", values, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeNotIn(List<Integer> values) {
            addCriterion("UserAttritionType not in", values, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeBetween(Integer value1, Integer value2) {
            addCriterion("UserAttritionType between", value1, value2, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserattritiontypeNotBetween(Integer value1, Integer value2) {
            addCriterion("UserAttritionType not between", value1, value2, "userattritiontype");
            return (Criteria) this;
        }

        public Criteria andUserorganizationIsNull() {
            addCriterion("UserOrganization is null");
            return (Criteria) this;
        }

        public Criteria andUserorganizationIsNotNull() {
            addCriterion("UserOrganization is not null");
            return (Criteria) this;
        }

        public Criteria andUserorganizationEqualTo(String value) {
            addCriterion("UserOrganization =", value, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationNotEqualTo(String value) {
            addCriterion("UserOrganization <>", value, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationGreaterThan(String value) {
            addCriterion("UserOrganization >", value, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationGreaterThanOrEqualTo(String value) {
            addCriterion("UserOrganization >=", value, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationLessThan(String value) {
            addCriterion("UserOrganization <", value, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationLessThanOrEqualTo(String value) {
            addCriterion("UserOrganization <=", value, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationLike(String value) {
            addCriterion("UserOrganization like", value, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationNotLike(String value) {
            addCriterion("UserOrganization not like", value, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationIn(List<String> values) {
            addCriterion("UserOrganization in", values, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationNotIn(List<String> values) {
            addCriterion("UserOrganization not in", values, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationBetween(String value1, String value2) {
            addCriterion("UserOrganization between", value1, value2, "userorganization");
            return (Criteria) this;
        }

        public Criteria andUserorganizationNotBetween(String value1, String value2) {
            addCriterion("UserOrganization not between", value1, value2, "userorganization");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Short value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Short value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Short value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Short value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Short value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Short value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Short> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Short> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Short value1, Short value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Short value1, Short value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}