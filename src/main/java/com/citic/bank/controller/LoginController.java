package com.citic.bank.controller;

import com.citic.bank.dao.UserMapper;
import com.citic.bank.model.User;
import com.citic.bank.service.LoginService;
import com.citic.bank.util.Md5;
import com.citic.bank.util.UserSession;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: ym
 * @Date: 2019/12/4 14:56
 * @Version 1.0
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/tologin")
    public String tologin(){
        return "loginPage.jsp";
    }

    @RequestMapping("/login")
    public String login(@Param(value="number")String number,
                        @Param("password")String password,
                        Model model){
         User user=new User();
         user.setAccountPhone(number);
         user.setAccountPwd(Md5.MD5(password.replace(" ","").trim()));
         if(user.getId()!=null){
             UserSession.putUserSession(user);
         }else{
             model.addAttribute("success", "登录失败");
             return "successBuy.jsp";
         }
        return "index.jsp";
    }
}
