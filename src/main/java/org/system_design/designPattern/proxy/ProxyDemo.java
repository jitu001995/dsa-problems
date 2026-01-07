package org.system_design.designPattern.proxy;
public class ProxyDemo {
    public static void main(String[] args) {

        Database adminDb = new DatabaseProxy("ADMIN");
        adminDb.readData();

        Database userDb = new DatabaseProxy("USER");
        userDb.readData();
    }
}

