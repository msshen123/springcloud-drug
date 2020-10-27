package com.jk.mapper;

import com.jk.entity.kmeeting;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface kmeetingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(kmeeting ke);

    int insertSelective(kmeeting record);

    kmeeting selectByPrimaryKey(Integer meetingId);

    int updateByPrimaryKeySelective(kmeeting record);

    int updateByPrimaryKey(kmeeting ke);

    List<kmeeting> findq();

    kmeeting select(Integer id);
}