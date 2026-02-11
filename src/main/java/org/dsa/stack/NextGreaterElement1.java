package org.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args){
       int[] arr  = {4,5,2,25};
       int [] result = findNextGreater(arr);
       System.out.println("Arrays :: "+ Arrays.toString(result));

        int [] result2 =  findNextGreater(arr);
        System.out.println("Result 2 :: "+Arrays.toString(result2));

        int[] result3 = findNextGreater6(arr);
        System.out.println("Result 3 :: "+Arrays.toString(result3));
    }


    public static int[] findNextGreater(int[]arr){
        int n=arr.length;
        int[] nge = new int[n];
        Stack<Integer> stack = new Stack();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <=arr[i]){
                stack.pop();
            }
            nge[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return nge;
    }


    public static int[] findNextGreater6(int[] arr){
        Stack<Integer> stack = new Stack();
        int[] nge = new int[arr.length];
        Integer n=arr.length;
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <=arr[i]){
                stack.pop();
            }
            nge[i] = stack.isEmpty()?-1:stack.peek();
            stack.push(arr[i]);
        }
        return nge;
    }


}
