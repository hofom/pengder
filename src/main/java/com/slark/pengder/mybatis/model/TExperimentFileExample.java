package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TExperimentFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TExperimentFileExample() {
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

        public Criteria andFilenameIsNull() {
            addCriterion("FileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("FileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("FileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("FileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("FileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("FileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("FileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("FileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("FileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("FileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("FileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("FileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("FileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("FileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathIsNull() {
            addCriterion("FileAbsolutePath is null");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathIsNotNull() {
            addCriterion("FileAbsolutePath is not null");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathEqualTo(String value) {
            addCriterion("FileAbsolutePath =", value, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathNotEqualTo(String value) {
            addCriterion("FileAbsolutePath <>", value, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathGreaterThan(String value) {
            addCriterion("FileAbsolutePath >", value, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathGreaterThanOrEqualTo(String value) {
            addCriterion("FileAbsolutePath >=", value, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathLessThan(String value) {
            addCriterion("FileAbsolutePath <", value, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathLessThanOrEqualTo(String value) {
            addCriterion("FileAbsolutePath <=", value, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathLike(String value) {
            addCriterion("FileAbsolutePath like", value, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathNotLike(String value) {
            addCriterion("FileAbsolutePath not like", value, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathIn(List<String> values) {
            addCriterion("FileAbsolutePath in", values, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathNotIn(List<String> values) {
            addCriterion("FileAbsolutePath not in", values, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathBetween(String value1, String value2) {
            addCriterion("FileAbsolutePath between", value1, value2, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFileabsolutepathNotBetween(String value1, String value2) {
            addCriterion("FileAbsolutePath not between", value1, value2, "fileabsolutepath");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNull() {
            addCriterion("FileSize is null");
            return (Criteria) this;
        }

        public Criteria andFilesizeIsNotNull() {
            addCriterion("FileSize is not null");
            return (Criteria) this;
        }

        public Criteria andFilesizeEqualTo(Long value) {
            addCriterion("FileSize =", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotEqualTo(Long value) {
            addCriterion("FileSize <>", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThan(Long value) {
            addCriterion("FileSize >", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeGreaterThanOrEqualTo(Long value) {
            addCriterion("FileSize >=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThan(Long value) {
            addCriterion("FileSize <", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeLessThanOrEqualTo(Long value) {
            addCriterion("FileSize <=", value, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeIn(List<Long> values) {
            addCriterion("FileSize in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotIn(List<Long> values) {
            addCriterion("FileSize not in", values, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeBetween(Long value1, Long value2) {
            addCriterion("FileSize between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilesizeNotBetween(Long value1, Long value2) {
            addCriterion("FileSize not between", value1, value2, "filesize");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeIsNull() {
            addCriterion("FileCreateTime is null");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeIsNotNull() {
            addCriterion("FileCreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeEqualTo(Date value) {
            addCriterion("FileCreateTime =", value, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeNotEqualTo(Date value) {
            addCriterion("FileCreateTime <>", value, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeGreaterThan(Date value) {
            addCriterion("FileCreateTime >", value, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FileCreateTime >=", value, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeLessThan(Date value) {
            addCriterion("FileCreateTime <", value, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("FileCreateTime <=", value, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeIn(List<Date> values) {
            addCriterion("FileCreateTime in", values, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeNotIn(List<Date> values) {
            addCriterion("FileCreateTime not in", values, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeBetween(Date value1, Date value2) {
            addCriterion("FileCreateTime between", value1, value2, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andFilecreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("FileCreateTime not between", value1, value2, "filecreatetime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNull() {
            addCriterion("AddTime is null");
            return (Criteria) this;
        }

        public Criteria andAddtimeIsNotNull() {
            addCriterion("AddTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddtimeEqualTo(Date value) {
            addCriterion("AddTime =", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotEqualTo(Date value) {
            addCriterion("AddTime <>", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThan(Date value) {
            addCriterion("AddTime >", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AddTime >=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThan(Date value) {
            addCriterion("AddTime <", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeLessThanOrEqualTo(Date value) {
            addCriterion("AddTime <=", value, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeIn(List<Date> values) {
            addCriterion("AddTime in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotIn(List<Date> values) {
            addCriterion("AddTime not in", values, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeBetween(Date value1, Date value2) {
            addCriterion("AddTime between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andAddtimeNotBetween(Date value1, Date value2) {
            addCriterion("AddTime not between", value1, value2, "addtime");
            return (Criteria) this;
        }

        public Criteria andProgressIsNull() {
            addCriterion("Progress is null");
            return (Criteria) this;
        }

        public Criteria andProgressIsNotNull() {
            addCriterion("Progress is not null");
            return (Criteria) this;
        }

        public Criteria andProgressEqualTo(Integer value) {
            addCriterion("Progress =", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotEqualTo(Integer value) {
            addCriterion("Progress <>", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThan(Integer value) {
            addCriterion("Progress >", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressGreaterThanOrEqualTo(Integer value) {
            addCriterion("Progress >=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThan(Integer value) {
            addCriterion("Progress <", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressLessThanOrEqualTo(Integer value) {
            addCriterion("Progress <=", value, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressIn(List<Integer> values) {
            addCriterion("Progress in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotIn(List<Integer> values) {
            addCriterion("Progress not in", values, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressBetween(Integer value1, Integer value2) {
            addCriterion("Progress between", value1, value2, "progress");
            return (Criteria) this;
        }

        public Criteria andProgressNotBetween(Integer value1, Integer value2) {
            addCriterion("Progress not between", value1, value2, "progress");
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