package com.citic.bank.model;

public class Compy {
    private Long id;

    private String compyCode;

    private String compyName;

    private String represenName;

    private String compyAddr;

    private String compyNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompyCode() {
        return compyCode;
    }

    public void setCompyCode(String compyCode) {
        this.compyCode = compyCode == null ? null : compyCode.trim();
    }

    public String getCompyName() {
        return compyName;
    }

    public void setCompyName(String compyName) {
        this.compyName = compyName == null ? null : compyName.trim();
    }

    public String getRepresenName() {
        return represenName;
    }

    public void setRepresenName(String represenName) {
        this.represenName = represenName == null ? null : represenName.trim();
    }

    public String getCompyAddr() {
        return compyAddr;
    }

    public void setCompyAddr(String compyAddr) {
        this.compyAddr = compyAddr == null ? null : compyAddr.trim();
    }

    public String getCompyNumber() {
        return compyNumber;
    }

    public void setCompyNumber(String compyNumber) {
        this.compyNumber = compyNumber == null ? null : compyNumber.trim();
    }
}