package com.jk.service;

import com.jk.entity.JobEntity;

import java.util.List;

public interface JobService {

    List<JobEntity> findPage(JobEntity job);

    void getDelete(Integer jobId);

    void getAdd(JobEntity job);

    JobEntity getHui(Integer jobId);
}
