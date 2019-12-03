package com.citic.bank.model;

import java.util.Date;

public class Trade {
    private Long id;

    private String accountName;

    private String fundCode;

    private String transactionValue;

    private String quotient;

    private Date date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode == null ? null : fundCode.trim();
    }

    public String getTransactionValue() {
        return transactionValue;
    }

    public void setTransactionValue(String transactionValue) {
        this.transactionValue = transactionValue == null ? null : transactionValue.trim();
    }

    public String getQuotient() {
        return quotient;
    }

    public void setQuotient(String quotient) {
        this.quotient = quotient == null ? null : quotient.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}