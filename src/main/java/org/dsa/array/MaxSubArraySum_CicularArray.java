package org.dsa.array;

public class MaxSubArraySum_CicularArray {
    public static void main(String[] args){
        int[] arr={5, -3, 5};
        int maxSum = maxSubarraySumCircular(arr);
        System.out.println(maxSum);

    }

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;

        int maxKadane = nums[0];
        int currMax = 0;

        int minKadane = nums[0];
        int currMin = 0;

        for (int num : nums) {
            // Max subarray sum (Kadane)
            currMax = Math.max(num, currMax + num);
            maxKadane = Math.max(maxKadane, currMax);

            // Min subarray sum (Kadane variant)
            currMin = Math.min(num, currMin + num);
            minKadane = Math.min(minKadane, currMin);

            totalSum += num;
        }

        // All elements are negative
        if (maxKadane < 0) {
            return maxKadane;
        }

        return Math.max(maxKadane, totalSum - minKadane);

    }
}
