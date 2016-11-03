package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TinstrumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TinstrumentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("Model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("Model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("Model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("Model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("Model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("Model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("Model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("Model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("Model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("Model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("Model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("Model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("Model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("Model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNull() {
            addCriterion("Specification is null");
            return (Criteria) this;
        }

        public Criteria andSpecificationIsNotNull() {
            addCriterion("Specification is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificationEqualTo(String value) {
            addCriterion("Specification =", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotEqualTo(String value) {
            addCriterion("Specification <>", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThan(String value) {
            addCriterion("Specification >", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("Specification >=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThan(String value) {
            addCriterion("Specification <", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLessThanOrEqualTo(String value) {
            addCriterion("Specification <=", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationLike(String value) {
            addCriterion("Specification like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotLike(String value) {
            addCriterion("Specification not like", value, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationIn(List<String> values) {
            addCriterion("Specification in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotIn(List<String> values) {
            addCriterion("Specification not in", values, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationBetween(String value1, String value2) {
            addCriterion("Specification between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andSpecificationNotBetween(String value1, String value2) {
            addCriterion("Specification not between", value1, value2, "specification");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("Manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("Manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("Manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("Manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("Manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("Manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("Manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("Manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("Manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("Manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("Manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("Manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("Manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("Manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("Country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("Country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("Country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("Country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("Country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("Country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("Country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("Country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("Country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("Country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("Country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("Country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("Country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("Country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNull() {
            addCriterion("Supplier is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIsNotNull() {
            addCriterion("Supplier is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierEqualTo(String value) {
            addCriterion("Supplier =", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotEqualTo(String value) {
            addCriterion("Supplier <>", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThan(String value) {
            addCriterion("Supplier >", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierGreaterThanOrEqualTo(String value) {
            addCriterion("Supplier >=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThan(String value) {
            addCriterion("Supplier <", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLessThanOrEqualTo(String value) {
            addCriterion("Supplier <=", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierLike(String value) {
            addCriterion("Supplier like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotLike(String value) {
            addCriterion("Supplier not like", value, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierIn(List<String> values) {
            addCriterion("Supplier in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotIn(List<String> values) {
            addCriterion("Supplier not in", values, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierBetween(String value1, String value2) {
            addCriterion("Supplier between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andSupplierNotBetween(String value1, String value2) {
            addCriterion("Supplier not between", value1, value2, "supplier");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateIsNull() {
            addCriterion("PurchasedDate is null");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateIsNotNull() {
            addCriterion("PurchasedDate is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateEqualTo(Date value) {
            addCriterionForJDBCDate("PurchasedDate =", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("PurchasedDate <>", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateGreaterThan(Date value) {
            addCriterionForJDBCDate("PurchasedDate >", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PurchasedDate >=", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateLessThan(Date value) {
            addCriterionForJDBCDate("PurchasedDate <", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("PurchasedDate <=", value, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateIn(List<Date> values) {
            addCriterionForJDBCDate("PurchasedDate in", values, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("PurchasedDate not in", values, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PurchasedDate between", value1, value2, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andPurchaseddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("PurchasedDate not between", value1, value2, "purchaseddate");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("Value is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("Value is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(BigDecimal value) {
            addCriterion("Value =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(BigDecimal value) {
            addCriterion("Value <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(BigDecimal value) {
            addCriterion("Value >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Value >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(BigDecimal value) {
            addCriterion("Value <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Value <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<BigDecimal> values) {
            addCriterion("Value in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<BigDecimal> values) {
            addCriterion("Value not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Value between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Value not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andImageidIsNull() {
            addCriterion("ImageID is null");
            return (Criteria) this;
        }

        public Criteria andImageidIsNotNull() {
            addCriterion("ImageID is not null");
            return (Criteria) this;
        }

        public Criteria andImageidEqualTo(String value) {
            addCriterion("ImageID =", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotEqualTo(String value) {
            addCriterion("ImageID <>", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThan(String value) {
            addCriterion("ImageID >", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidGreaterThanOrEqualTo(String value) {
            addCriterion("ImageID >=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThan(String value) {
            addCriterion("ImageID <", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLessThanOrEqualTo(String value) {
            addCriterion("ImageID <=", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidLike(String value) {
            addCriterion("ImageID like", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotLike(String value) {
            addCriterion("ImageID not like", value, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidIn(List<String> values) {
            addCriterion("ImageID in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotIn(List<String> values) {
            addCriterion("ImageID not in", values, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidBetween(String value1, String value2) {
            addCriterion("ImageID between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andImageidNotBetween(String value1, String value2) {
            addCriterion("ImageID not between", value1, value2, "imageid");
            return (Criteria) this;
        }

        public Criteria andTransactorIsNull() {
            addCriterion("Transactor is null");
            return (Criteria) this;
        }

        public Criteria andTransactorIsNotNull() {
            addCriterion("Transactor is not null");
            return (Criteria) this;
        }

        public Criteria andTransactorEqualTo(Integer value) {
            addCriterion("Transactor =", value, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorNotEqualTo(Integer value) {
            addCriterion("Transactor <>", value, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorGreaterThan(Integer value) {
            addCriterion("Transactor >", value, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorGreaterThanOrEqualTo(Integer value) {
            addCriterion("Transactor >=", value, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorLessThan(Integer value) {
            addCriterion("Transactor <", value, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorLessThanOrEqualTo(Integer value) {
            addCriterion("Transactor <=", value, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorIn(List<Integer> values) {
            addCriterion("Transactor in", values, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorNotIn(List<Integer> values) {
            addCriterion("Transactor not in", values, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorBetween(Integer value1, Integer value2) {
            addCriterion("Transactor between", value1, value2, "transactor");
            return (Criteria) this;
        }

        public Criteria andTransactorNotBetween(Integer value1, Integer value2) {
            addCriterion("Transactor not between", value1, value2, "transactor");
            return (Criteria) this;
        }

        public Criteria andRoomIsNull() {
            addCriterion("Room is null");
            return (Criteria) this;
        }

        public Criteria andRoomIsNotNull() {
            addCriterion("Room is not null");
            return (Criteria) this;
        }

        public Criteria andRoomEqualTo(String value) {
            addCriterion("Room =", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotEqualTo(String value) {
            addCriterion("Room <>", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThan(String value) {
            addCriterion("Room >", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomGreaterThanOrEqualTo(String value) {
            addCriterion("Room >=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThan(String value) {
            addCriterion("Room <", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLessThanOrEqualTo(String value) {
            addCriterion("Room <=", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomLike(String value) {
            addCriterion("Room like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotLike(String value) {
            addCriterion("Room not like", value, "room");
            return (Criteria) this;
        }

        public Criteria andRoomIn(List<String> values) {
            addCriterion("Room in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotIn(List<String> values) {
            addCriterion("Room not in", values, "room");
            return (Criteria) this;
        }

        public Criteria andRoomBetween(String value1, String value2) {
            addCriterion("Room between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andRoomNotBetween(String value1, String value2) {
            addCriterion("Room not between", value1, value2, "room");
            return (Criteria) this;
        }

        public Criteria andDoorlistIsNull() {
            addCriterion("DoorList is null");
            return (Criteria) this;
        }

        public Criteria andDoorlistIsNotNull() {
            addCriterion("DoorList is not null");
            return (Criteria) this;
        }

        public Criteria andDoorlistEqualTo(String value) {
            addCriterion("DoorList =", value, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistNotEqualTo(String value) {
            addCriterion("DoorList <>", value, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistGreaterThan(String value) {
            addCriterion("DoorList >", value, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistGreaterThanOrEqualTo(String value) {
            addCriterion("DoorList >=", value, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistLessThan(String value) {
            addCriterion("DoorList <", value, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistLessThanOrEqualTo(String value) {
            addCriterion("DoorList <=", value, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistLike(String value) {
            addCriterion("DoorList like", value, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistNotLike(String value) {
            addCriterion("DoorList not like", value, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistIn(List<String> values) {
            addCriterion("DoorList in", values, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistNotIn(List<String> values) {
            addCriterion("DoorList not in", values, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistBetween(String value1, String value2) {
            addCriterion("DoorList between", value1, value2, "doorlist");
            return (Criteria) this;
        }

        public Criteria andDoorlistNotBetween(String value1, String value2) {
            addCriterion("DoorList not between", value1, value2, "doorlist");
            return (Criteria) this;
        }

        public Criteria andAssetnumberIsNull() {
            addCriterion("AssetNumber is null");
            return (Criteria) this;
        }

        public Criteria andAssetnumberIsNotNull() {
            addCriterion("AssetNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAssetnumberEqualTo(String value) {
            addCriterion("AssetNumber =", value, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberNotEqualTo(String value) {
            addCriterion("AssetNumber <>", value, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberGreaterThan(String value) {
            addCriterion("AssetNumber >", value, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberGreaterThanOrEqualTo(String value) {
            addCriterion("AssetNumber >=", value, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberLessThan(String value) {
            addCriterion("AssetNumber <", value, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberLessThanOrEqualTo(String value) {
            addCriterion("AssetNumber <=", value, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberLike(String value) {
            addCriterion("AssetNumber like", value, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberNotLike(String value) {
            addCriterion("AssetNumber not like", value, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberIn(List<String> values) {
            addCriterion("AssetNumber in", values, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberNotIn(List<String> values) {
            addCriterion("AssetNumber not in", values, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberBetween(String value1, String value2) {
            addCriterion("AssetNumber between", value1, value2, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetnumberNotBetween(String value1, String value2) {
            addCriterion("AssetNumber not between", value1, value2, "assetnumber");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerIsNull() {
            addCriterion("AssetManager is null");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerIsNotNull() {
            addCriterion("AssetManager is not null");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerEqualTo(Long value) {
            addCriterion("AssetManager =", value, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerNotEqualTo(Long value) {
            addCriterion("AssetManager <>", value, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerGreaterThan(Long value) {
            addCriterion("AssetManager >", value, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerGreaterThanOrEqualTo(Long value) {
            addCriterion("AssetManager >=", value, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerLessThan(Long value) {
            addCriterion("AssetManager <", value, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerLessThanOrEqualTo(Long value) {
            addCriterion("AssetManager <=", value, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerIn(List<Long> values) {
            addCriterion("AssetManager in", values, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerNotIn(List<Long> values) {
            addCriterion("AssetManager not in", values, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerBetween(Long value1, Long value2) {
            addCriterion("AssetManager between", value1, value2, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andAssetmanagerNotBetween(Long value1, Long value2) {
            addCriterion("AssetManager not between", value1, value2, "assetmanager");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNull() {
            addCriterion("Application is null");
            return (Criteria) this;
        }

        public Criteria andApplicationIsNotNull() {
            addCriterion("Application is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationEqualTo(String value) {
            addCriterion("Application =", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotEqualTo(String value) {
            addCriterion("Application <>", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThan(String value) {
            addCriterion("Application >", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationGreaterThanOrEqualTo(String value) {
            addCriterion("Application >=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThan(String value) {
            addCriterion("Application <", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLessThanOrEqualTo(String value) {
            addCriterion("Application <=", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationLike(String value) {
            addCriterion("Application like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotLike(String value) {
            addCriterion("Application not like", value, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationIn(List<String> values) {
            addCriterion("Application in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotIn(List<String> values) {
            addCriterion("Application not in", values, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationBetween(String value1, String value2) {
            addCriterion("Application between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andApplicationNotBetween(String value1, String value2) {
            addCriterion("Application not between", value1, value2, "application");
            return (Criteria) this;
        }

        public Criteria andAccessoriesIsNull() {
            addCriterion("Accessories is null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesIsNotNull() {
            addCriterion("Accessories is not null");
            return (Criteria) this;
        }

        public Criteria andAccessoriesEqualTo(String value) {
            addCriterion("Accessories =", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesNotEqualTo(String value) {
            addCriterion("Accessories <>", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesGreaterThan(String value) {
            addCriterion("Accessories >", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesGreaterThanOrEqualTo(String value) {
            addCriterion("Accessories >=", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesLessThan(String value) {
            addCriterion("Accessories <", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesLessThanOrEqualTo(String value) {
            addCriterion("Accessories <=", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesLike(String value) {
            addCriterion("Accessories like", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesNotLike(String value) {
            addCriterion("Accessories not like", value, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesIn(List<String> values) {
            addCriterion("Accessories in", values, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesNotIn(List<String> values) {
            addCriterion("Accessories not in", values, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesBetween(String value1, String value2) {
            addCriterion("Accessories between", value1, value2, "accessories");
            return (Criteria) this;
        }

        public Criteria andAccessoriesNotBetween(String value1, String value2) {
            addCriterion("Accessories not between", value1, value2, "accessories");
            return (Criteria) this;
        }

        public Criteria andParameterIsNull() {
            addCriterion("Parameter is null");
            return (Criteria) this;
        }

        public Criteria andParameterIsNotNull() {
            addCriterion("Parameter is not null");
            return (Criteria) this;
        }

        public Criteria andParameterEqualTo(String value) {
            addCriterion("Parameter =", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotEqualTo(String value) {
            addCriterion("Parameter <>", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThan(String value) {
            addCriterion("Parameter >", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterGreaterThanOrEqualTo(String value) {
            addCriterion("Parameter >=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThan(String value) {
            addCriterion("Parameter <", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLessThanOrEqualTo(String value) {
            addCriterion("Parameter <=", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterLike(String value) {
            addCriterion("Parameter like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotLike(String value) {
            addCriterion("Parameter not like", value, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterIn(List<String> values) {
            addCriterion("Parameter in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotIn(List<String> values) {
            addCriterion("Parameter not in", values, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterBetween(String value1, String value2) {
            addCriterion("Parameter between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andParameterNotBetween(String value1, String value2) {
            addCriterion("Parameter not between", value1, value2, "parameter");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNull() {
            addCriterion("OrganizationID is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIsNotNull() {
            addCriterion("OrganizationID is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationidEqualTo(Long value) {
            addCriterion("OrganizationID =", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotEqualTo(Long value) {
            addCriterion("OrganizationID <>", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThan(Long value) {
            addCriterion("OrganizationID >", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidGreaterThanOrEqualTo(Long value) {
            addCriterion("OrganizationID >=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThan(Long value) {
            addCriterion("OrganizationID <", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidLessThanOrEqualTo(Long value) {
            addCriterion("OrganizationID <=", value, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidIn(List<Long> values) {
            addCriterion("OrganizationID in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotIn(List<Long> values) {
            addCriterion("OrganizationID not in", values, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidBetween(Long value1, Long value2) {
            addCriterion("OrganizationID between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andOrganizationidNotBetween(Long value1, Long value2) {
            addCriterion("OrganizationID not between", value1, value2, "organizationid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidIsNull() {
            addCriterion("InstrumentTypeID is null");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidIsNotNull() {
            addCriterion("InstrumentTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidEqualTo(Integer value) {
            addCriterion("InstrumentTypeID =", value, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidNotEqualTo(Integer value) {
            addCriterion("InstrumentTypeID <>", value, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidGreaterThan(Integer value) {
            addCriterion("InstrumentTypeID >", value, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("InstrumentTypeID >=", value, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidLessThan(Integer value) {
            addCriterion("InstrumentTypeID <", value, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidLessThanOrEqualTo(Integer value) {
            addCriterion("InstrumentTypeID <=", value, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidIn(List<Integer> values) {
            addCriterion("InstrumentTypeID in", values, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidNotIn(List<Integer> values) {
            addCriterion("InstrumentTypeID not in", values, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidBetween(Integer value1, Integer value2) {
            addCriterion("InstrumentTypeID between", value1, value2, "instrumenttypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumenttypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("InstrumentTypeID not between", value1, value2, "instrumenttypeid");
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

        public Criteria andTerminalmacIsNull() {
            addCriterion("TerminalMac is null");
            return (Criteria) this;
        }

        public Criteria andTerminalmacIsNotNull() {
            addCriterion("TerminalMac is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalmacEqualTo(String value) {
            addCriterion("TerminalMac =", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacNotEqualTo(String value) {
            addCriterion("TerminalMac <>", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacGreaterThan(String value) {
            addCriterion("TerminalMac >", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacGreaterThanOrEqualTo(String value) {
            addCriterion("TerminalMac >=", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacLessThan(String value) {
            addCriterion("TerminalMac <", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacLessThanOrEqualTo(String value) {
            addCriterion("TerminalMac <=", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacLike(String value) {
            addCriterion("TerminalMac like", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacNotLike(String value) {
            addCriterion("TerminalMac not like", value, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacIn(List<String> values) {
            addCriterion("TerminalMac in", values, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacNotIn(List<String> values) {
            addCriterion("TerminalMac not in", values, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacBetween(String value1, String value2) {
            addCriterion("TerminalMac between", value1, value2, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalmacNotBetween(String value1, String value2) {
            addCriterion("TerminalMac not between", value1, value2, "terminalmac");
            return (Criteria) this;
        }

        public Criteria andTerminalversionIsNull() {
            addCriterion("TerminalVersion is null");
            return (Criteria) this;
        }

        public Criteria andTerminalversionIsNotNull() {
            addCriterion("TerminalVersion is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalversionEqualTo(String value) {
            addCriterion("TerminalVersion =", value, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionNotEqualTo(String value) {
            addCriterion("TerminalVersion <>", value, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionGreaterThan(String value) {
            addCriterion("TerminalVersion >", value, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionGreaterThanOrEqualTo(String value) {
            addCriterion("TerminalVersion >=", value, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionLessThan(String value) {
            addCriterion("TerminalVersion <", value, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionLessThanOrEqualTo(String value) {
            addCriterion("TerminalVersion <=", value, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionLike(String value) {
            addCriterion("TerminalVersion like", value, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionNotLike(String value) {
            addCriterion("TerminalVersion not like", value, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionIn(List<String> values) {
            addCriterion("TerminalVersion in", values, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionNotIn(List<String> values) {
            addCriterion("TerminalVersion not in", values, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionBetween(String value1, String value2) {
            addCriterion("TerminalVersion between", value1, value2, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andTerminalversionNotBetween(String value1, String value2) {
            addCriterion("TerminalVersion not between", value1, value2, "terminalversion");
            return (Criteria) this;
        }

        public Criteria andControltypeidIsNull() {
            addCriterion("ControlTypeID is null");
            return (Criteria) this;
        }

        public Criteria andControltypeidIsNotNull() {
            addCriterion("ControlTypeID is not null");
            return (Criteria) this;
        }

        public Criteria andControltypeidEqualTo(Short value) {
            addCriterion("ControlTypeID =", value, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidNotEqualTo(Short value) {
            addCriterion("ControlTypeID <>", value, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidGreaterThan(Short value) {
            addCriterion("ControlTypeID >", value, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidGreaterThanOrEqualTo(Short value) {
            addCriterion("ControlTypeID >=", value, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidLessThan(Short value) {
            addCriterion("ControlTypeID <", value, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidLessThanOrEqualTo(Short value) {
            addCriterion("ControlTypeID <=", value, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidIn(List<Short> values) {
            addCriterion("ControlTypeID in", values, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidNotIn(List<Short> values) {
            addCriterion("ControlTypeID not in", values, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidBetween(Short value1, Short value2) {
            addCriterion("ControlTypeID between", value1, value2, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andControltypeidNotBetween(Short value1, Short value2) {
            addCriterion("ControlTypeID not between", value1, value2, "controltypeid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidIsNull() {
            addCriterion("InstrumentStatusID is null");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidIsNotNull() {
            addCriterion("InstrumentStatusID is not null");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidEqualTo(Short value) {
            addCriterion("InstrumentStatusID =", value, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidNotEqualTo(Short value) {
            addCriterion("InstrumentStatusID <>", value, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidGreaterThan(Short value) {
            addCriterion("InstrumentStatusID >", value, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidGreaterThanOrEqualTo(Short value) {
            addCriterion("InstrumentStatusID >=", value, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidLessThan(Short value) {
            addCriterion("InstrumentStatusID <", value, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidLessThanOrEqualTo(Short value) {
            addCriterion("InstrumentStatusID <=", value, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidIn(List<Short> values) {
            addCriterion("InstrumentStatusID in", values, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidNotIn(List<Short> values) {
            addCriterion("InstrumentStatusID not in", values, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidBetween(Short value1, Short value2) {
            addCriterion("InstrumentStatusID between", value1, value2, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andInstrumentstatusidNotBetween(Short value1, Short value2) {
            addCriterion("InstrumentStatusID not between", value1, value2, "instrumentstatusid");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeIsNull() {
            addCriterion("BeginUsingTime is null");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeIsNotNull() {
            addCriterion("BeginUsingTime is not null");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeEqualTo(Date value) {
            addCriterion("BeginUsingTime =", value, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeNotEqualTo(Date value) {
            addCriterion("BeginUsingTime <>", value, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeGreaterThan(Date value) {
            addCriterion("BeginUsingTime >", value, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BeginUsingTime >=", value, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeLessThan(Date value) {
            addCriterion("BeginUsingTime <", value, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeLessThanOrEqualTo(Date value) {
            addCriterion("BeginUsingTime <=", value, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeIn(List<Date> values) {
            addCriterion("BeginUsingTime in", values, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeNotIn(List<Date> values) {
            addCriterion("BeginUsingTime not in", values, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeBetween(Date value1, Date value2) {
            addCriterion("BeginUsingTime between", value1, value2, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andBeginusingtimeNotBetween(Date value1, Date value2) {
            addCriterion("BeginUsingTime not between", value1, value2, "beginusingtime");
            return (Criteria) this;
        }

        public Criteria andMinintervalIsNull() {
            addCriterion("MinInterval is null");
            return (Criteria) this;
        }

        public Criteria andMinintervalIsNotNull() {
            addCriterion("MinInterval is not null");
            return (Criteria) this;
        }

        public Criteria andMinintervalEqualTo(Short value) {
            addCriterion("MinInterval =", value, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalNotEqualTo(Short value) {
            addCriterion("MinInterval <>", value, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalGreaterThan(Short value) {
            addCriterion("MinInterval >", value, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalGreaterThanOrEqualTo(Short value) {
            addCriterion("MinInterval >=", value, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalLessThan(Short value) {
            addCriterion("MinInterval <", value, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalLessThanOrEqualTo(Short value) {
            addCriterion("MinInterval <=", value, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalIn(List<Short> values) {
            addCriterion("MinInterval in", values, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalNotIn(List<Short> values) {
            addCriterion("MinInterval not in", values, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalBetween(Short value1, Short value2) {
            addCriterion("MinInterval between", value1, value2, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMinintervalNotBetween(Short value1, Short value2) {
            addCriterion("MinInterval not between", value1, value2, "mininterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalIsNull() {
            addCriterion("MaxInterval is null");
            return (Criteria) this;
        }

        public Criteria andMaxintervalIsNotNull() {
            addCriterion("MaxInterval is not null");
            return (Criteria) this;
        }

        public Criteria andMaxintervalEqualTo(Short value) {
            addCriterion("MaxInterval =", value, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalNotEqualTo(Short value) {
            addCriterion("MaxInterval <>", value, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalGreaterThan(Short value) {
            addCriterion("MaxInterval >", value, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalGreaterThanOrEqualTo(Short value) {
            addCriterion("MaxInterval >=", value, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalLessThan(Short value) {
            addCriterion("MaxInterval <", value, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalLessThanOrEqualTo(Short value) {
            addCriterion("MaxInterval <=", value, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalIn(List<Short> values) {
            addCriterion("MaxInterval in", values, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalNotIn(List<Short> values) {
            addCriterion("MaxInterval not in", values, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalBetween(Short value1, Short value2) {
            addCriterion("MaxInterval between", value1, value2, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMaxintervalNotBetween(Short value1, Short value2) {
            addCriterion("MaxInterval not between", value1, value2, "maxinterval");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeIsNull() {
            addCriterion("MinLeadTime is null");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeIsNotNull() {
            addCriterion("MinLeadTime is not null");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeEqualTo(Short value) {
            addCriterion("MinLeadTime =", value, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeNotEqualTo(Short value) {
            addCriterion("MinLeadTime <>", value, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeGreaterThan(Short value) {
            addCriterion("MinLeadTime >", value, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeGreaterThanOrEqualTo(Short value) {
            addCriterion("MinLeadTime >=", value, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeLessThan(Short value) {
            addCriterion("MinLeadTime <", value, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeLessThanOrEqualTo(Short value) {
            addCriterion("MinLeadTime <=", value, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeIn(List<Short> values) {
            addCriterion("MinLeadTime in", values, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeNotIn(List<Short> values) {
            addCriterion("MinLeadTime not in", values, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeBetween(Short value1, Short value2) {
            addCriterion("MinLeadTime between", value1, value2, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMinleadtimeNotBetween(Short value1, Short value2) {
            addCriterion("MinLeadTime not between", value1, value2, "minleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeIsNull() {
            addCriterion("MaxLeadTime is null");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeIsNotNull() {
            addCriterion("MaxLeadTime is not null");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeEqualTo(Integer value) {
            addCriterion("MaxLeadTime =", value, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeNotEqualTo(Integer value) {
            addCriterion("MaxLeadTime <>", value, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeGreaterThan(Integer value) {
            addCriterion("MaxLeadTime >", value, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxLeadTime >=", value, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeLessThan(Integer value) {
            addCriterion("MaxLeadTime <", value, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeLessThanOrEqualTo(Integer value) {
            addCriterion("MaxLeadTime <=", value, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeIn(List<Integer> values) {
            addCriterion("MaxLeadTime in", values, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeNotIn(List<Integer> values) {
            addCriterion("MaxLeadTime not in", values, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeBetween(Integer value1, Integer value2) {
            addCriterion("MaxLeadTime between", value1, value2, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxleadtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxLeadTime not between", value1, value2, "maxleadtime");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingIsNull() {
            addCriterion("MaxValidBooking is null");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingIsNotNull() {
            addCriterion("MaxValidBooking is not null");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingEqualTo(Byte value) {
            addCriterion("MaxValidBooking =", value, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingNotEqualTo(Byte value) {
            addCriterion("MaxValidBooking <>", value, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingGreaterThan(Byte value) {
            addCriterion("MaxValidBooking >", value, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingGreaterThanOrEqualTo(Byte value) {
            addCriterion("MaxValidBooking >=", value, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingLessThan(Byte value) {
            addCriterion("MaxValidBooking <", value, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingLessThanOrEqualTo(Byte value) {
            addCriterion("MaxValidBooking <=", value, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingIn(List<Byte> values) {
            addCriterion("MaxValidBooking in", values, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingNotIn(List<Byte> values) {
            addCriterion("MaxValidBooking not in", values, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingBetween(Byte value1, Byte value2) {
            addCriterion("MaxValidBooking between", value1, value2, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andMaxvalidbookingNotBetween(Byte value1, Byte value2) {
            addCriterion("MaxValidBooking not between", value1, value2, "maxvalidbooking");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeIsNull() {
            addCriterion("BookingHoldingTime is null");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeIsNotNull() {
            addCriterion("BookingHoldingTime is not null");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeEqualTo(Short value) {
            addCriterion("BookingHoldingTime =", value, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeNotEqualTo(Short value) {
            addCriterion("BookingHoldingTime <>", value, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeGreaterThan(Short value) {
            addCriterion("BookingHoldingTime >", value, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeGreaterThanOrEqualTo(Short value) {
            addCriterion("BookingHoldingTime >=", value, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeLessThan(Short value) {
            addCriterion("BookingHoldingTime <", value, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeLessThanOrEqualTo(Short value) {
            addCriterion("BookingHoldingTime <=", value, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeIn(List<Short> values) {
            addCriterion("BookingHoldingTime in", values, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeNotIn(List<Short> values) {
            addCriterion("BookingHoldingTime not in", values, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeBetween(Short value1, Short value2) {
            addCriterion("BookingHoldingTime between", value1, value2, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andBookingholdingtimeNotBetween(Short value1, Short value2) {
            addCriterion("BookingHoldingTime not between", value1, value2, "bookingholdingtime");
            return (Criteria) this;
        }

        public Criteria andFreecancellingIsNull() {
            addCriterion("FreeCancelling is null");
            return (Criteria) this;
        }

        public Criteria andFreecancellingIsNotNull() {
            addCriterion("FreeCancelling is not null");
            return (Criteria) this;
        }

        public Criteria andFreecancellingEqualTo(Short value) {
            addCriterion("FreeCancelling =", value, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingNotEqualTo(Short value) {
            addCriterion("FreeCancelling <>", value, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingGreaterThan(Short value) {
            addCriterion("FreeCancelling >", value, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingGreaterThanOrEqualTo(Short value) {
            addCriterion("FreeCancelling >=", value, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingLessThan(Short value) {
            addCriterion("FreeCancelling <", value, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingLessThanOrEqualTo(Short value) {
            addCriterion("FreeCancelling <=", value, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingIn(List<Short> values) {
            addCriterion("FreeCancelling in", values, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingNotIn(List<Short> values) {
            addCriterion("FreeCancelling not in", values, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingBetween(Short value1, Short value2) {
            addCriterion("FreeCancelling between", value1, value2, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andFreecancellingNotBetween(Short value1, Short value2) {
            addCriterion("FreeCancelling not between", value1, value2, "freecancelling");
            return (Criteria) this;
        }

        public Criteria andAlerttimeIsNull() {
            addCriterion("AlertTime is null");
            return (Criteria) this;
        }

        public Criteria andAlerttimeIsNotNull() {
            addCriterion("AlertTime is not null");
            return (Criteria) this;
        }

        public Criteria andAlerttimeEqualTo(Short value) {
            addCriterion("AlertTime =", value, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeNotEqualTo(Short value) {
            addCriterion("AlertTime <>", value, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeGreaterThan(Short value) {
            addCriterion("AlertTime >", value, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeGreaterThanOrEqualTo(Short value) {
            addCriterion("AlertTime >=", value, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeLessThan(Short value) {
            addCriterion("AlertTime <", value, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeLessThanOrEqualTo(Short value) {
            addCriterion("AlertTime <=", value, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeIn(List<Short> values) {
            addCriterion("AlertTime in", values, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeNotIn(List<Short> values) {
            addCriterion("AlertTime not in", values, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeBetween(Short value1, Short value2) {
            addCriterion("AlertTime between", value1, value2, "alerttime");
            return (Criteria) this;
        }

        public Criteria andAlerttimeNotBetween(Short value1, Short value2) {
            addCriterion("AlertTime not between", value1, value2, "alerttime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeIsNull() {
            addCriterion("OffDelayTime is null");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeIsNotNull() {
            addCriterion("OffDelayTime is not null");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeEqualTo(Short value) {
            addCriterion("OffDelayTime =", value, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeNotEqualTo(Short value) {
            addCriterion("OffDelayTime <>", value, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeGreaterThan(Short value) {
            addCriterion("OffDelayTime >", value, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeGreaterThanOrEqualTo(Short value) {
            addCriterion("OffDelayTime >=", value, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeLessThan(Short value) {
            addCriterion("OffDelayTime <", value, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeLessThanOrEqualTo(Short value) {
            addCriterion("OffDelayTime <=", value, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeIn(List<Short> values) {
            addCriterion("OffDelayTime in", values, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeNotIn(List<Short> values) {
            addCriterion("OffDelayTime not in", values, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeBetween(Short value1, Short value2) {
            addCriterion("OffDelayTime between", value1, value2, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andOffdelaytimeNotBetween(Short value1, Short value2) {
            addCriterion("OffDelayTime not between", value1, value2, "offdelaytime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeIsNull() {
            addCriterion("MinOffTime is null");
            return (Criteria) this;
        }

        public Criteria andMinofftimeIsNotNull() {
            addCriterion("MinOffTime is not null");
            return (Criteria) this;
        }

        public Criteria andMinofftimeEqualTo(Short value) {
            addCriterion("MinOffTime =", value, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeNotEqualTo(Short value) {
            addCriterion("MinOffTime <>", value, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeGreaterThan(Short value) {
            addCriterion("MinOffTime >", value, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeGreaterThanOrEqualTo(Short value) {
            addCriterion("MinOffTime >=", value, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeLessThan(Short value) {
            addCriterion("MinOffTime <", value, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeLessThanOrEqualTo(Short value) {
            addCriterion("MinOffTime <=", value, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeIn(List<Short> values) {
            addCriterion("MinOffTime in", values, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeNotIn(List<Short> values) {
            addCriterion("MinOffTime not in", values, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeBetween(Short value1, Short value2) {
            addCriterion("MinOffTime between", value1, value2, "minofftime");
            return (Criteria) this;
        }

        public Criteria andMinofftimeNotBetween(Short value1, Short value2) {
            addCriterion("MinOffTime not between", value1, value2, "minofftime");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentIsNull() {
            addCriterion("AlertCurrent is null");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentIsNotNull() {
            addCriterion("AlertCurrent is not null");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentEqualTo(Float value) {
            addCriterion("AlertCurrent =", value, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentNotEqualTo(Float value) {
            addCriterion("AlertCurrent <>", value, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentGreaterThan(Float value) {
            addCriterion("AlertCurrent >", value, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentGreaterThanOrEqualTo(Float value) {
            addCriterion("AlertCurrent >=", value, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentLessThan(Float value) {
            addCriterion("AlertCurrent <", value, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentLessThanOrEqualTo(Float value) {
            addCriterion("AlertCurrent <=", value, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentIn(List<Float> values) {
            addCriterion("AlertCurrent in", values, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentNotIn(List<Float> values) {
            addCriterion("AlertCurrent not in", values, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentBetween(Float value1, Float value2) {
            addCriterion("AlertCurrent between", value1, value2, "alertcurrent");
            return (Criteria) this;
        }

        public Criteria andAlertcurrentNotBetween(Float value1, Float value2) {
            addCriterion("AlertCurrent not between", value1, value2, "alertcurrent");
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

        public Criteria andCreatedidEqualTo(Integer value) {
            addCriterion("CreatedID =", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotEqualTo(Integer value) {
            addCriterion("CreatedID <>", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThan(Integer value) {
            addCriterion("CreatedID >", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreatedID >=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThan(Integer value) {
            addCriterion("CreatedID <", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidLessThanOrEqualTo(Integer value) {
            addCriterion("CreatedID <=", value, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidIn(List<Integer> values) {
            addCriterion("CreatedID in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotIn(List<Integer> values) {
            addCriterion("CreatedID not in", values, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidBetween(Integer value1, Integer value2) {
            addCriterion("CreatedID between", value1, value2, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreatedidNotBetween(Integer value1, Integer value2) {
            addCriterion("CreatedID not between", value1, value2, "createdid");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("CreatedDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("CreatedDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("CreatedDate =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("CreatedDate <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("CreatedDate >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreatedDate >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("CreatedDate <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("CreatedDate <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("CreatedDate in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("CreatedDate not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("CreatedDate between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("CreatedDate not between", value1, value2, "createddate");
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

        public Criteria andModifieddateIsNull() {
            addCriterion("ModifiedDate is null");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNotNull() {
            addCriterion("ModifiedDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddateEqualTo(Date value) {
            addCriterion("ModifiedDate =", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotEqualTo(Date value) {
            addCriterion("ModifiedDate <>", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThan(Date value) {
            addCriterion("ModifiedDate >", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate >=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThan(Date value) {
            addCriterion("ModifiedDate <", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThanOrEqualTo(Date value) {
            addCriterion("ModifiedDate <=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIn(List<Date> values) {
            addCriterion("ModifiedDate in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotIn(List<Date> values) {
            addCriterion("ModifiedDate not in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotBetween(Date value1, Date value2) {
            addCriterion("ModifiedDate not between", value1, value2, "modifieddate");
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

        public Criteria andDeleteddateIsNull() {
            addCriterion("DeletedDate is null");
            return (Criteria) this;
        }

        public Criteria andDeleteddateIsNotNull() {
            addCriterion("DeletedDate is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteddateEqualTo(Date value) {
            addCriterion("DeletedDate =", value, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateNotEqualTo(Date value) {
            addCriterion("DeletedDate <>", value, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateGreaterThan(Date value) {
            addCriterion("DeletedDate >", value, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateGreaterThanOrEqualTo(Date value) {
            addCriterion("DeletedDate >=", value, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateLessThan(Date value) {
            addCriterion("DeletedDate <", value, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateLessThanOrEqualTo(Date value) {
            addCriterion("DeletedDate <=", value, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateIn(List<Date> values) {
            addCriterion("DeletedDate in", values, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateNotIn(List<Date> values) {
            addCriterion("DeletedDate not in", values, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateBetween(Date value1, Date value2) {
            addCriterion("DeletedDate between", value1, value2, "deleteddate");
            return (Criteria) this;
        }

        public Criteria andDeleteddateNotBetween(Date value1, Date value2) {
            addCriterion("DeletedDate not between", value1, value2, "deleteddate");
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

        public Criteria andNocarduseIsNull() {
            addCriterion("NoCardUse is null");
            return (Criteria) this;
        }

        public Criteria andNocarduseIsNotNull() {
            addCriterion("NoCardUse is not null");
            return (Criteria) this;
        }

        public Criteria andNocarduseEqualTo(Short value) {
            addCriterion("NoCardUse =", value, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseNotEqualTo(Short value) {
            addCriterion("NoCardUse <>", value, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseGreaterThan(Short value) {
            addCriterion("NoCardUse >", value, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseGreaterThanOrEqualTo(Short value) {
            addCriterion("NoCardUse >=", value, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseLessThan(Short value) {
            addCriterion("NoCardUse <", value, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseLessThanOrEqualTo(Short value) {
            addCriterion("NoCardUse <=", value, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseIn(List<Short> values) {
            addCriterion("NoCardUse in", values, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseNotIn(List<Short> values) {
            addCriterion("NoCardUse not in", values, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseBetween(Short value1, Short value2) {
            addCriterion("NoCardUse between", value1, value2, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andNocarduseNotBetween(Short value1, Short value2) {
            addCriterion("NoCardUse not between", value1, value2, "nocarduse");
            return (Criteria) this;
        }

        public Criteria andMinorderdateIsNull() {
            addCriterion("MinOrderdate is null");
            return (Criteria) this;
        }

        public Criteria andMinorderdateIsNotNull() {
            addCriterion("MinOrderdate is not null");
            return (Criteria) this;
        }

        public Criteria andMinorderdateEqualTo(Short value) {
            addCriterion("MinOrderdate =", value, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateNotEqualTo(Short value) {
            addCriterion("MinOrderdate <>", value, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateGreaterThan(Short value) {
            addCriterion("MinOrderdate >", value, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateGreaterThanOrEqualTo(Short value) {
            addCriterion("MinOrderdate >=", value, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateLessThan(Short value) {
            addCriterion("MinOrderdate <", value, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateLessThanOrEqualTo(Short value) {
            addCriterion("MinOrderdate <=", value, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateIn(List<Short> values) {
            addCriterion("MinOrderdate in", values, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateNotIn(List<Short> values) {
            addCriterion("MinOrderdate not in", values, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateBetween(Short value1, Short value2) {
            addCriterion("MinOrderdate between", value1, value2, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andMinorderdateNotBetween(Short value1, Short value2) {
            addCriterion("MinOrderdate not between", value1, value2, "minorderdate");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("Description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("Description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("Description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("Description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("Description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("Description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("Description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("Description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("Description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("Description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("Description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("Description not between", value1, value2, "description");
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