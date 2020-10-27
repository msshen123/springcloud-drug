package com.jk.userprovider.mapper;

import com.jk.userprovider.entity.Ttree;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TtreeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(Ttree record);

    int insertSelective(Ttree record);

    Ttree selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(Ttree record);

    int updateByPrimaryKey(Ttree record);

    List<Ttree> find(int pid);
}