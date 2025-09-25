package org.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {
    public static void main(String[] args){
       int[] arr  = {4,5,2,25};
       int [] result = nextGreaterEle(arr);
       System.out.println("Arrays :: "+ Arrays.toString(result));

        int [] result2 =  findNextGreater(arr);
        System.out.println("Result 2 :: "+Arrays.toString(result2));
    }

    private static int[] nextGreaterEle(int[] arr) {
        int n=arr.length;
        int [] nge = new int[n];
        Stack<Integer> stack = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            nge[i] = stack.isEmpty()?-1:stack.peek();

            stack.push(arr[i]);
        }
        return nge;
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

}
