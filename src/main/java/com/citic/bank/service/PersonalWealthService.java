package com.citic.bank.service;

import com.citic.bank.model.PersonalWealth;
import com.citic.bank.model.Trade;

import java.util.List;

public interface PersonalWealthService {
    List<PersonalWealth> getPersonalWealthById(String id);
    List<Trade> getHistoryTrade(String id);

}//Of PersonalWealthService
