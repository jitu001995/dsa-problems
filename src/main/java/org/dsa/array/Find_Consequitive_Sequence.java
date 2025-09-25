package org.dsa.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Find_Consequitive_Sequence {
    public static void main(String[] args) { 
        int[] arr = {100,1,200,2,3,4};
        consequitiveSequence(arr);
    }
    public static void consequitiveSequence(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int longestLength = 0;
        int startLength = 0;
        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }
                if (currentLength > longestLength) {
                    longestLength = currentLength;
                    startLength = num;
                }
            }
        }
        // Build and print the longest sequence
        List<Integer> sequence = new ArrayList<>();
        for (int i = 0; i < longestLength; i++) {
            sequence.add(startLength + i);
        }

        System.out.println("Longest consecutive subarray: " + sequence);
        System.out.println("Length: " + longestLength);
    }
}
