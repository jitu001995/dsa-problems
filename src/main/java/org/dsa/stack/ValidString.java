package org.dsa.stack;

import java.util.Stack;

public class ValidString {
    public static void main(String[] args){
        String s = "(){}[]";
        boolean result = isValid(s);
        System.out.println("IsValid ::"+result);
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            if(isOpen(c)){
                stack.push(c);
            }else{
                if(stack.size()>0 && isSameType(stack.peek(),c)){
                  stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isSameType(char open,char close){
        return (open == '(' && close == ')') || (open == '[' && close == ']') ||  (open == '{' && close == '}');
    }
    public static boolean isOpen(char c){
        return c=='(' || c=='[' || c=='{';
    }
}
