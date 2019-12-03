package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.UserMapper;
import com.citic.bank.model.User;
import com.citic.bank.service.UserInfoUpdate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserUpdateImp implements UserInfoUpdate {
    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean updateUserInfo(User record) {
        return false;
    }//Of updateUserInfo

    @Override
    public List<User> showAllUsers() {

        return null;
    }
}//Of class UserUpdateImp
