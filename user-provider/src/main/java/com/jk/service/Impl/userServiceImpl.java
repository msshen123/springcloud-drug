package com.jk.service.Impl;

import com.jk.entity.UserEntity;
import com.jk.mapper.UserMapper;
import com.jk.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<UserEntity> find() {
        return userMapper.find();
    }

    @Override
    public void delete(Integer userId) {
        userMapper.delete(userId);
    }

    @Override
    public void insert(UserEntity user) {
        if(user.getUserId()!=null){
            userMapper.update(user);
        }
        userMapper.insert(user);
    }

    @Override
    public UserEntity selectId(Integer userId) {
        return userMapper.selectId(userId);
    }
}
