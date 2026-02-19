package org.system_design.designPattern.Strategy;

import java.util.HashMap;
import java.util.Map;

public class PaymentStrategyFactory {
    public static final Map<String,PaymentStrategy> STRATEGY_MAP = new HashMap<>();

    static {
        STRATEGY_MAP.put("UPI",new UPIPayment());
        STRATEGY_MAP.put("CARD", new CardPayment());
    }

    public static PaymentStrategy getStrategy(String type){
        PaymentStrategy strategy = STRATEGY_MAP.get(type.toUpperCase());
        if (strategy == null) {
            throw new IllegalArgumentException("No strategy found for : " + type);
        }
        return strategy;
    }
}
