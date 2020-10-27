package com.jk.entity;

import lombok.Data;

import java.util.Date;

@Data
public class activity {
    private Integer activityId;

    private String activityName;

    private String activityType;

    private Integer divisionId;

    private Integer departmentId;

    private Date startTime;

    private Date endTime;

    private Integer status;

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public void setDivisionId(Integer divisionId) {
        this.divisionId = divisionId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getActivityType() {
        return activityType;
    }

    public Integer getDivisionId() {
        return divisionId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Integer getStatus() {
        return status;
    }
}