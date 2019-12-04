package com.citic.bank.controller;

import com.citic.bank.model.User;
import com.citic.bank.service.UserRegService;
import com.citic.bank.util.Md5;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@Controller
public class UserController {

    public static String getRandomCode(String phone) {
        SimpleDateFormat simpleDateFormat;
        simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        String str = simpleDateFormat.format(date);
        return phone + str;// 当前时间
    }

    @Resource
    @Autowired
    private UserRegService userRegService;

    @RequestMapping("/toregPage")
    public String toRegist(){
        return "regPage.jsp";
    }

    //注册用户
    @RequestMapping(value = "/regPage")
    public String regist(@Param(value = "accountName") String accountName,
                      @Param(value = "accountPhone") String accountPhone,
                      @Param(value = "accountBankCard") String accountBankCard,
                      @Param(value = "accountIdenNumber") String accountIdenNumber,
                      @Param(value="accountPasswd") String accountPasswd){
        int message = 0;
        User user = new User();
        user.setAccountCode(getRandomCode(accountPhone.trim()));
        user.setAccountName(accountName.trim());
        user.setAccountPhone(accountPhone.trim());
        user.setBankCard(accountBankCard.trim());
        user.setIdenNumber(accountIdenNumber.trim());
        user.setAccountPwd(Md5.MD5(accountPasswd.replace(" ","").trim()));

        System.out.println(user.getAccountName());
        System.out.println(user.getAccountPwd());
        message =userRegService.regist(user);
        return "loginPage.jsp";
    }
}
