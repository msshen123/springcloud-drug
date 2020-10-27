package com.jk.mapper;

import com.jk.entity.tbtree;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface tbtreeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(tbtree record);

    int insertSelective(tbtree record);

    tbtree selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(tbtree record);

    int updateByPrimaryKey(tbtree record);

    List<tbtree> find(int pid);
}