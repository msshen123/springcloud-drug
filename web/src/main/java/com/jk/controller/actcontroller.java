package com.jk.controller;

import com.jk.entity.activity;
import com.jk.service.actservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("act")
public class actcontroller {
    @Resource
    private actservice actservice;

    @RequestMapping("findq")
    @ResponseBody
    public List<activity> findq(activity km) {
        return actservice.findq(km);
    }

    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id) {
        actservice.delete(id);
    }

    @RequestMapping("add")
    @ResponseBody
    public void add(activity po) {
        actservice.add(po);
    }

    @RequestMapping("huixian")
    @ResponseBody
    public activity select(Integer id) {
        return actservice.select(id);
    }
}
