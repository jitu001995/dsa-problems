package org.dsa.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagram {
    public static void main(String[] args){
       String s = "cbaebabacd";
       String p = "abc";

       List<Integer> list = findAnagram(s,p);
       System.out.println("Anagram List :: "+list);
    }
    public static List<Integer> findAnagram(String s, String p) {

        List<Integer> list = new ArrayList<>();

        if(s.length() < p.length()) return list;

        int[] pfreq = new int[26];
        int[] sfreq = new int[26];

        // pattern frequency
        for(char c : p.toCharArray()) {
            pfreq[c - 'a']++;
        }

        int window = p.length();

        for(int i = 0; i < s.length(); i++) {

            // add new character to window
            sfreq[s.charAt(i) - 'a']++;

            // remove character if window exceeds size
            if(i >= window) {
                sfreq[s.charAt(i - window) - 'a']--;
            }

            // compare arrays
            if(Arrays.equals(pfreq, sfreq)) {
                list.add(i - window + 1);
                /*
                int start = i - window + 1;

                list.add(s.substring(start, start + window));

                 */
            }
        }

        return list;
    }
}
