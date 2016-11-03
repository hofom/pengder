package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TchangingofsuppliesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TchangingofsuppliesExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("Version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("Version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Short value) {
            addCriterion("Version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Short value) {
            addCriterion("Version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Short value) {
            addCriterion("Version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("Version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Short value) {
            addCriterion("Version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Short value) {
            addCriterion("Version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Short> values) {
            addCriterion("Version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Short> values) {
            addCriterion("Version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Short value1, Short value2) {
            addCriterion("Version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Short value1, Short value2) {
            addCriterion("Version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andNewestIsNull() {
            addCriterion("Newest is null");
            return (Criteria) this;
        }

        public Criteria andNewestIsNotNull() {
            addCriterion("Newest is not null");
            return (Criteria) this;
        }

        public Criteria andNewestEqualTo(Byte value) {
            addCriterion("Newest =", value, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestNotEqualTo(Byte value) {
            addCriterion("Newest <>", value, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestGreaterThan(Byte value) {
            addCriterion("Newest >", value, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestGreaterThanOrEqualTo(Byte value) {
            addCriterion("Newest >=", value, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestLessThan(Byte value) {
            addCriterion("Newest <", value, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestLessThanOrEqualTo(Byte value) {
            addCriterion("Newest <=", value, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestIn(List<Byte> values) {
            addCriterion("Newest in", values, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestNotIn(List<Byte> values) {
            addCriterion("Newest not in", values, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestBetween(Byte value1, Byte value2) {
            addCriterion("Newest between", value1, value2, "newest");
            return (Criteria) this;
        }

        public Criteria andNewestNotBetween(Byte value1, Byte value2) {
            addCriterion("Newest not between", value1, value2, "newest");
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

        public Criteria andUserIsNull() {
            addCriterion("User is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("User is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(Integer value) {
            addCriterion("User =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(Integer value) {
            addCriterion("User <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(Integer value) {
            addCriterion("User >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("User >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(Integer value) {
            addCriterion("User <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(Integer value) {
            addCriterion("User <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<Integer> values) {
            addCriterion("User in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<Integer> values) {
            addCriterion("User not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(Integer value1, Integer value2) {
            addCriterion("User between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(Integer value1, Integer value2) {
            addCriterion("User not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("Time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("Time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("Time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("Time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("Time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("Time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("Time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("Time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("Time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("Time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("Time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("Reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("Reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("Reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("Reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("Reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("Reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("Reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("Reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("Reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("Reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("Reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("Reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("Reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("Reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andSuppliesidIsNull() {
            addCriterion("SuppliesID is null");
            return (Criteria) this;
        }

        public Criteria andSuppliesidIsNotNull() {
            addCriterion("SuppliesID is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliesidEqualTo(Integer value) {
            addCriterion("SuppliesID =", value, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidNotEqualTo(Integer value) {
            addCriterion("SuppliesID <>", value, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidGreaterThan(Integer value) {
            addCriterion("SuppliesID >", value, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidGreaterThanOrEqualTo(Integer value) {
            addCriterion("SuppliesID >=", value, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidLessThan(Integer value) {
            addCriterion("SuppliesID <", value, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidLessThanOrEqualTo(Integer value) {
            addCriterion("SuppliesID <=", value, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidIn(List<Integer> values) {
            addCriterion("SuppliesID in", values, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidNotIn(List<Integer> values) {
            addCriterion("SuppliesID not in", values, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidBetween(Integer value1, Integer value2) {
            addCriterion("SuppliesID between", value1, value2, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesidNotBetween(Integer value1, Integer value2) {
            addCriterion("SuppliesID not between", value1, value2, "suppliesid");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameIsNull() {
            addCriterion("SuppliesName is null");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameIsNotNull() {
            addCriterion("SuppliesName is not null");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameEqualTo(String value) {
            addCriterion("SuppliesName =", value, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameNotEqualTo(String value) {
            addCriterion("SuppliesName <>", value, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameGreaterThan(String value) {
            addCriterion("SuppliesName >", value, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameGreaterThanOrEqualTo(String value) {
            addCriterion("SuppliesName >=", value, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameLessThan(String value) {
            addCriterion("SuppliesName <", value, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameLessThanOrEqualTo(String value) {
            addCriterion("SuppliesName <=", value, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameLike(String value) {
            addCriterion("SuppliesName like", value, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameNotLike(String value) {
            addCriterion("SuppliesName not like", value, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameIn(List<String> values) {
            addCriterion("SuppliesName in", values, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameNotIn(List<String> values) {
            addCriterion("SuppliesName not in", values, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameBetween(String value1, String value2) {
            addCriterion("SuppliesName between", value1, value2, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andSuppliesnameNotBetween(String value1, String value2) {
            addCriterion("SuppliesName not between", value1, value2, "suppliesname");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("Quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("Quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Short value) {
            addCriterion("Quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Short value) {
            addCriterion("Quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Short value) {
            addCriterion("Quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Short value) {
            addCriterion("Quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Short value) {
            addCriterion("Quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Short value) {
            addCriterion("Quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Short> values) {
            addCriterion("Quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Short> values) {
            addCriterion("Quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Short value1, Short value2) {
            addCriterion("Quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Short value1, Short value2) {
            addCriterion("Quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("Price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("Price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("Price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("Price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("Price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("Price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("Price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("Price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andFillbyuserIsNull() {
            addCriterion("FillByUser is null");
            return (Criteria) this;
        }

        public Criteria andFillbyuserIsNotNull() {
            addCriterion("FillByUser is not null");
            return (Criteria) this;
        }

        public Criteria andFillbyuserEqualTo(String value) {
            addCriterion("FillByUser =", value, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserNotEqualTo(String value) {
            addCriterion("FillByUser <>", value, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserGreaterThan(String value) {
            addCriterion("FillByUser >", value, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserGreaterThanOrEqualTo(String value) {
            addCriterion("FillByUser >=", value, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserLessThan(String value) {
            addCriterion("FillByUser <", value, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserLessThanOrEqualTo(String value) {
            addCriterion("FillByUser <=", value, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserLike(String value) {
            addCriterion("FillByUser like", value, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserNotLike(String value) {
            addCriterion("FillByUser not like", value, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserIn(List<String> values) {
            addCriterion("FillByUser in", values, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserNotIn(List<String> values) {
            addCriterion("FillByUser not in", values, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserBetween(String value1, String value2) {
            addCriterion("FillByUser between", value1, value2, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFillbyuserNotBetween(String value1, String value2) {
            addCriterion("FillByUser not between", value1, value2, "fillbyuser");
            return (Criteria) this;
        }

        public Criteria andFilledtimeIsNull() {
            addCriterion("FilledTime is null");
            return (Criteria) this;
        }

        public Criteria andFilledtimeIsNotNull() {
            addCriterion("FilledTime is not null");
            return (Criteria) this;
        }

        public Criteria andFilledtimeEqualTo(Date value) {
            addCriterion("FilledTime =", value, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeNotEqualTo(Date value) {
            addCriterion("FilledTime <>", value, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeGreaterThan(Date value) {
            addCriterion("FilledTime >", value, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FilledTime >=", value, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeLessThan(Date value) {
            addCriterion("FilledTime <", value, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeLessThanOrEqualTo(Date value) {
            addCriterion("FilledTime <=", value, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeIn(List<Date> values) {
            addCriterion("FilledTime in", values, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeNotIn(List<Date> values) {
            addCriterion("FilledTime not in", values, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeBetween(Date value1, Date value2) {
            addCriterion("FilledTime between", value1, value2, "filledtime");
            return (Criteria) this;
        }

        public Criteria andFilledtimeNotBetween(Date value1, Date value2) {
            addCriterion("FilledTime not between", value1, value2, "filledtime");
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

        public Criteria andResearchgroupidIsNull() {
            addCriterion("ResearchGroupID is null");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidIsNotNull() {
            addCriterion("ResearchGroupID is not null");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidEqualTo(Integer value) {
            addCriterion("ResearchGroupID =", value, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidNotEqualTo(Integer value) {
            addCriterion("ResearchGroupID <>", value, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidGreaterThan(Integer value) {
            addCriterion("ResearchGroupID >", value, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ResearchGroupID >=", value, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidLessThan(Integer value) {
            addCriterion("ResearchGroupID <", value, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidLessThanOrEqualTo(Integer value) {
            addCriterion("ResearchGroupID <=", value, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidIn(List<Integer> values) {
            addCriterion("ResearchGroupID in", values, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidNotIn(List<Integer> values) {
            addCriterion("ResearchGroupID not in", values, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidBetween(Integer value1, Integer value2) {
            addCriterion("ResearchGroupID between", value1, value2, "researchgroupid");
            return (Criteria) this;
        }

        public Criteria andResearchgroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("ResearchGroupID not between", value1, value2, "researchgroupid");
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