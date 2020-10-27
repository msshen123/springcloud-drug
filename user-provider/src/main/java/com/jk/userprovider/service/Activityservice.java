package com.jk.userprovider.service;

import com.jk.userprovider.entity.Activity;

import java.util.List;

public interface Activityservice {
    List<Activity> find();

    void delete(Integer id);

    void add(Activity po);

    Activity select(Integer id);
}
