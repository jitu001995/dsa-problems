package org.system_design.designPattern.AbstractFactory.checkBoxImpl;

import org.system_design.designPattern.AbstractFactory.ICheckbox;

public class MacCheckBoxImpl implements ICheckbox {
    @Override
    public void createCheck() {
        System.out.println("Rendering Mack Checkbox ");
    }
}
