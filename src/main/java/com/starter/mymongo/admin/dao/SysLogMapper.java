package com.starter.mymongo.admin.dao;

import com.starter.mymongo.admin.model.SysLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysLog record);

    int insertSelective(SysLog record);

    SysLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLog record);

    int updateByPrimaryKey(SysLog record);
}