package com.ei.patterns.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("Application started...");
        logger.log("Performing some operation...");
    }
}
