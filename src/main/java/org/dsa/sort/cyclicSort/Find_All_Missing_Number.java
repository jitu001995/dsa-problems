package org.dsa.sort.cyclicSort;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Missing_Number {
    public static void main(String[] args){
        int[] arr = {4,3,2,7,8,2,3,1};
       List<Integer> result =  findAllMissingNumber(arr);
       System.out.println("List of All missing Number :: "+result);
    }
    public static List<Integer> findAllMissingNumber(int[] arr){
        List<Integer> result = new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int correctIdx = arr[i]-1;
            if(arr[i] !=arr[correctIdx]){
                swap(arr,i,correctIdx);
            }else{
                i++;
            }
        }
        for(int j=0; j<arr.length; j++){
            if(arr[j] != j+1){
                result.add(j+1);
            }
        }
        return result;
    }

    public static void swap(int [] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;
    }
}
