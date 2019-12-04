package com.citic.bank.service;

import com.citic.bank.model.CollectExtend;
import com.citic.bank.model.PersonalWealth;
import com.citic.bank.model.TradeExtend;

import java.util.List;

public interface PersonalWealthService {
    List<PersonalWealth> getPersonalWealthById(String id);

    List<TradeExtend> getHistoryTrade(String id);

    List<CollectExtend> getCollectList(String id);
}//Of PersonalWealthService
