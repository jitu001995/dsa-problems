package org.dsa.array;

public class ReverseVowels {
    public static void main(String[] args) {
        String s ="hello";
        System.out.println(reverseVowels(s));

    }


    public static String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (left < right) {
            while (left < right && !isVowels(s.charAt(left))) {
                left++;
            }
              while (left < right && !isVowels(s.charAt(right))) {
                right--;
            }
            char leftChar = chars[left];
            chars[left] = chars[right];
            chars[right] = leftChar;
            left++;
            right--;
        }
        return new String(chars);
    }

public static boolean isVowels(char c){
        c = Character.toLowerCase(c);
    return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
}
}