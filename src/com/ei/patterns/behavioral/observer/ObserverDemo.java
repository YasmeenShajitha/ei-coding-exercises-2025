package com.ei.patterns.behavioral.observer;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject stock = new Subject();
        stock.addObserver(new StockObserver("Investor A"));
        stock.addObserver(new StockObserver("Investor B"));

        stock.setPrice(100.5f);
        stock.setPrice(102.3f);
    }
}
