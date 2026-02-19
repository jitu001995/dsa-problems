package org.system_design.designPattern.Strategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void pay() {
        strategy.pay();
    }
}