/**
 * @Author XXD
 */
package com.citic.bank.controller;

import com.citic.bank.model.*;
import com.citic.bank.service.FundInfo;
import com.citic.bank.service.PersonalWealthService;
import com.citic.bank.service.UserInfoUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("/personal")
public class IndividualCenterController {
    @Autowired
    private UserInfoUpdate userInfoUpdate;
    @Autowired
    private FundInfo fundInfo;

    @Autowired
    private PersonalWealthService personalWealthService;
//    @Autowired
//    private

    /**
     * The user info contain the data and fund user bought or others
     *
     * @return
     */
    @RequestMapping("")
    public String personal(HttpSession session, Model model) {
        String id = "1";
        //Step1. Get the user info
        try {
            id = (String) session.getAttribute("uid");

        } catch (Exception e) {
            System.out.println(e);
        }
        id = "1";
        //Step2. Get user info

        User userInfo = userInfoUpdate.getUserById(id);
        //The information of individual to show on the page
        HashMap<String, String> map = new HashMap<>();
        map.put("name", userInfo.getAccountName());
        map.put("phone", userInfo.getAccountPhone());
        map.put("bankCard", userInfo.getBankCard());
        map.put("id", userInfo.getIdenNumber());

        //Step2. Get owned funds
        List<PersonalWealth> allOwnedPersonalWealth = personalWealthService.getPersonalWealthById(id);

        model.addAllAttributes(map);


        //Step3. Get the history order
        List<TradeExtend> tradeList = personalWealthService.getHistoryTrade(userInfo.getAccountCode());

//        System.out.println(userInfo.getAccountCode());
//        for (TradeExtend tradeE:tradeList) {
//            System.out.println(tradeE);
//        }

        //Step4. Get the collect history
        List<CollectExtend> collectList = personalWealthService.getCollectList(userInfo.getAccountCode());
        model.addAttribute("wealthlist", allOwnedPersonalWealth);
        model.addAttribute("historylist", tradeList);
        model.addAttribute("collectlist", collectList);

        return "/individualcenter.jsp";

    }//Of personal

    @RequestMapping("/fund")
    @ResponseBody
    public List getFund() {
        List<User> allUsers = userInfoUpdate.showAllUsers();
        return allUsers;
    }//Of getFund


    @RequestMapping("/test")
    public String test() {
        return "/individualcenter.jsp";
    }//Of fun test
}//Of class IndividualCenterController
