package com.ei.astronaut;

import java.util.*;

public class ScheduleManager {
    private static ScheduleManager instance; // Singleton
    private final List<Task> tasks = new ArrayList<>();
    private final List<ScheduleObserver> observers = new ArrayList<>();

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void registerObserver(ScheduleObserver observer) {
        observers.add(observer);
    }

    public void addTask(Task task) {
        for (Task existing : tasks) {
            if (task.getStart().isBefore(existing.getEnd()) &&
                existing.getStart().isBefore(task.getEnd())) {
                notifyConflict(task, existing);
                return;
            }
        }
        tasks.add(task);
        Collections.sort(tasks);
        notifyAdded(task);
    }

    public void removeTask(String id) {
        tasks.removeIf(t -> t.getId().equals(id));
        System.out.println("Task removed: " + id);
    }

    public void markCompleted(String id) {
        for (Task t : tasks) {
            if (t.getId().equals(id)) {
                t.markCompleted();
                System.out.println("Task marked complete: " + id);
            }
        }
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks scheduled today.");
        } else {
            tasks.forEach(System.out::println);
        }
    }

    private void notifyConflict(Task newTask, Task existing) {
        for (ScheduleObserver obs : observers) {
            obs.onConflict(newTask, existing);
        }
    }

    private void notifyAdded(Task task) {
        for (ScheduleObserver obs : observers) {
            obs.onAdded(task);
        }
    }
}
