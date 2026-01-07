package org.system_design.designPattern.singleTon;
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {               // First check
            synchronized (Singleton.class) {
                if (instance == null) {       // Second check
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
