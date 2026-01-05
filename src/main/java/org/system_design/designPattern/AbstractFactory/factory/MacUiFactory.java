package org.system_design.designPattern.AbstractFactory.factory;

import org.system_design.designPattern.AbstractFactory.IButton;
import org.system_design.designPattern.AbstractFactory.ICheckbox;
import org.system_design.designPattern.AbstractFactory.UIFactory;
import org.system_design.designPattern.AbstractFactory.buttonImpl.MacButton;
import org.system_design.designPattern.AbstractFactory.checkBoxImpl.WindowCheckBoxImp;

public class MacUiFactory implements UIFactory {
    @Override
    public IButton createButton() {
        return new MacButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowCheckBoxImp();
    }
}
