package com.citic.bank.controller;

import com.citic.bank.model.User;
import com.citic.bank.util.Md5;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class UserController {

    //判断是否已经登录
    public boolean isLogin(User user){
        return false;
    }

    //注册用户
    @RequestMapping(value = "UserUpdateImp", method = RequestMethod.POST)
    @ResponseBody
    public int registerUser(User user){
        String passwdByMd5 = Md5.MD5(user.getAccountPwd());

        return 0;
    }
}
