package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jump")
public class JumpController {
   //跳转登录页面
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    //跳转活动页面
    @RequestMapping("act")
    public String act(){
        return "admin/act";
    }
    //跳转树页面
    @RequestMapping("index")
    public String index(){
        return "admin/index";
    }
}
