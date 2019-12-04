/**
 * @Author XXD
 */
package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.TradeMapper;
import com.citic.bank.dao.WealthMapper;
import com.citic.bank.model.Trade;
import com.citic.bank.model.Wealth;
import com.citic.bank.model.WealthExample;
import com.citic.bank.service.FundSellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FundSellServiceImp implements FundSellService {
    public static double price=1.234;

    @Autowired
    WealthMapper wealthMapper;
    @Autowired
    TradeMapper tradeMapper;

    @Override
    public boolean sellFund(String account, double money) {

        //Step1. Get the fund the people own
        List<Wealth> currentWealth=wealthMapper.selectByAccount(Long.parseLong(account));
        if (currentWealth == null || currentWealth.size() == 0) {
            return false;
        }//Of if, the case of the wrong number
        Wealth wealth=currentWealth.get(0);
        double share=money/price;
        if(share>wealth.getShare()||share<0){
            return false;
        }//Of if
        double currentShare=wealth.getShare()-share;
        wealth.setShare(currentShare);
        double currentMoney=wealth.getMoney()-money;
        wealth.setMoney(currentMoney);

        //Step2. Update the money
        WealthExample wealthExample=new WealthExample();
        wealthExample.createCriteria().andUidEqualTo(wealth.getUid()).andFidEqualTo(wealth.getFid());
        int status=wealthMapper.updateByExample(wealth,wealthExample);


        //Step3. Log the sell info to the order table
        Trade trade=new Trade();
        trade.setAccountCode(account);
        trade.setFundCode(wealth.getFid());
        trade.setDate(new Date());
        trade.setQuotient(String.format("-%.2f",share));
        trade.setTransactionValue(String.format("-%.2f",money));
        int insetStatus=tradeMapper.insert(trade);

        if(status==1 && insetStatus==1){
            return true;
        }//Of if
        return false;
    }//Of sellFund
}//Of class FundSellServiceImp
