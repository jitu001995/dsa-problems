package org.dsa.greedy;

import java.util.Arrays;

public class AssignHole_To_Mice {
    public static void main(String[] args){
        int[] mices = {4,-4,2};
        int[] holes = {4,0,5};
        int result = assignHoles(mices,holes);
        System.out.println("Max Time :: "+result);
    }
    public static int assignHoles(int[] mices,int[]holes){
        Arrays.sort(mices);
        Arrays.sort(holes);
        int max=0;
        for(int i=0; i<mices.length; i++){
            if(max < Math.abs(mices[i]-holes[i])){
                max = Math.abs(mices[i]-holes[i]);
            }
        }
        return Math.abs(max);
    }
}
