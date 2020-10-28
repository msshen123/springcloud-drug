package com.jk.service;

import com.jk.entity.activity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("huodong-provider")
public interface actservice {


    @RequestMapping("findq")
    public List<activity> findq(@RequestBody activity km);

    @RequestMapping("delete")
    public void delete(@RequestParam Integer id);

    @RequestMapping("add")
    public void add(@RequestBody activity po);

    @RequestMapping("select")
    public activity select(@RequestParam Integer id);
}
