package com.example.myfirstapplication;

import com.google.gson.annotations.SerializedName;

import java.security.SecureRandom;

public class DataModel {

    @SerializedName("userId")
    int userId;

    @SerializedName("id")
    int id;

    @SerializedName("title")
    String title;

    @SerializedName("body")
    String body;


    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }


}
