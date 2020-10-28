package com.jk.service;

import com.jk.entity.JobEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "user")
public interface JobService {

    @RequestMapping("job/findPage")
    public List<JobEntity> findPage();

    @RequestMapping("job/del")
    public void getDelete(@RequestParam Integer jobId);

    @RequestMapping("job/insert")
    public void getAdd(@RequestBody JobEntity job);

    @RequestMapping("job/getHui")
    public JobEntity getHui(@RequestParam Integer jobId);
}
