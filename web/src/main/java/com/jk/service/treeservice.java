package com.jk.service;

import com.jk.entity.tbtree;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "tree-provider")
public interface treeservice {

    @RequestMapping("qfind")
    public List<tbtree> findtree();
}
