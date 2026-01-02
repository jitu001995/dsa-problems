package org.system_design.designPattern.AbstractFactory.buttonImpl;

import org.system_design.designPattern.AbstractFactory.IButton;

public class MacButton implements IButton {
    @Override
    public void createButton() {
        System.out.println("Rendering Mac Button :: ");
    }
}
