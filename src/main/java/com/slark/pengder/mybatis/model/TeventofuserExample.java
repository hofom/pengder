package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeventofuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeventofuserExample() {
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

        public Criteria andEventtypeIsNull() {
            addCriterion("EventType is null");
            return (Criteria) this;
        }

        public Criteria andEventtypeIsNotNull() {
            addCriterion("EventType is not null");
            return (Criteria) this;
        }

        public Criteria andEventtypeEqualTo(Short value) {
            addCriterion("EventType =", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotEqualTo(Short value) {
            addCriterion("EventType <>", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeGreaterThan(Short value) {
            addCriterion("EventType >", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("EventType >=", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeLessThan(Short value) {
            addCriterion("EventType <", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeLessThanOrEqualTo(Short value) {
            addCriterion("EventType <=", value, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeIn(List<Short> values) {
            addCriterion("EventType in", values, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotIn(List<Short> values) {
            addCriterion("EventType not in", values, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeBetween(Short value1, Short value2) {
            addCriterion("EventType between", value1, value2, "eventtype");
            return (Criteria) this;
        }

        public Criteria andEventtypeNotBetween(Short value1, Short value2) {
            addCriterion("EventType not between", value1, value2, "eventtype");
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

        public Criteria andOperationtimeIsNull() {
            addCriterion("OperationTime is null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIsNotNull() {
            addCriterion("OperationTime is not null");
            return (Criteria) this;
        }

        public Criteria andOperationtimeEqualTo(Date value) {
            addCriterion("OperationTime =", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotEqualTo(Date value) {
            addCriterion("OperationTime <>", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThan(Date value) {
            addCriterion("OperationTime >", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OperationTime >=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThan(Date value) {
            addCriterion("OperationTime <", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeLessThanOrEqualTo(Date value) {
            addCriterion("OperationTime <=", value, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeIn(List<Date> values) {
            addCriterion("OperationTime in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotIn(List<Date> values) {
            addCriterion("OperationTime not in", values, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeBetween(Date value1, Date value2) {
            addCriterion("OperationTime between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperationtimeNotBetween(Date value1, Date value2) {
            addCriterion("OperationTime not between", value1, value2, "operationtime");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNull() {
            addCriterion("Operator is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIsNotNull() {
            addCriterion("Operator is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorEqualTo(Integer value) {
            addCriterion("Operator =", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotEqualTo(Integer value) {
            addCriterion("Operator <>", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThan(Integer value) {
            addCriterion("Operator >", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("Operator >=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThan(Integer value) {
            addCriterion("Operator <", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("Operator <=", value, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorIn(List<Integer> values) {
            addCriterion("Operator in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotIn(List<Integer> values) {
            addCriterion("Operator not in", values, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorBetween(Integer value1, Integer value2) {
            addCriterion("Operator between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("Operator not between", value1, value2, "operator");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1IsNull() {
            addCriterion("OperateValue1 is null");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1IsNotNull() {
            addCriterion("OperateValue1 is not null");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1EqualTo(String value) {
            addCriterion("OperateValue1 =", value, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1NotEqualTo(String value) {
            addCriterion("OperateValue1 <>", value, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1GreaterThan(String value) {
            addCriterion("OperateValue1 >", value, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1GreaterThanOrEqualTo(String value) {
            addCriterion("OperateValue1 >=", value, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1LessThan(String value) {
            addCriterion("OperateValue1 <", value, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1LessThanOrEqualTo(String value) {
            addCriterion("OperateValue1 <=", value, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1Like(String value) {
            addCriterion("OperateValue1 like", value, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1NotLike(String value) {
            addCriterion("OperateValue1 not like", value, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1In(List<String> values) {
            addCriterion("OperateValue1 in", values, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1NotIn(List<String> values) {
            addCriterion("OperateValue1 not in", values, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1Between(String value1, String value2) {
            addCriterion("OperateValue1 between", value1, value2, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue1NotBetween(String value1, String value2) {
            addCriterion("OperateValue1 not between", value1, value2, "operatevalue1");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2IsNull() {
            addCriterion("OperateValue2 is null");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2IsNotNull() {
            addCriterion("OperateValue2 is not null");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2EqualTo(Integer value) {
            addCriterion("OperateValue2 =", value, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2NotEqualTo(Integer value) {
            addCriterion("OperateValue2 <>", value, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2GreaterThan(Integer value) {
            addCriterion("OperateValue2 >", value, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2GreaterThanOrEqualTo(Integer value) {
            addCriterion("OperateValue2 >=", value, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2LessThan(Integer value) {
            addCriterion("OperateValue2 <", value, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2LessThanOrEqualTo(Integer value) {
            addCriterion("OperateValue2 <=", value, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2In(List<Integer> values) {
            addCriterion("OperateValue2 in", values, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2NotIn(List<Integer> values) {
            addCriterion("OperateValue2 not in", values, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2Between(Integer value1, Integer value2) {
            addCriterion("OperateValue2 between", value1, value2, "operatevalue2");
            return (Criteria) this;
        }

        public Criteria andOperatevalue2NotBetween(Integer value1, Integer value2) {
            addCriterion("OperateValue2 not between", value1, value2, "operatevalue2");
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

        public Criteria andRelaterecordIsNull() {
            addCriterion("RelateRecord is null");
            return (Criteria) this;
        }

        public Criteria andRelaterecordIsNotNull() {
            addCriterion("RelateRecord is not null");
            return (Criteria) this;
        }

        public Criteria andRelaterecordEqualTo(Long value) {
            addCriterion("RelateRecord =", value, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordNotEqualTo(Long value) {
            addCriterion("RelateRecord <>", value, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordGreaterThan(Long value) {
            addCriterion("RelateRecord >", value, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordGreaterThanOrEqualTo(Long value) {
            addCriterion("RelateRecord >=", value, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordLessThan(Long value) {
            addCriterion("RelateRecord <", value, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordLessThanOrEqualTo(Long value) {
            addCriterion("RelateRecord <=", value, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordIn(List<Long> values) {
            addCriterion("RelateRecord in", values, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordNotIn(List<Long> values) {
            addCriterion("RelateRecord not in", values, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordBetween(Long value1, Long value2) {
            addCriterion("RelateRecord between", value1, value2, "relaterecord");
            return (Criteria) this;
        }

        public Criteria andRelaterecordNotBetween(Long value1, Long value2) {
            addCriterion("RelateRecord not between", value1, value2, "relaterecord");
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