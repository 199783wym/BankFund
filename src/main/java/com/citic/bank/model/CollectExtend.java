package com.citic.bank.model;

import java.text.SimpleDateFormat;

public class CollectExtend extends Collect {
    private String fundName;
    private String dateStr;
    private String lastRate;

    public CollectExtend(Collect collect, String name,double lastRate){
        setFundName(name);
        setAccountCode(collect.getAccountCode());
        setFundCode(collect.getFundCode());
        setId(collect.getId());
        setCollectDate(collect.getCollectDate());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        setDateStr(sdf.format(collect.getCollectDate()));
        setLastRate(String.format("%.2f",lastRate));
    }

    public String getLastRate() {
        return lastRate;
    }

    public void setLastRate(String lastRate) {
        this.lastRate = lastRate;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getDateStr() {
        return dateStr;
    }

    public void setDateStr(String dateStr) {
        this.dateStr = dateStr;
    }
}
