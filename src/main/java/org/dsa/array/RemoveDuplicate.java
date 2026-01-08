package org.dsa.array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr={1,2,2,3,4,4,5,6,6,7};

       int uniqueCount =  removeDuplicate(arr,arr.length);
       for(int i=0; i<uniqueCount; i++){
           System.out.print(arr[i]+" ");
       }
    }

    public static int removeDuplicate(int[] arr,int n){
        int j=0;
        for(int i=1; i<n; i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
}
