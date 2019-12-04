package com.citic.bank.controller;

import com.citic.bank.model.SellInfoBody;
import com.citic.bank.service.Utils;
import com.citic.bank.util.UserSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SellFundController {
    @ResponseBody
    @RequestMapping("/fundSell")
    public String sellFund(@RequestBody SellInfoBody sellInfoBody){
        if(UserSession.getUserSession()==null){
            return "login";
        }//Of if


        return "success";
    }//Of sellFund
}//Of SellFundController
