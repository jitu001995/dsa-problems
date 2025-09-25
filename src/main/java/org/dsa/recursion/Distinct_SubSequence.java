package org.dsa.recursion;

public class Distinct_SubSequence {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        System.out.println(distinctSubSequence(s,t,0,0));
    }
    public static int distinctSubSequence(String s,String t,int i, int j) {
        if (j == t.length()) {
            return 1;
        }
        if (s.length() == i) {
            return 0;
        }
        int inc = 0;
        int exc = 0;
        if (s.charAt(i) == t.charAt(j)) {
            inc = distinctSubSequence(s, t, i + 1, j + 1);
        }
        exc = distinctSubSequence(s, t, i+1, j);
        return inc + exc;
    }
}
