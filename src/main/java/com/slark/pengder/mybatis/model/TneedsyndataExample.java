package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.List;

public class TneedsyndataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TneedsyndataExample() {
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

        public Criteria andTargetinstrumentidIsNull() {
            addCriterion("TargetInstrumentID is null");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidIsNotNull() {
            addCriterion("TargetInstrumentID is not null");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidEqualTo(Integer value) {
            addCriterion("TargetInstrumentID =", value, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidNotEqualTo(Integer value) {
            addCriterion("TargetInstrumentID <>", value, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidGreaterThan(Integer value) {
            addCriterion("TargetInstrumentID >", value, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("TargetInstrumentID >=", value, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidLessThan(Integer value) {
            addCriterion("TargetInstrumentID <", value, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidLessThanOrEqualTo(Integer value) {
            addCriterion("TargetInstrumentID <=", value, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidIn(List<Integer> values) {
            addCriterion("TargetInstrumentID in", values, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidNotIn(List<Integer> values) {
            addCriterion("TargetInstrumentID not in", values, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidBetween(Integer value1, Integer value2) {
            addCriterion("TargetInstrumentID between", value1, value2, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andTargetinstrumentidNotBetween(Integer value1, Integer value2) {
            addCriterion("TargetInstrumentID not between", value1, value2, "targetinstrumentid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidIsNull() {
            addCriterion("NeedSynDataID is null");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidIsNotNull() {
            addCriterion("NeedSynDataID is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidEqualTo(Integer value) {
            addCriterion("NeedSynDataID =", value, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidNotEqualTo(Integer value) {
            addCriterion("NeedSynDataID <>", value, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidGreaterThan(Integer value) {
            addCriterion("NeedSynDataID >", value, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidGreaterThanOrEqualTo(Integer value) {
            addCriterion("NeedSynDataID >=", value, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidLessThan(Integer value) {
            addCriterion("NeedSynDataID <", value, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidLessThanOrEqualTo(Integer value) {
            addCriterion("NeedSynDataID <=", value, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidIn(List<Integer> values) {
            addCriterion("NeedSynDataID in", values, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidNotIn(List<Integer> values) {
            addCriterion("NeedSynDataID not in", values, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidBetween(Integer value1, Integer value2) {
            addCriterion("NeedSynDataID between", value1, value2, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndataidNotBetween(Integer value1, Integer value2) {
            addCriterion("NeedSynDataID not between", value1, value2, "needsyndataid");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeIsNull() {
            addCriterion("NeedSynDataType is null");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeIsNotNull() {
            addCriterion("NeedSynDataType is not null");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeEqualTo(Short value) {
            addCriterion("NeedSynDataType =", value, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeNotEqualTo(Short value) {
            addCriterion("NeedSynDataType <>", value, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeGreaterThan(Short value) {
            addCriterion("NeedSynDataType >", value, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeGreaterThanOrEqualTo(Short value) {
            addCriterion("NeedSynDataType >=", value, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeLessThan(Short value) {
            addCriterion("NeedSynDataType <", value, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeLessThanOrEqualTo(Short value) {
            addCriterion("NeedSynDataType <=", value, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeIn(List<Short> values) {
            addCriterion("NeedSynDataType in", values, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeNotIn(List<Short> values) {
            addCriterion("NeedSynDataType not in", values, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeBetween(Short value1, Short value2) {
            addCriterion("NeedSynDataType between", value1, value2, "needsyndatatype");
            return (Criteria) this;
        }

        public Criteria andNeedsyndatatypeNotBetween(Short value1, Short value2) {
            addCriterion("NeedSynDataType not between", value1, value2, "needsyndatatype");
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