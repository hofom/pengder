package com.slark.pengder.mybatis.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TglobalconfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TglobalconfigExample() {
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

        public Criteria andLanguageIsNull() {
            addCriterion("Language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("Language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(Short value) {
            addCriterion("Language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(Short value) {
            addCriterion("Language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(Short value) {
            addCriterion("Language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(Short value) {
            addCriterion("Language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(Short value) {
            addCriterion("Language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(Short value) {
            addCriterion("Language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<Short> values) {
            addCriterion("Language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<Short> values) {
            addCriterion("Language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(Short value1, Short value2) {
            addCriterion("Language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(Short value1, Short value2) {
            addCriterion("Language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialIsNull() {
            addCriterion("PasswordTrial is null");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialIsNotNull() {
            addCriterion("PasswordTrial is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialEqualTo(Byte value) {
            addCriterion("PasswordTrial =", value, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialNotEqualTo(Byte value) {
            addCriterion("PasswordTrial <>", value, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialGreaterThan(Byte value) {
            addCriterion("PasswordTrial >", value, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialGreaterThanOrEqualTo(Byte value) {
            addCriterion("PasswordTrial >=", value, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialLessThan(Byte value) {
            addCriterion("PasswordTrial <", value, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialLessThanOrEqualTo(Byte value) {
            addCriterion("PasswordTrial <=", value, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialIn(List<Byte> values) {
            addCriterion("PasswordTrial in", values, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialNotIn(List<Byte> values) {
            addCriterion("PasswordTrial not in", values, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialBetween(Byte value1, Byte value2) {
            addCriterion("PasswordTrial between", value1, value2, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andPasswordtrialNotBetween(Byte value1, Byte value2) {
            addCriterion("PasswordTrial not between", value1, value2, "passwordtrial");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanIsNull() {
            addCriterion("LogoutTimeSpan is null");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanIsNotNull() {
            addCriterion("LogoutTimeSpan is not null");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanEqualTo(Short value) {
            addCriterion("LogoutTimeSpan =", value, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanNotEqualTo(Short value) {
            addCriterion("LogoutTimeSpan <>", value, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanGreaterThan(Short value) {
            addCriterion("LogoutTimeSpan >", value, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanGreaterThanOrEqualTo(Short value) {
            addCriterion("LogoutTimeSpan >=", value, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanLessThan(Short value) {
            addCriterion("LogoutTimeSpan <", value, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanLessThanOrEqualTo(Short value) {
            addCriterion("LogoutTimeSpan <=", value, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanIn(List<Short> values) {
            addCriterion("LogoutTimeSpan in", values, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanNotIn(List<Short> values) {
            addCriterion("LogoutTimeSpan not in", values, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanBetween(Short value1, Short value2) {
            addCriterion("LogoutTimeSpan between", value1, value2, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andLogouttimespanNotBetween(Short value1, Short value2) {
            addCriterion("LogoutTimeSpan not between", value1, value2, "logouttimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanIsNull() {
            addCriterion("TemporaryCardTimeSpan is null");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanIsNotNull() {
            addCriterion("TemporaryCardTimeSpan is not null");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanEqualTo(Short value) {
            addCriterion("TemporaryCardTimeSpan =", value, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanNotEqualTo(Short value) {
            addCriterion("TemporaryCardTimeSpan <>", value, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanGreaterThan(Short value) {
            addCriterion("TemporaryCardTimeSpan >", value, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanGreaterThanOrEqualTo(Short value) {
            addCriterion("TemporaryCardTimeSpan >=", value, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanLessThan(Short value) {
            addCriterion("TemporaryCardTimeSpan <", value, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanLessThanOrEqualTo(Short value) {
            addCriterion("TemporaryCardTimeSpan <=", value, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanIn(List<Short> values) {
            addCriterion("TemporaryCardTimeSpan in", values, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanNotIn(List<Short> values) {
            addCriterion("TemporaryCardTimeSpan not in", values, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanBetween(Short value1, Short value2) {
            addCriterion("TemporaryCardTimeSpan between", value1, value2, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andTemporarycardtimespanNotBetween(Short value1, Short value2) {
            addCriterion("TemporaryCardTimeSpan not between", value1, value2, "temporarycardtimespan");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryIsNull() {
            addCriterion("AttachmentDirectory is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryIsNotNull() {
            addCriterion("AttachmentDirectory is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryEqualTo(String value) {
            addCriterion("AttachmentDirectory =", value, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryNotEqualTo(String value) {
            addCriterion("AttachmentDirectory <>", value, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryGreaterThan(String value) {
            addCriterion("AttachmentDirectory >", value, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryGreaterThanOrEqualTo(String value) {
            addCriterion("AttachmentDirectory >=", value, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryLessThan(String value) {
            addCriterion("AttachmentDirectory <", value, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryLessThanOrEqualTo(String value) {
            addCriterion("AttachmentDirectory <=", value, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryLike(String value) {
            addCriterion("AttachmentDirectory like", value, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryNotLike(String value) {
            addCriterion("AttachmentDirectory not like", value, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryIn(List<String> values) {
            addCriterion("AttachmentDirectory in", values, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryNotIn(List<String> values) {
            addCriterion("AttachmentDirectory not in", values, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryBetween(String value1, String value2) {
            addCriterion("AttachmentDirectory between", value1, value2, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andAttachmentdirectoryNotBetween(String value1, String value2) {
            addCriterion("AttachmentDirectory not between", value1, value2, "attachmentdirectory");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishIsNull() {
            addCriterion("TimeInPunish is null");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishIsNotNull() {
            addCriterion("TimeInPunish is not null");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishEqualTo(Integer value) {
            addCriterion("TimeInPunish =", value, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishNotEqualTo(Integer value) {
            addCriterion("TimeInPunish <>", value, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishGreaterThan(Integer value) {
            addCriterion("TimeInPunish >", value, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishGreaterThanOrEqualTo(Integer value) {
            addCriterion("TimeInPunish >=", value, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishLessThan(Integer value) {
            addCriterion("TimeInPunish <", value, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishLessThanOrEqualTo(Integer value) {
            addCriterion("TimeInPunish <=", value, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishIn(List<Integer> values) {
            addCriterion("TimeInPunish in", values, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishNotIn(List<Integer> values) {
            addCriterion("TimeInPunish not in", values, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishBetween(Integer value1, Integer value2) {
            addCriterion("TimeInPunish between", value1, value2, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andTimeinpunishNotBetween(Integer value1, Integer value2) {
            addCriterion("TimeInPunish not between", value1, value2, "timeinpunish");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNull() {
            addCriterion("Invoice is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceIsNotNull() {
            addCriterion("Invoice is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceEqualTo(Short value) {
            addCriterion("Invoice =", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotEqualTo(Short value) {
            addCriterion("Invoice <>", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThan(Short value) {
            addCriterion("Invoice >", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceGreaterThanOrEqualTo(Short value) {
            addCriterion("Invoice >=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThan(Short value) {
            addCriterion("Invoice <", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceLessThanOrEqualTo(Short value) {
            addCriterion("Invoice <=", value, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceIn(List<Short> values) {
            addCriterion("Invoice in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotIn(List<Short> values) {
            addCriterion("Invoice not in", values, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceBetween(Short value1, Short value2) {
            addCriterion("Invoice between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andInvoiceNotBetween(Short value1, Short value2) {
            addCriterion("Invoice not between", value1, value2, "invoice");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackIsNull() {
            addCriterion("PunishTimeOfBlack is null");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackIsNotNull() {
            addCriterion("PunishTimeOfBlack is not null");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackEqualTo(Integer value) {
            addCriterion("PunishTimeOfBlack =", value, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackNotEqualTo(Integer value) {
            addCriterion("PunishTimeOfBlack <>", value, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackGreaterThan(Integer value) {
            addCriterion("PunishTimeOfBlack >", value, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackGreaterThanOrEqualTo(Integer value) {
            addCriterion("PunishTimeOfBlack >=", value, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackLessThan(Integer value) {
            addCriterion("PunishTimeOfBlack <", value, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackLessThanOrEqualTo(Integer value) {
            addCriterion("PunishTimeOfBlack <=", value, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackIn(List<Integer> values) {
            addCriterion("PunishTimeOfBlack in", values, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackNotIn(List<Integer> values) {
            addCriterion("PunishTimeOfBlack not in", values, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackBetween(Integer value1, Integer value2) {
            addCriterion("PunishTimeOfBlack between", value1, value2, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andPunishtimeofblackNotBetween(Integer value1, Integer value2) {
            addCriterion("PunishTimeOfBlack not between", value1, value2, "punishtimeofblack");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverIsNull() {
            addCriterion("AddrOfTimeServer is null");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverIsNotNull() {
            addCriterion("AddrOfTimeServer is not null");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverEqualTo(String value) {
            addCriterion("AddrOfTimeServer =", value, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverNotEqualTo(String value) {
            addCriterion("AddrOfTimeServer <>", value, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverGreaterThan(String value) {
            addCriterion("AddrOfTimeServer >", value, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverGreaterThanOrEqualTo(String value) {
            addCriterion("AddrOfTimeServer >=", value, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverLessThan(String value) {
            addCriterion("AddrOfTimeServer <", value, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverLessThanOrEqualTo(String value) {
            addCriterion("AddrOfTimeServer <=", value, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverLike(String value) {
            addCriterion("AddrOfTimeServer like", value, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverNotLike(String value) {
            addCriterion("AddrOfTimeServer not like", value, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverIn(List<String> values) {
            addCriterion("AddrOfTimeServer in", values, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverNotIn(List<String> values) {
            addCriterion("AddrOfTimeServer not in", values, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverBetween(String value1, String value2) {
            addCriterion("AddrOfTimeServer between", value1, value2, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andAddroftimeserverNotBetween(String value1, String value2) {
            addCriterion("AddrOfTimeServer not between", value1, value2, "addroftimeserver");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateIsNull() {
            addCriterion("BlacklistRate is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateIsNotNull() {
            addCriterion("BlacklistRate is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateEqualTo(Short value) {
            addCriterion("BlacklistRate =", value, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateNotEqualTo(Short value) {
            addCriterion("BlacklistRate <>", value, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateGreaterThan(Short value) {
            addCriterion("BlacklistRate >", value, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateGreaterThanOrEqualTo(Short value) {
            addCriterion("BlacklistRate >=", value, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateLessThan(Short value) {
            addCriterion("BlacklistRate <", value, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateLessThanOrEqualTo(Short value) {
            addCriterion("BlacklistRate <=", value, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateIn(List<Short> values) {
            addCriterion("BlacklistRate in", values, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateNotIn(List<Short> values) {
            addCriterion("BlacklistRate not in", values, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateBetween(Short value1, Short value2) {
            addCriterion("BlacklistRate between", value1, value2, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andBlacklistrateNotBetween(Short value1, Short value2) {
            addCriterion("BlacklistRate not between", value1, value2, "blacklistrate");
            return (Criteria) this;
        }

        public Criteria andVipaccountIsNull() {
            addCriterion("VipAccount is null");
            return (Criteria) this;
        }

        public Criteria andVipaccountIsNotNull() {
            addCriterion("VipAccount is not null");
            return (Criteria) this;
        }

        public Criteria andVipaccountEqualTo(Byte value) {
            addCriterion("VipAccount =", value, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountNotEqualTo(Byte value) {
            addCriterion("VipAccount <>", value, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountGreaterThan(Byte value) {
            addCriterion("VipAccount >", value, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountGreaterThanOrEqualTo(Byte value) {
            addCriterion("VipAccount >=", value, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountLessThan(Byte value) {
            addCriterion("VipAccount <", value, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountLessThanOrEqualTo(Byte value) {
            addCriterion("VipAccount <=", value, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountIn(List<Byte> values) {
            addCriterion("VipAccount in", values, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountNotIn(List<Byte> values) {
            addCriterion("VipAccount not in", values, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountBetween(Byte value1, Byte value2) {
            addCriterion("VipAccount between", value1, value2, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andVipaccountNotBetween(Byte value1, Byte value2) {
            addCriterion("VipAccount not between", value1, value2, "vipaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountIsNull() {
            addCriterion("GeneralAccount is null");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountIsNotNull() {
            addCriterion("GeneralAccount is not null");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountEqualTo(Byte value) {
            addCriterion("GeneralAccount =", value, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountNotEqualTo(Byte value) {
            addCriterion("GeneralAccount <>", value, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountGreaterThan(Byte value) {
            addCriterion("GeneralAccount >", value, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountGreaterThanOrEqualTo(Byte value) {
            addCriterion("GeneralAccount >=", value, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountLessThan(Byte value) {
            addCriterion("GeneralAccount <", value, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountLessThanOrEqualTo(Byte value) {
            addCriterion("GeneralAccount <=", value, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountIn(List<Byte> values) {
            addCriterion("GeneralAccount in", values, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountNotIn(List<Byte> values) {
            addCriterion("GeneralAccount not in", values, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountBetween(Byte value1, Byte value2) {
            addCriterion("GeneralAccount between", value1, value2, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andGeneralaccountNotBetween(Byte value1, Byte value2) {
            addCriterion("GeneralAccount not between", value1, value2, "generalaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountIsNull() {
            addCriterion("UnauthorityAccount is null");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountIsNotNull() {
            addCriterion("UnauthorityAccount is not null");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountEqualTo(Byte value) {
            addCriterion("UnauthorityAccount =", value, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountNotEqualTo(Byte value) {
            addCriterion("UnauthorityAccount <>", value, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountGreaterThan(Byte value) {
            addCriterion("UnauthorityAccount >", value, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountGreaterThanOrEqualTo(Byte value) {
            addCriterion("UnauthorityAccount >=", value, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountLessThan(Byte value) {
            addCriterion("UnauthorityAccount <", value, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountLessThanOrEqualTo(Byte value) {
            addCriterion("UnauthorityAccount <=", value, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountIn(List<Byte> values) {
            addCriterion("UnauthorityAccount in", values, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountNotIn(List<Byte> values) {
            addCriterion("UnauthorityAccount not in", values, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountBetween(Byte value1, Byte value2) {
            addCriterion("UnauthorityAccount between", value1, value2, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andUnauthorityaccountNotBetween(Byte value1, Byte value2) {
            addCriterion("UnauthorityAccount not between", value1, value2, "unauthorityaccount");
            return (Criteria) this;
        }

        public Criteria andAccountalertIsNull() {
            addCriterion("AccountAlert is null");
            return (Criteria) this;
        }

        public Criteria andAccountalertIsNotNull() {
            addCriterion("AccountAlert is not null");
            return (Criteria) this;
        }

        public Criteria andAccountalertEqualTo(BigDecimal value) {
            addCriterion("AccountAlert =", value, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertNotEqualTo(BigDecimal value) {
            addCriterion("AccountAlert <>", value, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertGreaterThan(BigDecimal value) {
            addCriterion("AccountAlert >", value, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AccountAlert >=", value, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertLessThan(BigDecimal value) {
            addCriterion("AccountAlert <", value, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AccountAlert <=", value, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertIn(List<BigDecimal> values) {
            addCriterion("AccountAlert in", values, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertNotIn(List<BigDecimal> values) {
            addCriterion("AccountAlert not in", values, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AccountAlert between", value1, value2, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountalertNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AccountAlert not between", value1, value2, "accountalert");
            return (Criteria) this;
        }

        public Criteria andAccountroundIsNull() {
            addCriterion("AccountRound is null");
            return (Criteria) this;
        }

        public Criteria andAccountroundIsNotNull() {
            addCriterion("AccountRound is not null");
            return (Criteria) this;
        }

        public Criteria andAccountroundEqualTo(BigDecimal value) {
            addCriterion("AccountRound =", value, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundNotEqualTo(BigDecimal value) {
            addCriterion("AccountRound <>", value, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundGreaterThan(BigDecimal value) {
            addCriterion("AccountRound >", value, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AccountRound >=", value, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundLessThan(BigDecimal value) {
            addCriterion("AccountRound <", value, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AccountRound <=", value, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundIn(List<BigDecimal> values) {
            addCriterion("AccountRound in", values, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundNotIn(List<BigDecimal> values) {
            addCriterion("AccountRound not in", values, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AccountRound between", value1, value2, "accountround");
            return (Criteria) this;
        }

        public Criteria andAccountroundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AccountRound not between", value1, value2, "accountround");
            return (Criteria) this;
        }

        public Criteria andVipstandardIsNull() {
            addCriterion("VipStandard is null");
            return (Criteria) this;
        }

        public Criteria andVipstandardIsNotNull() {
            addCriterion("VipStandard is not null");
            return (Criteria) this;
        }

        public Criteria andVipstandardEqualTo(BigDecimal value) {
            addCriterion("VipStandard =", value, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardNotEqualTo(BigDecimal value) {
            addCriterion("VipStandard <>", value, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardGreaterThan(BigDecimal value) {
            addCriterion("VipStandard >", value, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VipStandard >=", value, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardLessThan(BigDecimal value) {
            addCriterion("VipStandard <", value, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VipStandard <=", value, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardIn(List<BigDecimal> values) {
            addCriterion("VipStandard in", values, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardNotIn(List<BigDecimal> values) {
            addCriterion("VipStandard not in", values, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VipStandard between", value1, value2, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andVipstandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VipStandard not between", value1, value2, "vipstandard");
            return (Criteria) this;
        }

        public Criteria andViprewardIsNull() {
            addCriterion("VipReward is null");
            return (Criteria) this;
        }

        public Criteria andViprewardIsNotNull() {
            addCriterion("VipReward is not null");
            return (Criteria) this;
        }

        public Criteria andViprewardEqualTo(BigDecimal value) {
            addCriterion("VipReward =", value, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardNotEqualTo(BigDecimal value) {
            addCriterion("VipReward <>", value, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardGreaterThan(BigDecimal value) {
            addCriterion("VipReward >", value, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VipReward >=", value, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardLessThan(BigDecimal value) {
            addCriterion("VipReward <", value, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VipReward <=", value, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardIn(List<BigDecimal> values) {
            addCriterion("VipReward in", values, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardNotIn(List<BigDecimal> values) {
            addCriterion("VipReward not in", values, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VipReward between", value1, value2, "vipreward");
            return (Criteria) this;
        }

        public Criteria andViprewardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VipReward not between", value1, value2, "vipreward");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissIsNull() {
            addCriterion("DeductCreditMiss is null");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissIsNotNull() {
            addCriterion("DeductCreditMiss is not null");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissEqualTo(Short value) {
            addCriterion("DeductCreditMiss =", value, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissNotEqualTo(Short value) {
            addCriterion("DeductCreditMiss <>", value, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissGreaterThan(Short value) {
            addCriterion("DeductCreditMiss >", value, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissGreaterThanOrEqualTo(Short value) {
            addCriterion("DeductCreditMiss >=", value, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissLessThan(Short value) {
            addCriterion("DeductCreditMiss <", value, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissLessThanOrEqualTo(Short value) {
            addCriterion("DeductCreditMiss <=", value, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissIn(List<Short> values) {
            addCriterion("DeductCreditMiss in", values, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissNotIn(List<Short> values) {
            addCriterion("DeductCreditMiss not in", values, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissBetween(Short value1, Short value2) {
            addCriterion("DeductCreditMiss between", value1, value2, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andDeductcreditmissNotBetween(Short value1, Short value2) {
            addCriterion("DeductCreditMiss not between", value1, value2, "deductcreditmiss");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditIsNull() {
            addCriterion("VipFloorCredit is null");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditIsNotNull() {
            addCriterion("VipFloorCredit is not null");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditEqualTo(Short value) {
            addCriterion("VipFloorCredit =", value, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditNotEqualTo(Short value) {
            addCriterion("VipFloorCredit <>", value, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditGreaterThan(Short value) {
            addCriterion("VipFloorCredit >", value, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditGreaterThanOrEqualTo(Short value) {
            addCriterion("VipFloorCredit >=", value, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditLessThan(Short value) {
            addCriterion("VipFloorCredit <", value, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditLessThanOrEqualTo(Short value) {
            addCriterion("VipFloorCredit <=", value, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditIn(List<Short> values) {
            addCriterion("VipFloorCredit in", values, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditNotIn(List<Short> values) {
            addCriterion("VipFloorCredit not in", values, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditBetween(Short value1, Short value2) {
            addCriterion("VipFloorCredit between", value1, value2, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andVipfloorcreditNotBetween(Short value1, Short value2) {
            addCriterion("VipFloorCredit not between", value1, value2, "vipfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditIsNull() {
            addCriterion("CommonFloorCredit is null");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditIsNotNull() {
            addCriterion("CommonFloorCredit is not null");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditEqualTo(Short value) {
            addCriterion("CommonFloorCredit =", value, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditNotEqualTo(Short value) {
            addCriterion("CommonFloorCredit <>", value, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditGreaterThan(Short value) {
            addCriterion("CommonFloorCredit >", value, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditGreaterThanOrEqualTo(Short value) {
            addCriterion("CommonFloorCredit >=", value, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditLessThan(Short value) {
            addCriterion("CommonFloorCredit <", value, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditLessThanOrEqualTo(Short value) {
            addCriterion("CommonFloorCredit <=", value, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditIn(List<Short> values) {
            addCriterion("CommonFloorCredit in", values, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditNotIn(List<Short> values) {
            addCriterion("CommonFloorCredit not in", values, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditBetween(Short value1, Short value2) {
            addCriterion("CommonFloorCredit between", value1, value2, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andCommonfloorcreditNotBetween(Short value1, Short value2) {
            addCriterion("CommonFloorCredit not between", value1, value2, "commonfloorcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditIsNull() {
            addCriterion("EndPunishCredit is null");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditIsNotNull() {
            addCriterion("EndPunishCredit is not null");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditEqualTo(Short value) {
            addCriterion("EndPunishCredit =", value, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditNotEqualTo(Short value) {
            addCriterion("EndPunishCredit <>", value, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditGreaterThan(Short value) {
            addCriterion("EndPunishCredit >", value, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditGreaterThanOrEqualTo(Short value) {
            addCriterion("EndPunishCredit >=", value, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditLessThan(Short value) {
            addCriterion("EndPunishCredit <", value, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditLessThanOrEqualTo(Short value) {
            addCriterion("EndPunishCredit <=", value, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditIn(List<Short> values) {
            addCriterion("EndPunishCredit in", values, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditNotIn(List<Short> values) {
            addCriterion("EndPunishCredit not in", values, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditBetween(Short value1, Short value2) {
            addCriterion("EndPunishCredit between", value1, value2, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andEndpunishcreditNotBetween(Short value1, Short value2) {
            addCriterion("EndPunishCredit not between", value1, value2, "endpunishcredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditIsNull() {
            addCriterion("AnnualGainCredit is null");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditIsNotNull() {
            addCriterion("AnnualGainCredit is not null");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditEqualTo(Short value) {
            addCriterion("AnnualGainCredit =", value, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditNotEqualTo(Short value) {
            addCriterion("AnnualGainCredit <>", value, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditGreaterThan(Short value) {
            addCriterion("AnnualGainCredit >", value, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditGreaterThanOrEqualTo(Short value) {
            addCriterion("AnnualGainCredit >=", value, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditLessThan(Short value) {
            addCriterion("AnnualGainCredit <", value, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditLessThanOrEqualTo(Short value) {
            addCriterion("AnnualGainCredit <=", value, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditIn(List<Short> values) {
            addCriterion("AnnualGainCredit in", values, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditNotIn(List<Short> values) {
            addCriterion("AnnualGainCredit not in", values, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditBetween(Short value1, Short value2) {
            addCriterion("AnnualGainCredit between", value1, value2, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andAnnualgaincreditNotBetween(Short value1, Short value2) {
            addCriterion("AnnualGainCredit not between", value1, value2, "annualgaincredit");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNull() {
            addCriterion("WorkTime is null");
            return (Criteria) this;
        }

        public Criteria andWorktimeIsNotNull() {
            addCriterion("WorkTime is not null");
            return (Criteria) this;
        }

        public Criteria andWorktimeEqualTo(String value) {
            addCriterion("WorkTime =", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotEqualTo(String value) {
            addCriterion("WorkTime <>", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThan(String value) {
            addCriterion("WorkTime >", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeGreaterThanOrEqualTo(String value) {
            addCriterion("WorkTime >=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThan(String value) {
            addCriterion("WorkTime <", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLessThanOrEqualTo(String value) {
            addCriterion("WorkTime <=", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeLike(String value) {
            addCriterion("WorkTime like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotLike(String value) {
            addCriterion("WorkTime not like", value, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeIn(List<String> values) {
            addCriterion("WorkTime in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotIn(List<String> values) {
            addCriterion("WorkTime not in", values, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeBetween(String value1, String value2) {
            addCriterion("WorkTime between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andWorktimeNotBetween(String value1, String value2) {
            addCriterion("WorkTime not between", value1, value2, "worktime");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitIsNull() {
            addCriterion("TimeLowerLimit is null");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitIsNotNull() {
            addCriterion("TimeLowerLimit is not null");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitEqualTo(Short value) {
            addCriterion("TimeLowerLimit =", value, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitNotEqualTo(Short value) {
            addCriterion("TimeLowerLimit <>", value, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitGreaterThan(Short value) {
            addCriterion("TimeLowerLimit >", value, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitGreaterThanOrEqualTo(Short value) {
            addCriterion("TimeLowerLimit >=", value, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitLessThan(Short value) {
            addCriterion("TimeLowerLimit <", value, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitLessThanOrEqualTo(Short value) {
            addCriterion("TimeLowerLimit <=", value, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitIn(List<Short> values) {
            addCriterion("TimeLowerLimit in", values, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitNotIn(List<Short> values) {
            addCriterion("TimeLowerLimit not in", values, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitBetween(Short value1, Short value2) {
            addCriterion("TimeLowerLimit between", value1, value2, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andTimelowerlimitNotBetween(Short value1, Short value2) {
            addCriterion("TimeLowerLimit not between", value1, value2, "timelowerlimit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditIsNull() {
            addCriterion("OccupyDeductCredit is null");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditIsNotNull() {
            addCriterion("OccupyDeductCredit is not null");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditEqualTo(Short value) {
            addCriterion("OccupyDeductCredit =", value, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditNotEqualTo(Short value) {
            addCriterion("OccupyDeductCredit <>", value, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditGreaterThan(Short value) {
            addCriterion("OccupyDeductCredit >", value, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditGreaterThanOrEqualTo(Short value) {
            addCriterion("OccupyDeductCredit >=", value, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditLessThan(Short value) {
            addCriterion("OccupyDeductCredit <", value, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditLessThanOrEqualTo(Short value) {
            addCriterion("OccupyDeductCredit <=", value, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditIn(List<Short> values) {
            addCriterion("OccupyDeductCredit in", values, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditNotIn(List<Short> values) {
            addCriterion("OccupyDeductCredit not in", values, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditBetween(Short value1, Short value2) {
            addCriterion("OccupyDeductCredit between", value1, value2, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andOccupydeductcreditNotBetween(Short value1, Short value2) {
            addCriterion("OccupyDeductCredit not between", value1, value2, "occupydeductcredit");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeIsNull() {
            addCriterion("TrainingValidTime is null");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeIsNotNull() {
            addCriterion("TrainingValidTime is not null");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeEqualTo(Short value) {
            addCriterion("TrainingValidTime =", value, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeNotEqualTo(Short value) {
            addCriterion("TrainingValidTime <>", value, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeGreaterThan(Short value) {
            addCriterion("TrainingValidTime >", value, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeGreaterThanOrEqualTo(Short value) {
            addCriterion("TrainingValidTime >=", value, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeLessThan(Short value) {
            addCriterion("TrainingValidTime <", value, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeLessThanOrEqualTo(Short value) {
            addCriterion("TrainingValidTime <=", value, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeIn(List<Short> values) {
            addCriterion("TrainingValidTime in", values, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeNotIn(List<Short> values) {
            addCriterion("TrainingValidTime not in", values, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeBetween(Short value1, Short value2) {
            addCriterion("TrainingValidTime between", value1, value2, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andTrainingvalidtimeNotBetween(Short value1, Short value2) {
            addCriterion("TrainingValidTime not between", value1, value2, "trainingvalidtime");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreIsNull() {
            addCriterion("LevelOfCentre is null");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreIsNotNull() {
            addCriterion("LevelOfCentre is not null");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreEqualTo(Short value) {
            addCriterion("LevelOfCentre =", value, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreNotEqualTo(Short value) {
            addCriterion("LevelOfCentre <>", value, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreGreaterThan(Short value) {
            addCriterion("LevelOfCentre >", value, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreGreaterThanOrEqualTo(Short value) {
            addCriterion("LevelOfCentre >=", value, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreLessThan(Short value) {
            addCriterion("LevelOfCentre <", value, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreLessThanOrEqualTo(Short value) {
            addCriterion("LevelOfCentre <=", value, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreIn(List<Short> values) {
            addCriterion("LevelOfCentre in", values, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreNotIn(List<Short> values) {
            addCriterion("LevelOfCentre not in", values, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreBetween(Short value1, Short value2) {
            addCriterion("LevelOfCentre between", value1, value2, "levelofcentre");
            return (Criteria) this;
        }

        public Criteria andLevelofcentreNotBetween(Short value1, Short value2) {
            addCriterion("LevelOfCentre not between", value1, value2, "levelofcentre");
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

        public Criteria andTimelowercreditIsNull() {
            addCriterion("TimeLowerCredit is null");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditIsNotNull() {
            addCriterion("TimeLowerCredit is not null");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditEqualTo(Short value) {
            addCriterion("TimeLowerCredit =", value, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditNotEqualTo(Short value) {
            addCriterion("TimeLowerCredit <>", value, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditGreaterThan(Short value) {
            addCriterion("TimeLowerCredit >", value, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditGreaterThanOrEqualTo(Short value) {
            addCriterion("TimeLowerCredit >=", value, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditLessThan(Short value) {
            addCriterion("TimeLowerCredit <", value, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditLessThanOrEqualTo(Short value) {
            addCriterion("TimeLowerCredit <=", value, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditIn(List<Short> values) {
            addCriterion("TimeLowerCredit in", values, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditNotIn(List<Short> values) {
            addCriterion("TimeLowerCredit not in", values, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditBetween(Short value1, Short value2) {
            addCriterion("TimeLowerCredit between", value1, value2, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andTimelowercreditNotBetween(Short value1, Short value2) {
            addCriterion("TimeLowerCredit not between", value1, value2, "timelowercredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditIsNull() {
            addCriterion("InitCredit is null");
            return (Criteria) this;
        }

        public Criteria andInitcreditIsNotNull() {
            addCriterion("InitCredit is not null");
            return (Criteria) this;
        }

        public Criteria andInitcreditEqualTo(Short value) {
            addCriterion("InitCredit =", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditNotEqualTo(Short value) {
            addCriterion("InitCredit <>", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditGreaterThan(Short value) {
            addCriterion("InitCredit >", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditGreaterThanOrEqualTo(Short value) {
            addCriterion("InitCredit >=", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditLessThan(Short value) {
            addCriterion("InitCredit <", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditLessThanOrEqualTo(Short value) {
            addCriterion("InitCredit <=", value, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditIn(List<Short> values) {
            addCriterion("InitCredit in", values, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditNotIn(List<Short> values) {
            addCriterion("InitCredit not in", values, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditBetween(Short value1, Short value2) {
            addCriterion("InitCredit between", value1, value2, "initcredit");
            return (Criteria) this;
        }

        public Criteria andInitcreditNotBetween(Short value1, Short value2) {
            addCriterion("InitCredit not between", value1, value2, "initcredit");
            return (Criteria) this;
        }

        public Criteria andBillingformulaIsNull() {
            addCriterion("BillingFormula is null");
            return (Criteria) this;
        }

        public Criteria andBillingformulaIsNotNull() {
            addCriterion("BillingFormula is not null");
            return (Criteria) this;
        }

        public Criteria andBillingformulaEqualTo(String value) {
            addCriterion("BillingFormula =", value, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaNotEqualTo(String value) {
            addCriterion("BillingFormula <>", value, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaGreaterThan(String value) {
            addCriterion("BillingFormula >", value, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaGreaterThanOrEqualTo(String value) {
            addCriterion("BillingFormula >=", value, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaLessThan(String value) {
            addCriterion("BillingFormula <", value, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaLessThanOrEqualTo(String value) {
            addCriterion("BillingFormula <=", value, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaLike(String value) {
            addCriterion("BillingFormula like", value, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaNotLike(String value) {
            addCriterion("BillingFormula not like", value, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaIn(List<String> values) {
            addCriterion("BillingFormula in", values, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaNotIn(List<String> values) {
            addCriterion("BillingFormula not in", values, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaBetween(String value1, String value2) {
            addCriterion("BillingFormula between", value1, value2, "billingformula");
            return (Criteria) this;
        }

        public Criteria andBillingformulaNotBetween(String value1, String value2) {
            addCriterion("BillingFormula not between", value1, value2, "billingformula");
            return (Criteria) this;
        }

        public Criteria andSinglerewardIsNull() {
            addCriterion("SingleReward is null");
            return (Criteria) this;
        }

        public Criteria andSinglerewardIsNotNull() {
            addCriterion("SingleReward is not null");
            return (Criteria) this;
        }

        public Criteria andSinglerewardEqualTo(Short value) {
            addCriterion("SingleReward =", value, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardNotEqualTo(Short value) {
            addCriterion("SingleReward <>", value, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardGreaterThan(Short value) {
            addCriterion("SingleReward >", value, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardGreaterThanOrEqualTo(Short value) {
            addCriterion("SingleReward >=", value, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardLessThan(Short value) {
            addCriterion("SingleReward <", value, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardLessThanOrEqualTo(Short value) {
            addCriterion("SingleReward <=", value, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardIn(List<Short> values) {
            addCriterion("SingleReward in", values, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardNotIn(List<Short> values) {
            addCriterion("SingleReward not in", values, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardBetween(Short value1, Short value2) {
            addCriterion("SingleReward between", value1, value2, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSinglerewardNotBetween(Short value1, Short value2) {
            addCriterion("SingleReward not between", value1, value2, "singlereward");
            return (Criteria) this;
        }

        public Criteria andSingledeductIsNull() {
            addCriterion("SingleDeduct is null");
            return (Criteria) this;
        }

        public Criteria andSingledeductIsNotNull() {
            addCriterion("SingleDeduct is not null");
            return (Criteria) this;
        }

        public Criteria andSingledeductEqualTo(Short value) {
            addCriterion("SingleDeduct =", value, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductNotEqualTo(Short value) {
            addCriterion("SingleDeduct <>", value, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductGreaterThan(Short value) {
            addCriterion("SingleDeduct >", value, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductGreaterThanOrEqualTo(Short value) {
            addCriterion("SingleDeduct >=", value, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductLessThan(Short value) {
            addCriterion("SingleDeduct <", value, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductLessThanOrEqualTo(Short value) {
            addCriterion("SingleDeduct <=", value, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductIn(List<Short> values) {
            addCriterion("SingleDeduct in", values, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductNotIn(List<Short> values) {
            addCriterion("SingleDeduct not in", values, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductBetween(Short value1, Short value2) {
            addCriterion("SingleDeduct between", value1, value2, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andSingledeductNotBetween(Short value1, Short value2) {
            addCriterion("SingleDeduct not between", value1, value2, "singlededuct");
            return (Criteria) this;
        }

        public Criteria andUppercreditIsNull() {
            addCriterion("UpperCredit is null");
            return (Criteria) this;
        }

        public Criteria andUppercreditIsNotNull() {
            addCriterion("UpperCredit is not null");
            return (Criteria) this;
        }

        public Criteria andUppercreditEqualTo(Short value) {
            addCriterion("UpperCredit =", value, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditNotEqualTo(Short value) {
            addCriterion("UpperCredit <>", value, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditGreaterThan(Short value) {
            addCriterion("UpperCredit >", value, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditGreaterThanOrEqualTo(Short value) {
            addCriterion("UpperCredit >=", value, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditLessThan(Short value) {
            addCriterion("UpperCredit <", value, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditLessThanOrEqualTo(Short value) {
            addCriterion("UpperCredit <=", value, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditIn(List<Short> values) {
            addCriterion("UpperCredit in", values, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditNotIn(List<Short> values) {
            addCriterion("UpperCredit not in", values, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditBetween(Short value1, Short value2) {
            addCriterion("UpperCredit between", value1, value2, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andUppercreditNotBetween(Short value1, Short value2) {
            addCriterion("UpperCredit not between", value1, value2, "uppercredit");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelIsNull() {
            addCriterion("DeductCreditBookingCancel is null");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelIsNotNull() {
            addCriterion("DeductCreditBookingCancel is not null");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelEqualTo(Short value) {
            addCriterion("DeductCreditBookingCancel =", value, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelNotEqualTo(Short value) {
            addCriterion("DeductCreditBookingCancel <>", value, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelGreaterThan(Short value) {
            addCriterion("DeductCreditBookingCancel >", value, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelGreaterThanOrEqualTo(Short value) {
            addCriterion("DeductCreditBookingCancel >=", value, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelLessThan(Short value) {
            addCriterion("DeductCreditBookingCancel <", value, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelLessThanOrEqualTo(Short value) {
            addCriterion("DeductCreditBookingCancel <=", value, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelIn(List<Short> values) {
            addCriterion("DeductCreditBookingCancel in", values, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelNotIn(List<Short> values) {
            addCriterion("DeductCreditBookingCancel not in", values, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelBetween(Short value1, Short value2) {
            addCriterion("DeductCreditBookingCancel between", value1, value2, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andDeductcreditbookingcancelNotBetween(Short value1, Short value2) {
            addCriterion("DeductCreditBookingCancel not between", value1, value2, "deductcreditbookingcancel");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditIsNull() {
            addCriterion("ActiveTimeofNewCredit is null");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditIsNotNull() {
            addCriterion("ActiveTimeofNewCredit is not null");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditEqualTo(Integer value) {
            addCriterion("ActiveTimeofNewCredit =", value, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditNotEqualTo(Integer value) {
            addCriterion("ActiveTimeofNewCredit <>", value, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditGreaterThan(Integer value) {
            addCriterion("ActiveTimeofNewCredit >", value, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditGreaterThanOrEqualTo(Integer value) {
            addCriterion("ActiveTimeofNewCredit >=", value, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditLessThan(Integer value) {
            addCriterion("ActiveTimeofNewCredit <", value, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditLessThanOrEqualTo(Integer value) {
            addCriterion("ActiveTimeofNewCredit <=", value, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditIn(List<Integer> values) {
            addCriterion("ActiveTimeofNewCredit in", values, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditNotIn(List<Integer> values) {
            addCriterion("ActiveTimeofNewCredit not in", values, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditBetween(Integer value1, Integer value2) {
            addCriterion("ActiveTimeofNewCredit between", value1, value2, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andActivetimeofnewcreditNotBetween(Integer value1, Integer value2) {
            addCriterion("ActiveTimeofNewCredit not between", value1, value2, "activetimeofnewcredit");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidIsNull() {
            addCriterion("MajorOrganizationID is null");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidIsNotNull() {
            addCriterion("MajorOrganizationID is not null");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidEqualTo(Integer value) {
            addCriterion("MajorOrganizationID =", value, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidNotEqualTo(Integer value) {
            addCriterion("MajorOrganizationID <>", value, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidGreaterThan(Integer value) {
            addCriterion("MajorOrganizationID >", value, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("MajorOrganizationID >=", value, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidLessThan(Integer value) {
            addCriterion("MajorOrganizationID <", value, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidLessThanOrEqualTo(Integer value) {
            addCriterion("MajorOrganizationID <=", value, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidIn(List<Integer> values) {
            addCriterion("MajorOrganizationID in", values, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidNotIn(List<Integer> values) {
            addCriterion("MajorOrganizationID not in", values, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidBetween(Integer value1, Integer value2) {
            addCriterion("MajorOrganizationID between", value1, value2, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andMajororganizationidNotBetween(Integer value1, Integer value2) {
            addCriterion("MajorOrganizationID not between", value1, value2, "majororganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidIsNull() {
            addCriterion("OtherOrganizationID is null");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidIsNotNull() {
            addCriterion("OtherOrganizationID is not null");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidEqualTo(Integer value) {
            addCriterion("OtherOrganizationID =", value, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidNotEqualTo(Integer value) {
            addCriterion("OtherOrganizationID <>", value, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidGreaterThan(Integer value) {
            addCriterion("OtherOrganizationID >", value, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("OtherOrganizationID >=", value, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidLessThan(Integer value) {
            addCriterion("OtherOrganizationID <", value, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidLessThanOrEqualTo(Integer value) {
            addCriterion("OtherOrganizationID <=", value, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidIn(List<Integer> values) {
            addCriterion("OtherOrganizationID in", values, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidNotIn(List<Integer> values) {
            addCriterion("OtherOrganizationID not in", values, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidBetween(Integer value1, Integer value2) {
            addCriterion("OtherOrganizationID between", value1, value2, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andOtherorganizationidNotBetween(Integer value1, Integer value2) {
            addCriterion("OtherOrganizationID not between", value1, value2, "otherorganizationid");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditIsNull() {
            addCriterion("ExpGainCredit is null");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditIsNotNull() {
            addCriterion("ExpGainCredit is not null");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditEqualTo(Short value) {
            addCriterion("ExpGainCredit =", value, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditNotEqualTo(Short value) {
            addCriterion("ExpGainCredit <>", value, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditGreaterThan(Short value) {
            addCriterion("ExpGainCredit >", value, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditGreaterThanOrEqualTo(Short value) {
            addCriterion("ExpGainCredit >=", value, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditLessThan(Short value) {
            addCriterion("ExpGainCredit <", value, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditLessThanOrEqualTo(Short value) {
            addCriterion("ExpGainCredit <=", value, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditIn(List<Short> values) {
            addCriterion("ExpGainCredit in", values, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditNotIn(List<Short> values) {
            addCriterion("ExpGainCredit not in", values, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditBetween(Short value1, Short value2) {
            addCriterion("ExpGainCredit between", value1, value2, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andExpgaincreditNotBetween(Short value1, Short value2) {
            addCriterion("ExpGainCredit not between", value1, value2, "expgaincredit");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlIsNull() {
            addCriterion("ClientSoftwareUpdateURL is null");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlIsNotNull() {
            addCriterion("ClientSoftwareUpdateURL is not null");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlEqualTo(String value) {
            addCriterion("ClientSoftwareUpdateURL =", value, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlNotEqualTo(String value) {
            addCriterion("ClientSoftwareUpdateURL <>", value, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlGreaterThan(String value) {
            addCriterion("ClientSoftwareUpdateURL >", value, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlGreaterThanOrEqualTo(String value) {
            addCriterion("ClientSoftwareUpdateURL >=", value, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlLessThan(String value) {
            addCriterion("ClientSoftwareUpdateURL <", value, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlLessThanOrEqualTo(String value) {
            addCriterion("ClientSoftwareUpdateURL <=", value, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlLike(String value) {
            addCriterion("ClientSoftwareUpdateURL like", value, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlNotLike(String value) {
            addCriterion("ClientSoftwareUpdateURL not like", value, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlIn(List<String> values) {
            addCriterion("ClientSoftwareUpdateURL in", values, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlNotIn(List<String> values) {
            addCriterion("ClientSoftwareUpdateURL not in", values, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlBetween(String value1, String value2) {
            addCriterion("ClientSoftwareUpdateURL between", value1, value2, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareupdateurlNotBetween(String value1, String value2) {
            addCriterion("ClientSoftwareUpdateURL not between", value1, value2, "clientsoftwareupdateurl");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateIsNull() {
            addCriterion("ClientSoftwareAutoUpdate is null");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateIsNotNull() {
            addCriterion("ClientSoftwareAutoUpdate is not null");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateEqualTo(Byte value) {
            addCriterion("ClientSoftwareAutoUpdate =", value, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateNotEqualTo(Byte value) {
            addCriterion("ClientSoftwareAutoUpdate <>", value, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateGreaterThan(Byte value) {
            addCriterion("ClientSoftwareAutoUpdate >", value, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateGreaterThanOrEqualTo(Byte value) {
            addCriterion("ClientSoftwareAutoUpdate >=", value, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateLessThan(Byte value) {
            addCriterion("ClientSoftwareAutoUpdate <", value, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateLessThanOrEqualTo(Byte value) {
            addCriterion("ClientSoftwareAutoUpdate <=", value, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateIn(List<Byte> values) {
            addCriterion("ClientSoftwareAutoUpdate in", values, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateNotIn(List<Byte> values) {
            addCriterion("ClientSoftwareAutoUpdate not in", values, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateBetween(Byte value1, Byte value2) {
            addCriterion("ClientSoftwareAutoUpdate between", value1, value2, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andClientsoftwareautoupdateNotBetween(Byte value1, Byte value2) {
            addCriterion("ClientSoftwareAutoUpdate not between", value1, value2, "clientsoftwareautoupdate");
            return (Criteria) this;
        }

        public Criteria andVerifydiffIsNull() {
            addCriterion("verifydiff is null");
            return (Criteria) this;
        }

        public Criteria andVerifydiffIsNotNull() {
            addCriterion("verifydiff is not null");
            return (Criteria) this;
        }

        public Criteria andVerifydiffEqualTo(Integer value) {
            addCriterion("verifydiff =", value, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffNotEqualTo(Integer value) {
            addCriterion("verifydiff <>", value, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffGreaterThan(Integer value) {
            addCriterion("verifydiff >", value, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffGreaterThanOrEqualTo(Integer value) {
            addCriterion("verifydiff >=", value, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffLessThan(Integer value) {
            addCriterion("verifydiff <", value, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffLessThanOrEqualTo(Integer value) {
            addCriterion("verifydiff <=", value, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffIn(List<Integer> values) {
            addCriterion("verifydiff in", values, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffNotIn(List<Integer> values) {
            addCriterion("verifydiff not in", values, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffBetween(Integer value1, Integer value2) {
            addCriterion("verifydiff between", value1, value2, "verifydiff");
            return (Criteria) this;
        }

        public Criteria andVerifydiffNotBetween(Integer value1, Integer value2) {
            addCriterion("verifydiff not between", value1, value2, "verifydiff");
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