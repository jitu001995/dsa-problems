package org.system_design.designPattern.AbstractFactory.factory;

import org.system_design.designPattern.AbstractFactory.IButton;
import org.system_design.designPattern.AbstractFactory.ICheckbox;
import org.system_design.designPattern.AbstractFactory.UIFactory;
import org.system_design.designPattern.AbstractFactory.buttonImpl.WindowButton;
import org.system_design.designPattern.AbstractFactory.checkBoxImpl.WindowCheckBoxImp;

import java.awt.*;

public class WindowUiFactory implements UIFactory {
    @Override
    public IButton createButton() {
       return new WindowButton();
    }

    @Override
    public ICheckbox createCheckbox() {
        return new WindowCheckBoxImp();
    }
}
