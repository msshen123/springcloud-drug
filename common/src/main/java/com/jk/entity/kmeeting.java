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

    public void setMeetingId(Integer meetingId) {
        this.meetingId = meetingId;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public void setMeetingPlace(String meetingPlace) {
        this.meetingPlace = meetingPlace;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public void setMeetingStatus(Integer meetingStatus) {
        this.meetingStatus = meetingStatus;
    }

    public void setProductGroup(Integer productGroup) {
        this.productGroup = productGroup;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public String getMeetingPlace() {
        return meetingPlace;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public Integer getMeetingStatus() {
        return meetingStatus;
    }

    public Integer getProductGroup() {
        return productGroup;
    }
}