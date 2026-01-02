package org.system_design.designPattern.AbstractFactory;

public class AbstractFactoryPattern {
    public static void main(String[] args){
       String osName="window";
        UIFactory uiFactory=UIFactoryProvider.getFactory(osName);

        uiFactory.createButton();
        uiFactory.createCheckbox();
    }
}
