package org.dsa.array;

import java.util.Arrays;

public class MakeArraySquare {
    public static void main(String[] args){
        int[] arr={-4, -1, 0, 3, 10};
       int res[] = makeArraySquare(arr);
       System.out.println(Arrays.toString(res));
    }
    public static int[] makeArraySquare(int[] arr){
        int n = arr.length;
         int left=0;
         int right=n-1;
         int[] res=new int[n];
         int idx=n-1;
         while(left<=right){
             int leftSq = arr[left] *arr[left];
             int rightSq = arr[right]*arr[right];
             if(leftSq>rightSq){
                 res[idx--]=leftSq;
                 left++;
             }else{
                 res[idx--]=rightSq;
                 right--;
             }
         }
         return res;
    }
}
