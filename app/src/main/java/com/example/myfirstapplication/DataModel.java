package com.example.myfirstapplication;

import java.security.SecureRandom;

public class DataModel {

    private int userId;

    private int id;

    private String title;

    private boolean completed;

    public int getUserId() {
        return userId;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }
}
