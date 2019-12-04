package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.CollectMapper;
import com.citic.bank.dao.ProductMapper;
import com.citic.bank.dao.TradeMapper;
import com.citic.bank.dao.WealthMapper;
import com.citic.bank.model.*;
import com.citic.bank.service.PersonalWealthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PersonalWealthServiceImp implements PersonalWealthService {
    @Autowired
    WealthMapper wealthMapper;

    @Autowired
    ProductMapper productMapper;

    @Autowired
    TradeMapper tradeMapper;

    @Autowired
    CollectMapper collectMapper;

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
            double interestsRate=(Math.random()/10-0.05);

            PersonalWealth personalWealth = new PersonalWealth();
            Product currentProduct = productMap.get(fid);
            Wealth currentWealth = wealthMap.get(fid);
            personalWealth.setFundName(currentProduct.getFundName());
            personalWealth.setFundNo(fid);
            personalWealth.setInterests(currentWealth.getMoney()*(0.22+interestsRate));
            personalWealth.setOwnedWealth(currentWealth.getMoney());
            personalWealth.setInterestsRate(0.22+interestsRate);
            personalWealth.setLastRate(interestsRate);
            personalWealth.setLastWealth(currentWealth.getMoney()*interestsRate);
            personalWealthList.add(personalWealth);
        }//Of for

        return personalWealthList;
    }

    @Override
    public List<TradeExtend> getHistoryTrade(String accountCode) {

        TradeExample tradeExample = new TradeExample();
        tradeExample.createCriteria().andAccountCodeEqualTo(accountCode);

        List<Trade> tradeList = tradeMapper.selectByExample(tradeExample);
        /**
         * Concat the fund number and the fund name
         */
        Set<String> hashSet = new HashSet<>();
        for (Trade t : tradeList) {
            hashSet.add(t.getFundCode());
        }//Of for

        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andFundCodeIn(new ArrayList<String>(hashSet));
        List<Product> productList = productMapper.selectByExample(productExample);
        HashMap<String, String> maps = new HashMap<>();
        for (Product p : productList) {
            maps.put(p.getFundCode(), p.getFundName());
        }//Of for

        ArrayList<TradeExtend> tradeExtends = new ArrayList<>();
        for (Trade t : tradeList) {
            TradeExtend current = new TradeExtend(t, maps.get(t.getFundCode()));
            tradeExtends.add(current);
        }//Of for

        return tradeExtends;

    }//Of getHistoryTrade

    @Override
    public List<CollectExtend> getCollectList(String account) {
        CollectExample collectExample = new CollectExample();
        collectExample.createCriteria().andAccountCodeEqualTo(account);
        List<Collect> collectList = collectMapper.selectByExample(collectExample);

        /**
         * Concat the fund number and the fund name
         */
        Set<String> hashSet = new HashSet<>();
        for (Collect t : collectList) {
            hashSet.add(t.getFundCode());
        }//Of for

        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andFundCodeIn(new ArrayList<String>(hashSet));
        List<Product> productList = productMapper.selectByExample(productExample);
        HashMap<String, String> maps = new HashMap<>();
        for (Product p : productList) {
            maps.put(p.getFundCode(), p.getFundName());
        }//Of for

        ArrayList<CollectExtend> collectExtends = new ArrayList<>();
        for (Collect collect : collectList) {
            double interestsRate=(Math.random()/10-0.05);
            CollectExtend current = new CollectExtend(collect, maps.get(collect.getFundCode()),interestsRate);
            collectExtends.add(current);
        }//Of for



        return collectExtends;
    }//Of getCollectList


}
