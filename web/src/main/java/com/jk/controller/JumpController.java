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
}
