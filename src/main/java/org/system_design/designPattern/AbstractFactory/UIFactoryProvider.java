package org.system_design.designPattern.AbstractFactory;

import org.system_design.designPattern.AbstractFactory.factory.MacUiFactory;
import org.system_design.designPattern.AbstractFactory.factory.WindowUiFactory;

public class UIFactoryProvider {
    public static UIFactory  getFactory(String osName){
        if(osName==null) return null;
        switch (osName.toLowerCase()){
            case "window":
                return new WindowUiFactory();
            case "mack" :
                return new MacUiFactory();
            default:
                throw new IllegalArgumentException("Illegal Argument");
        }
    }
}
