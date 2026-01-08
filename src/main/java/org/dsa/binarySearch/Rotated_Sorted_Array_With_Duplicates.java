package org.dsa.binarySearch;

public class Rotated_Sorted_Array_With_Duplicates {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10,1,2,3,4,5,6};
        int target = 6;

        boolean result = searchInArray(arr,target);
        System.out.println("Result :: "+result);
    }

    public static boolean searchInArray(int[] arr,int target){
         int lo = 0;
         int hi = arr. length-1;
         while(lo <= hi){
             int mid = lo+(hi-lo)/2;

             if(arr[mid] == target){
                 return true;
             }
             if(arr[lo] <= arr[mid] && arr[mid]==arr[hi] ){
                 lo = lo+1;
                 hi = hi-1;
                 continue;
             }else if(arr[lo] <= arr[mid]){
                 if(arr[lo]<= target && target < arr[mid]){
                    hi = mid-1;
                 }else{
                   lo=mid+1;
                 }
             }else{
                  if(arr[mid] < target && target <= arr[hi]){
                      lo= mid+1;
                  }else{
                      hi = mid-1;
                  }
             }
         }
         return false;
    }
}
