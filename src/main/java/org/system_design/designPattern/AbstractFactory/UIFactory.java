package org.system_design.designPattern.AbstractFactory;

import org.system_design.designPattern.AbstractFactory.buttonImpl.MacButton;
import org.system_design.designPattern.AbstractFactory.checkBoxImpl.MacCheckBoxImpl;

import java.awt.*;

public interface UIFactory {
    IButton createButton();
    ICheckbox createCheckbox();
}
