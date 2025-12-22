package org.dsa.dp.array.BU;

public class House_Robber {
    public static void main(String[] args){
        int[] arr={1,2,3,1}; 

        int result = rob(arr);

        System.out.println("Result :: "+result);
    }
    public static int rob(int[]arr){
        if(arr.length == 1){
            return arr[0];
        }
        int [] dp = new int[arr.length];
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2; i<arr.length; i++){
            dp[i] = Math.max(arr[i]+dp[i-2],dp[i-1]);
        }
        return dp[arr.length-1];
    }
}
