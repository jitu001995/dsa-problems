package org.dsa.greedy;

import java.util.Arrays;

public class PilesOfBoxes {
    public static void main(String[] args){
        int [] heights = {150,210,210,80,110};
        long result = minBoxesToRemove(heights);
        System.out.println("Result :: "+result);
    }

    private static long minBoxesToRemove(int[] heights) {
        if(heights==null || heights.length == 0){
            return 0;
        }
        Arrays.sort(heights);
        int n= heights.length;
        int minHeight=heights[0];

        long totalRemove=0;
        for(int i=0; i<n; i++){
            totalRemove += (heights[i]-minHeight);
        }
        return totalRemove;

    }
}
