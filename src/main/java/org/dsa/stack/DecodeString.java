package org.dsa.stack;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args){
        String s="3[a2[c]]";

        String decodedString = decodeString(s);
        System.out.println("Decoded Str :: "+decodedString);

        String result2 = decodeString2(s);
        System.out.println("Result 2 :: "+result2);
    }
    public static String decodeString(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();
        StringBuilder curr=new StringBuilder();
        int num=0;
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num*10+(ch-'0');
            }else if(ch=='['){
                countStack.push(num);
                stringStack.push(curr);
                num = 0;
                curr=new StringBuilder();
            }else if(ch==']'){
                int times = countStack.pop();
                StringBuilder prev = stringStack.pop();
                StringBuilder temp = new StringBuilder(prev);
                for(int i=0; i<times; i++){
                    temp.append(curr);
                }
                curr=temp;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }



    public static String decodeString2(String s){
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<StringBuilder>();
        int num=0;
        StringBuilder curr=new StringBuilder();

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num = num *10+(ch-'0');
            }else if(ch=='['){
                countStack.push(num);
                stringStack.push(curr);
                num = 0;
                curr=new StringBuilder();
            }else if(ch==']'){
                int times = countStack.pop();
                StringBuilder prev = stringStack.pop();
                StringBuilder temp = new StringBuilder(prev);
                for(int i=0; i<times; i++){
                    temp.append(curr);
                }
                curr=temp;
            }else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
