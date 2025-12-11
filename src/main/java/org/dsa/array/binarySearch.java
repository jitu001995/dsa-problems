package org.dsa.array;

public class binarySearch {
    public static void main(String[] args) {
        int [] arr = {2,3,5,6,7,8,9,11,13,15,18};

        int item = 11;
        int result = search(arr,item);
        System.out.println("Result :: "+result);

        int result2 = search2(arr,7);
        System.out.println("Result2 :: "+result2);

        System.out.println("-----------");
        int result3 = search3(arr,6);
        System.out.println("Result 3 :: "+result3);
    }

    public static int search(int[] arr,int item){
        int lo =0;
        int hi=arr.length-1;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == item){
                return mid;
            }else if (arr[mid] > item){
                hi = mid-1;
            }else{
                lo=mid+1;
            }
        }
        return -1;
    }

    public static int search2(int[] arr,int item){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == item) {
              return mid;
            }else if(arr[mid] > item){
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return -1;
    }



    public static int search3(int[] arr,int item){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == item) {
                return mid;
            }else if(arr[mid] < item){
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return -1;
    }
}
