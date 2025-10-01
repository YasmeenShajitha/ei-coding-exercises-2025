package com.ei.astronaut;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.registerObserver(new ConflictObserver());

        Scanner sc = new Scanner(System.in);
        String option;

        System.out.println("🚀 Astronaut Daily Schedule Organizer");
        System.out.println("Commands: add, view, remove, complete, exit");

        while (true) {
            System.out.print("\nEnter command: ");
            option = sc.nextLine().trim().toLowerCase();

            switch (option) {
                case "add":
                    System.out.println("Format: <description>|<HH:mm>|<HH:mm>|<priority>");
                    String line = sc.nextLine();
                    String[] parts = line.split("\\|");
                    if (parts.length < 4) {
                        System.out.println("❌ Invalid format.");
                        break;
                    }
                    String id = UUID.randomUUID().toString().substring(0, 5);
                    Task t = TaskFactory.create(id, parts[0], parts[1], parts[2], parts[3]);
                    manager.addTask(t);
                    break;

                case "view":
                    manager.viewTasks();
                    break;

                case "remove":
                    System.out.print("Enter task id: ");
                    String rid = sc.nextLine();
                    manager.removeTask(rid);
                    break;

                case "complete":
                    System.out.print("Enter task id: ");
                    String cid = sc.nextLine();
                    manager.markCompleted(cid);
                    break;

                case "exit":
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("❌ Unknown command.");
            }
        }
    }
}
