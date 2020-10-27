package com.jk.entity;

public class JobEntity {

    private Integer jobId;

    private String jobName;

    private String jobMemo;

    private String jobStatus;

    private String jobDate;

    public Integer getJobId() {
        return jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public String getJobMemo() {
        return jobMemo;
    }

    public String getJobStatus() {
        return jobStatus;
    }

    public String getJobDate() {
        return jobDate;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setJobMemo(String jobMemo) {
        this.jobMemo = jobMemo;
    }

    public void setJobStatus(String jobStatus) {
        this.jobStatus = jobStatus;
    }

    public void setJobDate(String jobDate) {
        this.jobDate = jobDate;
    }
}
