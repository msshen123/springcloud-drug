package com.jk.controller;

import com.jk.entity.UserEntity;
import com.jk.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("find")
    public List<UserEntity> find(){
        return userService.find();
    }

    @RequestMapping("delete")
    public void delete(@RequestParam Integer userId){
        userService.delete(userId);
    }

    @RequestMapping("add")
    public void insert(@RequestBody UserEntity user){
        userService.insert(user);
    }

    @RequestMapping("huixian")
    public UserEntity selectId(@RequestParam Integer userId){
        return userService.selectId(userId);
    }
}
