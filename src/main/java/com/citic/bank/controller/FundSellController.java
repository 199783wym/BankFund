/**
 * @Author XXD
 *
 */
package com.citic.bank.controller;

import com.citic.bank.model.Trade;
import com.citic.bank.service.FundInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/fund")
public class FundSellController {
    @Autowired
    private FundInfo fundInfo;

    @ResponseBody
    @RequestMapping("/all")
    public List<Trade> getHistory(){
        return fundInfo.getAllTrade();
    }//Of getHistory

    @ResponseBody
    @RequestMapping("/test")
    public String getByid(){
        return "";
    }//Of getByid


}//Of class FundSellController
