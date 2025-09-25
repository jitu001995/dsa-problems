package org.dsa.array;

import java.util.Arrays;

public class Rearrange_Alternate_Number {
    public static void main(String[] args){
        int[] arr = {3,1,-2,-5,2,-4};
        int []result = rearrangeNumber(arr);

        System.out.println("Arrays ::"+ Arrays.toString(result));

    }

    private static int[] rearrangeNumber(int[] arr) {
        int n=arr.length;
        int [] result = new int[n];
        int [] pos=new int[n/2];
        int[] neg=new int[n/2];
        int p=0; int q=0;
        for(int no : arr){
            if(no>0){
                pos[p++]=no;
            }else{
                neg[q++]=no;
            }
        }

        int i=0,j=0, k=0;
        while(i<pos.length && j<neg.length){
            result[k++]=pos[i++];
            result[k++]=neg[j++];
        }
        return result;
    }
}
