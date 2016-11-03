package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TeventofaccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeventofaccountExample() {
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

        public Criteria andRelevantrecordIsNull() {
            addCriterion("RelevantRecord is null");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordIsNotNull() {
            addCriterion("RelevantRecord is not null");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordEqualTo(Long value) {
            addCriterion("RelevantRecord =", value, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordNotEqualTo(Long value) {
            addCriterion("RelevantRecord <>", value, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordGreaterThan(Long value) {
            addCriterion("RelevantRecord >", value, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordGreaterThanOrEqualTo(Long value) {
            addCriterion("RelevantRecord >=", value, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordLessThan(Long value) {
            addCriterion("RelevantRecord <", value, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordLessThanOrEqualTo(Long value) {
            addCriterion("RelevantRecord <=", value, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordIn(List<Long> values) {
            addCriterion("RelevantRecord in", values, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordNotIn(List<Long> values) {
            addCriterion("RelevantRecord not in", values, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordBetween(Long value1, Long value2) {
            addCriterion("RelevantRecord between", value1, value2, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andRelevantrecordNotBetween(Long value1, Long value2) {
            addCriterion("RelevantRecord not between", value1, value2, "relevantrecord");
            return (Criteria) this;
        }

        public Criteria andEventIsNull() {
            addCriterion("Event is null");
            return (Criteria) this;
        }

        public Criteria andEventIsNotNull() {
            addCriterion("Event is not null");
            return (Criteria) this;
        }

        public Criteria andEventEqualTo(Short value) {
            addCriterion("Event =", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotEqualTo(Short value) {
            addCriterion("Event <>", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThan(Short value) {
            addCriterion("Event >", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventGreaterThanOrEqualTo(Short value) {
            addCriterion("Event >=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThan(Short value) {
            addCriterion("Event <", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventLessThanOrEqualTo(Short value) {
            addCriterion("Event <=", value, "event");
            return (Criteria) this;
        }

        public Criteria andEventIn(List<Short> values) {
            addCriterion("Event in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotIn(List<Short> values) {
            addCriterion("Event not in", values, "event");
            return (Criteria) this;
        }

        public Criteria andEventBetween(Short value1, Short value2) {
            addCriterion("Event between", value1, value2, "event");
            return (Criteria) this;
        }

        public Criteria andEventNotBetween(Short value1, Short value2) {
            addCriterion("Event not between", value1, value2, "event");
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

        public Criteria andEarlycreditIsNull() {
            addCriterion("EarlyCredit is null");
            return (Criteria) this;
        }

        public Criteria andEarlycreditIsNotNull() {
            addCriterion("EarlyCredit is not null");
            return (Criteria) this;
        }

        public Criteria andEarlycreditEqualTo(BigDecimal value) {
            addCriterion("EarlyCredit =", value, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditNotEqualTo(BigDecimal value) {
            addCriterion("EarlyCredit <>", value, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditGreaterThan(BigDecimal value) {
            addCriterion("EarlyCredit >", value, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EarlyCredit >=", value, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditLessThan(BigDecimal value) {
            addCriterion("EarlyCredit <", value, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EarlyCredit <=", value, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditIn(List<BigDecimal> values) {
            addCriterion("EarlyCredit in", values, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditNotIn(List<BigDecimal> values) {
            addCriterion("EarlyCredit not in", values, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EarlyCredit between", value1, value2, "earlycredit");
            return (Criteria) this;
        }

        public Criteria andEarlycreditNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EarlyCredit not between", value1, value2, "earlycredit");
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

        public Criteria andEarlymoneyIsNull() {
            addCriterion("EarlyMoney is null");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyIsNotNull() {
            addCriterion("EarlyMoney is not null");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyEqualTo(BigDecimal value) {
            addCriterion("EarlyMoney =", value, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyNotEqualTo(BigDecimal value) {
            addCriterion("EarlyMoney <>", value, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyGreaterThan(BigDecimal value) {
            addCriterion("EarlyMoney >", value, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EarlyMoney >=", value, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyLessThan(BigDecimal value) {
            addCriterion("EarlyMoney <", value, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EarlyMoney <=", value, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyIn(List<BigDecimal> values) {
            addCriterion("EarlyMoney in", values, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyNotIn(List<BigDecimal> values) {
            addCriterion("EarlyMoney not in", values, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EarlyMoney between", value1, value2, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andEarlymoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EarlyMoney not between", value1, value2, "earlymoney");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionIsNull() {
            addCriterion("MoneyTransaction is null");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionIsNotNull() {
            addCriterion("MoneyTransaction is not null");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionEqualTo(BigDecimal value) {
            addCriterion("MoneyTransaction =", value, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionNotEqualTo(BigDecimal value) {
            addCriterion("MoneyTransaction <>", value, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionGreaterThan(BigDecimal value) {
            addCriterion("MoneyTransaction >", value, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MoneyTransaction >=", value, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionLessThan(BigDecimal value) {
            addCriterion("MoneyTransaction <", value, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MoneyTransaction <=", value, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionIn(List<BigDecimal> values) {
            addCriterion("MoneyTransaction in", values, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionNotIn(List<BigDecimal> values) {
            addCriterion("MoneyTransaction not in", values, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MoneyTransaction between", value1, value2, "moneytransaction");
            return (Criteria) this;
        }

        public Criteria andMoneytransactionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MoneyTransaction not between", value1, value2, "moneytransaction");
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

        public Criteria andRelevantaccountidIsNull() {
            addCriterion("RelevantAccountID is null");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidIsNotNull() {
            addCriterion("RelevantAccountID is not null");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidEqualTo(Integer value) {
            addCriterion("RelevantAccountID =", value, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidNotEqualTo(Integer value) {
            addCriterion("RelevantAccountID <>", value, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidGreaterThan(Integer value) {
            addCriterion("RelevantAccountID >", value, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidGreaterThanOrEqualTo(Integer value) {
            addCriterion("RelevantAccountID >=", value, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidLessThan(Integer value) {
            addCriterion("RelevantAccountID <", value, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidLessThanOrEqualTo(Integer value) {
            addCriterion("RelevantAccountID <=", value, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidIn(List<Integer> values) {
            addCriterion("RelevantAccountID in", values, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidNotIn(List<Integer> values) {
            addCriterion("RelevantAccountID not in", values, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidBetween(Integer value1, Integer value2) {
            addCriterion("RelevantAccountID between", value1, value2, "relevantaccountid");
            return (Criteria) this;
        }

        public Criteria andRelevantaccountidNotBetween(Integer value1, Integer value2) {
            addCriterion("RelevantAccountID not between", value1, value2, "relevantaccountid");
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