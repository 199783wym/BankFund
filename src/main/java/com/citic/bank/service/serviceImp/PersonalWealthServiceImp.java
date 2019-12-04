package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.ProductMapper;
import com.citic.bank.dao.TradeMapper;
import com.citic.bank.dao.WealthMapper;
import com.citic.bank.model.*;
import com.citic.bank.service.PersonalWealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PersonalWealthServiceImp implements PersonalWealthService {
    @Autowired
    WealthMapper wealthMapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    TradeMapper tradeMapper;

    @Override
    public List<PersonalWealth> getPersonalWealthById(String id) {
        //Convert id
        Long ID = Long.parseLong(id);

        //Case1. Have for a period of time
        WealthExample wealthExample = new WealthExample();
        wealthExample.createCriteria().andUidEqualTo(ID);
        List<Wealth> wealths = wealthMapper.selectByExample(wealthExample);
        Map<String, Wealth> wealthMap = new HashMap<>();

        //Case2. Partial of funds owned for a period of time


        //Case3. Bought last day

        /**
         * Get fund list for the person owned
         */
        ArrayList<String> fidList = new ArrayList();
        for (Wealth w : wealths) {
            fidList.add(w.getFid());
            wealthMap.put(w.getFid(), w);
        }//Of for

        /**
         * Get the fund info from the fund table
         */
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andFundCodeIn(fidList);
        List<Product> productList = productMapper.selectByExample(productExample);
        Map<String, Product> productMap = new HashMap<>();
        for (Product p : productList) {
            productMap.put(p.getFundCode(), p);
        }//Of for

        /**
         *Check for all orders
         */


        /**
         * Concat the info from the fund and value
         */
        List<PersonalWealth> personalWealthList = new ArrayList<>();
        for (String fid : fidList) {
            PersonalWealth personalWealth = new PersonalWealth();
            Product currentProduct = productMap.get(fid);
            Wealth currentWealth = wealthMap.get(fid);
            personalWealth.setFundName(currentProduct.getFundName());
            personalWealth.setFundNo(fid);
            personalWealth.setInterests(currentWealth.getMoney());
            personalWealth.setOwnedWealth(0);
            personalWealthList.add(personalWealth);
        }//Of for

        return personalWealthList;
    }

    @Override
    public List<Trade> getHistoryTrade(String accountCode) {

        TradeExample tradeExample=new TradeExample();
        tradeExample.createCriteria().andAccountCodeEqualTo(accountCode);
//        List<Trade> tradeList=tradeMapper
        return null;
    }//Of getHistoryTrade


}
