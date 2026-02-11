package org.dsa.Deque;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountDistinct {
    public static void main(String[] args){
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        List<Integer> result = countDistinct(arr,k);
        System.out.println(result);
    }
    public static List<Integer> countDistinct(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        int i = 0;
        for (int j = 0; j < arr.length; j++) {

            freq.put(arr[j], freq.getOrDefault(arr[j], 0) + 1);

            if (j - i + 1 == k) {
                result.add(freq.size());

                freq.put(arr[i], freq.get(arr[i]) - 1);
                if (freq.get(arr[i]) == 0) freq.remove(arr[i]);
                i++;
            }
        }
        return result;
    }

}
