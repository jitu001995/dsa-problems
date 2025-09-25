package org.dsa.sliding_window;

public class Max_SumArray_Sum_Of_Size_K {
    public static void main(String[] args) {
        int[] arr={2,1,3,4,5,6,7,8,9,2,3};
        int k = 3;

       int res =  MaxSubArray(arr,k);

       System.out.println("Result ::"+res);
    }
   public static int MaxSubArray(int[] arr,int k){
        int ans = 0;
        int sum =0;
        for(int i=0; i<k; i++){
            sum +=arr[i];
        }
        ans = sum;
        for(int i=k; i<arr.length; i++){
            sum +=arr[i];

            sum -=arr[i-k];
            ans = Math.max(sum,ans);
        }
        return ans;
   }
}
