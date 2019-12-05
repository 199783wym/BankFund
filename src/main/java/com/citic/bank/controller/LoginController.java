package com.citic.bank.controller;

import com.citic.bank.dao.UserMapper;
import com.citic.bank.dto.ProductDTO;
import com.citic.bank.model.User;
import com.citic.bank.service.LoginService;
import com.citic.bank.service.ProductService;
import com.citic.bank.util.Md5;
import com.citic.bank.util.UserSession;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/12/4 14:56
 * @Version 1.0
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    @Autowired
    private ProductService productService;

    /**
     * 跳转至登录页面
     * @return
     */

    @RequestMapping("/tologin")
    public String tologin(){
        return "loginPage.jsp";
    }

    /**
     * 登录操作
     * @param number
     * @param password
     * @param model
     * @return
     */

    @RequestMapping("/login")
    public String login(@Param(value = "number") String number,
                        @Param(value = "password") String password,
                        Model model, HttpServletRequest request){
         User user=new User();
         user.setAccountPhone(number);
         user.setAccountPwd(Md5.MD5(password.replace(" ","").trim()));
        user = loginService.Login(user);
        List<ProductDTO> productList1= productService.queryProductAll();
        Collections.sort(productList1,new Comparator<ProductDTO>() {
            @Override
            public int compare(ProductDTO p1, ProductDTO p2) {
                if(p1.getDay()< p2.getDay()){
                    return 1;
                }
                if(p1.getDay() == p2.getDay()){
                    return 0;
                }
                return -1;
            }
        });
        model.addAttribute("productList6", productList1);
         if(user.getId()!=null){//如果查到了id代表有该用户 则存入session
             UserSession.putUserSession(user);
             HttpSession session = request.getSession();
             session.setAttribute("islogin",number);
         }else{//失败跳转到登录失败
             model.addAttribute("success", "登录失败");
             return "successBuy.jsp";
         }
        return "index.jsp";
    }
}
