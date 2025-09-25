package org.dsa.dp.array.BU;

public class Longest_Increasing_subsequence {
    public static void main(String[] args) {
        int[] arr = {10,9,2,5,7,3,101,18};

      int result =   longestOfLics(arr);
      System.out.println(" Result :: "+result);
    }

    public static int longestOfLics(int[] arr){
      int[] dp = new int[arr.length];
      int length = 0;
      for(int no : arr){
          int pos = binarySearch(dp,0,length,no);

          dp[pos] = no;
          if(pos == length) {
              length++;
          }
      }
      return length;
    }
    public static int binarySearch(int[] dp, int low, int hi,int target){
        while(low < hi){
            int mid = low+(hi-low)/2;
            if(dp[mid] < target) {
                low = mid + 1;
            }else{
                hi = mid;
            }
        }
        return low;
    }
}
