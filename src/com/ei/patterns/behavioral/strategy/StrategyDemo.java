package com.ei.patterns.behavioral.strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.pay(500);

        context.setStrategy(new UpiPayment());
        context.pay(300);
    }
}
