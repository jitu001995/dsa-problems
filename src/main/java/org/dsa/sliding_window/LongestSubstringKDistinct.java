package org.dsa.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {


    public static void main(String[] args) {
        String s = "eceba";
        int k = 2;
        System.out.println("length of unique char substr :: "+longestSubstringKDistinct(s, k)); // Output: 3

        System.out.println("String with unique char :: "+longestSubstringKDistinct2(s,k));

        //  Time complexity : O(n)
        //  space complexity: O(k);
    }


    public static int longestSubstringKDistinct(String s, int k) {
        if (k == 0 || s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, maxLen = -1;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            if(freq.size()==k)
                maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }


    public static String longestSubstringKDistinct2(String s, int k) {
        if (k == 0 || s == null || s.length() == 0) {
            return "";
        }

        Map<Character, Integer> freq = new HashMap<>();
        int left = 0, maxLen = 0,start = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            freq.put(c, freq.getOrDefault(c, 0) + 1);

            while (freq.size() > k) {
                char leftChar = s.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            if(right-left+1>maxLen){
                maxLen = right-left+1;
                start=left;
            }
        }

        return s.substring(start,start+maxLen);
    }
}
