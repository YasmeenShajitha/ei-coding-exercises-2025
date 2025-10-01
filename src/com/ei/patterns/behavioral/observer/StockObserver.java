package com.ei.patterns.behavioral.observer;

public class StockObserver implements Observer {
    private String name;

    public StockObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(float price) {
        System.out.println(name + " received update: Stock price is " + price);
    }
}
