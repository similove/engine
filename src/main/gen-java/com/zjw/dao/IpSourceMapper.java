package com.zjw.dao;

import com.zjw.model.IpSource;
import com.zjw.model.IpSourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IpSourceMapper {
    int countByExample(IpSourceExample example);

    int deleteByExample(IpSourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IpSource record);

    int insertSelective(IpSource record);

    List<IpSource> selectByExampleWithBLOBs(IpSourceExample example);

    List<IpSource> selectByExample(IpSourceExample example);

    IpSource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IpSource record, @Param("example") IpSourceExample example);

    int updateByExampleWithBLOBs(@Param("record") IpSource record, @Param("example") IpSourceExample example);

    int updateByExample(@Param("record") IpSource record, @Param("example") IpSourceExample example);

    int updateByPrimaryKeySelective(IpSource record);

    int updateByPrimaryKeyWithBLOBs(IpSource record);

    int updateByPrimaryKey(IpSource record);
}