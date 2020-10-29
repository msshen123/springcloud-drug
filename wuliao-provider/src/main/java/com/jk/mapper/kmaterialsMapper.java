package com.jk.mapper;

import com.jk.entity.kmaterials;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface kmaterialsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(kmaterials record);

    int insertSelective(kmaterials record);

    kmaterials selectByPrimaryKey(Integer materialsId);

    int updateByPrimaryKeySelective(kmaterials record);

    int updateByPrimaryKey(kmaterials record);


    List<kmaterials> findpage(Integer page, Integer rows, kmaterials kma);

    Long count(kmaterials kma);
}