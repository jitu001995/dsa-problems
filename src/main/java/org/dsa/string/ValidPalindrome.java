package org.dsa.string;

public class ValidPalindrome {
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";

        boolean isValid  = isValidPalindrome(s);
        System.out.println("IsValid ::"+isValid);
    }
    public static boolean isValidPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            if(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
