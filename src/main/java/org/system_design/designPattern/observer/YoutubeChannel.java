package org.system_design.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Channel{

    public List<Subscriber> subscriberList;
    private String latestVideo;

    public YoutubeChannel() {
        this.subscriberList = new ArrayList<>();
    }
    @Override
    public void subscribe(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
         for(Subscriber subscriber:subscriberList){
             subscriber.update(latestVideo);
         }
    }

    public void uploadVideo(String videoTitle) {
        this.latestVideo = videoTitle;
        notifySubscribers();
    }
}
