package org.dsa.stack;

import java.util.Stack;

public class RemoveStars {
    public static void main(String[] args) {
        String s= "leet**cod*e";
        String strRes = removeStars(s);

        System.out.println("String is removed :: "+ strRes);
    }

    private static String removeStars(String s) {
     Stack<Character> stack = new Stack<>();
       for(Character ch : s.toCharArray()){
           if( ch=='*'){
               if(!stack.isEmpty()) {
                   stack.pop();
               }
           }else {
               stack.push(ch);
           }
       }
       StringBuilder sb = new StringBuilder();
       for(Character c : stack){
           sb.append(c);
       }
       return sb.toString();
    }
}
