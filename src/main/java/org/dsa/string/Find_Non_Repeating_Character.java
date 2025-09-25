package org.dsa.string;

import java.util.HashSet;

public class Find_Non_Repeating_Character {
    public static void main(String[] args) {
        String s = "pkwekp";

       String strNonRepeat =  findNonRepeativeCharacter(s);

       System.out.println(" NonRepeate "+strNonRepeat);
    }

    private static String findNonRepeativeCharacter(String s) {
        int start=0;
        int maxLength = 0;
        int left=0;
        HashSet<Character> charSet = new HashSet<>();

        for(int right=0; right<s.length(); right++){
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            if(right-left+1 > maxLength){
                maxLength = right-left+1;
                start= left;
            }
        }
        return s.substring(start, start + maxLength);
    }
}
