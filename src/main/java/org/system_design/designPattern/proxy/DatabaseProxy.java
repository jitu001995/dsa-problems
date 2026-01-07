package org.system_design.designPattern.proxy;

import org.system_design.designPattern.proxy.Database;
import org.system_design.designPattern.proxy.RealDatabase;

public class DatabaseProxy implements Database {

    private RealDatabase realDatabase;
    private String userRole;

    public DatabaseProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void readData() {
        if ("ADMIN".equalsIgnoreCase(userRole)) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase(); // lazy initialization
            }
            realDatabase.readData();
        } else {
            System.out.println("Access Denied: You are not authorized!");
        }
    }
}
