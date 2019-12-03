package com.citic.bank.model;

public class Mger extends MgerKey {
    private String mgerName;

    private String companyName;

    private String mgerNumber;

    public String getMgerName() {
        return mgerName;
    }

    public void setMgerName(String mgerName) {
        this.mgerName = mgerName == null ? null : mgerName.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getMgerNumber() {
        return mgerNumber;
    }

    public void setMgerNumber(String mgerNumber) {
        this.mgerNumber = mgerNumber == null ? null : mgerNumber.trim();
    }
}