package com.jk.service.Impl;

import com.jk.entity.activity;
import com.jk.mapper.activityMapper;
import com.jk.service.actservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class actserviceImpl implements actservice {
    @Resource
    private activityMapper activityMapper;

    @Override
    public List<activity> findq() {
        return activityMapper.findq();
    }

    @Override
    public void delete(Integer id) {
        activityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(activity po) {
        if (po.getActivityId() != null) {
            activityMapper.updateByPrimaryKey(po);
        } else {
            activityMapper.insert(po);
        }
    }

    @Override
    public activity select(Integer id) {
        return activityMapper.select(id);
    }
}
