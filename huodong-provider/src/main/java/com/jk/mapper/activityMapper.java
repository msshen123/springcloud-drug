package com.jk.mapper;

import com.jk.entity.activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface activityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(activity po);

    int insertSelective(activity record);

    activity selectByPrimaryKey(Integer activityId);

    int updateByPrimaryKeySelective(activity record);

    int updateByPrimaryKey(activity po);

    List<activity> findq();

    activity select(Integer id);
}