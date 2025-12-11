package org.dsa.array;

public class MaxSubArraySum_Size_K {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,1,1,1,1};
        int k = 3;
        System.out.println("------------MaxSubArraySum----------");
        int result2 = maxSubArraySumOfSizeK(arr,k);
        System.out.println("Result2 :: "+result2);
    }

    private static int maxSubArraySumOfSizeK(int[] arr, int k) {
        int sum = 0;
        int ans = 0;
        for(int i=0; i<k; i++){
            sum +=arr[i];
        }
        ans = sum;
        for(int i=k; i<arr.length; i++){
            sum +=arr[i];
            sum -=arr[i-k];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
