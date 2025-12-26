package org.dsa.array;

import java.util.Arrays;
import java.util.HashMap;

public class   TwoSum {
    public static void main(String[] args) {
        int [] arr = {1,2,4,8,3};
        int target = 5;
      int [] sum =   findTargetSum(arr,target);
      System.out.println("Find Second :: "+ Arrays.toString(sum));


      int[] result =   findTargetSum2(arr,target);
      System.out.println("Result :: "+Arrays.toString(result));
    }

    private static int[] findTargetSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i], i);
        }
        return null;
    }

    private static int[] findTargetSum2(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i],i);
        }
        return null;
    }
}
