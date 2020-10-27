package com.jk.userprovider.entity;

import lombok.Data;

import java.util.Date;
@Data
public class Activity {
    private Integer activityId;

    private String activityName;

    private String activityType;

    private Integer divisionId;

    private Integer departmentId;

    private Date startTime;

    private Date endTime;

    private Integer status;

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