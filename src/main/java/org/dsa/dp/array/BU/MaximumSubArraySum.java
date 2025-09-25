package org.dsa.dp.array.BU;

import java.util.Arrays;

public class MaximumSubArraySum {
    public static void main(String[] args){

     //   Given an integer array nums, find the contiguous subarray (of at least one element)
        //   which has the largest sum, and return its sum.
        int [] arr= {-2,1,-3,4,-1,2,1,-5,4};

           int result = maxSubArray(arr);
         System.out.println("Max sum :: "+result);
    }

    public static int maxSubArray(int[] arr){
        int n= arr.length;
        int[] dp=new int[n];
        dp[0]=arr[0];
         int maxSum = 0;
        for(int i=1; i<n; i++){
            dp[i] = Math.max(arr[i],arr[i]+dp[i-1]);
            maxSum = Math.max(maxSum,dp[i]);
        }

        System.out.println(" DP Array :: "+ Arrays.toString(dp));
        return maxSum;
    }
}
