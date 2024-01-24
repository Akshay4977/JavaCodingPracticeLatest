package com.example.javacodingpracticelatest.models;

import java.io.Serializable;

public class User implements Serializable {

    int userId;
    String userName;
    String userEmail;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
