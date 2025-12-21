package org.dsa.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class insert_Intervals {
    public static void main(String[] args){
        // Given intervals
        int[][] intervals = {
                {1, 3},
                {6, 9}
        };

        // New interval to insert
        int[] newInterval = {2, 5};

        // Call insert method
        int[][] result = insert(intervals, newInterval);

        // Print result
        System.out.println(Arrays.deepToString(result));
    }

    public static int[][] insert(int[][] intervals,int[] newInterval){
         List<int[]> result = new ArrayList<>();
         for(int[] curr : intervals){
             if(curr[1]>newInterval[0]){
                 result.add(curr);
             }else if(curr[0]>newInterval[1]){
                 result.add(newInterval);
                  newInterval = curr;
             }else{
                 newInterval[0] = Math.min(newInterval[0], curr[0]);
                 newInterval[1] = Math.max(newInterval[1], curr[1]);
             }
         }
         result.add(newInterval);
         return result.toArray(new int[result.size()][]);
    }
}
