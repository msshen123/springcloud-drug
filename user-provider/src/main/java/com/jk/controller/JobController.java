package com.jk.controller;

import com.jk.entity.JobEntity;
import com.jk.service.JobService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("job")
public class JobController {

    @Resource
    private JobService jobService;

    @RequestMapping("findPage")
    public List<JobEntity> findPage(){
        return jobService.findPage();
    }

    @RequestMapping("del")
    public void getDelete(@RequestParam Integer jobId){
        jobService.getDelete(jobId);
    }

    @RequestMapping("insert")
    public void getAdd(@RequestBody JobEntity job){
        jobService.getAdd(job);
    }

    @RequestMapping("getHui")
    public JobEntity getHui(@RequestParam Integer jobId){
        return jobService.getHui(jobId);
    }
}
