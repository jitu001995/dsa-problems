package org.dsa.greedy;

import java.util.Arrays;

public class Mice_Cheese {
    public static void main(String[]args){
        int[] reward1={1,4,4,6};
        int[] reward2 ={1,3,4,2};
        int k=2;
        int maxPoint= miceAndCheese(reward1,reward2,k);
        System.out.println(maxPoint);
    }

    private static int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int n = reward1.length;

        int base=0;
        for(int r : reward2) base+=r;

        int[] gains = new int[n];

        for(int i=0; i<n; i++){
            gains[i] = reward1[i]- reward2[i];
        }

        // step-3 : we need top k gains -> sort descending
        Arrays.sort(gains);

        int extra = 0;
        for(int i=n-1; i>=n-k; i--){
            extra +=gains[i];
        }
        return base+extra;
    }
}
/*               mm
explanation to interviewer :
        “I first assume all mice eat cheese-2.
Then I calculate the extra reward gained if a mouse eats cheese-1 instead.
I pick the k mice with the highest extra gain and add that to the base reward.”

*/


//
//There are two mice and n different types of cheese, each type of cheese should be eaten by exactly one mouse.
//
//A point of the cheese with index i (0-indexed) is:
//
//reward1[i] if the first mouse eats it.
//        reward2[i] if the second mouse eats it.
//You are given a positive integer array reward1, a positive integer array reward2, and a non-negative integer k.
//
//Return the maximum points the mice can achieve if the first mouse eats exactly k types of cheese.
//
//
//
//        Example 1:
//
//Input: reward1 = [1,1,3,4], reward2 = [4,4,1,1], k = 2
//Output: 15
//Explanation: In this example, the first mouse eats the 2nd (0-indexed) and the 3rd types of cheese, and the second mouse eats the 0th and the 1st types of cheese.
//The total points are 4 + 4 + 3 + 4 = 15.
//It can be proven that 15 is the maximum total points that the mice can achieve.
//Example 2:
//
//Input: reward1 = [1,1], reward2 = [1,1], k = 2
//Output: 2
//Explanation: In this example, the first mouse eats the 0th (0-indexed) and 1st types of cheese, and the second mouse does not eat any cheese.
//The total points are 1 + 1 = 2.
//It can be proven that 2 is the maximum total points that the mice can achieve.
