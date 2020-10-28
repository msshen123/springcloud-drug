package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.kmaterials;
import com.jk.service.matservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("mat")
public class matcontroller {
@Resource
    private matservice matservice;
@RequestMapping("findpage")
    @ResponseBody
    public PageResult findpage(Integer page,Integer rows,kmaterials kma){
    return matservice.find(page,rows,kma);
}
}
