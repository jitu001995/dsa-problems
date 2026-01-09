package org.dsa.string;

import java.util.HashMap;

public class MostkDistinctLongestSubStr {
    public static void main(String[] args){
       String str = "eceba";
       String strRes= longestSubStrKDistinct(str,2);
       System.out.println("Result :: "+strRes);
    }

    public static String longestSubStrKDistinct(String str,int k){
        HashMap<Character, Integer> freq = new HashMap<>();
        int left=0, maxLen=0, start=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.size()>k) {
                char leftChar = str.charAt(left);
                freq.put(leftChar, freq.get(leftChar) - 1);
                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }
                left++;
            }
            if(i-left+1>maxLen){
                maxLen=i-left+1;
                start=left;
            }
        }
        return str.substring(start,start+maxLen);
    }
}
