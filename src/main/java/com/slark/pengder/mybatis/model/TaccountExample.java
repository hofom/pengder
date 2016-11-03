package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaccountExample() {
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

        public Criteria andAccountnameIsNull() {
            addCriterion("AccountName is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("AccountName is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("AccountName =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("AccountName <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("AccountName >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("AccountName >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("AccountName <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("AccountName <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("AccountName like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("AccountName not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("AccountName in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("AccountName not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("AccountName between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("AccountName not between", value1, value2, "accountname");
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

        public Criteria andMoneyIsNull() {
            addCriterion("Money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("Money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("Money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("Money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("Money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("Money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("Money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("Money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNull() {
            addCriterion("AccountType is null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIsNotNull() {
            addCriterion("AccountType is not null");
            return (Criteria) this;
        }

        public Criteria andAccounttypeEqualTo(Short value) {
            addCriterion("AccountType =", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotEqualTo(Short value) {
            addCriterion("AccountType <>", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThan(Short value) {
            addCriterion("AccountType >", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeGreaterThanOrEqualTo(Short value) {
            addCriterion("AccountType >=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThan(Short value) {
            addCriterion("AccountType <", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeLessThanOrEqualTo(Short value) {
            addCriterion("AccountType <=", value, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeIn(List<Short> values) {
            addCriterion("AccountType in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotIn(List<Short> values) {
            addCriterion("AccountType not in", values, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeBetween(Short value1, Short value2) {
            addCriterion("AccountType between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andAccounttypeNotBetween(Short value1, Short value2) {
            addCriterion("AccountType not between", value1, value2, "accounttype");
            return (Criteria) this;
        }

        public Criteria andNewcreditIsNull() {
            addCriterion("NewCredit is null");
            return (Criteria) this;
        }

        public Criteria andNewcreditIsNotNull() {
            addCriterion("NewCredit is not null");
            return (Criteria) this;
        }

        public Criteria andNewcreditEqualTo(BigDecimal value) {
            addCriterion("NewCredit =", value, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditNotEqualTo(BigDecimal value) {
            addCriterion("NewCredit <>", value, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditGreaterThan(BigDecimal value) {
            addCriterion("NewCredit >", value, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NewCredit >=", value, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditLessThan(BigDecimal value) {
            addCriterion("NewCredit <", value, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NewCredit <=", value, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditIn(List<BigDecimal> values) {
            addCriterion("NewCredit in", values, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditNotIn(List<BigDecimal> values) {
            addCriterion("NewCredit not in", values, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NewCredit between", value1, value2, "newcredit");
            return (Criteria) this;
        }

        public Criteria andNewcreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NewCredit not between", value1, value2, "newcredit");
            return (Criteria) this;
        }

        public Criteria andInspiretimeIsNull() {
            addCriterion("InspireTime is null");
            return (Criteria) this;
        }

        public Criteria andInspiretimeIsNotNull() {
            addCriterion("InspireTime is not null");
            return (Criteria) this;
        }

        public Criteria andInspiretimeEqualTo(Date value) {
            addCriterion("InspireTime =", value, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeNotEqualTo(Date value) {
            addCriterion("InspireTime <>", value, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeGreaterThan(Date value) {
            addCriterion("InspireTime >", value, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("InspireTime >=", value, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeLessThan(Date value) {
            addCriterion("InspireTime <", value, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeLessThanOrEqualTo(Date value) {
            addCriterion("InspireTime <=", value, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeIn(List<Date> values) {
            addCriterion("InspireTime in", values, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeNotIn(List<Date> values) {
            addCriterion("InspireTime not in", values, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeBetween(Date value1, Date value2) {
            addCriterion("InspireTime between", value1, value2, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andInspiretimeNotBetween(Date value1, Date value2) {
            addCriterion("InspireTime not between", value1, value2, "inspiretime");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("State is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("State is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Short value) {
            addCriterion("State =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("State <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("State >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("State >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("State <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("State <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("State in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("State not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("State between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("State not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeIsNull() {
            addCriterion("AttritionType is null");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeIsNotNull() {
            addCriterion("AttritionType is not null");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeEqualTo(Short value) {
            addCriterion("AttritionType =", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeNotEqualTo(Short value) {
            addCriterion("AttritionType <>", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeGreaterThan(Short value) {
            addCriterion("AttritionType >", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeGreaterThanOrEqualTo(Short value) {
            addCriterion("AttritionType >=", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeLessThan(Short value) {
            addCriterion("AttritionType <", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeLessThanOrEqualTo(Short value) {
            addCriterion("AttritionType <=", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeIn(List<Short> values) {
            addCriterion("AttritionType in", values, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeNotIn(List<Short> values) {
            addCriterion("AttritionType not in", values, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeBetween(Short value1, Short value2) {
            addCriterion("AttritionType between", value1, value2, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeNotBetween(Short value1, Short value2) {
            addCriterion("AttritionType not between", value1, value2, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andInitcreditIsNull() {
            addCriterion("InitCredit is null");
            return (Criteria) this;
        }

        public Criteria andInitcreditIsNotNull() {
            addCriterion("InitCredit is not null");
            return (Criteria) this;
        }

        public Criteria andInitcreditEqualTo(BigDecimal value) {
            addCriterion("InitCredit =", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditNotEqualTo(BigDecimal value) {
            addCriterion("InitCredit <>", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditGreaterThan(BigDecimal value) {
            addCriterion("InitCredit >", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("InitCredit >=", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditLessThan(BigDecimal value) {
            addCriterion("InitCredit <", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("InitCredit <=", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditIn(List<BigDecimal> values) {
            addCriterion("InitCredit in", values, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditNotIn(List<BigDecimal> values) {
            addCriterion("InitCredit not in", values, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InitCredit between", value1, value2, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("InitCredit not between", value1, value2, "initcredit");
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

        public Criteria andBelongorganizationIsNull() {
            addCriterion("BelongOrganization is null");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationIsNotNull() {
            addCriterion("BelongOrganization is not null");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationEqualTo(Integer value) {
            addCriterion("BelongOrganization =", value, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationNotEqualTo(Integer value) {
            addCriterion("BelongOrganization <>", value, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationGreaterThan(Integer value) {
            addCriterion("BelongOrganization >", value, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationGreaterThanOrEqualTo(Integer value) {
            addCriterion("BelongOrganization >=", value, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationLessThan(Integer value) {
            addCriterion("BelongOrganization <", value, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationLessThanOrEqualTo(Integer value) {
            addCriterion("BelongOrganization <=", value, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationIn(List<Integer> values) {
            addCriterion("BelongOrganization in", values, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationNotIn(List<Integer> values) {
            addCriterion("BelongOrganization not in", values, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationBetween(Integer value1, Integer value2) {
            addCriterion("BelongOrganization between", value1, value2, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andBelongorganizationNotBetween(Integer value1, Integer value2) {
            addCriterion("BelongOrganization not between", value1, value2, "belongorganization");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("OwnerID is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("OwnerID is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Integer value) {
            addCriterion("OwnerID =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Integer value) {
            addCriterion("OwnerID <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Integer value) {
            addCriterion("OwnerID >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Integer value) {
            addCriterion("OwnerID >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Integer value) {
            addCriterion("OwnerID <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Integer value) {
            addCriterion("OwnerID <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Integer> values) {
            addCriterion("OwnerID in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Integer> values) {
            addCriterion("OwnerID not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Integer value1, Integer value2) {
            addCriterion("OwnerID between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Integer value1, Integer value2) {
            addCriterion("OwnerID not between", value1, value2, "ownerid");
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