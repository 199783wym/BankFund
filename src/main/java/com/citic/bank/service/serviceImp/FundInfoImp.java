package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.TradeMapper;
import com.citic.bank.model.Trade;
import com.citic.bank.service.FundInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FundInfoImp implements FundInfo {
    @Autowired
    private TradeMapper tradeMapper;

    @Override
    public List<Trade> getAllTrade() {
        List result=null;//tradeMapper.getAllTrades();
        return result;
    }//Of fun getAllTrade

    @Override
    public Trade getById(String id) {
        return tradeMapper.selectByPrimaryKey(Long.parseLong(id));
    }
}
