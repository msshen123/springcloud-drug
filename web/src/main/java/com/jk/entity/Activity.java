package com.jk.entity;

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


}