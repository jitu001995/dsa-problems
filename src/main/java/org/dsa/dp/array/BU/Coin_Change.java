package org.dsa.dp.array.BU;

import java.util.Arrays;

public class Coin_Change {
    public static void main(String[] args) {
        int[] coins = {1,2,3,5};
        int amount = 11;
        int coinRes  = lcsBU(coins,amount);
        System.out.println("Count : "+coinRes);

    }
    public static int lcsBU(int []coins, int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1; i<= amount; i++){
            for(int coin : coins){
                if (i - coin >=0) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount?-1:dp[amount];
    }
}
