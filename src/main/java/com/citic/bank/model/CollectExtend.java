package com.citic.bank.model;

import java.text.SimpleDateFormat;

public class CollectExtend extends Collect {
    private String fundName;
    private String dateStr;

    public CollectExtend(Collect collect, String name){
        setFundName(name);
        setAccountCode(collect.getAccountCode());
        setFundCode(collect.getFundCode());
        setId(collect.getId());
        setCollectDate(collect.getCollectDate());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        setDateStr(sdf.format(collect.getCollectDate()));
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
