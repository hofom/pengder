package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TinstrumentreservationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TinstrumentreservationExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andDayofweekIsNull() {
            addCriterion("DayOfWeek is null");
            return (Criteria) this;
        }

        public Criteria andDayofweekIsNotNull() {
            addCriterion("DayOfWeek is not null");
            return (Criteria) this;
        }

        public Criteria andDayofweekEqualTo(Byte value) {
            addCriterion("DayOfWeek =", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekNotEqualTo(Byte value) {
            addCriterion("DayOfWeek <>", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekGreaterThan(Byte value) {
            addCriterion("DayOfWeek >", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekGreaterThanOrEqualTo(Byte value) {
            addCriterion("DayOfWeek >=", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekLessThan(Byte value) {
            addCriterion("DayOfWeek <", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekLessThanOrEqualTo(Byte value) {
            addCriterion("DayOfWeek <=", value, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekIn(List<Byte> values) {
            addCriterion("DayOfWeek in", values, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekNotIn(List<Byte> values) {
            addCriterion("DayOfWeek not in", values, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekBetween(Byte value1, Byte value2) {
            addCriterion("DayOfWeek between", value1, value2, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andDayofweekNotBetween(Byte value1, Byte value2) {
            addCriterion("DayOfWeek not between", value1, value2, "dayofweek");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("ProjectName is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("ProjectName is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("ProjectName =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("ProjectName <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("ProjectName >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProjectName >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("ProjectName <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("ProjectName <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("ProjectName like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("ProjectName not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("ProjectName in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("ProjectName not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("ProjectName between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("ProjectName not between", value1, value2, "projectname");
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

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterionForJDBCTime("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterionForJDBCTime("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterionForJDBCTime("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterionForJDBCTime("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("StartTime not between", value1, value2, "starttime");
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
            addCriterionForJDBCTime("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterionForJDBCTime("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterionForJDBCTime("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterionForJDBCTime("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andActivetimeIsNull() {
            addCriterion("ActiveTime is null");
            return (Criteria) this;
        }

        public Criteria andActivetimeIsNotNull() {
            addCriterion("ActiveTime is not null");
            return (Criteria) this;
        }

        public Criteria andActivetimeEqualTo(Date value) {
            addCriterion("ActiveTime =", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotEqualTo(Date value) {
            addCriterion("ActiveTime <>", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeGreaterThan(Date value) {
            addCriterion("ActiveTime >", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ActiveTime >=", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeLessThan(Date value) {
            addCriterion("ActiveTime <", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeLessThanOrEqualTo(Date value) {
            addCriterion("ActiveTime <=", value, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeIn(List<Date> values) {
            addCriterion("ActiveTime in", values, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotIn(List<Date> values) {
            addCriterion("ActiveTime not in", values, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeBetween(Date value1, Date value2) {
            addCriterion("ActiveTime between", value1, value2, "activetime");
            return (Criteria) this;
        }

        public Criteria andActivetimeNotBetween(Date value1, Date value2) {
            addCriterion("ActiveTime not between", value1, value2, "activetime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeIsNull() {
            addCriterion("ExpireTime is null");
            return (Criteria) this;
        }

        public Criteria andExpiretimeIsNotNull() {
            addCriterion("ExpireTime is not null");
            return (Criteria) this;
        }

        public Criteria andExpiretimeEqualTo(Date value) {
            addCriterion("ExpireTime =", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeNotEqualTo(Date value) {
            addCriterion("ExpireTime <>", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeGreaterThan(Date value) {
            addCriterion("ExpireTime >", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpireTime >=", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeLessThan(Date value) {
            addCriterion("ExpireTime <", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeLessThanOrEqualTo(Date value) {
            addCriterion("ExpireTime <=", value, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeIn(List<Date> values) {
            addCriterion("ExpireTime in", values, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeNotIn(List<Date> values) {
            addCriterion("ExpireTime not in", values, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeBetween(Date value1, Date value2) {
            addCriterion("ExpireTime between", value1, value2, "expiretime");
            return (Criteria) this;
        }

        public Criteria andExpiretimeNotBetween(Date value1, Date value2) {
            addCriterion("ExpireTime not between", value1, value2, "expiretime");
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

        public Criteria andReceivesyntickIsNull() {
            addCriterion("ReceiveSynTick is null");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickIsNotNull() {
            addCriterion("ReceiveSynTick is not null");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickEqualTo(Integer value) {
            addCriterion("ReceiveSynTick =", value, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickNotEqualTo(Integer value) {
            addCriterion("ReceiveSynTick <>", value, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickGreaterThan(Integer value) {
            addCriterion("ReceiveSynTick >", value, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickGreaterThanOrEqualTo(Integer value) {
            addCriterion("ReceiveSynTick >=", value, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickLessThan(Integer value) {
            addCriterion("ReceiveSynTick <", value, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickLessThanOrEqualTo(Integer value) {
            addCriterion("ReceiveSynTick <=", value, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickIn(List<Integer> values) {
            addCriterion("ReceiveSynTick in", values, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickNotIn(List<Integer> values) {
            addCriterion("ReceiveSynTick not in", values, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickBetween(Integer value1, Integer value2) {
            addCriterion("ReceiveSynTick between", value1, value2, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andReceivesyntickNotBetween(Integer value1, Integer value2) {
            addCriterion("ReceiveSynTick not between", value1, value2, "receivesyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickIsNull() {
            addCriterion("ApplySynTick is null");
            return (Criteria) this;
        }

        public Criteria andApplysyntickIsNotNull() {
            addCriterion("ApplySynTick is not null");
            return (Criteria) this;
        }

        public Criteria andApplysyntickEqualTo(Integer value) {
            addCriterion("ApplySynTick =", value, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickNotEqualTo(Integer value) {
            addCriterion("ApplySynTick <>", value, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickGreaterThan(Integer value) {
            addCriterion("ApplySynTick >", value, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickGreaterThanOrEqualTo(Integer value) {
            addCriterion("ApplySynTick >=", value, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickLessThan(Integer value) {
            addCriterion("ApplySynTick <", value, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickLessThanOrEqualTo(Integer value) {
            addCriterion("ApplySynTick <=", value, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickIn(List<Integer> values) {
            addCriterion("ApplySynTick in", values, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickNotIn(List<Integer> values) {
            addCriterion("ApplySynTick not in", values, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickBetween(Integer value1, Integer value2) {
            addCriterion("ApplySynTick between", value1, value2, "applysyntick");
            return (Criteria) this;
        }

        public Criteria andApplysyntickNotBetween(Integer value1, Integer value2) {
            addCriterion("ApplySynTick not between", value1, value2, "applysyntick");
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