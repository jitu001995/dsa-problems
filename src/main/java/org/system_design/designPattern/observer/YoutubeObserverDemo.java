package org.system_design.designPattern.observer;

public class YoutubeObserverDemo {
    public static void main(String[] args){
        YoutubeChannel channel = new YoutubeChannel();

         UserSubscriber user1 = new UserSubscriber("jitendra");
         UserSubscriber user2 = new UserSubscriber("jitu");

         channel.subscribe(user1);
         channel.subscribe(user2);

         channel.uploadVideo("Observer Design Pattern in Java");
        System.out.println("---- User3 Subscribes ----");
        channel.subscribe(user2);

        channel.uploadVideo("Spring Boot Event Handling Explained");
    }
}
