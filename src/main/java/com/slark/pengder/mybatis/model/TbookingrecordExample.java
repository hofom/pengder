package com.slark.pengder.mybatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbookingrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbookingrecordExample() {
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

        public Criteria andBookingpriorityidIsNull() {
            addCriterion("BookingPriorityID is null");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidIsNotNull() {
            addCriterion("BookingPriorityID is not null");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidEqualTo(Short value) {
            addCriterion("BookingPriorityID =", value, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidNotEqualTo(Short value) {
            addCriterion("BookingPriorityID <>", value, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidGreaterThan(Short value) {
            addCriterion("BookingPriorityID >", value, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidGreaterThanOrEqualTo(Short value) {
            addCriterion("BookingPriorityID >=", value, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidLessThan(Short value) {
            addCriterion("BookingPriorityID <", value, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidLessThanOrEqualTo(Short value) {
            addCriterion("BookingPriorityID <=", value, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidIn(List<Short> values) {
            addCriterion("BookingPriorityID in", values, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidNotIn(List<Short> values) {
            addCriterion("BookingPriorityID not in", values, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidBetween(Short value1, Short value2) {
            addCriterion("BookingPriorityID between", value1, value2, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingpriorityidNotBetween(Short value1, Short value2) {
            addCriterion("BookingPriorityID not between", value1, value2, "bookingpriorityid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidIsNull() {
            addCriterion("BookingModelID is null");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidIsNotNull() {
            addCriterion("BookingModelID is not null");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidEqualTo(Short value) {
            addCriterion("BookingModelID =", value, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidNotEqualTo(Short value) {
            addCriterion("BookingModelID <>", value, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidGreaterThan(Short value) {
            addCriterion("BookingModelID >", value, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidGreaterThanOrEqualTo(Short value) {
            addCriterion("BookingModelID >=", value, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidLessThan(Short value) {
            addCriterion("BookingModelID <", value, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidLessThanOrEqualTo(Short value) {
            addCriterion("BookingModelID <=", value, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidIn(List<Short> values) {
            addCriterion("BookingModelID in", values, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidNotIn(List<Short> values) {
            addCriterion("BookingModelID not in", values, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidBetween(Short value1, Short value2) {
            addCriterion("BookingModelID between", value1, value2, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andBookingmodelidNotBetween(Short value1, Short value2) {
            addCriterion("BookingModelID not between", value1, value2, "bookingmodelid");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("StartTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("StartTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("StartTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("StartTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("StartTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("StartTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("StartTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("StartTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("StartTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("StartTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("StartTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("StartTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("EndTime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("EndTime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("EndTime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("EndTime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("EndTime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("EndTime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("EndTime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("EndTime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("EndTime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("EndTime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("EndTime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidIsNull() {
            addCriterion("SessionTypeID is null");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidIsNotNull() {
            addCriterion("SessionTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidEqualTo(Short value) {
            addCriterion("SessionTypeID =", value, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidNotEqualTo(Short value) {
            addCriterion("SessionTypeID <>", value, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidGreaterThan(Short value) {
            addCriterion("SessionTypeID >", value, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidGreaterThanOrEqualTo(Short value) {
            addCriterion("SessionTypeID >=", value, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidLessThan(Short value) {
            addCriterion("SessionTypeID <", value, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidLessThanOrEqualTo(Short value) {
            addCriterion("SessionTypeID <=", value, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidIn(List<Short> values) {
            addCriterion("SessionTypeID in", values, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidNotIn(List<Short> values) {
            addCriterion("SessionTypeID not in", values, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidBetween(Short value1, Short value2) {
            addCriterion("SessionTypeID between", value1, value2, "sessiontypeid");
            return (Criteria) this;
        }

        public Criteria andSessiontypeidNotBetween(Short value1, Short value2) {
            addCriterion("SessionTypeID not between", value1, value2, "sessiontypeid");
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

        public Criteria andBookingstatusidIsNull() {
            addCriterion("BookingStatusID is null");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidIsNotNull() {
            addCriterion("BookingStatusID is not null");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidEqualTo(Short value) {
            addCriterion("BookingStatusID =", value, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidNotEqualTo(Short value) {
            addCriterion("BookingStatusID <>", value, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidGreaterThan(Short value) {
            addCriterion("BookingStatusID >", value, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidGreaterThanOrEqualTo(Short value) {
            addCriterion("BookingStatusID >=", value, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidLessThan(Short value) {
            addCriterion("BookingStatusID <", value, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidLessThanOrEqualTo(Short value) {
            addCriterion("BookingStatusID <=", value, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidIn(List<Short> values) {
            addCriterion("BookingStatusID in", values, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidNotIn(List<Short> values) {
            addCriterion("BookingStatusID not in", values, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidBetween(Short value1, Short value2) {
            addCriterion("BookingStatusID between", value1, value2, "bookingstatusid");
            return (Criteria) this;
        }

        public Criteria andBookingstatusidNotBetween(Short value1, Short value2) {
            addCriterion("BookingStatusID not between", value1, value2, "bookingstatusid");
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

        public Criteria andCreatedidEqualTo(Long value) {
            addCriterion("CreatedID =", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotEqualTo(Long value) {
            addCriterion("CreatedID <>", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThan(Long value) {
            addCriterion("CreatedID >", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThanOrEqualTo(Long value) {
            addCriterion("CreatedID >=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThan(Long value) {
            addCriterion("CreatedID <", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThanOrEqualTo(Long value) {
            addCriterion("CreatedID <=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidIn(List<Long> values) {
            addCriterion("CreatedID in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotIn(List<Long> values) {
            addCriterion("CreatedID not in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidBetween(Long value1, Long value2) {
            addCriterion("CreatedID between", value1, value2, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotBetween(Long value1, Long value2) {
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

        public Criteria andModifiedidIsNull() {
            addCriterion("ModifiedID is null");
            return (Criteria) this;
        }

        public Criteria andModifiedidIsNotNull() {
            addCriterion("ModifiedID is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedidEqualTo(Long value) {
            addCriterion("ModifiedID =", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotEqualTo(Long value) {
            addCriterion("ModifiedID <>", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidGreaterThan(Long value) {
            addCriterion("ModifiedID >", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidGreaterThanOrEqualTo(Long value) {
            addCriterion("ModifiedID >=", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidLessThan(Long value) {
            addCriterion("ModifiedID <", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidLessThanOrEqualTo(Long value) {
            addCriterion("ModifiedID <=", value, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidIn(List<Long> values) {
            addCriterion("ModifiedID in", values, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotIn(List<Long> values) {
            addCriterion("ModifiedID not in", values, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidBetween(Long value1, Long value2) {
            addCriterion("ModifiedID between", value1, value2, "modifiedid");
            return (Criteria) this;
        }

        public Criteria andModifiedidNotBetween(Long value1, Long value2) {
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

        public Criteria andIsallowregIsNull() {
            addCriterion("IsAllowReg is null");
            return (Criteria) this;
        }

        public Criteria andIsallowregIsNotNull() {
            addCriterion("IsAllowReg is not null");
            return (Criteria) this;
        }

        public Criteria andIsallowregEqualTo(Boolean value) {
            addCriterion("IsAllowReg =", value, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregNotEqualTo(Boolean value) {
            addCriterion("IsAllowReg <>", value, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregGreaterThan(Boolean value) {
            addCriterion("IsAllowReg >", value, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsAllowReg >=", value, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregLessThan(Boolean value) {
            addCriterion("IsAllowReg <", value, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregLessThanOrEqualTo(Boolean value) {
            addCriterion("IsAllowReg <=", value, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregIn(List<Boolean> values) {
            addCriterion("IsAllowReg in", values, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregNotIn(List<Boolean> values) {
            addCriterion("IsAllowReg not in", values, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAllowReg between", value1, value2, "isallowreg");
            return (Criteria) this;
        }

        public Criteria andIsallowregNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsAllowReg not between", value1, value2, "isallowreg");
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