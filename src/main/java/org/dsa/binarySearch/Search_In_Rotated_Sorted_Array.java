package org.dsa.binarySearch;

import static org.dsa.array.binarySearch.search;

public class Search_In_Rotated_Sorted_Array {
    public static void main(String[] args) {
    int[] arr = { 7, 8, 9,10, 1, 2, 3, 4, 5};

    int target = 3;
    boolean result = searchInArray(arr, target);
     System.out.println("Result :: "+result);
  }
  public static boolean searchInArray(int[] arr, int target) {
        int lo= 0;
        int hi = arr.length-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == target){
                return true;
            }
            // check left
            if(arr[lo] <= arr[mid]) {
                if (arr[lo] <= target && target <= arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
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
