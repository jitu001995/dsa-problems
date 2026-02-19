package org.system_design.designPattern.Strategy;

public class Main {
    public static void main(String[] args){
        PaymentContext context = new PaymentContext();

        String userInput = "upi";

        PaymentStrategy strategy = PaymentStrategyFactory.getStrategy(userInput);

        context.setStrategy(strategy);
        context.pay();
    }
}
