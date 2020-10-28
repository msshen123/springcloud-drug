package com.jk.service.Impl;

import com.jk.entity.JobEntity;
import com.jk.mapper.JobMapper;
import com.jk.service.JobService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Resource
    private JobMapper jobMapper;

    @Override
    public List<JobEntity> findPage(JobEntity job) {
        return jobMapper.findPage(job);
    }

    @Override
    public void getDelete(Integer jobId) {
        jobMapper.getDelete(jobId);
    }

    @Override
    public void getAdd(JobEntity job) {
        if(job.getJobId()!=null){
            jobMapper.getUpdate(job);
        }else{
            jobMapper.getAdd(job);
        }

    }

    @Override
    public JobEntity getHui(Integer jobId) {
        return jobMapper.getHui(jobId);
    }
}
