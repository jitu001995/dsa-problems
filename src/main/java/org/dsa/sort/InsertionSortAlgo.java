package org.dsa.sort;

import java.util.Arrays;

public class InsertionSortAlgo {
  public static void main(String[] args){
      int[] arr={8,3,5,2};
      insertionSort(arr);
      System.out.println(Arrays.toString(arr));
  }
  public static void insertionSort(int[] arr){
      int n = arr.length;
      for(int i=1; i<n; i++){
          int key=arr[i];
          int j=i-1;

          while(j>=0 && arr[j]>key){
              arr[j+1]=arr[j];
              j--;
          }
          arr[j+1]=key;

      }
  }
}
