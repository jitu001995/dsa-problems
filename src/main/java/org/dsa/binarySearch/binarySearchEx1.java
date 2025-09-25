package org.dsa.binarySearch;

public class binarySearchEx1 {
    public static void main(String[] args) {
        int[] arr  = {4,5,1,2,3};
        int target = 2;
      int result =  performSearch(arr,target);
      System.out.println("Result :: "+result);

    }

    public static int performSearch(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                lo = mid + 1;
            }else{
              hi = mid - 1;
            }
        }
       return -1;
    }

}
