package org.dsa.string;

public class LongestPalindrome_SubString {
    public static void main(String[] args) {
        String str = "babad";
       String result =  findLongestPalindrome(str);
       System.out.println("Longest Palindrome String :: "+result);
    }

    private static String findLongestPalindrome(String str) {
        if(str==null || str.length() == 0){
            return "";
        }
        String longest = "";
        for(int i=0; i< str.length(); i++){
            String oddPalindrome = expandAroundCenter(str,i,i);
            String evenPalindrom = expandAroundCenter(str,i,i+1);
            if(oddPalindrome.length() > longest.length()){
                longest = oddPalindrome;
            }
            if(evenPalindrom.length() > longest.length()){
                longest = evenPalindrom;
            }
        }
      return longest;
    }
    public static String expandAroundCenter(String str, int left, int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1,right);
    }


}
