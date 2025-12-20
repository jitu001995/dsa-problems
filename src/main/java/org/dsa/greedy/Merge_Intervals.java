package org.dsa.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge_Intervals {
    public static void main(String[] args){
        int[][] intervals ={{1,3},{2,6},{8,10},{15,18}};
       int [][] merged =  mergeOverlap(intervals);
       System.out.println(Arrays.deepToString(merged));
    }

    private static int[][] mergeOverlap(int[][] intervals) {
        if(intervals.length==0) return intervals;

        Arrays.sort(intervals,(a, b)->a[0]-b[0]);
        List<int[]> merged = new ArrayList<>();
        int[] current = intervals[0];

        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= current[1]){
                current[1]=Math.max(current[i],intervals[i][1]);
            }else{
                merged.add(current);
                current = intervals[i]; // move forward
            }

        }
        merged.add(current);
        return merged.toArray(new int[merged.size()][]);
    }
}
