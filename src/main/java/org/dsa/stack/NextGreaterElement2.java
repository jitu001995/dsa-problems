package org.dsa.stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
      public static void main(String[] args){
          int [] arr = {1,2,1};

          int[] res = findNextGreaterElement(arr);
          System.out.println("Result ::"+Arrays.toString(res));
      }
      public static int[] findNextGreaterElement(int[] arr){
          int n = arr.length;
          int [] res = new int[n];
          Arrays.fill(res,-1);
          Stack<Integer> stack = new Stack<>();
          for(int i=0; i<2*n; i++){
              int num = arr[i%n];

              while(!stack.isEmpty() && arr[stack.peek()] < num){
                  System.out.println("peek :: "+stack.peek());
                  res[stack.pop()] = num;
              }
              if(i<n){
                  stack.push(i);
              }

          }
          return res;
      }

      public static int[] findNextGreaterEle(int[] arr){
          int n=arr.length;
          int[] res = new int[n];
          Arrays.fill(res,-1);
          Stack<Integer> stack =new Stack<>();
          for(int i=0; i<2*n; i++){
              int num = arr[i%n];
              while(!stack.isEmpty() && arr[stack.peek()]<num){
                  res[stack.pop()]=num;
              }
              if(i<n){
                  stack.push(i);
              }
          }
          return res;
      }



}
