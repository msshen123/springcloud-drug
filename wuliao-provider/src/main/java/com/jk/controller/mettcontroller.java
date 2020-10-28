package com.jk.controller;

import com.jk.entity.kmeeting;
import com.jk.service.mettservice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class mettcontroller {
    @Resource
    private mettservice mettservice;

    @RequestMapping("findq")
    public List<kmeeting> findq(@RequestBody kmeeting km) {
        return mettservice.findq(km);
    }

    @RequestMapping("delete")
    public void delete(@RequestParam Integer id) {
        mettservice.delete(id);
    }

    @RequestMapping("add")
    public void add(@RequestBody kmeeting po) {
        mettservice.add(po);

    }

    @RequestMapping("select")
    public kmeeting select(@RequestParam Integer id) {

        return mettservice.select(id);
    }
}
