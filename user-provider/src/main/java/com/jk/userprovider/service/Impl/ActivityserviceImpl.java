package com.jk.userprovider.service.Impl;

import com.jk.userprovider.entity.Activity;
import com.jk.userprovider.mapper.ActivityMapper;
import com.jk.userprovider.service.Activityservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ActivityserviceImpl implements Activityservice {

    @Resource
    private ActivityMapper ActivityMapper;
    @Override
    public List<Activity> find() {
        return ActivityMapper.find();
    }

    @Override
    public void delete(Integer id) {
        ActivityMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(Activity po) {
        if(po.getActivityId()!=null){
            ActivityMapper.updateByPrimaryKey(po);
        }else{
            ActivityMapper.insert(po);
        }
    }

    @Override
    public Activity select(Integer id) {
        return ActivityMapper.select(id);
    }
}
