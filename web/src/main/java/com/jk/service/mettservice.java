package com.jk.service;

import com.jk.entity.kmeeting;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "wuliao-provider")
public interface mettservice {

    @RequestMapping("findq")
    public List<kmeeting> findq(@RequestBody kmeeting km);

    @RequestMapping("delete")
    public void delete(@RequestParam Integer id);

    @RequestMapping("add")
    public void add(@RequestBody kmeeting po);

    @RequestMapping("select")
    public kmeeting select(@RequestParam Integer id);
}
