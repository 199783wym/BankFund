package com.citic.bank.service;

import com.citic.bank.model.User;

import java.util.List;

public interface UserInfoUpdate {
    boolean updateUserInfo(User record);
    List<User> showAllUsers();
    User getUserById(String id);

}//Of interface UserInfoUpdate
