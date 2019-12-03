package com.citic.bank.model;

import java.util.ArrayList;
import java.util.List;

public class MgerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgerExample() {
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

        public Criteria andMgerCodeIsNull() {
            addCriterion("mger_code is null");
            return (Criteria) this;
        }

        public Criteria andMgerCodeIsNotNull() {
            addCriterion("mger_code is not null");
            return (Criteria) this;
        }

        public Criteria andMgerCodeEqualTo(String value) {
            addCriterion("mger_code =", value, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeNotEqualTo(String value) {
            addCriterion("mger_code <>", value, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeGreaterThan(String value) {
            addCriterion("mger_code >", value, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("mger_code >=", value, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeLessThan(String value) {
            addCriterion("mger_code <", value, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeLessThanOrEqualTo(String value) {
            addCriterion("mger_code <=", value, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeLike(String value) {
            addCriterion("mger_code like", value, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeNotLike(String value) {
            addCriterion("mger_code not like", value, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeIn(List<String> values) {
            addCriterion("mger_code in", values, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeNotIn(List<String> values) {
            addCriterion("mger_code not in", values, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeBetween(String value1, String value2) {
            addCriterion("mger_code between", value1, value2, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerCodeNotBetween(String value1, String value2) {
            addCriterion("mger_code not between", value1, value2, "mgerCode");
            return (Criteria) this;
        }

        public Criteria andMgerNameIsNull() {
            addCriterion("mger_name is null");
            return (Criteria) this;
        }

        public Criteria andMgerNameIsNotNull() {
            addCriterion("mger_name is not null");
            return (Criteria) this;
        }

        public Criteria andMgerNameEqualTo(String value) {
            addCriterion("mger_name =", value, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameNotEqualTo(String value) {
            addCriterion("mger_name <>", value, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameGreaterThan(String value) {
            addCriterion("mger_name >", value, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameGreaterThanOrEqualTo(String value) {
            addCriterion("mger_name >=", value, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameLessThan(String value) {
            addCriterion("mger_name <", value, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameLessThanOrEqualTo(String value) {
            addCriterion("mger_name <=", value, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameLike(String value) {
            addCriterion("mger_name like", value, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameNotLike(String value) {
            addCriterion("mger_name not like", value, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameIn(List<String> values) {
            addCriterion("mger_name in", values, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameNotIn(List<String> values) {
            addCriterion("mger_name not in", values, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameBetween(String value1, String value2) {
            addCriterion("mger_name between", value1, value2, "mgerName");
            return (Criteria) this;
        }

        public Criteria andMgerNameNotBetween(String value1, String value2) {
            addCriterion("mger_name not between", value1, value2, "mgerName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andMgerNumberIsNull() {
            addCriterion("mger_number is null");
            return (Criteria) this;
        }

        public Criteria andMgerNumberIsNotNull() {
            addCriterion("mger_number is not null");
            return (Criteria) this;
        }

        public Criteria andMgerNumberEqualTo(String value) {
            addCriterion("mger_number =", value, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberNotEqualTo(String value) {
            addCriterion("mger_number <>", value, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberGreaterThan(String value) {
            addCriterion("mger_number >", value, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("mger_number >=", value, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberLessThan(String value) {
            addCriterion("mger_number <", value, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberLessThanOrEqualTo(String value) {
            addCriterion("mger_number <=", value, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberLike(String value) {
            addCriterion("mger_number like", value, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberNotLike(String value) {
            addCriterion("mger_number not like", value, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberIn(List<String> values) {
            addCriterion("mger_number in", values, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberNotIn(List<String> values) {
            addCriterion("mger_number not in", values, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberBetween(String value1, String value2) {
            addCriterion("mger_number between", value1, value2, "mgerNumber");
            return (Criteria) this;
        }

        public Criteria andMgerNumberNotBetween(String value1, String value2) {
            addCriterion("mger_number not between", value1, value2, "mgerNumber");
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