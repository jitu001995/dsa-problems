package org.dsa.binarySearch;

public class Find_Rotation_Time_Array {
    public static void main(String[] args) {
        int [] arr = {4,5,1,2,3};
       int count = getRotationCount(arr);
       System.out.println("Count :: "+count);
    }

    private static int getRotationCount(int[] arr) {
        int lo=0;
        int hi = arr.length-1;
        int ans=arr[lo];
        int index=-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;

            if(arr[lo]<=arr[hi]){
                if(arr[lo] < ans){
                    index = lo;
                    ans = arr[lo];
                }
                break;
            }
            if(arr[lo] <= arr[mid]){
                if(arr[lo] < ans){
                    index = lo;
                    ans=arr[lo];
                }
                lo=mid+1;
            }else{
                hi = mid-1;
                if(arr[mid]<ans){
                    index = mid;
                    ans = arr[mid];
                }
            }

        }
        return index;
    }
}
