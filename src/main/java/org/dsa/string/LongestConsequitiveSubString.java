package org.dsa.string;

public class LongestConsequitiveSubString {
    public static void main(String[] args) {
        String s = "abcdefmnopqrstuvwabcdefghijklmnwxyz";
        System.out.println(longestConsecutiveSubstring(s));
    }

    private static String longestConsecutiveSubstring(String s) {
        if (s == null || s.length() == 0) return "";

        int start = 0;
        int maxStart = 0;
        int maxLen = 1;

        for (int i = 1; i < s.length(); i++) {
            // check if characters are consecutive
            if (s.charAt(i) != s.charAt(i - 1) + 1) {
                start = i; // reset window
            }

            int currLen = i - start + 1;

            if (currLen > maxLen) {
                maxLen = currLen;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLen);
    }
}
