package org.dsa.array;

import java.util.Arrays;

public class Find_FirstAndLast_Position_In_Sorted_Arraty {
    public static void main(String[] args){
        int[] nums={5,7,7,8,9,8,10};
        int target=8;
       int[] res = searchRange(nums,target);
       System.out.println("Res :: "+ Arrays.toString(res));
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        return new int[]{left, right};
    }

    private static int binarySearch(int[] arr, int target, boolean findFirst) {
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while(start <= end){
          int mid = start+(end-start)/2;

          if(arr[mid]<target){
              start = mid + 1;
          }else if(arr[mid]>target){
             end=mid-1;
          }else{
              ans = mid;
              if(findFirst){
                  end = mid-1;
              }else{
                  start = mid+1;
              }
          }
        }

        return ans;
    }
}
