package org.dsa.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String result = minWindow(s, t);
        System.out.println(result);
    }

    public static String minWindow(String s, String t) {

        if (s.length() < t.length()) return "";

        Map<Character, Integer> map = new HashMap<>();

        // Step 1: store frequency of characters in t
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;

        // Step 2: expand right pointer
        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);

                if (map.get(rightChar) >= 0) {
                    count++;
                }
            }

            // Step 3: shrink window when all characters found
            while (count == t.length()) {

                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);

                if (map.containsKey(leftChar)) {
                    map.put(leftChar, map.get(leftChar) + 1);

                    if (map.get(leftChar) > 0) {
                        count--;
                    }
                }

                left++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}
