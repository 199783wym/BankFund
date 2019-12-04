package com.citic.bank.dao;

import com.citic.bank.model.User;
import com.citic.bank.model.UserExample;
import com.citic.bank.model.UserKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Mapper
@Repository
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

    @Select("select * from fund_account_info where id=#{id}")
    User selectById(@Param("id") Long id);

    @Select("select * from fund_account_info where account_code=#{accountCode}")
    User selectByAccout(@Param("accountCode") String accountCode);

}