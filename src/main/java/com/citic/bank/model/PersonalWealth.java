package com.citic.bank.model;

public class PersonalWealth {
    private String fundName;
    private String fundNo;
    private String ownedWealth;
    private String lastWealth;
    private String interests;
    private String interestsRate;

    public String getInterestsRate() {
        return interestsRate;
    }

    public void setInterestsRate(double interestsRate) {
        this.interestsRate = String.format("%.2f",interestsRate);
    }

    public String getLastRate() {
        return lastRate;
    }

    public void setLastRate(double lastRate) {
        this.lastRate = String.format("%.2f",lastRate);
    }

    private String lastRate;

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundNo() {
        return fundNo;
    }

    public void setFundNo(String fundNo) {
        this.fundNo = fundNo;
    }

    public String getOwnedWealth() {
        return ownedWealth;
    }

    public void setOwnedWealth(double ownedWealth) {
        this.ownedWealth = String.format("%.2f",ownedWealth);
    }

    public String getLastWealth() {
        return lastWealth;
    }

    public void setLastWealth(double lastWealth) {
        this.lastWealth = String.format("%.2f",lastWealth);
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(double interests) {
        this.interests = String.format("%.2f",interests);
    }
}//Of PersonalWealth
