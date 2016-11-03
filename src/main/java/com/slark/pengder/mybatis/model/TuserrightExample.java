package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TuserrightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TuserrightExample() {
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

        public Criteria andUserrightidIsNull() {
            addCriterion("UserRightID is null");
            return (Criteria) this;
        }

        public Criteria andUserrightidIsNotNull() {
            addCriterion("UserRightID is not null");
            return (Criteria) this;
        }

        public Criteria andUserrightidEqualTo(Short value) {
            addCriterion("UserRightID =", value, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidNotEqualTo(Short value) {
            addCriterion("UserRightID <>", value, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidGreaterThan(Short value) {
            addCriterion("UserRightID >", value, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidGreaterThanOrEqualTo(Short value) {
            addCriterion("UserRightID >=", value, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidLessThan(Short value) {
            addCriterion("UserRightID <", value, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidLessThanOrEqualTo(Short value) {
            addCriterion("UserRightID <=", value, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidIn(List<Short> values) {
            addCriterion("UserRightID in", values, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidNotIn(List<Short> values) {
            addCriterion("UserRightID not in", values, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidBetween(Short value1, Short value2) {
            addCriterion("UserRightID between", value1, value2, "userrightid");
            return (Criteria) this;
        }

        public Criteria andUserrightidNotBetween(Short value1, Short value2) {
            addCriterion("UserRightID not between", value1, value2, "userrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidIsNull() {
            addCriterion("TemporaryRightID is null");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidIsNotNull() {
            addCriterion("TemporaryRightID is not null");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidEqualTo(Short value) {
            addCriterion("TemporaryRightID =", value, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidNotEqualTo(Short value) {
            addCriterion("TemporaryRightID <>", value, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidGreaterThan(Short value) {
            addCriterion("TemporaryRightID >", value, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidGreaterThanOrEqualTo(Short value) {
            addCriterion("TemporaryRightID >=", value, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidLessThan(Short value) {
            addCriterion("TemporaryRightID <", value, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidLessThanOrEqualTo(Short value) {
            addCriterion("TemporaryRightID <=", value, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidIn(List<Short> values) {
            addCriterion("TemporaryRightID in", values, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidNotIn(List<Short> values) {
            addCriterion("TemporaryRightID not in", values, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidBetween(Short value1, Short value2) {
            addCriterion("TemporaryRightID between", value1, value2, "temporaryrightid");
            return (Criteria) this;
        }

        public Criteria andTemporaryrightidNotBetween(Short value1, Short value2) {
            addCriterion("TemporaryRightID not between", value1, value2, "temporaryrightid");
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

        public Criteria andGrantedidIsNull() {
            addCriterion("GrantedID is null");
            return (Criteria) this;
        }

        public Criteria andGrantedidIsNotNull() {
            addCriterion("GrantedID is not null");
            return (Criteria) this;
        }

        public Criteria andGrantedidEqualTo(Integer value) {
            addCriterion("GrantedID =", value, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidNotEqualTo(Integer value) {
            addCriterion("GrantedID <>", value, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidGreaterThan(Integer value) {
            addCriterion("GrantedID >", value, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("GrantedID >=", value, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidLessThan(Integer value) {
            addCriterion("GrantedID <", value, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidLessThanOrEqualTo(Integer value) {
            addCriterion("GrantedID <=", value, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidIn(List<Integer> values) {
            addCriterion("GrantedID in", values, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidNotIn(List<Integer> values) {
            addCriterion("GrantedID not in", values, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidBetween(Integer value1, Integer value2) {
            addCriterion("GrantedID between", value1, value2, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedidNotBetween(Integer value1, Integer value2) {
            addCriterion("GrantedID not between", value1, value2, "grantedid");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeIsNull() {
            addCriterion("GrantedTime is null");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeIsNotNull() {
            addCriterion("GrantedTime is not null");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeEqualTo(Date value) {
            addCriterion("GrantedTime =", value, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeNotEqualTo(Date value) {
            addCriterion("GrantedTime <>", value, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeGreaterThan(Date value) {
            addCriterion("GrantedTime >", value, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("GrantedTime >=", value, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeLessThan(Date value) {
            addCriterion("GrantedTime <", value, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeLessThanOrEqualTo(Date value) {
            addCriterion("GrantedTime <=", value, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeIn(List<Date> values) {
            addCriterion("GrantedTime in", values, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeNotIn(List<Date> values) {
            addCriterion("GrantedTime not in", values, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeBetween(Date value1, Date value2) {
            addCriterion("GrantedTime between", value1, value2, "grantedtime");
            return (Criteria) this;
        }

        public Criteria andGrantedtimeNotBetween(Date value1, Date value2) {
            addCriterion("GrantedTime not between", value1, value2, "grantedtime");
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