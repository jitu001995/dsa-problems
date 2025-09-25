package org.dsa.binarySearch.practice;

public class Search_In_Rotated_Sorted_Array_2 {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,1,2,3};
        int target = 3;
        boolean result = performSearchInRotate(arr,target);
        System.out.println("Result :: "+result);
    }

    public static boolean performSearchInRotate(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;

            if(arr[mid] == target){
                return true;
            }
            // check left sorted Array
            if(arr[lo] <= arr[mid]){
                if(arr[lo] <= target && target <= arr[mid]){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }else{
                if(arr[mid] <= target && target <= arr[hi]){
                    lo = mid+1;
                }else{
                    hi = mid-1;
                }
            }
        }
        return false;
    }
}
