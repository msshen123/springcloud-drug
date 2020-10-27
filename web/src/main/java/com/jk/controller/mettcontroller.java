package com.jk.controller;

import com.jk.entity.kmeeting;
import com.jk.service.mettservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("mett")
public class mettcontroller {

@Resource
    private mettservice mettservice;

@RequestMapping("findq")
    @ResponseBody
    public List<kmeeting>findq(){
    return mettservice.findq();
}
    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id){
        mettservice.delete(id);
    }
    @RequestMapping("add")
    @ResponseBody
    public void add(kmeeting po){
        mettservice.add(po);
    }
    @RequestMapping("huixian")
    @ResponseBody
    public kmeeting select(Integer id){
        return mettservice.select(id);
    }
}
