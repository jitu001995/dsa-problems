package org.dsa.binarySearch;

import java.util.Arrays;

public class FindMin_Rotated_Search_Array {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 2, 3};

        int result = findMin(arr);
        System.out.println("Result :: " + result);

       int res2 =  findMin2(arr);
       System.out.println("Result 2 :"+res2);

    }

    public static int findMin(int[] arr) {
        Arrays.sort(arr);
        int low = 0;
        int hi = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(low <= hi){
            int  mid= low+(hi-low)/2;
            if(arr[low] <= arr[hi]){
                ans = Math.min(ans,arr[low]);
                break;
            }
            if(arr[low] <= arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid+1;
            }else{
                hi = mid-1;
                ans = Math.min(ans,arr[mid]);
            }
        }
        return ans;
    }

    public static int findMin2(int[] arr){
        Arrays.sort(arr);
        int lo=0;
        int hi=arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(arr[lo] < arr[hi]){
                ans = Math.min(ans,arr[lo]);
                break;
            }else if(arr[lo] <= arr[mid]){
                ans = Math.min(ans,arr[mid]);
                lo = mid+1;
            }else{
                hi = mid+1;
                ans = Math.min(ans,arr[mid]);
            }
        }
        return ans;
    }
}
