package org.dsa.greedy;

import java.util.Arrays;

public class M_Meeting_In_Rooms {
    public static void main (String[] args){
        int [][] meetings = {
                {1,3},
                {2,4},
                {3,5},
                {0,6},
                {5,7},
                {8,9}
        };

       int maxMeeting =  maxMeeting(meetings);
       System.out.println("Max Meeting in Room :: "+maxMeeting);
    }

    private static int maxMeeting(int[][] meetings) {

        // Sorting the meetings array based on end time
        //We always p ick the meeting that finishes earliest.
        Arrays.sort(meetings,(a, b)->a[1]-b[1]);
        int count = 1;  //We always select the first meeting So we already have at least one meeting selected
        int lastEnd = meetings[0][1];  //Track Last End Time
        for(int i=1; i<meetings.length; i++){
            if(meetings[i][0]>lastEnd){
                // Current meeting should start after previous meeting ends
                // If true: No overlap We can select it
                count++;
                lastEnd=meetings[i][1];
            }
        }
        return count;
    }

    private static int maxMeetingWithDoubleArray(int[] start,int[] end) {
        int n=start.length;
        Integer[] idx = new Integer[n];
        for(int i=0; i<n; i++) idx[i]=i;
        Arrays.sort(idx,(i,j)->end[i]-end[j]);

        int count = 1;
        int lastEnd = end[idx[0]];
        for(int i=1; i<n; i++){
            if(start[idx[i]]>lastEnd){
                count++;
                lastEnd=end[idx[i]];
            }
        }
        return count;
    }
}
