package com.jk.mapper;

import com.jk.entity.JobEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface JobMapper {

    List<JobEntity> findPage();

    void getDelete(Integer jobId);

    void getAdd(JobEntity job);

    JobEntity getHui(Integer jobId);

    void getUpdate(JobEntity job);
}
