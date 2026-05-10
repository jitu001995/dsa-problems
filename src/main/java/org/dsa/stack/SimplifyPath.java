package org.dsa.stack;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args){
        String path = "/home/";
        // output = "/home"

        String result = simplifyPath(path);
        System.out.println("Simplify path :: "+result);
    }
    public static String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String [] paths = path.split("/");
        for(String part : paths){

            if(part.equals("") || part.equals(".")){
                continue;
            }
            if(part.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else{
                stack.push(part);
            }
        }
        StringBuilder sb = new StringBuilder();
        for(String dir : stack){
            sb.append("/").append(dir);
        }
        return sb.length()==0?"/":sb.toString();
    }
}
