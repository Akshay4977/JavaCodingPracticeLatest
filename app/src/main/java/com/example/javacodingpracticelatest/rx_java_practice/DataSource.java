package com.example.javacodingpracticelatest.rx_java_practice;

import java.util.ArrayList;
import java.util.List;

public class DataSource {

    public static List<Task> createTaskList() {
        List<Task> task = new ArrayList<>();
        task.add(new Task("task1", true));
        task.add(new Task("task2", false));
        task.add(new Task("task3", true));
        return task;
    }

}
