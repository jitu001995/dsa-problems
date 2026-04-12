package org.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};

        List<Integer> result = findLeaders(arr);
        System.out.println("Result List ::"+result);

    }

    public static List<Integer> findLeaders(int[] arr) {
        int n = arr.length;
        int maxRight = arr[n - 1];
        List<Integer> result = new ArrayList<>();

        result.add(maxRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                result.add(maxRight);
            }

        }
        Collections.reverse(result);
        return result;
    }


}
