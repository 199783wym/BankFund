package com.citic.bank.controller;

import com.citic.bank.model.SellInfoBody;
import com.citic.bank.service.FundSellService;
import com.citic.bank.service.Utils;
import com.citic.bank.util.UserSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SellFundController {
    @Autowired
    private FundSellService fundSellService;

    @ResponseBody
    @RequestMapping(value = "/fundSell",method = RequestMethod.POST)
    public String sellFund(@RequestBody SellInfoBody sellInfoBody){
        System.out.println(sellInfoBody);

        if(UserSession.getUserSession()==null){
            return "login";
        }//Of if
//        String account=sellInfoBody.getAccount();
        String account=UserSession.getUserSession().getAccountCode();
        double money=sellInfoBody.getSellMoney();
        if(!fundSellService.sellFund(account,money)){
            return "fail";
        }
        return "success";
    }//Of sellFund
}//Of SellFundController
