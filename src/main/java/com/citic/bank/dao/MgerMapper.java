package com.citic.bank.dao;

import com.citic.bank.model.Mger;
import com.citic.bank.model.MgerExample;
import com.citic.bank.model.MgerKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MgerMapper {
    int deleteByPrimaryKey(MgerKey key);

    int insert(Mger record);

    int insertSelective(Mger record);

    List<Mger> selectByExample(MgerExample example);

    Mger selectByPrimaryKey(MgerKey key);

    int updateByExampleSelective(@Param("record") Mger record, @Param("example") MgerExample example);

    int updateByExample(@Param("record") Mger record, @Param("example") MgerExample example);

    int updateByPrimaryKeySelective(Mger record);

    int updateByPrimaryKey(Mger record);
}