package com.citic.bank.dao;

import com.citic.bank.model.User;
import com.citic.bank.model.UserExample;
import com.citic.bank.model.UserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
    int deleteByPrimaryKey(UserKey key);

    // 注册，插入全部字段
    int insert(User record);

    // 注册，插入部分字段
    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(UserKey key);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    @Select("select * from fund_account_info")
    List<User> selectAllUsers();
}