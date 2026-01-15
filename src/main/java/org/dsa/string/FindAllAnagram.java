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
    public static List<Integer> findAnagram(String s, String p){
        List<Integer> list=new ArrayList<>();
        int[] pfreq=new int[26];
        for(char c : p.toCharArray()){
            pfreq[c-'a']++;
        }

        for(int i=0; i<=s.length()-p.length(); i++){
            int [] freq = new int[26];
           for(int j=i; j<i+p.length(); j++){
               freq[s.charAt(j)-'a']++;
           }
           if(Arrays.equals(pfreq,freq)){
               list.add(i);
           }
        }
        return list;
    }
}
