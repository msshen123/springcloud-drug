package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.kmaterials;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
@FeignClient("wuliao-provider")
public interface matservice {
    @RequestMapping("findpage")
    public PageResult find(@RequestParam(value="page",defaultValue = "1") Integer page,@RequestParam(value="rows",defaultValue = "10")Integer rows,kmaterials kma);

}
