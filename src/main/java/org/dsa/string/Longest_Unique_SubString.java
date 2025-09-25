package org.dsa.string;

import java.util.HashSet;

public class Longest_Unique_SubString {
    public static void main(String[] args) {
        String str = "aabckdea";

        String strRes = longestSubString(str);
        System.out.println("Result :: "+strRes);
    }

    public static String longestSubString(String str){
        HashSet<Character> charSet = new HashSet<>();
        int left = 0;
        int start  = 0;
        int maxLen = 0;
        for(int right =0; right<str.length(); right++){
            while(charSet.contains(str.charAt(right))){
                charSet.remove(str.charAt(left));
                left++;
            }
            charSet.add(str.charAt(right));
            if(right-left+1 > maxLen){
                maxLen = right-left+1;
                start = left;
            }
        }
        return str.substring(start,start+maxLen);

    }
}
