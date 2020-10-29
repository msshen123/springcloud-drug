package com.jk.service;

import com.jk.entity.PageResult;
import com.jk.entity.kmaterials;

import java.util.List;

public interface matservice {
    PageResult find(Integer page, Integer rows, kmaterials kma);

    void deleteBrand(Integer id);
}
