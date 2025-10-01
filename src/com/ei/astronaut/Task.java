package com.ei.astronaut;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Task implements Comparable<Task> {
    public enum Priority { LOW, MEDIUM, HIGH }

    private final String id;
    private final String description;
    private final LocalTime start;
    private final LocalTime end;
    private final Priority priority;
    private boolean completed = false;

    private static final DateTimeFormatter TF = DateTimeFormatter.ofPattern("HH:mm");

    public Task(String id, String description, LocalTime start, LocalTime end, Priority priority) {
        if (!end.isAfter(start)) {
            throw new IllegalArgumentException("End time must be after start time!");
        }
        this.id = id;
        this.description = description;
        this.start = start;
        this.end = end;
        this.priority = priority;
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public LocalTime getStart() { return start; }
    public LocalTime getEnd() { return end; }
    public Priority getPriority() { return priority; }
    public boolean isCompleted() { return completed; }

    public void markCompleted() {
        completed = true;
    }

    @Override
    public int compareTo(Task other) {
        return this.start.compareTo(other.start);
    }

    @Override
    public String toString() {
        return String.format("[%s] %s | %s-%s | %s | %s",
                id,
                description,
                start.format(TF),
                end.format(TF),
                priority,
                completed ? "DONE" : "PENDING");
    }
}
