package com.jk.userprovider.mapper;

import com.jk.userprovider.entity.Activity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ActivityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Activity po);

    int insertSelective(Activity record);

    Activity selectByPrimaryKey(Integer activityId);

    int updateByPrimaryKeySelective(Activity record);

    int updateByPrimaryKey(Activity po);

    List<Activity> find();

    Activity select(Integer id);
}