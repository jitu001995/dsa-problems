package org.system_design.designPattern.observer;

public class UserSubscriber implements Subscriber{
    private String name;

    public UserSubscriber(String name){
        this.name=name;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println(name + " got notification: New video uploaded -> " + videoTitle);
    }
}
