package org.dsa.backtracking;

public class StringPermutation{
    public static void main(String[] args){
        String str ="abc";
        permute("",str);


    }
    static void permute(String prefix, String remaining) {

        if (remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {

            char ch = remaining.charAt(i);

            String left = remaining.substring(0, i);
            String right = remaining.substring(i + 1);

            permute(prefix + ch, left + right);
        }
    }
}
