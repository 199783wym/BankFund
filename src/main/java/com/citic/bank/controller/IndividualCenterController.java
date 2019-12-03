/**
 * @Author XXD
 */
package com.citic.bank.controller;

import com.citic.bank.model.User;
import com.citic.bank.service.UserInfoUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/personal")
public class IndividualCenterController {
    @Autowired
    private UserInfoUpdate userInfoUpdate;

    @RequestMapping("")
    public String personal() {
        return "personal";
    }//Of personal

    @RequestMapping("/fund")
    @ResponseBody
    public List getFund() {
        List<User> allUsers = userInfoUpdate.showAllUsers();
        return allUsers;
    }//Of getFund

}//Of class IndividualCenterController
