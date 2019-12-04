package com.citic.bank.service.serviceImp;

import com.citic.bank.dao.UserMapper;
import com.citic.bank.model.User;
import com.citic.bank.model.UserExample;
import com.citic.bank.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: ym
 * @Date: 2019/12/4 16:51
 * @Version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 登录操作
     * @param user
     * @return
     */
    @Override
    public User Login(User user) {
       UserExample userExample= new UserExample();
        userExample.createCriteria().andAccountPhoneEqualTo(user.getAccountPhone()).andAccountPwdEqualTo(user.getAccountPwd());
        List<User> users= userMapper.selectByExample(userExample);
        if(users.size()!=0){//如果user不为空
            user=users.get(0);
        }
        return user;
    }
}
