---

 🚀 EI Coding Exercises 2025

This repository contains solutions for EI Round 1 problem statements, implemented in Java (without Maven) with clean folder structure and proper design patterns.
Each exercise is fully coded, tested, and organized for easy understanding.

---

 📂 Project Structure


ei-coding-exercises-2025/
 └── src/
     └── com/ei/
         ├── patterns/               Exercise 1 – Design Patterns
         │   ├── behavioral/
         │   │   ├── observer/       Observer Pattern
         │   │   └── strategy/       Strategy Pattern
         │   ├── creational/
         │   │   ├── singleton/      Singleton Pattern
         │   │   └── factory/        Factory Pattern
         │   └── structural/
         │       ├── adapter/        Adapter Pattern
         │       └── decorator/      Decorator Pattern
         └── astronaut/              Exercise 2 – Astronaut Daily Scheduler


---

 📝 Exercises

 1️⃣ Exercise 1 – Design Pattern Implementations

* Behavioral

  * Observer Pattern (Stock Price Notifier)
  * Strategy Pattern (Payment System)
* Creational

  * Singleton Pattern (Logger)
  * Factory Pattern (Shape Factory)
* Structural

  * Adapter Pattern (Audio Player supporting MP3/MP4)
  * Decorator Pattern (Coffee Customization)

👉 Each demo has a `*Demo.java` class with a runnable `main()` method.

---

 2️⃣ Exercise 2 – Astronaut Daily Schedule Organizer

A console-based scheduling system for astronauts with:

* Singleton – Central `ScheduleManager`
* Factory – `TaskFactory` for creating tasks
* Observer – `ConflictObserver` to detect overlapping tasks

Features:

* Add, view, remove, complete tasks
* Detect schedule conflicts
* Prioritize tasks (LOW / MEDIUM / HIGH)
* Clean CLI interface

---

 ⚡ How to Compile & Run

From project root:

 Compile All Sources


dir /s /b src\*.java > sources.txt
javac -d out @sources.txt


 Run Design Pattern Demos


java -cp out com.ei.patterns.behavioral.observer.ObserverDemo
java -cp out com.ei.patterns.behavioral.strategy.StrategyDemo
java -cp out com.ei.patterns.creational.singleton.SingletonDemo
java -cp out com.ei.patterns.creational.factory.FactoryDemo
java -cp out com.ei.patterns.structural.adapter.AdapterDemo
java -cp out com.ei.patterns.structural.decorator.DecoratorDemo


 Run Astronaut Scheduler


java -cp out com.ei.astronaut.Main


---

 ✅ Example Run (Astronaut Scheduler)


🚀 Astronaut Daily Schedule Organizer
Commands: add, view, remove, complete, exit

Enter command: add
Format: <description>|<HH:mm>|<HH:mm>|<priority>
Exercise|07:00|08:00|HIGH
✅ Task added successfully: Exercise

Enter command: view
[3a9f2] Exercise | 07:00-08:00 | HIGH | PENDING


---

 📌 Notes

* Built with Java 17+, no external dependencies (pure JDK).
* Hidden test cases expected → code is modular, extensible, and follows design pattern best practices.
* Each solution has been tested against normal and edge cases.









