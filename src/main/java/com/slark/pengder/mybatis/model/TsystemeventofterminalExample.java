package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TsystemeventofterminalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TsystemeventofterminalExample() {
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

        public Criteria andTerminalmacIsNull() {
            addCriterion("TerminalMAC is null");
            return (Criteria) this;
        }

        public Criteria andTerminalmacIsNotNull() {
            addCriterion("TerminalMAC is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalmacEqualTo(String value) {
            addCriterion("TerminalMAC =", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacNotEqualTo(String value) {
            addCriterion("TerminalMAC <>", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacGreaterThan(String value) {
            addCriterion("TerminalMAC >", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacGreaterThanOrEqualTo(String value) {
            addCriterion("TerminalMAC >=", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacLessThan(String value) {
            addCriterion("TerminalMAC <", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacLessThanOrEqualTo(String value) {
            addCriterion("TerminalMAC <=", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacLike(String value) {
            addCriterion("TerminalMAC like", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacNotLike(String value) {
            addCriterion("TerminalMAC not like", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacIn(List<String> values) {
            addCriterion("TerminalMAC in", values, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacNotIn(List<String> values) {
            addCriterion("TerminalMAC not in", values, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacBetween(String value1, String value2) {
            addCriterion("TerminalMAC between", value1, value2, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacNotBetween(String value1, String value2) {
            addCriterion("TerminalMAC not between", value1, value2, "terminalmac");
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

        public Criteria andEventtypeidIsNull() {
            addCriterion("EventTypeID is null");
            return (Criteria) this;
        }

        public Criteria andEventtypeidIsNotNull() {
            addCriterion("EventTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andEventtypeidEqualTo(Integer value) {
            addCriterion("EventTypeID =", value, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidNotEqualTo(Integer value) {
            addCriterion("EventTypeID <>", value, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidGreaterThan(Integer value) {
            addCriterion("EventTypeID >", value, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("EventTypeID >=", value, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidLessThan(Integer value) {
            addCriterion("EventTypeID <", value, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("EventTypeID <=", value, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidIn(List<Integer> values) {
            addCriterion("EventTypeID in", values, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidNotIn(List<Integer> values) {
            addCriterion("EventTypeID not in", values, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidBetween(Integer value1, Integer value2) {
            addCriterion("EventTypeID between", value1, value2, "eventtypeid");
            return (Criteria) this;
        }

        public Criteria andEventtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("EventTypeID not between", value1, value2, "eventtypeid");
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

        public Criteria andEventcontentIsNull() {
            addCriterion("EventContent is null");
            return (Criteria) this;
        }

        public Criteria andEventcontentIsNotNull() {
            addCriterion("EventContent is not null");
            return (Criteria) this;
        }

        public Criteria andEventcontentEqualTo(Long value) {
            addCriterion("EventContent =", value, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentNotEqualTo(Long value) {
            addCriterion("EventContent <>", value, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentGreaterThan(Long value) {
            addCriterion("EventContent >", value, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentGreaterThanOrEqualTo(Long value) {
            addCriterion("EventContent >=", value, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentLessThan(Long value) {
            addCriterion("EventContent <", value, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentLessThanOrEqualTo(Long value) {
            addCriterion("EventContent <=", value, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentIn(List<Long> values) {
            addCriterion("EventContent in", values, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentNotIn(List<Long> values) {
            addCriterion("EventContent not in", values, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentBetween(Long value1, Long value2) {
            addCriterion("EventContent between", value1, value2, "eventcontent");
            return (Criteria) this;
        }

        public Criteria andEventcontentNotBetween(Long value1, Long value2) {
            addCriterion("EventContent not between", value1, value2, "eventcontent");
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