package com.jk.controller;

import com.jk.entity.PageResult;
import com.jk.entity.kmaterials;
import com.jk.service.matservice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class matcontroller {
     @Resource
    private com.jk.service.matservice matservice;

    @RequestMapping("findpage")
    public PageResult find(@RequestParam(value="page",defaultValue = "1") Integer page,@RequestParam(value="rows",defaultValue = "10")Integer rows,kmaterials kma){
    return matservice.find(page,rows,kma);
}
}
