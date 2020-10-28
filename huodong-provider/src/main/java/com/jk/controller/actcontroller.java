package com.jk.controller;

import com.jk.entity.activity;
import com.jk.service.actservice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class actcontroller {

    @Resource
    private actservice actservice;

    @RequestMapping("findq")
    public List<activity> findq() {
        return actservice.findq();
    }

    @RequestMapping("delete")
    public void delete(@RequestParam Integer id) {
        actservice.delete(id);
    }

    @RequestMapping("add")
    public void add(@RequestBody activity po) {
        actservice.add(po);

    }

    @RequestMapping("select")
    public activity select(@RequestParam Integer id) {

        return actservice.select(id);
    }
}
