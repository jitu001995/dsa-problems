package org.dsa.array;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args){
        int []nums = {0,1,0,3,12};
        moveZeros2(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void moveZero(int[] arr){
       int index=0;
       for(int i=0; i<arr.length; i++){
           if(arr[i] !=0){
               arr[index++]=arr[i];
           }
        }

       while(index<arr.length){
           arr[index++]=0;
       }
    }

    public static void moveZeros2(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != j) {       // swap only when required
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }
}
