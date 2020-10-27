package com.jk.service;

import com.jk.entity.UserEntity;

import java.util.List;

public interface UserService {


    List<UserEntity> find();

    void delete(Integer userId);

    void insert(UserEntity user);

    UserEntity selectId(Integer userId);
}
