package com.example.javacodingpracticelatest.rx_java_practice;

public class Task {
    private String description;
    private boolean isComplete;

    public Task(String description, boolean isComplete) {
        this.description = description;
        this.isComplete = isComplete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
