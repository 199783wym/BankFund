package com.citic.bank.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNull() {
            addCriterion("fund_code is null");
            return (Criteria) this;
        }

        public Criteria andFundCodeIsNotNull() {
            addCriterion("fund_code is not null");
            return (Criteria) this;
        }

        public Criteria andFundCodeEqualTo(String value) {
            addCriterion("fund_code =", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotEqualTo(String value) {
            addCriterion("fund_code <>", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThan(String value) {
            addCriterion("fund_code >", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_code >=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThan(String value) {
            addCriterion("fund_code <", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLessThanOrEqualTo(String value) {
            addCriterion("fund_code <=", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeLike(String value) {
            addCriterion("fund_code like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotLike(String value) {
            addCriterion("fund_code not like", value, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeIn(List<String> values) {
            addCriterion("fund_code in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotIn(List<String> values) {
            addCriterion("fund_code not in", values, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeBetween(String value1, String value2) {
            addCriterion("fund_code between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundCodeNotBetween(String value1, String value2) {
            addCriterion("fund_code not between", value1, value2, "fundCode");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNull() {
            addCriterion("fund_type is null");
            return (Criteria) this;
        }

        public Criteria andFundTypeIsNotNull() {
            addCriterion("fund_type is not null");
            return (Criteria) this;
        }

        public Criteria andFundTypeEqualTo(String value) {
            addCriterion("fund_type =", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotEqualTo(String value) {
            addCriterion("fund_type <>", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThan(String value) {
            addCriterion("fund_type >", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fund_type >=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThan(String value) {
            addCriterion("fund_type <", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLessThanOrEqualTo(String value) {
            addCriterion("fund_type <=", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeLike(String value) {
            addCriterion("fund_type like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotLike(String value) {
            addCriterion("fund_type not like", value, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeIn(List<String> values) {
            addCriterion("fund_type in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotIn(List<String> values) {
            addCriterion("fund_type not in", values, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeBetween(String value1, String value2) {
            addCriterion("fund_type between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundTypeNotBetween(String value1, String value2) {
            addCriterion("fund_type not between", value1, value2, "fundType");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNull() {
            addCriterion("fund_name is null");
            return (Criteria) this;
        }

        public Criteria andFundNameIsNotNull() {
            addCriterion("fund_name is not null");
            return (Criteria) this;
        }

        public Criteria andFundNameEqualTo(String value) {
            addCriterion("fund_name =", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotEqualTo(String value) {
            addCriterion("fund_name <>", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThan(String value) {
            addCriterion("fund_name >", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameGreaterThanOrEqualTo(String value) {
            addCriterion("fund_name >=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThan(String value) {
            addCriterion("fund_name <", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLessThanOrEqualTo(String value) {
            addCriterion("fund_name <=", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameLike(String value) {
            addCriterion("fund_name like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotLike(String value) {
            addCriterion("fund_name not like", value, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameIn(List<String> values) {
            addCriterion("fund_name in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotIn(List<String> values) {
            addCriterion("fund_name not in", values, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameBetween(String value1, String value2) {
            addCriterion("fund_name between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundNameNotBetween(String value1, String value2) {
            addCriterion("fund_name not between", value1, value2, "fundName");
            return (Criteria) this;
        }

        public Criteria andFundMgerIsNull() {
            addCriterion("fund_mger is null");
            return (Criteria) this;
        }

        public Criteria andFundMgerIsNotNull() {
            addCriterion("fund_mger is not null");
            return (Criteria) this;
        }

        public Criteria andFundMgerEqualTo(String value) {
            addCriterion("fund_mger =", value, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerNotEqualTo(String value) {
            addCriterion("fund_mger <>", value, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerGreaterThan(String value) {
            addCriterion("fund_mger >", value, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerGreaterThanOrEqualTo(String value) {
            addCriterion("fund_mger >=", value, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerLessThan(String value) {
            addCriterion("fund_mger <", value, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerLessThanOrEqualTo(String value) {
            addCriterion("fund_mger <=", value, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerLike(String value) {
            addCriterion("fund_mger like", value, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerNotLike(String value) {
            addCriterion("fund_mger not like", value, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerIn(List<String> values) {
            addCriterion("fund_mger in", values, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerNotIn(List<String> values) {
            addCriterion("fund_mger not in", values, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerBetween(String value1, String value2) {
            addCriterion("fund_mger between", value1, value2, "fundMger");
            return (Criteria) this;
        }

        public Criteria andFundMgerNotBetween(String value1, String value2) {
            addCriterion("fund_mger not between", value1, value2, "fundMger");
            return (Criteria) this;
        }

        public Criteria andCompyNameIsNull() {
            addCriterion("compy_name is null");
            return (Criteria) this;
        }

        public Criteria andCompyNameIsNotNull() {
            addCriterion("compy_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompyNameEqualTo(String value) {
            addCriterion("compy_name =", value, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameNotEqualTo(String value) {
            addCriterion("compy_name <>", value, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameGreaterThan(String value) {
            addCriterion("compy_name >", value, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameGreaterThanOrEqualTo(String value) {
            addCriterion("compy_name >=", value, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameLessThan(String value) {
            addCriterion("compy_name <", value, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameLessThanOrEqualTo(String value) {
            addCriterion("compy_name <=", value, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameLike(String value) {
            addCriterion("compy_name like", value, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameNotLike(String value) {
            addCriterion("compy_name not like", value, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameIn(List<String> values) {
            addCriterion("compy_name in", values, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameNotIn(List<String> values) {
            addCriterion("compy_name not in", values, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameBetween(String value1, String value2) {
            addCriterion("compy_name between", value1, value2, "compyName");
            return (Criteria) this;
        }

        public Criteria andCompyNameNotBetween(String value1, String value2) {
            addCriterion("compy_name not between", value1, value2, "compyName");
            return (Criteria) this;
        }

        public Criteria andFundStatusIsNull() {
            addCriterion("fund_status is null");
            return (Criteria) this;
        }

        public Criteria andFundStatusIsNotNull() {
            addCriterion("fund_status is not null");
            return (Criteria) this;
        }

        public Criteria andFundStatusEqualTo(String value) {
            addCriterion("fund_status =", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusNotEqualTo(String value) {
            addCriterion("fund_status <>", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusGreaterThan(String value) {
            addCriterion("fund_status >", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("fund_status >=", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusLessThan(String value) {
            addCriterion("fund_status <", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusLessThanOrEqualTo(String value) {
            addCriterion("fund_status <=", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusLike(String value) {
            addCriterion("fund_status like", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusNotLike(String value) {
            addCriterion("fund_status not like", value, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusIn(List<String> values) {
            addCriterion("fund_status in", values, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusNotIn(List<String> values) {
            addCriterion("fund_status not in", values, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusBetween(String value1, String value2) {
            addCriterion("fund_status between", value1, value2, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andFundStatusNotBetween(String value1, String value2) {
            addCriterion("fund_status not between", value1, value2, "fundStatus");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("risk_level is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("risk_level is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(String value) {
            addCriterion("risk_level =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(String value) {
            addCriterion("risk_level <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(String value) {
            addCriterion("risk_level >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(String value) {
            addCriterion("risk_level >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(String value) {
            addCriterion("risk_level <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(String value) {
            addCriterion("risk_level <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLike(String value) {
            addCriterion("risk_level like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotLike(String value) {
            addCriterion("risk_level not like", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<String> values) {
            addCriterion("risk_level in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<String> values) {
            addCriterion("risk_level not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(String value1, String value2) {
            addCriterion("risk_level between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(String value1, String value2) {
            addCriterion("risk_level not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andFundRatingIsNull() {
            addCriterion("fund_rating is null");
            return (Criteria) this;
        }

        public Criteria andFundRatingIsNotNull() {
            addCriterion("fund_rating is not null");
            return (Criteria) this;
        }

        public Criteria andFundRatingEqualTo(String value) {
            addCriterion("fund_rating =", value, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingNotEqualTo(String value) {
            addCriterion("fund_rating <>", value, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingGreaterThan(String value) {
            addCriterion("fund_rating >", value, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingGreaterThanOrEqualTo(String value) {
            addCriterion("fund_rating >=", value, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingLessThan(String value) {
            addCriterion("fund_rating <", value, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingLessThanOrEqualTo(String value) {
            addCriterion("fund_rating <=", value, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingLike(String value) {
            addCriterion("fund_rating like", value, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingNotLike(String value) {
            addCriterion("fund_rating not like", value, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingIn(List<String> values) {
            addCriterion("fund_rating in", values, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingNotIn(List<String> values) {
            addCriterion("fund_rating not in", values, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingBetween(String value1, String value2) {
            addCriterion("fund_rating between", value1, value2, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundRatingNotBetween(String value1, String value2) {
            addCriterion("fund_rating not between", value1, value2, "fundRating");
            return (Criteria) this;
        }

        public Criteria andFundScaleIsNull() {
            addCriterion("fund_scale is null");
            return (Criteria) this;
        }

        public Criteria andFundScaleIsNotNull() {
            addCriterion("fund_scale is not null");
            return (Criteria) this;
        }

        public Criteria andFundScaleEqualTo(String value) {
            addCriterion("fund_scale =", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleNotEqualTo(String value) {
            addCriterion("fund_scale <>", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleGreaterThan(String value) {
            addCriterion("fund_scale >", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleGreaterThanOrEqualTo(String value) {
            addCriterion("fund_scale >=", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleLessThan(String value) {
            addCriterion("fund_scale <", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleLessThanOrEqualTo(String value) {
            addCriterion("fund_scale <=", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleLike(String value) {
            addCriterion("fund_scale like", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleNotLike(String value) {
            addCriterion("fund_scale not like", value, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleIn(List<String> values) {
            addCriterion("fund_scale in", values, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleNotIn(List<String> values) {
            addCriterion("fund_scale not in", values, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleBetween(String value1, String value2) {
            addCriterion("fund_scale between", value1, value2, "fundScale");
            return (Criteria) this;
        }

        public Criteria andFundScaleNotBetween(String value1, String value2) {
            addCriterion("fund_scale not between", value1, value2, "fundScale");
            return (Criteria) this;
        }

        public Criteria andIssueOrganIsNull() {
            addCriterion("issue_organ is null");
            return (Criteria) this;
        }

        public Criteria andIssueOrganIsNotNull() {
            addCriterion("issue_organ is not null");
            return (Criteria) this;
        }

        public Criteria andIssueOrganEqualTo(String value) {
            addCriterion("issue_organ =", value, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganNotEqualTo(String value) {
            addCriterion("issue_organ <>", value, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganGreaterThan(String value) {
            addCriterion("issue_organ >", value, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganGreaterThanOrEqualTo(String value) {
            addCriterion("issue_organ >=", value, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganLessThan(String value) {
            addCriterion("issue_organ <", value, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganLessThanOrEqualTo(String value) {
            addCriterion("issue_organ <=", value, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganLike(String value) {
            addCriterion("issue_organ like", value, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganNotLike(String value) {
            addCriterion("issue_organ not like", value, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganIn(List<String> values) {
            addCriterion("issue_organ in", values, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganNotIn(List<String> values) {
            addCriterion("issue_organ not in", values, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganBetween(String value1, String value2) {
            addCriterion("issue_organ between", value1, value2, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andIssueOrganNotBetween(String value1, String value2) {
            addCriterion("issue_organ not between", value1, value2, "issueOrgan");
            return (Criteria) this;
        }

        public Criteria andGmtCreatIsNull() {
            addCriterion("gmt_creat is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatIsNotNull() {
            addCriterion("gmt_creat is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreatEqualTo(Date value) {
            addCriterion("gmt_creat =", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatNotEqualTo(Date value) {
            addCriterion("gmt_creat <>", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatGreaterThan(Date value) {
            addCriterion("gmt_creat >", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatGreaterThanOrEqualTo(Date value) {
            addCriterion("gmt_creat >=", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatLessThan(Date value) {
            addCriterion("gmt_creat <", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatLessThanOrEqualTo(Date value) {
            addCriterion("gmt_creat <=", value, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatIn(List<Date> values) {
            addCriterion("gmt_creat in", values, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatNotIn(List<Date> values) {
            addCriterion("gmt_creat not in", values, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatBetween(Date value1, Date value2) {
            addCriterion("gmt_creat between", value1, value2, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andGmtCreatNotBetween(Date value1, Date value2) {
            addCriterion("gmt_creat not between", value1, value2, "gmtCreat");
            return (Criteria) this;
        }

        public Criteria andYnIsNull() {
            addCriterion("yn is null");
            return (Criteria) this;
        }

        public Criteria andYnIsNotNull() {
            addCriterion("yn is not null");
            return (Criteria) this;
        }

        public Criteria andYnEqualTo(String value) {
            addCriterion("yn =", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotEqualTo(String value) {
            addCriterion("yn <>", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThan(String value) {
            addCriterion("yn >", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnGreaterThanOrEqualTo(String value) {
            addCriterion("yn >=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThan(String value) {
            addCriterion("yn <", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLessThanOrEqualTo(String value) {
            addCriterion("yn <=", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnLike(String value) {
            addCriterion("yn like", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotLike(String value) {
            addCriterion("yn not like", value, "yn");
            return (Criteria) this;
        }

        public Criteria andYnIn(List<String> values) {
            addCriterion("yn in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotIn(List<String> values) {
            addCriterion("yn not in", values, "yn");
            return (Criteria) this;
        }

        public Criteria andYnBetween(String value1, String value2) {
            addCriterion("yn between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andYnNotBetween(String value1, String value2) {
            addCriterion("yn not between", value1, value2, "yn");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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