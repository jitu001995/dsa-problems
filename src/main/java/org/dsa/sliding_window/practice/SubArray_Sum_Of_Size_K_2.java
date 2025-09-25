package org.dsa.sliding_window.practice;

public class SubArray_Sum_Of_Size_K_2 {
    public static void main(String[] args) {
        int [] arr = {2,1,3,4,5,6,7,8,9,3,2};
        int k=3;
        int maxSUm =  maxSumOfSizeK2(arr,k);
        System.out.println("Max sum of Size k " + k + ": : "+maxSUm);
    }

    private static int maxSumOfSizeK2(int[] arr, int k) {
        int sum = 0;
        for(int i=0; i<k; i++){
            sum +=arr[i];
        }
        int ans = sum;
        for(int i=k; i<arr.length; i++){
            sum +=arr[i];
            sum -=arr[i-k];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
