package org.system_design.designPattern.Strategy;

public class CardPayment implements PaymentStrategy{

    @Override
    public void pay(){
        System.out.println("UPI Payment is done");
    }
}
