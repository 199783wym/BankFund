package com.citic.bank.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andAccountCodeIsNull() {
            addCriterion("account_code is null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIsNotNull() {
            addCriterion("account_code is not null");
            return (Criteria) this;
        }

        public Criteria andAccountCodeEqualTo(String value) {
            addCriterion("account_code =", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotEqualTo(String value) {
            addCriterion("account_code <>", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThan(String value) {
            addCriterion("account_code >", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeGreaterThanOrEqualTo(String value) {
            addCriterion("account_code >=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThan(String value) {
            addCriterion("account_code <", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLessThanOrEqualTo(String value) {
            addCriterion("account_code <=", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeLike(String value) {
            addCriterion("account_code like", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotLike(String value) {
            addCriterion("account_code not like", value, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeIn(List<String> values) {
            addCriterion("account_code in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotIn(List<String> values) {
            addCriterion("account_code not in", values, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeBetween(String value1, String value2) {
            addCriterion("account_code between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountCodeNotBetween(String value1, String value2) {
            addCriterion("account_code not between", value1, value2, "accountCode");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountPwdIsNull() {
            addCriterion("account_pwd is null");
            return (Criteria) this;
        }

        public Criteria andAccountPwdIsNotNull() {
            addCriterion("account_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPwdEqualTo(String value) {
            addCriterion("account_pwd =", value, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdNotEqualTo(String value) {
            addCriterion("account_pwd <>", value, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdGreaterThan(String value) {
            addCriterion("account_pwd >", value, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdGreaterThanOrEqualTo(String value) {
            addCriterion("account_pwd >=", value, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdLessThan(String value) {
            addCriterion("account_pwd <", value, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdLessThanOrEqualTo(String value) {
            addCriterion("account_pwd <=", value, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdLike(String value) {
            addCriterion("account_pwd like", value, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdNotLike(String value) {
            addCriterion("account_pwd not like", value, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdIn(List<String> values) {
            addCriterion("account_pwd in", values, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdNotIn(List<String> values) {
            addCriterion("account_pwd not in", values, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdBetween(String value1, String value2) {
            addCriterion("account_pwd between", value1, value2, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPwdNotBetween(String value1, String value2) {
            addCriterion("account_pwd not between", value1, value2, "accountPwd");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneIsNull() {
            addCriterion("account_phone is null");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneIsNotNull() {
            addCriterion("account_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneEqualTo(String value) {
            addCriterion("account_phone =", value, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneNotEqualTo(String value) {
            addCriterion("account_phone <>", value, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneGreaterThan(String value) {
            addCriterion("account_phone >", value, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("account_phone >=", value, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneLessThan(String value) {
            addCriterion("account_phone <", value, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneLessThanOrEqualTo(String value) {
            addCriterion("account_phone <=", value, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneLike(String value) {
            addCriterion("account_phone like", value, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneNotLike(String value) {
            addCriterion("account_phone not like", value, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneIn(List<String> values) {
            addCriterion("account_phone in", values, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneNotIn(List<String> values) {
            addCriterion("account_phone not in", values, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneBetween(String value1, String value2) {
            addCriterion("account_phone between", value1, value2, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andAccountPhoneNotBetween(String value1, String value2) {
            addCriterion("account_phone not between", value1, value2, "accountPhone");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andIdenNumberIsNull() {
            addCriterion("iden_number is null");
            return (Criteria) this;
        }

        public Criteria andIdenNumberIsNotNull() {
            addCriterion("iden_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdenNumberEqualTo(String value) {
            addCriterion("iden_number =", value, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberNotEqualTo(String value) {
            addCriterion("iden_number <>", value, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberGreaterThan(String value) {
            addCriterion("iden_number >", value, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberGreaterThanOrEqualTo(String value) {
            addCriterion("iden_number >=", value, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberLessThan(String value) {
            addCriterion("iden_number <", value, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberLessThanOrEqualTo(String value) {
            addCriterion("iden_number <=", value, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberLike(String value) {
            addCriterion("iden_number like", value, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberNotLike(String value) {
            addCriterion("iden_number not like", value, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberIn(List<String> values) {
            addCriterion("iden_number in", values, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberNotIn(List<String> values) {
            addCriterion("iden_number not in", values, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberBetween(String value1, String value2) {
            addCriterion("iden_number between", value1, value2, "idenNumber");
            return (Criteria) this;
        }

        public Criteria andIdenNumberNotBetween(String value1, String value2) {
            addCriterion("iden_number not between", value1, value2, "idenNumber");
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