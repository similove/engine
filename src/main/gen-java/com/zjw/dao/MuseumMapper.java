package com.zjw.dao;

import com.zjw.model.Museum;
import com.zjw.model.MuseumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MuseumMapper {
    int countByExample(MuseumExample example);

    int deleteByExample(MuseumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Museum record);

    int insertSelective(Museum record);

    List<Museum> selectByExample(MuseumExample example);

    Museum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Museum record, @Param("example") MuseumExample example);

    int updateByExample(@Param("record") Museum record, @Param("example") MuseumExample example);

    int updateByPrimaryKeySelective(Museum record);

    int updateByPrimaryKey(Museum record);
}