package com.jk.service;

import com.jk.entity.Ttree;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(value="user-provider")
public interface treeservice {


    @RequestMapping("qfind")
    public List<Ttree> findtree();

}
