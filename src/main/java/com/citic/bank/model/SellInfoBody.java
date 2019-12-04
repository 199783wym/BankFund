package com.citic.bank.model;

public class SellInfoBody {

    private String account;
    private String fundCode;
    private double sellMoney;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getFundCode() {
        return fundCode;
    }

    public void setFundCode(String fundCode) {
        this.fundCode = fundCode;
    }

    public double getSellMoney() {
        return sellMoney;
    }

    public void setSellMoney(double sellMoney) {
        this.sellMoney = sellMoney;
    }

    @Override
    public String toString() {
        return "SellInfoBody{" +
                "account='" + account + '\'' +
                ", fundCode='" + fundCode + '\'' +
                ", sellMoney=" + sellMoney +
                '}';
    }
}//Of class sellInfoBody
