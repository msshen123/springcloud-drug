package com.jk.service;

import com.jk.entity.UserEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user")
public interface UserService {

    @RequestMapping("user/find")
    public List<UserEntity> find(@RequestBody UserEntity user);

    @RequestMapping("user/delete")
    public void delete(@RequestParam Integer userId);

    @RequestMapping("user/add")
    public void insert(@RequestBody UserEntity user);

    @RequestMapping("user/huixian")
    public UserEntity selectId(@RequestParam Integer userId);
}
