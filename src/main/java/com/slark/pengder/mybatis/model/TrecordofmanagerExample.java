package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TrecordofmanagerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrecordofmanagerExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("Type not between", value1, value2, "type");
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

        public Criteria andManualaddEqualTo(Boolean value) {
            addCriterion("ManualAdd =", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddNotEqualTo(Boolean value) {
            addCriterion("ManualAdd <>", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddGreaterThan(Boolean value) {
            addCriterion("ManualAdd >", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ManualAdd >=", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddLessThan(Boolean value) {
            addCriterion("ManualAdd <", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddLessThanOrEqualTo(Boolean value) {
            addCriterion("ManualAdd <=", value, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddIn(List<Boolean> values) {
            addCriterion("ManualAdd in", values, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddNotIn(List<Boolean> values) {
            addCriterion("ManualAdd not in", values, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddBetween(Boolean value1, Boolean value2) {
            addCriterion("ManualAdd between", value1, value2, "manualadd");
            return (Criteria) this;
        }

        public Criteria andManualaddNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ManualAdd not between", value1, value2, "manualadd");
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

        public Criteria andSyntimeIsNull() {
            addCriterion("SynTime is null");
            return (Criteria) this;
        }

        public Criteria andSyntimeIsNotNull() {
            addCriterion("SynTime is not null");
            return (Criteria) this;
        }

        public Criteria andSyntimeEqualTo(Date value) {
            addCriterion("SynTime =", value, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeNotEqualTo(Date value) {
            addCriterion("SynTime <>", value, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeGreaterThan(Date value) {
            addCriterion("SynTime >", value, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SynTime >=", value, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeLessThan(Date value) {
            addCriterion("SynTime <", value, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeLessThanOrEqualTo(Date value) {
            addCriterion("SynTime <=", value, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeIn(List<Date> values) {
            addCriterion("SynTime in", values, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeNotIn(List<Date> values) {
            addCriterion("SynTime not in", values, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeBetween(Date value1, Date value2) {
            addCriterion("SynTime between", value1, value2, "syntime");
            return (Criteria) this;
        }

        public Criteria andSyntimeNotBetween(Date value1, Date value2) {
            addCriterion("SynTime not between", value1, value2, "syntime");
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

        public Criteria andConvertuserrecordidIsNull() {
            addCriterion("ConvertUserRecordID is null");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidIsNotNull() {
            addCriterion("ConvertUserRecordID is not null");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidEqualTo(Long value) {
            addCriterion("ConvertUserRecordID =", value, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidNotEqualTo(Long value) {
            addCriterion("ConvertUserRecordID <>", value, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidGreaterThan(Long value) {
            addCriterion("ConvertUserRecordID >", value, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidGreaterThanOrEqualTo(Long value) {
            addCriterion("ConvertUserRecordID >=", value, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidLessThan(Long value) {
            addCriterion("ConvertUserRecordID <", value, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidLessThanOrEqualTo(Long value) {
            addCriterion("ConvertUserRecordID <=", value, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidIn(List<Long> values) {
            addCriterion("ConvertUserRecordID in", values, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidNotIn(List<Long> values) {
            addCriterion("ConvertUserRecordID not in", values, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidBetween(Long value1, Long value2) {
            addCriterion("ConvertUserRecordID between", value1, value2, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andConvertuserrecordidNotBetween(Long value1, Long value2) {
            addCriterion("ConvertUserRecordID not between", value1, value2, "convertuserrecordid");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("Content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("Content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("Content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("Content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("Content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("Content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("Content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("Content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("Content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("Content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("Content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("Content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("Content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("Content not between", value1, value2, "content");
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

        public Criteria andTrainingproIsNull() {
            addCriterion("TrainingPro is null");
            return (Criteria) this;
        }

        public Criteria andTrainingproIsNotNull() {
            addCriterion("TrainingPro is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingproEqualTo(String value) {
            addCriterion("TrainingPro =", value, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproNotEqualTo(String value) {
            addCriterion("TrainingPro <>", value, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproGreaterThan(String value) {
            addCriterion("TrainingPro >", value, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproGreaterThanOrEqualTo(String value) {
            addCriterion("TrainingPro >=", value, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproLessThan(String value) {
            addCriterion("TrainingPro <", value, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproLessThanOrEqualTo(String value) {
            addCriterion("TrainingPro <=", value, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproLike(String value) {
            addCriterion("TrainingPro like", value, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproNotLike(String value) {
            addCriterion("TrainingPro not like", value, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproIn(List<String> values) {
            addCriterion("TrainingPro in", values, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproNotIn(List<String> values) {
            addCriterion("TrainingPro not in", values, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproBetween(String value1, String value2) {
            addCriterion("TrainingPro between", value1, value2, "trainingpro");
            return (Criteria) this;
        }

        public Criteria andTrainingproNotBetween(String value1, String value2) {
            addCriterion("TrainingPro not between", value1, value2, "trainingpro");
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