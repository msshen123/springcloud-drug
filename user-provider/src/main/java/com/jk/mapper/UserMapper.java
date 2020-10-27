package com.jk.mapper;

import com.jk.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserEntity> find();

    void delete(Integer userId);

    void insert(UserEntity user);

    UserEntity selectId(Integer userId);

    void update(UserEntity user);
}
