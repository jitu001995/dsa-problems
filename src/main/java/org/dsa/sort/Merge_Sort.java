package org.dsa.sort;

import java.util.Arrays;

public class Merge_Sort {
    public static void main(String[] args) {
        int[] arr = {5,1,4,3,2};

      int [] mergedArr =   MergeSort(arr,0,arr.length-1);
      System.out.println("Merged Array :: "+ Arrays.toString(mergedArr));
    }

    private static int[] MergeSort(int[] arr,int si,int ei) {
        if(si == ei){
            int [] bs = new int[1];
            bs[0] = arr[si];
            return bs;
        }

        int mid = si+(ei-si)/2;
        int [] fs = MergeSort(arr,si,mid);
        int [] fss = MergeSort(arr,mid+1,ei);

        return merge_Two_Sorted_Array(fs, fss);

    }

    private static int[] merge_Two_Sorted_Array(int[] arr1, int[] arr2) {
        int i=0;
        int j=0;
        int k=0;
        int m = arr1.length;
        int n = arr2.length;
        int [] ans = new int[m+n];
        while(i<m && j<n){
            if(arr1[i] < arr2[j]){
                ans[k++]=arr1[i++];

            }else{
                ans[k++] = arr2[j++];
            }
        }

        while(i<m){
            ans[k++]=arr1[i++];
        }
        while(j<n){
            ans[k++] = arr2[j++];
        }
        return ans;
    }
}
