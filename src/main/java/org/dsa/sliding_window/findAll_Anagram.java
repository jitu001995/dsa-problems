package org.dsa.sliding_window;

import java.util.*;
public class findAll_Anagram {
    public static void main(String[] args){
        String s = "cbaebabacd" ;
        String p = "abc";
        List<Integer> anagramList = findAnagrams(s,p);
        System.out.println("Angaram List ::"+anagramList);
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) return result;

        int[] freq = new int[26];

        // Step 1: fill freq for p
        for (char c : p.toCharArray()) {
            freq[c - 'a']++;
        }

        int left = 0, right = 0, count = p.length();

        // Step 2: sliding window
        while (right < s.length()) {
            char r = s.charAt(right);

            if (freq[r - 'a'] > 0) {
                count--;
            }
            freq[r - 'a']--;

            right++;

            // when window size matches
            if (count == 0) {
                result.add(left);
            }

            // maintain window size
            if (right - left == p.length()) {
                char l = s.charAt(left);

                if (freq[l - 'a'] >= 0) {
                    count++;
                }
                freq[l - 'a']++;

                left++;
            }
        }

        return result;
    }



}
