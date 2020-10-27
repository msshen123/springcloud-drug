package com.jk.userprovider.controller;

import com.jk.userprovider.entity.Ttree;
import com.jk.userprovider.service.treeservice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TreeController {

    @Resource
    private treeservice treeservice;

    @RequestMapping("qfind")
    public List<Ttree>findtree(){
        return treeservice.find();
    }
}
