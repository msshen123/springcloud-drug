package com.jk.service;

import com.jk.entity.activity;

import java.util.List;

public interface actservice {
    List<activity> findq();

    void delete(Integer id);

    void add(activity po);

    activity select(Integer id);
}
