package com.citic.bank.model;

import java.util.ArrayList;
import java.util.List;

public class CompyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompyExample() {
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

        public Criteria andCompyCodeIsNull() {
            addCriterion("compy_code is null");
            return (Criteria) this;
        }

        public Criteria andCompyCodeIsNotNull() {
            addCriterion("compy_code is not null");
            return (Criteria) this;
        }

        public Criteria andCompyCodeEqualTo(String value) {
            addCriterion("compy_code =", value, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeNotEqualTo(String value) {
            addCriterion("compy_code <>", value, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeGreaterThan(String value) {
            addCriterion("compy_code >", value, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("compy_code >=", value, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeLessThan(String value) {
            addCriterion("compy_code <", value, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeLessThanOrEqualTo(String value) {
            addCriterion("compy_code <=", value, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeLike(String value) {
            addCriterion("compy_code like", value, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeNotLike(String value) {
            addCriterion("compy_code not like", value, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeIn(List<String> values) {
            addCriterion("compy_code in", values, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeNotIn(List<String> values) {
            addCriterion("compy_code not in", values, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeBetween(String value1, String value2) {
            addCriterion("compy_code between", value1, value2, "compyCode");
            return (Criteria) this;
        }

        public Criteria andCompyCodeNotBetween(String value1, String value2) {
            addCriterion("compy_code not between", value1, value2, "compyCode");
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

        public Criteria andRepresenNameIsNull() {
            addCriterion("represen_name is null");
            return (Criteria) this;
        }

        public Criteria andRepresenNameIsNotNull() {
            addCriterion("represen_name is not null");
            return (Criteria) this;
        }

        public Criteria andRepresenNameEqualTo(String value) {
            addCriterion("represen_name =", value, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameNotEqualTo(String value) {
            addCriterion("represen_name <>", value, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameGreaterThan(String value) {
            addCriterion("represen_name >", value, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameGreaterThanOrEqualTo(String value) {
            addCriterion("represen_name >=", value, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameLessThan(String value) {
            addCriterion("represen_name <", value, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameLessThanOrEqualTo(String value) {
            addCriterion("represen_name <=", value, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameLike(String value) {
            addCriterion("represen_name like", value, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameNotLike(String value) {
            addCriterion("represen_name not like", value, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameIn(List<String> values) {
            addCriterion("represen_name in", values, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameNotIn(List<String> values) {
            addCriterion("represen_name not in", values, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameBetween(String value1, String value2) {
            addCriterion("represen_name between", value1, value2, "represenName");
            return (Criteria) this;
        }

        public Criteria andRepresenNameNotBetween(String value1, String value2) {
            addCriterion("represen_name not between", value1, value2, "represenName");
            return (Criteria) this;
        }

        public Criteria andCompyAddrIsNull() {
            addCriterion("compy_addr is null");
            return (Criteria) this;
        }

        public Criteria andCompyAddrIsNotNull() {
            addCriterion("compy_addr is not null");
            return (Criteria) this;
        }

        public Criteria andCompyAddrEqualTo(String value) {
            addCriterion("compy_addr =", value, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrNotEqualTo(String value) {
            addCriterion("compy_addr <>", value, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrGreaterThan(String value) {
            addCriterion("compy_addr >", value, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrGreaterThanOrEqualTo(String value) {
            addCriterion("compy_addr >=", value, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrLessThan(String value) {
            addCriterion("compy_addr <", value, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrLessThanOrEqualTo(String value) {
            addCriterion("compy_addr <=", value, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrLike(String value) {
            addCriterion("compy_addr like", value, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrNotLike(String value) {
            addCriterion("compy_addr not like", value, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrIn(List<String> values) {
            addCriterion("compy_addr in", values, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrNotIn(List<String> values) {
            addCriterion("compy_addr not in", values, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrBetween(String value1, String value2) {
            addCriterion("compy_addr between", value1, value2, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyAddrNotBetween(String value1, String value2) {
            addCriterion("compy_addr not between", value1, value2, "compyAddr");
            return (Criteria) this;
        }

        public Criteria andCompyNumberIsNull() {
            addCriterion("compy_number is null");
            return (Criteria) this;
        }

        public Criteria andCompyNumberIsNotNull() {
            addCriterion("compy_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompyNumberEqualTo(String value) {
            addCriterion("compy_number =", value, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberNotEqualTo(String value) {
            addCriterion("compy_number <>", value, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberGreaterThan(String value) {
            addCriterion("compy_number >", value, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberGreaterThanOrEqualTo(String value) {
            addCriterion("compy_number >=", value, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberLessThan(String value) {
            addCriterion("compy_number <", value, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberLessThanOrEqualTo(String value) {
            addCriterion("compy_number <=", value, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberLike(String value) {
            addCriterion("compy_number like", value, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberNotLike(String value) {
            addCriterion("compy_number not like", value, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberIn(List<String> values) {
            addCriterion("compy_number in", values, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberNotIn(List<String> values) {
            addCriterion("compy_number not in", values, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberBetween(String value1, String value2) {
            addCriterion("compy_number between", value1, value2, "compyNumber");
            return (Criteria) this;
        }

        public Criteria andCompyNumberNotBetween(String value1, String value2) {
            addCriterion("compy_number not between", value1, value2, "compyNumber");
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