package com.citic.bank.service;

import com.citic.bank.model.Trade;

import java.util.List;

public interface FundInfo {
    List<Trade> getAllTrade();
    Trade getById(String id);
}//Of interface FundInfo
