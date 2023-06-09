package com.sample.pojo;

public class ResponseObj {

    private final int id;
    private final String description;

    public ResponseObj(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
