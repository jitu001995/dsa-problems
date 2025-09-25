package org.dsa.dp.array.BU;

import java.util.Arrays;

public class ClimbStairs {
    public static void main(String[] args){
        int n=7;
        int[] arr={2,3,5};
       int result =  climbStairsOrderMatters(n,arr);

       System.out.println("Result :: "+result);
    }
    public static int climbStairsOrderMatters(int n,int[] steps){
         int[] dp = new int[n+1];
         Arrays.fill(dp,0);
         dp[0]=1;
         for(int i=1; i<=n; i++){
             for(int step : steps){
                 if(i-step >=0) {
                     dp[i] += dp[i - step];
                 }
             }
         }
         System.out.println("DP Arrays :: "+Arrays.toString(dp));
         return dp[n];
    }
}
