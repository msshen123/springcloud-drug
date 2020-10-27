package com.jk.controller;

import com.jk.entity.tbtree;
import com.jk.service.tbservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class tbcontroller {
@Resource
    private tbservice tbservice;

    @RequestMapping("qfind")
    public List<tbtree> findtree(){
        return tbservice.find();
    }
}
