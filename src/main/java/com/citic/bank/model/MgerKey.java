package com.citic.bank.model;

public class MgerKey {
    private Long id;

    private String mgerCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMgerCode() {
        return mgerCode;
    }

    public void setMgerCode(String mgerCode) {
        this.mgerCode = mgerCode == null ? null : mgerCode.trim();
    }
}