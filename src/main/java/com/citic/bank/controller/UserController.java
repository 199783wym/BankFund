package com.citic.bank.controller;

import com.citic.bank.model.User;
import com.citic.bank.service.UserRegService;
import com.citic.bank.util.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class UserController {

    @Autowired
    UserRegService userRegService;


    //注册用户
    @RequestMapping(value = "/regPage", method = RequestMethod.POST)
    @ResponseBody
    public int regist(@RequestParam(value = "accountName", required = false) String accountName,
                      @RequestParam(value = "accountPhone", required = false) String accountPhone,
                      @RequestParam(value = "accountBankCard", required = false) String accountBankCard,
                      @RequestParam(value = "accountIdenNumber", required = false) String accountIdenNumber,
                      @RequestParam(value = "accountPasswd", required = false) String accountPasswd){
        User user = new User();
        user.setAccountName(accountName.trim());
        user.setAccountPhone(accountPhone.trim());
        user.setBankCard(accountBankCard.trim());
        user.setIdenNumber(accountIdenNumber.trim());
        user.setAccountPwd(Md5.MD5(accountPasswd.replace(" ","").trim()));

        System.out.println(user.getAccountName());
        System.out.println(user.getAccountPwd());

        if (userRegService.regist(user) > 0){

        }

        return 1;
    }
}
