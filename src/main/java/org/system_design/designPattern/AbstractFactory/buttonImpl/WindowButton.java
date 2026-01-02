package org.system_design.designPattern.AbstractFactory.buttonImpl;
import org.system_design.designPattern.AbstractFactory.IButton;

public class WindowButton implements IButton {
    @Override
    public void createButton() {
         System.out.println("Rendering Window Button :: ");
    }

}
