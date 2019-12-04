package com.citic.bank.model;

public class SellInfoBody {

    private String account;
    private String fundCode;
    private String sellMoney;

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

    public String getSellMoney() {
        return sellMoney;
    }

    public void setSellMoney(String sellMoney) {
        this.sellMoney = sellMoney;
    }
}//Of class sellInfoBody
