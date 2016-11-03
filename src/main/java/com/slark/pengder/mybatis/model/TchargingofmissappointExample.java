package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TchargingofmissappointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TchargingofmissappointExample() {
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

        public Criteria andUserIsNull() {
            addCriterion("User is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("User is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(Integer value) {
            addCriterion("User =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(Integer value) {
            addCriterion("User <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(Integer value) {
            addCriterion("User >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("User >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(Integer value) {
            addCriterion("User <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(Integer value) {
            addCriterion("User <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<Integer> values) {
            addCriterion("User in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<Integer> values) {
            addCriterion("User not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(Integer value1, Integer value2) {
            addCriterion("User between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(Integer value1, Integer value2) {
            addCriterion("User not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andBelonggroupIsNull() {
            addCriterion("BelongGroup is null");
            return (Criteria) this;
        }

        public Criteria andBelonggroupIsNotNull() {
            addCriterion("BelongGroup is not null");
            return (Criteria) this;
        }

        public Criteria andBelonggroupEqualTo(Integer value) {
            addCriterion("BelongGroup =", value, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupNotEqualTo(Integer value) {
            addCriterion("BelongGroup <>", value, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupGreaterThan(Integer value) {
            addCriterion("BelongGroup >", value, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("BelongGroup >=", value, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupLessThan(Integer value) {
            addCriterion("BelongGroup <", value, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupLessThanOrEqualTo(Integer value) {
            addCriterion("BelongGroup <=", value, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupIn(List<Integer> values) {
            addCriterion("BelongGroup in", values, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupNotIn(List<Integer> values) {
            addCriterion("BelongGroup not in", values, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupBetween(Integer value1, Integer value2) {
            addCriterion("BelongGroup between", value1, value2, "belonggroup");
            return (Criteria) this;
        }

        public Criteria andBelonggroupNotBetween(Integer value1, Integer value2) {
            addCriterion("BelongGroup not between", value1, value2, "belonggroup");
            return (Criteria) this;
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

        public Criteria andChargeIsNull() {
            addCriterion("Charge is null");
            return (Criteria) this;
        }

        public Criteria andChargeIsNotNull() {
            addCriterion("Charge is not null");
            return (Criteria) this;
        }

        public Criteria andChargeEqualTo(BigDecimal value) {
            addCriterion("Charge =", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotEqualTo(BigDecimal value) {
            addCriterion("Charge <>", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThan(BigDecimal value) {
            addCriterion("Charge >", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Charge >=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThan(BigDecimal value) {
            addCriterion("Charge <", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Charge <=", value, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeIn(List<BigDecimal> values) {
            addCriterion("Charge in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotIn(List<BigDecimal> values) {
            addCriterion("Charge not in", values, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Charge between", value1, value2, "charge");
            return (Criteria) this;
        }

        public Criteria andChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Charge not between", value1, value2, "charge");
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

        public Criteria andGaincreditIsNull() {
            addCriterion("GainCredit is null");
            return (Criteria) this;
        }

        public Criteria andGaincreditIsNotNull() {
            addCriterion("GainCredit is not null");
            return (Criteria) this;
        }

        public Criteria andGaincreditEqualTo(Short value) {
            addCriterion("GainCredit =", value, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditNotEqualTo(Short value) {
            addCriterion("GainCredit <>", value, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditGreaterThan(Short value) {
            addCriterion("GainCredit >", value, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditGreaterThanOrEqualTo(Short value) {
            addCriterion("GainCredit >=", value, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditLessThan(Short value) {
            addCriterion("GainCredit <", value, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditLessThanOrEqualTo(Short value) {
            addCriterion("GainCredit <=", value, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditIn(List<Short> values) {
            addCriterion("GainCredit in", values, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditNotIn(List<Short> values) {
            addCriterion("GainCredit not in", values, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditBetween(Short value1, Short value2) {
            addCriterion("GainCredit between", value1, value2, "gaincredit");
            return (Criteria) this;
        }

        public Criteria andGaincreditNotBetween(Short value1, Short value2) {
            addCriterion("GainCredit not between", value1, value2, "gaincredit");
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

        public Criteria andRepresentationIsNull() {
            addCriterion("Representation is null");
            return (Criteria) this;
        }

        public Criteria andRepresentationIsNotNull() {
            addCriterion("Representation is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentationEqualTo(Boolean value) {
            addCriterion("Representation =", value, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationNotEqualTo(Boolean value) {
            addCriterion("Representation <>", value, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationGreaterThan(Boolean value) {
            addCriterion("Representation >", value, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationGreaterThanOrEqualTo(Boolean value) {
            addCriterion("Representation >=", value, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationLessThan(Boolean value) {
            addCriterion("Representation <", value, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationLessThanOrEqualTo(Boolean value) {
            addCriterion("Representation <=", value, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationIn(List<Boolean> values) {
            addCriterion("Representation in", values, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationNotIn(List<Boolean> values) {
            addCriterion("Representation not in", values, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationBetween(Boolean value1, Boolean value2) {
            addCriterion("Representation between", value1, value2, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationNotBetween(Boolean value1, Boolean value2) {
            addCriterion("Representation not between", value1, value2, "representation");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeIsNull() {
            addCriterion("RepresentationTime is null");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeIsNotNull() {
            addCriterion("RepresentationTime is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeEqualTo(Date value) {
            addCriterion("RepresentationTime =", value, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeNotEqualTo(Date value) {
            addCriterion("RepresentationTime <>", value, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeGreaterThan(Date value) {
            addCriterion("RepresentationTime >", value, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RepresentationTime >=", value, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeLessThan(Date value) {
            addCriterion("RepresentationTime <", value, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeLessThanOrEqualTo(Date value) {
            addCriterion("RepresentationTime <=", value, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeIn(List<Date> values) {
            addCriterion("RepresentationTime in", values, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeNotIn(List<Date> values) {
            addCriterion("RepresentationTime not in", values, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeBetween(Date value1, Date value2) {
            addCriterion("RepresentationTime between", value1, value2, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationtimeNotBetween(Date value1, Date value2) {
            addCriterion("RepresentationTime not between", value1, value2, "representationtime");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentIsNull() {
            addCriterion("RepresentationContent is null");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentIsNotNull() {
            addCriterion("RepresentationContent is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentEqualTo(String value) {
            addCriterion("RepresentationContent =", value, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentNotEqualTo(String value) {
            addCriterion("RepresentationContent <>", value, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentGreaterThan(String value) {
            addCriterion("RepresentationContent >", value, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentGreaterThanOrEqualTo(String value) {
            addCriterion("RepresentationContent >=", value, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentLessThan(String value) {
            addCriterion("RepresentationContent <", value, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentLessThanOrEqualTo(String value) {
            addCriterion("RepresentationContent <=", value, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentLike(String value) {
            addCriterion("RepresentationContent like", value, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentNotLike(String value) {
            addCriterion("RepresentationContent not like", value, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentIn(List<String> values) {
            addCriterion("RepresentationContent in", values, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentNotIn(List<String> values) {
            addCriterion("RepresentationContent not in", values, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentBetween(String value1, String value2) {
            addCriterion("RepresentationContent between", value1, value2, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationcontentNotBetween(String value1, String value2) {
            addCriterion("RepresentationContent not between", value1, value2, "representationcontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeIsNull() {
            addCriterion("RepresentationType is null");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeIsNotNull() {
            addCriterion("RepresentationType is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeEqualTo(String value) {
            addCriterion("RepresentationType =", value, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeNotEqualTo(String value) {
            addCriterion("RepresentationType <>", value, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeGreaterThan(String value) {
            addCriterion("RepresentationType >", value, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("RepresentationType >=", value, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeLessThan(String value) {
            addCriterion("RepresentationType <", value, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeLessThanOrEqualTo(String value) {
            addCriterion("RepresentationType <=", value, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeLike(String value) {
            addCriterion("RepresentationType like", value, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeNotLike(String value) {
            addCriterion("RepresentationType not like", value, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeIn(List<String> values) {
            addCriterion("RepresentationType in", values, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeNotIn(List<String> values) {
            addCriterion("RepresentationType not in", values, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeBetween(String value1, String value2) {
            addCriterion("RepresentationType between", value1, value2, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationtypeNotBetween(String value1, String value2) {
            addCriterion("RepresentationType not between", value1, value2, "representationtype");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentIsNull() {
            addCriterion("RepresentationReContent is null");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentIsNotNull() {
            addCriterion("RepresentationReContent is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentEqualTo(String value) {
            addCriterion("RepresentationReContent =", value, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentNotEqualTo(String value) {
            addCriterion("RepresentationReContent <>", value, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentGreaterThan(String value) {
            addCriterion("RepresentationReContent >", value, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentGreaterThanOrEqualTo(String value) {
            addCriterion("RepresentationReContent >=", value, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentLessThan(String value) {
            addCriterion("RepresentationReContent <", value, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentLessThanOrEqualTo(String value) {
            addCriterion("RepresentationReContent <=", value, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentLike(String value) {
            addCriterion("RepresentationReContent like", value, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentNotLike(String value) {
            addCriterion("RepresentationReContent not like", value, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentIn(List<String> values) {
            addCriterion("RepresentationReContent in", values, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentNotIn(List<String> values) {
            addCriterion("RepresentationReContent not in", values, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentBetween(String value1, String value2) {
            addCriterion("RepresentationReContent between", value1, value2, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationrecontentNotBetween(String value1, String value2) {
            addCriterion("RepresentationReContent not between", value1, value2, "representationrecontent");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierIsNull() {
            addCriterion("RepresentationReplier is null");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierIsNotNull() {
            addCriterion("RepresentationReplier is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierEqualTo(Integer value) {
            addCriterion("RepresentationReplier =", value, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierNotEqualTo(Integer value) {
            addCriterion("RepresentationReplier <>", value, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierGreaterThan(Integer value) {
            addCriterion("RepresentationReplier >", value, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierGreaterThanOrEqualTo(Integer value) {
            addCriterion("RepresentationReplier >=", value, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierLessThan(Integer value) {
            addCriterion("RepresentationReplier <", value, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierLessThanOrEqualTo(Integer value) {
            addCriterion("RepresentationReplier <=", value, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierIn(List<Integer> values) {
            addCriterion("RepresentationReplier in", values, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierNotIn(List<Integer> values) {
            addCriterion("RepresentationReplier not in", values, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierBetween(Integer value1, Integer value2) {
            addCriterion("RepresentationReplier between", value1, value2, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andRepresentationreplierNotBetween(Integer value1, Integer value2) {
            addCriterion("RepresentationReplier not between", value1, value2, "representationreplier");
            return (Criteria) this;
        }

        public Criteria andBookingidIsNull() {
            addCriterion("BookingID is null");
            return (Criteria) this;
        }

        public Criteria andBookingidIsNotNull() {
            addCriterion("BookingID is not null");
            return (Criteria) this;
        }

        public Criteria andBookingidEqualTo(Long value) {
            addCriterion("BookingID =", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidNotEqualTo(Long value) {
            addCriterion("BookingID <>", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidGreaterThan(Long value) {
            addCriterion("BookingID >", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidGreaterThanOrEqualTo(Long value) {
            addCriterion("BookingID >=", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidLessThan(Long value) {
            addCriterion("BookingID <", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidLessThanOrEqualTo(Long value) {
            addCriterion("BookingID <=", value, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidIn(List<Long> values) {
            addCriterion("BookingID in", values, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidNotIn(List<Long> values) {
            addCriterion("BookingID not in", values, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidBetween(Long value1, Long value2) {
            addCriterion("BookingID between", value1, value2, "bookingid");
            return (Criteria) this;
        }

        public Criteria andBookingidNotBetween(Long value1, Long value2) {
            addCriterion("BookingID not between", value1, value2, "bookingid");
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

        public Criteria andRepresentationretimeIsNull() {
            addCriterion("RepresentationReTime is null");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeIsNotNull() {
            addCriterion("RepresentationReTime is not null");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeEqualTo(Date value) {
            addCriterion("RepresentationReTime =", value, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeNotEqualTo(Date value) {
            addCriterion("RepresentationReTime <>", value, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeGreaterThan(Date value) {
            addCriterion("RepresentationReTime >", value, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RepresentationReTime >=", value, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeLessThan(Date value) {
            addCriterion("RepresentationReTime <", value, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeLessThanOrEqualTo(Date value) {
            addCriterion("RepresentationReTime <=", value, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeIn(List<Date> values) {
            addCriterion("RepresentationReTime in", values, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeNotIn(List<Date> values) {
            addCriterion("RepresentationReTime not in", values, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeBetween(Date value1, Date value2) {
            addCriterion("RepresentationReTime between", value1, value2, "representationretime");
            return (Criteria) this;
        }

        public Criteria andRepresentationretimeNotBetween(Date value1, Date value2) {
            addCriterion("RepresentationReTime not between", value1, value2, "representationretime");
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