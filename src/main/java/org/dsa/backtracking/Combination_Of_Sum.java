package org.dsa.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Of_Sum {
    public static void main(String[] args) {
        int[] arr={2,3,4,6,7};
        int sum = 7;

        List<Integer> arrList = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        findCombination(arr,sum,arrList,ans,0);

        System.out.println(ans);
        List<List<Integer>> ans2 = new ArrayList<>();

        combinationSum2(arr,sum,arrList,ans2,0);
        System.out.println("Answer :: "+ans2);

        System.out.println("--------Printing 3 --------------");
        List<List<Integer>> ans3 = new ArrayList<>();
        combinationSum3(arr,sum,arrList,ans3,0);
        System.out.println(ans3);

        System.out.println("--------Printing 4 --------------");
        List<Integer> arrList4 = new ArrayList<>();
        List<List<Integer>> ans4 = new ArrayList<>();
        combinationSum4(arr,sum,arrList4,ans4,0);
        System.out.println(ans4);
    }

    private static void findCombination(int[] arr, int sum, List<Integer> arrList, List<List<Integer>> ans, int idx) {
      if(sum == 0){
          ans.add(new ArrayList<>(arrList));
      }
      for(int i=idx; i<arr.length; i++){
          if(sum >= arr[i]){
              arrList.add(arr[i]);
              findCombination(arr,sum-arr[i],arrList,ans,i+1);
              arrList.remove(arrList.size()-1);
          }
      }

    }

    public static void combinationSum2(int[] arr, int sum, List<Integer> arrList, List<List<Integer>> ans,int idx){
        if(sum == 0){
            ans.add(new ArrayList<>(arrList));
        }

        for(int i=idx; i<arr.length; i++){
            if(sum >= arr[i]){
                arrList.add(arr[i]);
                combinationSum2(arr,sum-arr[i],arrList,ans,i+1);
                arrList.remove(arrList.size()-1);
            }
        }

    }

    public static void combinationSum3(int[] arr,int sum, List<Integer> arrList, List<List<Integer>> ans, int idx){
        if(sum == 0){
            ans.add(new ArrayList<>(arrList));
        }
        for(int i=idx; i<arr.length; i++){
            if(sum >= arr[i]){
                arrList.add(arr[i]);
                combinationSum3(arr,sum-arr[i],arrList,ans,i+1);
                arrList.remove(arrList.size()-1);
            }
        }
    }

    public static void combinationSum4(int[] arr, int sum, List<Integer> arrList,List<List<Integer>> ans, int idx){
        if(sum == 0){
            ans.add(new ArrayList<>(arrList));
        }
        for(int i=idx; i<arr.length; i++){
            if(sum >=arr[i]){
                arrList.add(arr[i]);
                combinationSum4(arr,sum-arr[i],arrList,ans,i+1);
                arrList.remove(arrList.size()-1);
            }
        }
    }
}
