package org.dsa.array;

public class MaximumSum_Circular_SubArray {
    public static void main(String[] args){
        int[] nums = {1,-2,3,-2};
        int maxSum  = maximumSubArraySum(nums);

        System.out.println("Max SubArray Sum :: "+maxSum);
    }
    public static int  maximumSubArraySum(int[] nums){
        int totalSum = 0;

        int maxKadane=nums[0];
        int currMax=0;
        int minKadane = nums[0];
        int currMin=0;
        for(int num : nums){
            currMax=Math.max(num,currMax+num);
            maxKadane=Math.max(maxKadane,currMax);

            currMin = Math.min(num, currMin+num);
            minKadane = Math.min(minKadane, currMin);

            totalSum += num;
        }

        if(maxKadane < 0){
            return maxKadane;
        }
        return Math.max(maxKadane, totalSum-minKadane);
    }
}
