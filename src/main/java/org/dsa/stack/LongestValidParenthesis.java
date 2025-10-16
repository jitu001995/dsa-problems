package org.dsa.stack;

import java.util.Stack;

public class LongestValidParenthesis {
    public static void main(String[] args){
        String str="1(aad(akdf)akdj";
        String result = findLongestValidSubstring(str);
        System.out.println("SubString :: "+result);
    }

    private static String findLongestValidSubstring(String str) {
      Stack<Integer> stack = new Stack();
     // stack.push(-1);
      int maxLen=0;
      int start = -1;
      for(int i=0; i<str.length(); i++){
           char c= str.charAt(i);
          if(isOpen(c)){
              stack.push(i);
          }else{
              if(!stack.isEmpty() && isSameType(str.charAt(stack.peek()),c)){
                  int openIndex = stack.pop();
                  int currLen = i-openIndex+1;
                  if(currLen > maxLen){
                      maxLen = currLen;
                      start = openIndex;
                  }
              }
          }
      }
     return start !=-1 ? str.substring(start,start+maxLen):"";
    }

    public static boolean isOpen(char c){
        return c=='('||c=='{'||c=='[';
    }
    public static boolean isSameType(char open, char close){
        return (open=='(' && close==')')  ||(open=='{' && close=='}') || (open=='[' && close==']');
    }
}
