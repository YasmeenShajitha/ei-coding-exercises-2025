package com.ei.astronaut;

public interface ScheduleObserver {
    void onConflict(Task newTask, Task existingTask);
    void onAdded(Task addedTask);
}
