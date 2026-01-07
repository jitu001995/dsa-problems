package org.system_design.designPattern.proxy;

public class RealDatabase implements Database{
    @Override
    public void readData() {
        System.out.println("Reading sensitive data from database...");
    }
}
