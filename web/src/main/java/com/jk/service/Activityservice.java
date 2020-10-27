package com.jk.service;

import com.jk.entity.Activity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value="user-provider")
public interface Activityservice {
    @RequestMapping("find")
    public List<Activity> find();

    @RequestMapping("delete")
    public void delete(@RequestParam Integer id);

    @RequestMapping("add")
    public void add(@RequestBody Activity po);

    @RequestMapping("select")
    public Activity select(@RequestParam Integer id);
}
