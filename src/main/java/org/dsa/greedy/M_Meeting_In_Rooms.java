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

        Arrays.sort(meetings,(a, b)->a[1]-b[1]);
        int count = 1;
        int lastEnd = meetings[0][1];
        for(int i=1; i<meetings.length; i++){
            if(meetings[i][0]>lastEnd){
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
