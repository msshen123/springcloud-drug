package com.jk.service;

import com.jk.entity.User;
import com.jk.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class UserServiceImpl  implements  UserService{
    @Autowired
    private UserMapper userMapper;


    @Override
    public User findUserByUserCode(String usercode) {

        List<User> sysUserByUsercode= userMapper.findSysUserByUsercode(usercode);
        if(CollectionUtils.isEmpty(sysUserByUsercode)){

          return  null;
        }
        return sysUserByUsercode.get(0);
    }
}
