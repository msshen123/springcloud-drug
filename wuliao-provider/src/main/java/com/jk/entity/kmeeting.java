package com.jk.entity;

import lombok.Data;

import java.util.Date;
@Data
public class kmeeting {
    private Integer meetingId;

    private String meetingName;

    private String meetingPlace;

    private Date meetingDate;

    private Integer meetingStatus;

    private Integer productGroup;

    public Integer getMeetingId() {
        return meetingId;
    }
}