package org.system_design.designPattern.AbstractFactory.factory;

import org.system_design.designPattern.AbstractFactory.UIFactory;

public class MacUiFactory implements UIFactory {
    @Override
    public void createButton() {
        System.out.println("Creating MacUI button ");
    }

    @Override
    public void createCheckbox() {
        System.out.println("Creating MacUI checkbox ");
    }
}
