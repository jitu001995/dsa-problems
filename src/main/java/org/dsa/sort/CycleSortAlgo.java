package org.dsa.sort;

import java.util.Arrays;

public class CycleSortAlgo {
    public static void main(String[] args){
        int[] arr={3,1,4,2,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }
    }

}
