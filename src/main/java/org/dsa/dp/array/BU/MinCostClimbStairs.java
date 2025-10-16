package org.dsa.dp.array.BU;

public class MinCostClimbStairs {
    public static void main(String[] args){
    int [] arr = {1,100,1,1,1,100,1,1,100,-1};
       int res = minCostBU(arr);
       System.out.println("Min Cost BU :: "+res);
    }

    public static int minCostBU(int[] arr) {
         int n = arr.length;
         int[] dp = new int[n];
         dp[0]=arr[0];
         dp[1]=arr[1];

         for(int i=2; i<n; i++){
             dp[i] = arr[i]+Math.min(dp[i-1],dp[i-2]);
         }
         return Math.min(dp[n-1],dp[n-2]);
    }
}
