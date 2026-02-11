package org.dsa.Deque;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Max_of_SubArray_Of_Size_k {
    public static void main(String[] args){
        int[] arr = {1,3,-1,-3,5,-2,6,7};
        int k = 3;

        List<Integer> result = maxOfSubarrays(arr, k);
        System.out.println(result);
    }
    public static List<Integer> maxOfSubarrays(int[] arr,int k){
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result=new ArrayList<>();

        for(int i=0; i<arr.length; i++){

            // remvoe last Element out of windo
            // 1️⃣ Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // 2️⃣ Remove smaller elements from the back
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            // 3️⃣ Add current index
            dq.offerLast(i);
            if(i>=k-1){
                result.add(arr[dq.peekFirst()]);
            }
        }
        return result;
    }
}
