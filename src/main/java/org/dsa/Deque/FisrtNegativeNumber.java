package org.dsa.Deque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FisrtNegativeNumber {
    public static void main(String[] args){
        int[] arr = {1,3,-1,-3,5,-2,6,7};
        int k = 3;

        List<Integer> result = firstNegative(arr,k);

        System.out.print(result);
    }
    public static List<Integer> firstNegative(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) q.offer(i);

            if (i >= k - 1) {
                // Remove out-of-window
                while (!q.isEmpty() && q.peek() < i - k + 1) {
                    q.poll();
                }

                result.add(q.isEmpty() ? 0 : arr[q.peek()]);
            }
        }
        return result;
    }

}
