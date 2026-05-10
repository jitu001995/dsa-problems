package org.dsa.stack;

import java.util.Stack;

public class Remove_All_Adjacent_From_String {
    public static void main(String[] args){
            String s = "abbaca";
            // outpuc : "ca"

        String result = removeAdjacent(s);
        System.out.println("Removed Adjacent char from String :: "+result);
    }

    public static String removeAdjacent(String s){
        Stack<Character> stack = new Stack<>();
        for(Character ch : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==ch){
                stack.pop();
            }else{
                stack.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}
