package com.jk.service.Impl;

import com.jk.entity.kmeeting;
import com.jk.mapper.kmeetingMapper;
import com.jk.service.mettservice;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class mettserviceImpl implements mettservice {
    @Resource
    private kmeetingMapper kmeetingMapper;

    @Override
    public List<kmeeting> findq(kmeeting km) {
        return kmeetingMapper.findq(km);

    }

    @Override
    public void delete(Integer id) {
        kmeetingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void add(kmeeting ke) {
        if (ke.getMeetingId() != null) {
            kmeetingMapper.updateByPrimaryKey(ke);
        } else {
            kmeetingMapper.insert(ke);
        }
    }

    @Override
    public kmeeting select(Integer id) {
        return kmeetingMapper.select(id);
    }
}
