package com.ei.astronaut;

public class ConflictObserver implements ScheduleObserver {
    @Override
    public void onConflict(Task newTask, Task existingTask) {
        System.out.println("⚠ Conflict: Task '" + newTask.getDescription() +
                "' overlaps with '" + existingTask.getDescription() + "'");
    }

    @Override
    public void onAdded(Task addedTask) {
        System.out.println("✅ Task added successfully: " + addedTask.getDescription());
    }
}
