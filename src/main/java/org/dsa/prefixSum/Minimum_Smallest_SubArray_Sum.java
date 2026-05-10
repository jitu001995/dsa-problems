package org.dsa.prefixSum;

public class Minimum_Smallest_SubArray_Sum {
   public static void main(String[] args){
      int arr[] = {3,-4, 2,-3,-1, 7,-5};
      int smallestSum =  smallestSumSubarray(arr,arr.length);
      System.out.println("Smallest sum ::"+smallestSum);
   }
    static int smallestSumSubarray(int a[], int size) {
        // your code here

        int smallSum=0;
        int currentSum = 0;
        for(int i=0; i<size; i++){
            currentSum = Math.min(a[i], currentSum + a[i]);
            if(currentSum < smallSum){
                smallSum = currentSum;
            }
        }
        return smallSum;
    }
}
