package com.jk.controller;

import com.jk.entity.Activity;
import com.jk.service.Activityservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("act")
public class ActivityController {

@Resource
    private Activityservice Activityservice;

  @RequestMapping("find")
   @ResponseBody
    public List<Activity> find(){
    return Activityservice.find();
}
    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id){
        Activityservice.delete(id);
    }
    @RequestMapping("add")
    @ResponseBody
    public void add(Activity po){
        Activityservice.add(po);
    }
    @RequestMapping("huixian")
    @ResponseBody
    public Activity select(Integer id){
        return Activityservice.select(id);
    }

}
