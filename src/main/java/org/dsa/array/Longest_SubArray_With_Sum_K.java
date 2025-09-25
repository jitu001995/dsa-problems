package org.dsa.array;

import java.util.HashMap;

public class Longest_SubArray_With_Sum_K {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,1,1,1};
        int k = 3;
        int result = longestSubArrayWithSum(arr,k);
        System.out.println("Result ::"+result);
    }

    private static int longestSubArrayWithSum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        Integer sum = 0;
        Integer maxLen = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];

            if(sum == k){
                maxLen = i+1;
            }
            // step 3: check if (sum - k) exists in the map
            // If yes, then subarray between map.get(sum-k)+1 ... i has sum = k
            if (map.containsKey(sum - k)) {
                int prevIndex = map.get(sum - k);
                int length = i - prevIndex;   // subarray length
                maxLen = Math.max(maxLen, length); // update longest
            }


            // step 4: store sum in map if not already present
            // We only want the FIRST occurrence, because
            // earlier index gives longer subarray.
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLen;
    }
}
