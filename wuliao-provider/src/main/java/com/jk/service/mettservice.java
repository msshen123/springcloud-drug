package com.jk.service;

import com.jk.entity.kmeeting;

import java.util.List;

public interface mettservice {
    List<kmeeting> findq(kmeeting km);

    void delete(Integer id);

    void add(kmeeting po);

    kmeeting select(Integer id);
}
