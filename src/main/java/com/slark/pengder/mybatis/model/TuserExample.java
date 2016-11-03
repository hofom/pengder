package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TuserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TuserExample() {
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

        public Criteria andLoginnameIsNull() {
            addCriterion("LoginName is null");
            return (Criteria) this;
        }

        public Criteria andLoginnameIsNotNull() {
            addCriterion("LoginName is not null");
            return (Criteria) this;
        }

        public Criteria andLoginnameEqualTo(String value) {
            addCriterion("LoginName =", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotEqualTo(String value) {
            addCriterion("LoginName <>", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThan(String value) {
            addCriterion("LoginName >", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameGreaterThanOrEqualTo(String value) {
            addCriterion("LoginName >=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThan(String value) {
            addCriterion("LoginName <", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLessThanOrEqualTo(String value) {
            addCriterion("LoginName <=", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameLike(String value) {
            addCriterion("LoginName like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotLike(String value) {
            addCriterion("LoginName not like", value, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameIn(List<String> values) {
            addCriterion("LoginName in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotIn(List<String> values) {
            addCriterion("LoginName not in", values, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameBetween(String value1, String value2) {
            addCriterion("LoginName between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andLoginnameNotBetween(String value1, String value2) {
            addCriterion("LoginName not between", value1, value2, "loginname");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("Password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("Password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("Password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("Password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("Password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("Password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("Password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("Password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("Password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("Password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("Password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("Password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("Password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("Password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andUserroleidIsNull() {
            addCriterion("UserRoleID is null");
            return (Criteria) this;
        }

        public Criteria andUserroleidIsNotNull() {
            addCriterion("UserRoleID is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleidEqualTo(Integer value) {
            addCriterion("UserRoleID =", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidNotEqualTo(Integer value) {
            addCriterion("UserRoleID <>", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidGreaterThan(Integer value) {
            addCriterion("UserRoleID >", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserRoleID >=", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidLessThan(Integer value) {
            addCriterion("UserRoleID <", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidLessThanOrEqualTo(Integer value) {
            addCriterion("UserRoleID <=", value, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidIn(List<Integer> values) {
            addCriterion("UserRoleID in", values, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidNotIn(List<Integer> values) {
            addCriterion("UserRoleID not in", values, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidBetween(Integer value1, Integer value2) {
            addCriterion("UserRoleID between", value1, value2, "userroleid");
            return (Criteria) this;
        }

        public Criteria andUserroleidNotBetween(Integer value1, Integer value2) {
            addCriterion("UserRoleID not between", value1, value2, "userroleid");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("Gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("Gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Byte value) {
            addCriterion("Gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Byte value) {
            addCriterion("Gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Byte value) {
            addCriterion("Gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Byte value) {
            addCriterion("Gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Byte value) {
            addCriterion("Gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Byte value) {
            addCriterion("Gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Byte> values) {
            addCriterion("Gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Byte> values) {
            addCriterion("Gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Byte value1, Byte value2) {
            addCriterion("Gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Byte value1, Byte value2) {
            addCriterion("Gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNull() {
            addCriterion("LoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLogintimeIsNotNull() {
            addCriterion("LoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLogintimeEqualTo(Date value) {
            addCriterion("LoginTime =", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotEqualTo(Date value) {
            addCriterion("LoginTime <>", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThan(Date value) {
            addCriterion("LoginTime >", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LoginTime >=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThan(Date value) {
            addCriterion("LoginTime <", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LoginTime <=", value, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeIn(List<Date> values) {
            addCriterion("LoginTime in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotIn(List<Date> values) {
            addCriterion("LoginTime not in", values, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeBetween(Date value1, Date value2) {
            addCriterion("LoginTime between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LoginTime not between", value1, value2, "logintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNull() {
            addCriterion("LastLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIsNotNull() {
            addCriterion("LastLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeEqualTo(Date value) {
            addCriterion("LastLoginTime =", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotEqualTo(Date value) {
            addCriterion("LastLoginTime <>", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThan(Date value) {
            addCriterion("LastLoginTime >", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime >=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThan(Date value) {
            addCriterion("LastLoginTime <", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("LastLoginTime <=", value, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeIn(List<Date> values) {
            addCriterion("LastLoginTime in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotIn(List<Date> values) {
            addCriterion("LastLoginTime not in", values, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("LastLoginTime not between", value1, value2, "lastlogintime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeIsNull() {
            addCriterion("LastSetPasswordTime is null");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeIsNotNull() {
            addCriterion("LastSetPasswordTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeEqualTo(Date value) {
            addCriterion("LastSetPasswordTime =", value, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeNotEqualTo(Date value) {
            addCriterion("LastSetPasswordTime <>", value, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeGreaterThan(Date value) {
            addCriterion("LastSetPasswordTime >", value, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastSetPasswordTime >=", value, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeLessThan(Date value) {
            addCriterion("LastSetPasswordTime <", value, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeLessThanOrEqualTo(Date value) {
            addCriterion("LastSetPasswordTime <=", value, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeIn(List<Date> values) {
            addCriterion("LastSetPasswordTime in", values, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeNotIn(List<Date> values) {
            addCriterion("LastSetPasswordTime not in", values, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeBetween(Date value1, Date value2) {
            addCriterion("LastSetPasswordTime between", value1, value2, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastsetpasswordtimeNotBetween(Date value1, Date value2) {
            addCriterion("LastSetPasswordTime not between", value1, value2, "lastsetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeIsNull() {
            addCriterion("LastResetPasswordTime is null");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeIsNotNull() {
            addCriterion("LastResetPasswordTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeEqualTo(Date value) {
            addCriterion("LastResetPasswordTime =", value, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeNotEqualTo(Date value) {
            addCriterion("LastResetPasswordTime <>", value, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeGreaterThan(Date value) {
            addCriterion("LastResetPasswordTime >", value, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastResetPasswordTime >=", value, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeLessThan(Date value) {
            addCriterion("LastResetPasswordTime <", value, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeLessThanOrEqualTo(Date value) {
            addCriterion("LastResetPasswordTime <=", value, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeIn(List<Date> values) {
            addCriterion("LastResetPasswordTime in", values, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeNotIn(List<Date> values) {
            addCriterion("LastResetPasswordTime not in", values, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeBetween(Date value1, Date value2) {
            addCriterion("LastResetPasswordTime between", value1, value2, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andLastresetpasswordtimeNotBetween(Date value1, Date value2) {
            addCriterion("LastResetPasswordTime not between", value1, value2, "lastresetpasswordtime");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountIsNull() {
            addCriterion("PasswordAttemptCount is null");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountIsNotNull() {
            addCriterion("PasswordAttemptCount is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountEqualTo(Byte value) {
            addCriterion("PasswordAttemptCount =", value, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountNotEqualTo(Byte value) {
            addCriterion("PasswordAttemptCount <>", value, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountGreaterThan(Byte value) {
            addCriterion("PasswordAttemptCount >", value, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountGreaterThanOrEqualTo(Byte value) {
            addCriterion("PasswordAttemptCount >=", value, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountLessThan(Byte value) {
            addCriterion("PasswordAttemptCount <", value, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountLessThanOrEqualTo(Byte value) {
            addCriterion("PasswordAttemptCount <=", value, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountIn(List<Byte> values) {
            addCriterion("PasswordAttemptCount in", values, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountNotIn(List<Byte> values) {
            addCriterion("PasswordAttemptCount not in", values, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountBetween(Byte value1, Byte value2) {
            addCriterion("PasswordAttemptCount between", value1, value2, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andPasswordattemptcountNotBetween(Byte value1, Byte value2) {
            addCriterion("PasswordAttemptCount not between", value1, value2, "passwordattemptcount");
            return (Criteria) this;
        }

        public Criteria andLockedIsNull() {
            addCriterion("Locked is null");
            return (Criteria) this;
        }

        public Criteria andLockedIsNotNull() {
            addCriterion("Locked is not null");
            return (Criteria) this;
        }

        public Criteria andLockedEqualTo(Byte value) {
            addCriterion("Locked =", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotEqualTo(Byte value) {
            addCriterion("Locked <>", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThan(Byte value) {
            addCriterion("Locked >", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedGreaterThanOrEqualTo(Byte value) {
            addCriterion("Locked >=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThan(Byte value) {
            addCriterion("Locked <", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedLessThanOrEqualTo(Byte value) {
            addCriterion("Locked <=", value, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedIn(List<Byte> values) {
            addCriterion("Locked in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotIn(List<Byte> values) {
            addCriterion("Locked not in", values, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedBetween(Byte value1, Byte value2) {
            addCriterion("Locked between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andLockedNotBetween(Byte value1, Byte value2) {
            addCriterion("Locked not between", value1, value2, "locked");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNull() {
            addCriterion("UserState is null");
            return (Criteria) this;
        }

        public Criteria andUserstateIsNotNull() {
            addCriterion("UserState is not null");
            return (Criteria) this;
        }

        public Criteria andUserstateEqualTo(Short value) {
            addCriterion("UserState =", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotEqualTo(Short value) {
            addCriterion("UserState <>", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThan(Short value) {
            addCriterion("UserState >", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateGreaterThanOrEqualTo(Short value) {
            addCriterion("UserState >=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThan(Short value) {
            addCriterion("UserState <", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateLessThanOrEqualTo(Short value) {
            addCriterion("UserState <=", value, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateIn(List<Short> values) {
            addCriterion("UserState in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotIn(List<Short> values) {
            addCriterion("UserState not in", values, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateBetween(Short value1, Short value2) {
            addCriterion("UserState between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andUserstateNotBetween(Short value1, Short value2) {
            addCriterion("UserState not between", value1, value2, "userstate");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNull() {
            addCriterion("RegisterTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIsNotNull() {
            addCriterion("RegisterTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistertimeEqualTo(Date value) {
            addCriterion("RegisterTime =", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotEqualTo(Date value) {
            addCriterion("RegisterTime <>", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThan(Date value) {
            addCriterion("RegisterTime >", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RegisterTime >=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThan(Date value) {
            addCriterion("RegisterTime <", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeLessThanOrEqualTo(Date value) {
            addCriterion("RegisterTime <=", value, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeIn(List<Date> values) {
            addCriterion("RegisterTime in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotIn(List<Date> values) {
            addCriterion("RegisterTime not in", values, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeBetween(Date value1, Date value2) {
            addCriterion("RegisterTime between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andRegistertimeNotBetween(Date value1, Date value2) {
            addCriterion("RegisterTime not between", value1, value2, "registertime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeIsNull() {
            addCriterion("ApprovedTime is null");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeIsNotNull() {
            addCriterion("ApprovedTime is not null");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeEqualTo(Date value) {
            addCriterion("ApprovedTime =", value, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeNotEqualTo(Date value) {
            addCriterion("ApprovedTime <>", value, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeGreaterThan(Date value) {
            addCriterion("ApprovedTime >", value, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ApprovedTime >=", value, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeLessThan(Date value) {
            addCriterion("ApprovedTime <", value, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeLessThanOrEqualTo(Date value) {
            addCriterion("ApprovedTime <=", value, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeIn(List<Date> values) {
            addCriterion("ApprovedTime in", values, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeNotIn(List<Date> values) {
            addCriterion("ApprovedTime not in", values, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeBetween(Date value1, Date value2) {
            addCriterion("ApprovedTime between", value1, value2, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andApprovedtimeNotBetween(Date value1, Date value2) {
            addCriterion("ApprovedTime not between", value1, value2, "approvedtime");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("FirstName is null");
            return (Criteria) this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("FirstName is not null");
            return (Criteria) this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("FirstName =", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("FirstName <>", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("FirstName >", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("FirstName >=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("FirstName <", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("FirstName <=", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("FirstName like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("FirstName not like", value, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameIn(List<String> values) {
            addCriterion("FirstName in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotIn(List<String> values) {
            addCriterion("FirstName not in", values, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("FirstName between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("FirstName not between", value1, value2, "firstname");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("LastName is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("LastName is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("LastName =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("LastName <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("LastName >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("LastName >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("LastName <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("LastName <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("LastName like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("LastName not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("LastName in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("LastName not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("LastName between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("LastName not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andUseridentifyIsNull() {
            addCriterion("UserIdentify is null");
            return (Criteria) this;
        }

        public Criteria andUseridentifyIsNotNull() {
            addCriterion("UserIdentify is not null");
            return (Criteria) this;
        }

        public Criteria andUseridentifyEqualTo(String value) {
            addCriterion("UserIdentify =", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyNotEqualTo(String value) {
            addCriterion("UserIdentify <>", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyGreaterThan(String value) {
            addCriterion("UserIdentify >", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyGreaterThanOrEqualTo(String value) {
            addCriterion("UserIdentify >=", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyLessThan(String value) {
            addCriterion("UserIdentify <", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyLessThanOrEqualTo(String value) {
            addCriterion("UserIdentify <=", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyLike(String value) {
            addCriterion("UserIdentify like", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyNotLike(String value) {
            addCriterion("UserIdentify not like", value, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyIn(List<String> values) {
            addCriterion("UserIdentify in", values, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyNotIn(List<String> values) {
            addCriterion("UserIdentify not in", values, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyBetween(String value1, String value2) {
            addCriterion("UserIdentify between", value1, value2, "useridentify");
            return (Criteria) this;
        }

        public Criteria andUseridentifyNotBetween(String value1, String value2) {
            addCriterion("UserIdentify not between", value1, value2, "useridentify");
            return (Criteria) this;
        }

        public Criteria andEmail1IsNull() {
            addCriterion("Email1 is null");
            return (Criteria) this;
        }

        public Criteria andEmail1IsNotNull() {
            addCriterion("Email1 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail1EqualTo(String value) {
            addCriterion("Email1 =", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotEqualTo(String value) {
            addCriterion("Email1 <>", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1GreaterThan(String value) {
            addCriterion("Email1 >", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1GreaterThanOrEqualTo(String value) {
            addCriterion("Email1 >=", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1LessThan(String value) {
            addCriterion("Email1 <", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1LessThanOrEqualTo(String value) {
            addCriterion("Email1 <=", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1Like(String value) {
            addCriterion("Email1 like", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotLike(String value) {
            addCriterion("Email1 not like", value, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1In(List<String> values) {
            addCriterion("Email1 in", values, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotIn(List<String> values) {
            addCriterion("Email1 not in", values, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1Between(String value1, String value2) {
            addCriterion("Email1 between", value1, value2, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail1NotBetween(String value1, String value2) {
            addCriterion("Email1 not between", value1, value2, "email1");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNull() {
            addCriterion("Email2 is null");
            return (Criteria) this;
        }

        public Criteria andEmail2IsNotNull() {
            addCriterion("Email2 is not null");
            return (Criteria) this;
        }

        public Criteria andEmail2EqualTo(String value) {
            addCriterion("Email2 =", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotEqualTo(String value) {
            addCriterion("Email2 <>", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThan(String value) {
            addCriterion("Email2 >", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2GreaterThanOrEqualTo(String value) {
            addCriterion("Email2 >=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThan(String value) {
            addCriterion("Email2 <", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2LessThanOrEqualTo(String value) {
            addCriterion("Email2 <=", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Like(String value) {
            addCriterion("Email2 like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotLike(String value) {
            addCriterion("Email2 not like", value, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2In(List<String> values) {
            addCriterion("Email2 in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotIn(List<String> values) {
            addCriterion("Email2 not in", values, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2Between(String value1, String value2) {
            addCriterion("Email2 between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andEmail2NotBetween(String value1, String value2) {
            addCriterion("Email2 not between", value1, value2, "email2");
            return (Criteria) this;
        }

        public Criteria andMobilephone1IsNull() {
            addCriterion("MobilePhone1 is null");
            return (Criteria) this;
        }

        public Criteria andMobilephone1IsNotNull() {
            addCriterion("MobilePhone1 is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephone1EqualTo(String value) {
            addCriterion("MobilePhone1 =", value, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1NotEqualTo(String value) {
            addCriterion("MobilePhone1 <>", value, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1GreaterThan(String value) {
            addCriterion("MobilePhone1 >", value, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1GreaterThanOrEqualTo(String value) {
            addCriterion("MobilePhone1 >=", value, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1LessThan(String value) {
            addCriterion("MobilePhone1 <", value, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1LessThanOrEqualTo(String value) {
            addCriterion("MobilePhone1 <=", value, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1Like(String value) {
            addCriterion("MobilePhone1 like", value, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1NotLike(String value) {
            addCriterion("MobilePhone1 not like", value, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1In(List<String> values) {
            addCriterion("MobilePhone1 in", values, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1NotIn(List<String> values) {
            addCriterion("MobilePhone1 not in", values, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1Between(String value1, String value2) {
            addCriterion("MobilePhone1 between", value1, value2, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone1NotBetween(String value1, String value2) {
            addCriterion("MobilePhone1 not between", value1, value2, "mobilephone1");
            return (Criteria) this;
        }

        public Criteria andMobilephone2IsNull() {
            addCriterion("MobilePhone2 is null");
            return (Criteria) this;
        }

        public Criteria andMobilephone2IsNotNull() {
            addCriterion("MobilePhone2 is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephone2EqualTo(String value) {
            addCriterion("MobilePhone2 =", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2NotEqualTo(String value) {
            addCriterion("MobilePhone2 <>", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2GreaterThan(String value) {
            addCriterion("MobilePhone2 >", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2GreaterThanOrEqualTo(String value) {
            addCriterion("MobilePhone2 >=", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2LessThan(String value) {
            addCriterion("MobilePhone2 <", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2LessThanOrEqualTo(String value) {
            addCriterion("MobilePhone2 <=", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2Like(String value) {
            addCriterion("MobilePhone2 like", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2NotLike(String value) {
            addCriterion("MobilePhone2 not like", value, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2In(List<String> values) {
            addCriterion("MobilePhone2 in", values, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2NotIn(List<String> values) {
            addCriterion("MobilePhone2 not in", values, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2Between(String value1, String value2) {
            addCriterion("MobilePhone2 between", value1, value2, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andMobilephone2NotBetween(String value1, String value2) {
            addCriterion("MobilePhone2 not between", value1, value2, "mobilephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone1IsNull() {
            addCriterion("Telephone1 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone1IsNotNull() {
            addCriterion("Telephone1 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone1EqualTo(String value) {
            addCriterion("Telephone1 =", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotEqualTo(String value) {
            addCriterion("Telephone1 <>", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1GreaterThan(String value) {
            addCriterion("Telephone1 >", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1GreaterThanOrEqualTo(String value) {
            addCriterion("Telephone1 >=", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1LessThan(String value) {
            addCriterion("Telephone1 <", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1LessThanOrEqualTo(String value) {
            addCriterion("Telephone1 <=", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1Like(String value) {
            addCriterion("Telephone1 like", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotLike(String value) {
            addCriterion("Telephone1 not like", value, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1In(List<String> values) {
            addCriterion("Telephone1 in", values, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotIn(List<String> values) {
            addCriterion("Telephone1 not in", values, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1Between(String value1, String value2) {
            addCriterion("Telephone1 between", value1, value2, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone1NotBetween(String value1, String value2) {
            addCriterion("Telephone1 not between", value1, value2, "telephone1");
            return (Criteria) this;
        }

        public Criteria andTelephone2IsNull() {
            addCriterion("Telephone2 is null");
            return (Criteria) this;
        }

        public Criteria andTelephone2IsNotNull() {
            addCriterion("Telephone2 is not null");
            return (Criteria) this;
        }

        public Criteria andTelephone2EqualTo(String value) {
            addCriterion("Telephone2 =", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotEqualTo(String value) {
            addCriterion("Telephone2 <>", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2GreaterThan(String value) {
            addCriterion("Telephone2 >", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2GreaterThanOrEqualTo(String value) {
            addCriterion("Telephone2 >=", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2LessThan(String value) {
            addCriterion("Telephone2 <", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2LessThanOrEqualTo(String value) {
            addCriterion("Telephone2 <=", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2Like(String value) {
            addCriterion("Telephone2 like", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotLike(String value) {
            addCriterion("Telephone2 not like", value, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2In(List<String> values) {
            addCriterion("Telephone2 in", values, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotIn(List<String> values) {
            addCriterion("Telephone2 not in", values, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2Between(String value1, String value2) {
            addCriterion("Telephone2 between", value1, value2, "telephone2");
            return (Criteria) this;
        }

        public Criteria andTelephone2NotBetween(String value1, String value2) {
            addCriterion("Telephone2 not between", value1, value2, "telephone2");
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

        public Criteria andLastsetcardidtimeIsNull() {
            addCriterion("LastSetCardIDTime is null");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeIsNotNull() {
            addCriterion("LastSetCardIDTime is not null");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeEqualTo(Date value) {
            addCriterion("LastSetCardIDTime =", value, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeNotEqualTo(Date value) {
            addCriterion("LastSetCardIDTime <>", value, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeGreaterThan(Date value) {
            addCriterion("LastSetCardIDTime >", value, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LastSetCardIDTime >=", value, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeLessThan(Date value) {
            addCriterion("LastSetCardIDTime <", value, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeLessThanOrEqualTo(Date value) {
            addCriterion("LastSetCardIDTime <=", value, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeIn(List<Date> values) {
            addCriterion("LastSetCardIDTime in", values, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeNotIn(List<Date> values) {
            addCriterion("LastSetCardIDTime not in", values, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeBetween(Date value1, Date value2) {
            addCriterion("LastSetCardIDTime between", value1, value2, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andLastsetcardidtimeNotBetween(Date value1, Date value2) {
            addCriterion("LastSetCardIDTime not between", value1, value2, "lastsetcardidtime");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1IsNull() {
            addCriterion("UsedCardID1 is null");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1IsNotNull() {
            addCriterion("UsedCardID1 is not null");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1EqualTo(Integer value) {
            addCriterion("UsedCardID1 =", value, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1NotEqualTo(Integer value) {
            addCriterion("UsedCardID1 <>", value, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1GreaterThan(Integer value) {
            addCriterion("UsedCardID1 >", value, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1GreaterThanOrEqualTo(Integer value) {
            addCriterion("UsedCardID1 >=", value, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1LessThan(Integer value) {
            addCriterion("UsedCardID1 <", value, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1LessThanOrEqualTo(Integer value) {
            addCriterion("UsedCardID1 <=", value, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1In(List<Integer> values) {
            addCriterion("UsedCardID1 in", values, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1NotIn(List<Integer> values) {
            addCriterion("UsedCardID1 not in", values, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1Between(Integer value1, Integer value2) {
            addCriterion("UsedCardID1 between", value1, value2, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid1NotBetween(Integer value1, Integer value2) {
            addCriterion("UsedCardID1 not between", value1, value2, "usedcardid1");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2IsNull() {
            addCriterion("UsedCardID2 is null");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2IsNotNull() {
            addCriterion("UsedCardID2 is not null");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2EqualTo(Integer value) {
            addCriterion("UsedCardID2 =", value, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2NotEqualTo(Integer value) {
            addCriterion("UsedCardID2 <>", value, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2GreaterThan(Integer value) {
            addCriterion("UsedCardID2 >", value, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2GreaterThanOrEqualTo(Integer value) {
            addCriterion("UsedCardID2 >=", value, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2LessThan(Integer value) {
            addCriterion("UsedCardID2 <", value, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2LessThanOrEqualTo(Integer value) {
            addCriterion("UsedCardID2 <=", value, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2In(List<Integer> values) {
            addCriterion("UsedCardID2 in", values, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2NotIn(List<Integer> values) {
            addCriterion("UsedCardID2 not in", values, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2Between(Integer value1, Integer value2) {
            addCriterion("UsedCardID2 between", value1, value2, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid2NotBetween(Integer value1, Integer value2) {
            addCriterion("UsedCardID2 not between", value1, value2, "usedcardid2");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3IsNull() {
            addCriterion("UsedCardID3 is null");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3IsNotNull() {
            addCriterion("UsedCardID3 is not null");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3EqualTo(Integer value) {
            addCriterion("UsedCardID3 =", value, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3NotEqualTo(Integer value) {
            addCriterion("UsedCardID3 <>", value, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3GreaterThan(Integer value) {
            addCriterion("UsedCardID3 >", value, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3GreaterThanOrEqualTo(Integer value) {
            addCriterion("UsedCardID3 >=", value, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3LessThan(Integer value) {
            addCriterion("UsedCardID3 <", value, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3LessThanOrEqualTo(Integer value) {
            addCriterion("UsedCardID3 <=", value, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3In(List<Integer> values) {
            addCriterion("UsedCardID3 in", values, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3NotIn(List<Integer> values) {
            addCriterion("UsedCardID3 not in", values, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3Between(Integer value1, Integer value2) {
            addCriterion("UsedCardID3 between", value1, value2, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andUsedcardid3NotBetween(Integer value1, Integer value2) {
            addCriterion("UsedCardID3 not between", value1, value2, "usedcardid3");
            return (Criteria) this;
        }

        public Criteria andPiIsNull() {
            addCriterion("PI is null");
            return (Criteria) this;
        }

        public Criteria andPiIsNotNull() {
            addCriterion("PI is not null");
            return (Criteria) this;
        }

        public Criteria andPiEqualTo(Byte value) {
            addCriterion("PI =", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiNotEqualTo(Byte value) {
            addCriterion("PI <>", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiGreaterThan(Byte value) {
            addCriterion("PI >", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiGreaterThanOrEqualTo(Byte value) {
            addCriterion("PI >=", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiLessThan(Byte value) {
            addCriterion("PI <", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiLessThanOrEqualTo(Byte value) {
            addCriterion("PI <=", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiIn(List<Byte> values) {
            addCriterion("PI in", values, "pi");
            return (Criteria) this;
        }

        public Criteria andPiNotIn(List<Byte> values) {
            addCriterion("PI not in", values, "pi");
            return (Criteria) this;
        }

        public Criteria andPiBetween(Byte value1, Byte value2) {
            addCriterion("PI between", value1, value2, "pi");
            return (Criteria) this;
        }

        public Criteria andPiNotBetween(Byte value1, Byte value2) {
            addCriterion("PI not between", value1, value2, "pi");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("Position is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("Position is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(Short value) {
            addCriterion("Position =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(Short value) {
            addCriterion("Position <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(Short value) {
            addCriterion("Position >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(Short value) {
            addCriterion("Position >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(Short value) {
            addCriterion("Position <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(Short value) {
            addCriterion("Position <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<Short> values) {
            addCriterion("Position in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<Short> values) {
            addCriterion("Position not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(Short value1, Short value2) {
            addCriterion("Position between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(Short value1, Short value2) {
            addCriterion("Position not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeIsNull() {
            addCriterion("AttritionType is null");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeIsNotNull() {
            addCriterion("AttritionType is not null");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeEqualTo(Short value) {
            addCriterion("AttritionType =", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeNotEqualTo(Short value) {
            addCriterion("AttritionType <>", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeGreaterThan(Short value) {
            addCriterion("AttritionType >", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeGreaterThanOrEqualTo(Short value) {
            addCriterion("AttritionType >=", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeLessThan(Short value) {
            addCriterion("AttritionType <", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeLessThanOrEqualTo(Short value) {
            addCriterion("AttritionType <=", value, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeIn(List<Short> values) {
            addCriterion("AttritionType in", values, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeNotIn(List<Short> values) {
            addCriterion("AttritionType not in", values, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeBetween(Short value1, Short value2) {
            addCriterion("AttritionType between", value1, value2, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andAttritiontypeNotBetween(Short value1, Short value2) {
            addCriterion("AttritionType not between", value1, value2, "attritiontype");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("Photo is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("Photo is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("Photo =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("Photo <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("Photo >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("Photo >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("Photo <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("Photo <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("Photo like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("Photo not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("Photo in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("Photo not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("Photo between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("Photo not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andActivedaccountIsNull() {
            addCriterion("ActivedAccount is null");
            return (Criteria) this;
        }

        public Criteria andActivedaccountIsNotNull() {
            addCriterion("ActivedAccount is not null");
            return (Criteria) this;
        }

        public Criteria andActivedaccountEqualTo(Integer value) {
            addCriterion("ActivedAccount =", value, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountNotEqualTo(Integer value) {
            addCriterion("ActivedAccount <>", value, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountGreaterThan(Integer value) {
            addCriterion("ActivedAccount >", value, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActivedAccount >=", value, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountLessThan(Integer value) {
            addCriterion("ActivedAccount <", value, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountLessThanOrEqualTo(Integer value) {
            addCriterion("ActivedAccount <=", value, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountIn(List<Integer> values) {
            addCriterion("ActivedAccount in", values, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountNotIn(List<Integer> values) {
            addCriterion("ActivedAccount not in", values, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountBetween(Integer value1, Integer value2) {
            addCriterion("ActivedAccount between", value1, value2, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andActivedaccountNotBetween(Integer value1, Integer value2) {
            addCriterion("ActivedAccount not between", value1, value2, "activedaccount");
            return (Criteria) this;
        }

        public Criteria andRelateduseridIsNull() {
            addCriterion("RelatedUserID is null");
            return (Criteria) this;
        }

        public Criteria andRelateduseridIsNotNull() {
            addCriterion("RelatedUserID is not null");
            return (Criteria) this;
        }

        public Criteria andRelateduseridEqualTo(Integer value) {
            addCriterion("RelatedUserID =", value, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridNotEqualTo(Integer value) {
            addCriterion("RelatedUserID <>", value, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridGreaterThan(Integer value) {
            addCriterion("RelatedUserID >", value, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("RelatedUserID >=", value, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridLessThan(Integer value) {
            addCriterion("RelatedUserID <", value, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridLessThanOrEqualTo(Integer value) {
            addCriterion("RelatedUserID <=", value, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridIn(List<Integer> values) {
            addCriterion("RelatedUserID in", values, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridNotIn(List<Integer> values) {
            addCriterion("RelatedUserID not in", values, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridBetween(Integer value1, Integer value2) {
            addCriterion("RelatedUserID between", value1, value2, "relateduserid");
            return (Criteria) this;
        }

        public Criteria andRelateduseridNotBetween(Integer value1, Integer value2) {
            addCriterion("RelatedUserID not between", value1, value2, "relateduserid");
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

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("Address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("Address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andExpireofblackIsNull() {
            addCriterion("ExpireOfBlack is null");
            return (Criteria) this;
        }

        public Criteria andExpireofblackIsNotNull() {
            addCriterion("ExpireOfBlack is not null");
            return (Criteria) this;
        }

        public Criteria andExpireofblackEqualTo(Date value) {
            addCriterion("ExpireOfBlack =", value, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackNotEqualTo(Date value) {
            addCriterion("ExpireOfBlack <>", value, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackGreaterThan(Date value) {
            addCriterion("ExpireOfBlack >", value, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackGreaterThanOrEqualTo(Date value) {
            addCriterion("ExpireOfBlack >=", value, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackLessThan(Date value) {
            addCriterion("ExpireOfBlack <", value, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackLessThanOrEqualTo(Date value) {
            addCriterion("ExpireOfBlack <=", value, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackIn(List<Date> values) {
            addCriterion("ExpireOfBlack in", values, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackNotIn(List<Date> values) {
            addCriterion("ExpireOfBlack not in", values, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackBetween(Date value1, Date value2) {
            addCriterion("ExpireOfBlack between", value1, value2, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andExpireofblackNotBetween(Date value1, Date value2) {
            addCriterion("ExpireOfBlack not between", value1, value2, "expireofblack");
            return (Criteria) this;
        }

        public Criteria andJidIsNull() {
            addCriterion("JID is null");
            return (Criteria) this;
        }

        public Criteria andJidIsNotNull() {
            addCriterion("JID is not null");
            return (Criteria) this;
        }

        public Criteria andJidEqualTo(Long value) {
            addCriterion("JID =", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotEqualTo(Long value) {
            addCriterion("JID <>", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThan(Long value) {
            addCriterion("JID >", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidGreaterThanOrEqualTo(Long value) {
            addCriterion("JID >=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThan(Long value) {
            addCriterion("JID <", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidLessThanOrEqualTo(Long value) {
            addCriterion("JID <=", value, "jid");
            return (Criteria) this;
        }

        public Criteria andJidIn(List<Long> values) {
            addCriterion("JID in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotIn(List<Long> values) {
            addCriterion("JID not in", values, "jid");
            return (Criteria) this;
        }

        public Criteria andJidBetween(Long value1, Long value2) {
            addCriterion("JID between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andJidNotBetween(Long value1, Long value2) {
            addCriterion("JID not between", value1, value2, "jid");
            return (Criteria) this;
        }

        public Criteria andCreditIsNull() {
            addCriterion("Credit is null");
            return (Criteria) this;
        }

        public Criteria andCreditIsNotNull() {
            addCriterion("Credit is not null");
            return (Criteria) this;
        }

        public Criteria andCreditEqualTo(Short value) {
            addCriterion("Credit =", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotEqualTo(Short value) {
            addCriterion("Credit <>", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThan(Short value) {
            addCriterion("Credit >", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditGreaterThanOrEqualTo(Short value) {
            addCriterion("Credit >=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThan(Short value) {
            addCriterion("Credit <", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditLessThanOrEqualTo(Short value) {
            addCriterion("Credit <=", value, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditIn(List<Short> values) {
            addCriterion("Credit in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotIn(List<Short> values) {
            addCriterion("Credit not in", values, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditBetween(Short value1, Short value2) {
            addCriterion("Credit between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andCreditNotBetween(Short value1, Short value2) {
            addCriterion("Credit not between", value1, value2, "credit");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationIsNull() {
            addCriterion("WorkOrganization is null");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationIsNotNull() {
            addCriterion("WorkOrganization is not null");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationEqualTo(String value) {
            addCriterion("WorkOrganization =", value, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationNotEqualTo(String value) {
            addCriterion("WorkOrganization <>", value, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationGreaterThan(String value) {
            addCriterion("WorkOrganization >", value, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationGreaterThanOrEqualTo(String value) {
            addCriterion("WorkOrganization >=", value, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationLessThan(String value) {
            addCriterion("WorkOrganization <", value, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationLessThanOrEqualTo(String value) {
            addCriterion("WorkOrganization <=", value, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationLike(String value) {
            addCriterion("WorkOrganization like", value, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationNotLike(String value) {
            addCriterion("WorkOrganization not like", value, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationIn(List<String> values) {
            addCriterion("WorkOrganization in", values, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationNotIn(List<String> values) {
            addCriterion("WorkOrganization not in", values, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationBetween(String value1, String value2) {
            addCriterion("WorkOrganization between", value1, value2, "workorganization");
            return (Criteria) this;
        }

        public Criteria andWorkorganizationNotBetween(String value1, String value2) {
            addCriterion("WorkOrganization not between", value1, value2, "workorganization");
            return (Criteria) this;
        }

        public Criteria andResearchgroupIsNull() {
            addCriterion("ResearchGroup is null");
            return (Criteria) this;
        }

        public Criteria andResearchgroupIsNotNull() {
            addCriterion("ResearchGroup is not null");
            return (Criteria) this;
        }

        public Criteria andResearchgroupEqualTo(String value) {
            addCriterion("ResearchGroup =", value, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupNotEqualTo(String value) {
            addCriterion("ResearchGroup <>", value, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupGreaterThan(String value) {
            addCriterion("ResearchGroup >", value, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupGreaterThanOrEqualTo(String value) {
            addCriterion("ResearchGroup >=", value, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupLessThan(String value) {
            addCriterion("ResearchGroup <", value, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupLessThanOrEqualTo(String value) {
            addCriterion("ResearchGroup <=", value, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupLike(String value) {
            addCriterion("ResearchGroup like", value, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupNotLike(String value) {
            addCriterion("ResearchGroup not like", value, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupIn(List<String> values) {
            addCriterion("ResearchGroup in", values, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupNotIn(List<String> values) {
            addCriterion("ResearchGroup not in", values, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupBetween(String value1, String value2) {
            addCriterion("ResearchGroup between", value1, value2, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andResearchgroupNotBetween(String value1, String value2) {
            addCriterion("ResearchGroup not between", value1, value2, "researchgroup");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyIsNull() {
            addCriterion("Emailverificationkey is null");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyIsNotNull() {
            addCriterion("Emailverificationkey is not null");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyEqualTo(Long value) {
            addCriterion("Emailverificationkey =", value, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyNotEqualTo(Long value) {
            addCriterion("Emailverificationkey <>", value, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyGreaterThan(Long value) {
            addCriterion("Emailverificationkey >", value, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyGreaterThanOrEqualTo(Long value) {
            addCriterion("Emailverificationkey >=", value, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyLessThan(Long value) {
            addCriterion("Emailverificationkey <", value, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyLessThanOrEqualTo(Long value) {
            addCriterion("Emailverificationkey <=", value, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyIn(List<Long> values) {
            addCriterion("Emailverificationkey in", values, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyNotIn(List<Long> values) {
            addCriterion("Emailverificationkey not in", values, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyBetween(Long value1, Long value2) {
            addCriterion("Emailverificationkey between", value1, value2, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andEmailverificationkeyNotBetween(Long value1, Long value2) {
            addCriterion("Emailverificationkey not between", value1, value2, "emailverificationkey");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedIsNull() {
            addCriterion("IsEmailVerified is null");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedIsNotNull() {
            addCriterion("IsEmailVerified is not null");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedEqualTo(Boolean value) {
            addCriterion("IsEmailVerified =", value, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedNotEqualTo(Boolean value) {
            addCriterion("IsEmailVerified <>", value, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedGreaterThan(Boolean value) {
            addCriterion("IsEmailVerified >", value, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsEmailVerified >=", value, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedLessThan(Boolean value) {
            addCriterion("IsEmailVerified <", value, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsEmailVerified <=", value, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedIn(List<Boolean> values) {
            addCriterion("IsEmailVerified in", values, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedNotIn(List<Boolean> values) {
            addCriterion("IsEmailVerified not in", values, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsEmailVerified between", value1, value2, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andIsemailverifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsEmailVerified not between", value1, value2, "isemailverified");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerIsNull() {
            addCriterion("PrivateManager is null");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerIsNotNull() {
            addCriterion("PrivateManager is not null");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerEqualTo(Byte value) {
            addCriterion("PrivateManager =", value, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerNotEqualTo(Byte value) {
            addCriterion("PrivateManager <>", value, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerGreaterThan(Byte value) {
            addCriterion("PrivateManager >", value, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerGreaterThanOrEqualTo(Byte value) {
            addCriterion("PrivateManager >=", value, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerLessThan(Byte value) {
            addCriterion("PrivateManager <", value, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerLessThanOrEqualTo(Byte value) {
            addCriterion("PrivateManager <=", value, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerIn(List<Byte> values) {
            addCriterion("PrivateManager in", values, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerNotIn(List<Byte> values) {
            addCriterion("PrivateManager not in", values, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerBetween(Byte value1, Byte value2) {
            addCriterion("PrivateManager between", value1, value2, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andPrivatemanagerNotBetween(Byte value1, Byte value2) {
            addCriterion("PrivateManager not between", value1, value2, "privatemanager");
            return (Criteria) this;
        }

        public Criteria andYkttimeIsNull() {
            addCriterion("ykttime is null");
            return (Criteria) this;
        }

        public Criteria andYkttimeIsNotNull() {
            addCriterion("ykttime is not null");
            return (Criteria) this;
        }

        public Criteria andYkttimeEqualTo(Integer value) {
            addCriterion("ykttime =", value, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeNotEqualTo(Integer value) {
            addCriterion("ykttime <>", value, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeGreaterThan(Integer value) {
            addCriterion("ykttime >", value, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("ykttime >=", value, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeLessThan(Integer value) {
            addCriterion("ykttime <", value, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeLessThanOrEqualTo(Integer value) {
            addCriterion("ykttime <=", value, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeIn(List<Integer> values) {
            addCriterion("ykttime in", values, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeNotIn(List<Integer> values) {
            addCriterion("ykttime not in", values, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeBetween(Integer value1, Integer value2) {
            addCriterion("ykttime between", value1, value2, "ykttime");
            return (Criteria) this;
        }

        public Criteria andYkttimeNotBetween(Integer value1, Integer value2) {
            addCriterion("ykttime not between", value1, value2, "ykttime");
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