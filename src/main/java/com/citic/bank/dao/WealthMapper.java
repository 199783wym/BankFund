package com.citic.bank.dao;

import com.citic.bank.model.Wealth;
import com.citic.bank.model.WealthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WealthMapper {
    int insert(Wealth record);

    int insertSelective(Wealth record);

    List<Wealth> selectByExample(WealthExample example);

    int updateByExampleSelective(@Param("record") Wealth record, @Param("example") WealthExample example);

    int updateByExample(@Param("record") Wealth record, @Param("example") WealthExample example);
}