package org.dsa.stack;

import java.util.*;

public class RemoveKDigits {

    public static void main(String[] args) {

        String num = "1432219";
        int k = 3;

        System.out.println(removeKdigits(num, k));
    }

    public static String removeKdigits(String num, int k) {

        Stack<Character> stack = new Stack<>();

        for (char digit : num.toCharArray()) {

            // remove bigger digits
            while (!stack.isEmpty()
                    && k > 0
                    && stack.peek() > digit) {

                stack.pop();
                k--;
            }

            stack.push(digit);
        }

        // if still k remaining
        while (k > 0) {
            stack.pop();
            k--;
        }

        // build number
        StringBuilder sb = new StringBuilder();

        for (char ch : stack) {
            sb.append(ch);
        }

        // remove leading zeros
        while (sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        // if empty return 0
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
