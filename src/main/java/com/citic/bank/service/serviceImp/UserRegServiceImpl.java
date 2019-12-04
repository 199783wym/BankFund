package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.UserMapper;
import com.citic.bank.model.User;
import com.citic.bank.service.UserRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRegServiceImpl implements UserRegService {

    @Autowired(required = false)
    UserMapper userMapper;

    @Override
    public int regist(User user) {
        return userMapper.insert(user);
    }
}
