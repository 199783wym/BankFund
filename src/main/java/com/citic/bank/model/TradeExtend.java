package com.citic.bank.model;

import java.text.SimpleDateFormat;

public class TradeExtend extends Trade {
    private String datestr;
    private String fundName;


    public TradeExtend(Trade trade, String name) {
        setFundName(name);
        setAccountCode(trade.getAccountCode());
        setDate(trade.getDate());
        setFundCode(trade.getFundCode());
        setId(trade.getId());
        setQuotient(trade.getQuotient());
        setTransactionValue(trade.getTransactionValue());
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        setDatestr(sdf.format(trade.getDate()));
    }//Of TradeExtend

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getDatestr() {
        return datestr;
    }

    public void setDatestr(String datestr) {
        this.datestr = datestr;
    }

    @Override
    public String toString() {
        return "TradeExtend{" +
                "fundName='" + fundName + '\'' +
                '}';
    }
}
