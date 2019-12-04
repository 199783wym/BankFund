package com.citic.bank.controller;

import com.citic.bank.model.Trade;
import com.citic.bank.service.ProductService;
import com.citic.bank.util.UserSession;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @Author: ym
 * @Date: 2019/12/4 13:16
 * @Version 1.0
 */
@Controller
public class BuyFundController {
     @Autowired
     private ProductService productService;

    /**
     * 买基金操作
     * @param productId
     * @param amount
     * @param model
     * @return
     */
    @RequestMapping("/buyFund")
    public String buyFund(@Param(value="productId")String productId,
                          @Param(value = "amount")String amount,
                          Model model){
        //查seeion
        if(UserSession.getUserSession()==null){//session不存在跳转页面提示
            model.addAttribute("success", "请先登录");
            return "successBuy.jsp";
        }
        //存在则进行数据库字段操作
         Trade trade= new Trade();
         trade.setAccountCode(UserSession.getUserSession().getAccountCode());
         trade.setFundCode(productId);
         trade.setDate(new Date());
         trade.setTransactionValue(amount);
         Double amountDouble= Double.parseDouble(amount);
         Double quo=amountDouble/1.234d;


         trade.setQuotient(String.format("%.2f",quo));
         int flag=productService.insert(trade);//存入交易目录 1成功 2失败
         if (flag==1){
             model.addAttribute("success", "购买成功");
         }else{
             model.addAttribute("success", "购买失败");
         }
         return "successBuy.jsp";
    }

}
