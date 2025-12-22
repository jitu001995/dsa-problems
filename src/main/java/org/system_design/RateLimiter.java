package org.system_design;

import java.util.HashMap;
import java.util.Map;

public class RateLimiter {

    public static final int limit=5;
    private static final long window_size=60000;  // 1 minute

    private static class UserRequest{
        int count;
        long windowStart;
        UserRequest(long time){
            this.count=1;
            this.windowStart=time;
        }

        Map<String, UserRequest> map = new HashMap<>();

        private synchronized boolean allowRequest(String userId){
            long currentTime = System.currentTimeMillis();

            UserRequest ur = map.get(userId);
            if(ur==null){
                map.put(userId, new UserRequest(currentTime));
                return true;
            }

            // reseting window after 1 mintue
            if(currentTime-ur.windowStart >= window_size){
                count=1;
                ur.windowStart=currentTime;
            }

            if(ur.count <limit){
                ur.count++;
                return true;
            }
            return false;
        }

    }

}
