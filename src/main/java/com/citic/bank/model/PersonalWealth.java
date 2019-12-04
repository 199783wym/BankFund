package com.citic.bank.model;

public class PersonalWealth {
    private String fundName;
    private String fundNo;
    private double ownedWealth;
    private double lastWealth;
    private double interests;


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

    public double getOwnedWealth() {
        return ownedWealth;
    }

    public void setOwnedWealth(double ownedWealth) {
        this.ownedWealth = ownedWealth;
    }

    public double getLastWealth() {
        return lastWealth;
    }

    public void setLastWealth(double lastWealth) {
        this.lastWealth = lastWealth;
    }

    public double getInterests() {
        return interests;
    }

    public void setInterests(double interests) {
        this.interests = interests;
    }
}//Of PersonalWealth
