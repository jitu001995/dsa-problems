package org.dsa.dp.array.BU;

import java.util.HashMap;

public class climbStairs_LeetCode {
    static HashMap<Integer,Integer> memo = new HashMap<>();
    public static void main(String[] args){
        int n=2;

        int result = climbStairs(n);

        System.out.println("Result :: "+result);
    }

    public static int climbStairs(int n){
        if(n==0 || n==1){
            return 1;
        }
        if(memo.containsKey(n)) return memo.get(n);

        int result = climbStairs(n-1)+climbStairs(n-2);
        memo.put(n,result);
        return result;

    }
}
