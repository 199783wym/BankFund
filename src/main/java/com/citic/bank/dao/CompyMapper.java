package com.citic.bank.dao;

import com.citic.bank.model.Compy;
import com.citic.bank.model.CompyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Compy record);

    int insertSelective(Compy record);

    List<Compy> selectByExample(CompyExample example);

    Compy selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Compy record, @Param("example") CompyExample example);

    int updateByExample(@Param("record") Compy record, @Param("example") CompyExample example);

    int updateByPrimaryKeySelective(Compy record);

    int updateByPrimaryKey(Compy record);
}