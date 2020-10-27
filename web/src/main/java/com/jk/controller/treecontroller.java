package com.jk.controller;

import com.jk.entity.Ttree;
import com.jk.service.treeservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("tree")
public class treecontroller {
@Resource
    private treeservice treeservice;

@RequestMapping("findtree")
@ResponseBody
    public List<Ttree>findtree(){
    return treeservice.findtree();
}


}
