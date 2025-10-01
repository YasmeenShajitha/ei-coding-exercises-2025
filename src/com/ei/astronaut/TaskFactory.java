package com.ei.astronaut;

import java.time.LocalTime;

public class TaskFactory {
    public static Task create(String id, String description, String startStr, String endStr, String priorityStr) {
        LocalTime start = LocalTime.parse(startStr);
        LocalTime end = LocalTime.parse(endStr);

        Task.Priority priority;
        try {
            priority = Task.Priority.valueOf(priorityStr.toUpperCase());
        } catch (Exception e) {
            priority = Task.Priority.MEDIUM; // default
        }
        return new Task(id, description, start, end, priority);
    }
}
