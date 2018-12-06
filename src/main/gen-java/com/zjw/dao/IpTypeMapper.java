package com.zjw.dao;

import com.zjw.model.IpType;
import com.zjw.model.IpTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpTypeMapper {
    int countByExample(IpTypeExample example);

    int deleteByExample(IpTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpType record);

    int insertSelective(IpType record);

    List<IpType> selectByExampleWithBLOBs(IpTypeExample example);

    List<IpType> selectByExample(IpTypeExample example);

    IpType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpType record, @Param("example") IpTypeExample example);

    int updateByExampleWithBLOBs(@Param("record") IpType record, @Param("example") IpTypeExample example);

    int updateByExample(@Param("record") IpType record, @Param("example") IpTypeExample example);

    int updateByPrimaryKeySelective(IpType record);

    int updateByPrimaryKeyWithBLOBs(IpType record);

    int updateByPrimaryKey(IpType record);
}