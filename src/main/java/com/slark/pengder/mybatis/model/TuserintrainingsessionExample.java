package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TuserintrainingsessionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TuserintrainingsessionExample() {
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

        public Criteria andSessionidIsNull() {
            addCriterion("SessionID is null");
            return (Criteria) this;
        }

        public Criteria andSessionidIsNotNull() {
            addCriterion("SessionID is not null");
            return (Criteria) this;
        }

        public Criteria andSessionidEqualTo(Long value) {
            addCriterion("SessionID =", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotEqualTo(Long value) {
            addCriterion("SessionID <>", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThan(Long value) {
            addCriterion("SessionID >", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidGreaterThanOrEqualTo(Long value) {
            addCriterion("SessionID >=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThan(Long value) {
            addCriterion("SessionID <", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidLessThanOrEqualTo(Long value) {
            addCriterion("SessionID <=", value, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidIn(List<Long> values) {
            addCriterion("SessionID in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotIn(List<Long> values) {
            addCriterion("SessionID not in", values, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidBetween(Long value1, Long value2) {
            addCriterion("SessionID between", value1, value2, "sessionid");
            return (Criteria) this;
        }

        public Criteria andSessionidNotBetween(Long value1, Long value2) {
            addCriterion("SessionID not between", value1, value2, "sessionid");
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

        public Criteria andCardserialIsNull() {
            addCriterion("CardSerial is null");
            return (Criteria) this;
        }

        public Criteria andCardserialIsNotNull() {
            addCriterion("CardSerial is not null");
            return (Criteria) this;
        }

        public Criteria andCardserialEqualTo(Integer value) {
            addCriterion("CardSerial =", value, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialNotEqualTo(Integer value) {
            addCriterion("CardSerial <>", value, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialGreaterThan(Integer value) {
            addCriterion("CardSerial >", value, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialGreaterThanOrEqualTo(Integer value) {
            addCriterion("CardSerial >=", value, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialLessThan(Integer value) {
            addCriterion("CardSerial <", value, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialLessThanOrEqualTo(Integer value) {
            addCriterion("CardSerial <=", value, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialIn(List<Integer> values) {
            addCriterion("CardSerial in", values, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialNotIn(List<Integer> values) {
            addCriterion("CardSerial not in", values, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialBetween(Integer value1, Integer value2) {
            addCriterion("CardSerial between", value1, value2, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCardserialNotBetween(Integer value1, Integer value2) {
            addCriterion("CardSerial not between", value1, value2, "cardserial");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeIsNull() {
            addCriterion("CheckedInTime is null");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeIsNotNull() {
            addCriterion("CheckedInTime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeEqualTo(Date value) {
            addCriterion("CheckedInTime =", value, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeNotEqualTo(Date value) {
            addCriterion("CheckedInTime <>", value, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeGreaterThan(Date value) {
            addCriterion("CheckedInTime >", value, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CheckedInTime >=", value, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeLessThan(Date value) {
            addCriterion("CheckedInTime <", value, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeLessThanOrEqualTo(Date value) {
            addCriterion("CheckedInTime <=", value, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeIn(List<Date> values) {
            addCriterion("CheckedInTime in", values, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeNotIn(List<Date> values) {
            addCriterion("CheckedInTime not in", values, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeBetween(Date value1, Date value2) {
            addCriterion("CheckedInTime between", value1, value2, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andCheckedintimeNotBetween(Date value1, Date value2) {
            addCriterion("CheckedInTime not between", value1, value2, "checkedintime");
            return (Criteria) this;
        }

        public Criteria andUserinfoIsNull() {
            addCriterion("UserInfo is null");
            return (Criteria) this;
        }

        public Criteria andUserinfoIsNotNull() {
            addCriterion("UserInfo is not null");
            return (Criteria) this;
        }

        public Criteria andUserinfoEqualTo(String value) {
            addCriterion("UserInfo =", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotEqualTo(String value) {
            addCriterion("UserInfo <>", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoGreaterThan(String value) {
            addCriterion("UserInfo >", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoGreaterThanOrEqualTo(String value) {
            addCriterion("UserInfo >=", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLessThan(String value) {
            addCriterion("UserInfo <", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLessThanOrEqualTo(String value) {
            addCriterion("UserInfo <=", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoLike(String value) {
            addCriterion("UserInfo like", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotLike(String value) {
            addCriterion("UserInfo not like", value, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoIn(List<String> values) {
            addCriterion("UserInfo in", values, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotIn(List<String> values) {
            addCriterion("UserInfo not in", values, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoBetween(String value1, String value2) {
            addCriterion("UserInfo between", value1, value2, "userinfo");
            return (Criteria) this;
        }

        public Criteria andUserinfoNotBetween(String value1, String value2) {
            addCriterion("UserInfo not between", value1, value2, "userinfo");
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

        public Criteria andManulIsNull() {
            addCriterion("Manul is null");
            return (Criteria) this;
        }

        public Criteria andManulIsNotNull() {
            addCriterion("Manul is not null");
            return (Criteria) this;
        }

        public Criteria andManulEqualTo(Boolean value) {
            addCriterion("Manul =", value, "manul");
            return (Criteria) this;
        }

        public Criteria andManulNotEqualTo(Boolean value) {
            addCriterion("Manul <>", value, "manul");
            return (Criteria) this;
        }

        public Criteria andManulGreaterThan(Boolean value) {
            addCriterion("Manul >", value, "manul");
            return (Criteria) this;
        }

        public Criteria andManulGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Manul >=", value, "manul");
            return (Criteria) this;
        }

        public Criteria andManulLessThan(Boolean value) {
            addCriterion("Manul <", value, "manul");
            return (Criteria) this;
        }

        public Criteria andManulLessThanOrEqualTo(Boolean value) {
            addCriterion("Manul <=", value, "manul");
            return (Criteria) this;
        }

        public Criteria andManulIn(List<Boolean> values) {
            addCriterion("Manul in", values, "manul");
            return (Criteria) this;
        }

        public Criteria andManulNotIn(List<Boolean> values) {
            addCriterion("Manul not in", values, "manul");
            return (Criteria) this;
        }

        public Criteria andManulBetween(Boolean value1, Boolean value2) {
            addCriterion("Manul between", value1, value2, "manul");
            return (Criteria) this;
        }

        public Criteria andManulNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Manul not between", value1, value2, "manul");
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

        public Criteria andUserpositionIsNull() {
            addCriterion("UserPosition is null");
            return (Criteria) this;
        }

        public Criteria andUserpositionIsNotNull() {
            addCriterion("UserPosition is not null");
            return (Criteria) this;
        }

        public Criteria andUserpositionEqualTo(Short value) {
            addCriterion("UserPosition =", value, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionNotEqualTo(Short value) {
            addCriterion("UserPosition <>", value, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionGreaterThan(Short value) {
            addCriterion("UserPosition >", value, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionGreaterThanOrEqualTo(Short value) {
            addCriterion("UserPosition >=", value, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionLessThan(Short value) {
            addCriterion("UserPosition <", value, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionLessThanOrEqualTo(Short value) {
            addCriterion("UserPosition <=", value, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionIn(List<Short> values) {
            addCriterion("UserPosition in", values, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionNotIn(List<Short> values) {
            addCriterion("UserPosition not in", values, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionBetween(Short value1, Short value2) {
            addCriterion("UserPosition between", value1, value2, "userposition");
            return (Criteria) this;
        }

        public Criteria andUserpositionNotBetween(Short value1, Short value2) {
            addCriterion("UserPosition not between", value1, value2, "userposition");
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