package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TusereventofterminalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TusereventofterminalExample() {
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

        public Criteria andUnknowncarduserIsNull() {
            addCriterion("UnknownCardUser is null");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserIsNotNull() {
            addCriterion("UnknownCardUser is not null");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserEqualTo(String value) {
            addCriterion("UnknownCardUser =", value, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserNotEqualTo(String value) {
            addCriterion("UnknownCardUser <>", value, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserGreaterThan(String value) {
            addCriterion("UnknownCardUser >", value, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserGreaterThanOrEqualTo(String value) {
            addCriterion("UnknownCardUser >=", value, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserLessThan(String value) {
            addCriterion("UnknownCardUser <", value, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserLessThanOrEqualTo(String value) {
            addCriterion("UnknownCardUser <=", value, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserLike(String value) {
            addCriterion("UnknownCardUser like", value, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserNotLike(String value) {
            addCriterion("UnknownCardUser not like", value, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserIn(List<String> values) {
            addCriterion("UnknownCardUser in", values, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserNotIn(List<String> values) {
            addCriterion("UnknownCardUser not in", values, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserBetween(String value1, String value2) {
            addCriterion("UnknownCardUser between", value1, value2, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncarduserNotBetween(String value1, String value2) {
            addCriterion("UnknownCardUser not between", value1, value2, "unknowncarduser");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoIsNull() {
            addCriterion("UnknownCardNo is null");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoIsNotNull() {
            addCriterion("UnknownCardNo is not null");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoEqualTo(String value) {
            addCriterion("UnknownCardNo =", value, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoNotEqualTo(String value) {
            addCriterion("UnknownCardNo <>", value, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoGreaterThan(String value) {
            addCriterion("UnknownCardNo >", value, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoGreaterThanOrEqualTo(String value) {
            addCriterion("UnknownCardNo >=", value, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoLessThan(String value) {
            addCriterion("UnknownCardNo <", value, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoLessThanOrEqualTo(String value) {
            addCriterion("UnknownCardNo <=", value, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoLike(String value) {
            addCriterion("UnknownCardNo like", value, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoNotLike(String value) {
            addCriterion("UnknownCardNo not like", value, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoIn(List<String> values) {
            addCriterion("UnknownCardNo in", values, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoNotIn(List<String> values) {
            addCriterion("UnknownCardNo not in", values, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoBetween(String value1, String value2) {
            addCriterion("UnknownCardNo between", value1, value2, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andUnknowncardnoNotBetween(String value1, String value2) {
            addCriterion("UnknownCardNo not between", value1, value2, "unknowncardno");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNull() {
            addCriterion("CardType is null");
            return (Criteria) this;
        }

        public Criteria andCardtypeIsNotNull() {
            addCriterion("CardType is not null");
            return (Criteria) this;
        }

        public Criteria andCardtypeEqualTo(Short value) {
            addCriterion("CardType =", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotEqualTo(Short value) {
            addCriterion("CardType <>", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThan(Short value) {
            addCriterion("CardType >", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CardType >=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThan(Short value) {
            addCriterion("CardType <", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeLessThanOrEqualTo(Short value) {
            addCriterion("CardType <=", value, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeIn(List<Short> values) {
            addCriterion("CardType in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotIn(List<Short> values) {
            addCriterion("CardType not in", values, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeBetween(Short value1, Short value2) {
            addCriterion("CardType between", value1, value2, "cardtype");
            return (Criteria) this;
        }

        public Criteria andCardtypeNotBetween(Short value1, Short value2) {
            addCriterion("CardType not between", value1, value2, "cardtype");
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

        public Criteria andActiontypeidIsNull() {
            addCriterion("ActionTypeID is null");
            return (Criteria) this;
        }

        public Criteria andActiontypeidIsNotNull() {
            addCriterion("ActionTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andActiontypeidEqualTo(Short value) {
            addCriterion("ActionTypeID =", value, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidNotEqualTo(Short value) {
            addCriterion("ActionTypeID <>", value, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidGreaterThan(Short value) {
            addCriterion("ActionTypeID >", value, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidGreaterThanOrEqualTo(Short value) {
            addCriterion("ActionTypeID >=", value, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidLessThan(Short value) {
            addCriterion("ActionTypeID <", value, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidLessThanOrEqualTo(Short value) {
            addCriterion("ActionTypeID <=", value, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidIn(List<Short> values) {
            addCriterion("ActionTypeID in", values, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidNotIn(List<Short> values) {
            addCriterion("ActionTypeID not in", values, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidBetween(Short value1, Short value2) {
            addCriterion("ActionTypeID between", value1, value2, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActiontypeidNotBetween(Short value1, Short value2) {
            addCriterion("ActionTypeID not between", value1, value2, "actiontypeid");
            return (Criteria) this;
        }

        public Criteria andActionresultidIsNull() {
            addCriterion("ActionResultID is null");
            return (Criteria) this;
        }

        public Criteria andActionresultidIsNotNull() {
            addCriterion("ActionResultID is not null");
            return (Criteria) this;
        }

        public Criteria andActionresultidEqualTo(Short value) {
            addCriterion("ActionResultID =", value, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidNotEqualTo(Short value) {
            addCriterion("ActionResultID <>", value, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidGreaterThan(Short value) {
            addCriterion("ActionResultID >", value, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidGreaterThanOrEqualTo(Short value) {
            addCriterion("ActionResultID >=", value, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidLessThan(Short value) {
            addCriterion("ActionResultID <", value, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidLessThanOrEqualTo(Short value) {
            addCriterion("ActionResultID <=", value, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidIn(List<Short> values) {
            addCriterion("ActionResultID in", values, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidNotIn(List<Short> values) {
            addCriterion("ActionResultID not in", values, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidBetween(Short value1, Short value2) {
            addCriterion("ActionResultID between", value1, value2, "actionresultid");
            return (Criteria) this;
        }

        public Criteria andActionresultidNotBetween(Short value1, Short value2) {
            addCriterion("ActionResultID not between", value1, value2, "actionresultid");
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