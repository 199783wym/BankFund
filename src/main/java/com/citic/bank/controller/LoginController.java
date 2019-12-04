package com.citic.bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ym
 * @Date: 2019/12/4 14:56
 * @Version 1.0
 */
@Controller
public class LoginController {

    @RequestMapping("/tologin")
    public String tologin(){
        return "loginPage.jsp";
    }

    @RequestMapping("/login")
    public String login(){
        return "index.jsp";
    }
}
