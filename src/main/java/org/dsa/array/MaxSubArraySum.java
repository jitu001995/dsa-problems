package org.dsa.array;


public class MaxSubArraySum {
    public static void main(String[] args){
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max SubArray Sum: " + maxSubArray(nums));

        maxSubArrayWithElements(nums);
    }

    private static int maxSubArray(int[] nums) {

        int currentSum = nums[0];
        int maxSum = 0;
        for(int i=0; i<nums.length; i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }


    private static void maxSubArrayWithElements(int[] nums) {

        int currentSum = nums[0];
        int maxSum = nums[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("Max Sum: " + maxSum);
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
