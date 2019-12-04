package com.citic.bank.model;

public class User extends UserKey {
    private String accountName;

    private String accountPwd;

    private String accountPhone;

    private String bankCard;

    private String idenNumber;

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getAccountPwd() {
        return accountPwd;
    }

    public void setAccountPwd(String accountPwd) {
        this.accountPwd = accountPwd == null ? null : accountPwd.trim();
    }

    public String getAccountPhone() {
        return accountPhone;
    }

    public void setAccountPhone(String accountPhone) {
        this.accountPhone = accountPhone == null ? null : accountPhone.trim();
    }

    public String getBankCard() {
        return bankCard;
    }

    public void setBankCard(String bankCard) {
        this.bankCard = bankCard == null ? null : bankCard.trim();
    }

    public String getIdenNumber() {
        return idenNumber;
    }

    public void setIdenNumber(String idenNumber) {
        this.idenNumber = idenNumber == null ? null : idenNumber.trim();
    }

    @Override
    public String toString() {
        return "User{" +
                "accountName='" + accountName + '\'' +
                ", accountPwd='" + accountPwd + '\'' +
                ", accountPhone='" + accountPhone + '\'' +
                ", bankCard='" + bankCard + '\'' +
                ", idenNumber='" + idenNumber + '\'' +
                '}';
    }
}