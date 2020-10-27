package com.jk.userprovider.controller;

import com.jk.userprovider.entity.Activity;
import com.jk.userprovider.service.Activityservice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController

public class ActivityController {

    @Resource
    private Activityservice Activityservice;

@RequestMapping("find")
    public List<Activity> find(){
    return Activityservice.find();
}
    @RequestMapping("delete")
    public void delete(@RequestParam Integer id){
        Activityservice.delete(id);
    }
    @RequestMapping("add")
    public void add(@RequestBody Activity po){
        Activityservice.add(po);

    }
    @RequestMapping("select")
    public Activity select(@RequestParam Integer id){

        return Activityservice.select(id);
    }

}
