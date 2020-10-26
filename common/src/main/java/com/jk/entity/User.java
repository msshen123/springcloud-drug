package com.jk.entity;

import lombok.Data;

@Data
public class User {
    private Integer id;

    private String userCode;

    private String userName;

    private String password;

    private String salt;

    private String locked;

    public Integer getId() {
        return id;
    }

    public String getUserCode() {
        return userCode;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getSalt() {
        return salt;
    }

    public String getLocked() {
        return locked;
    }
}