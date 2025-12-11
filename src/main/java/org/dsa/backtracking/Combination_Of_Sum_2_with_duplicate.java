package org.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Combination_Of_Sum_2_with_duplicate {
    public static void main(String[] args){
        int[] arr={2,3,4,6,7};
        int sum = 7;

        List<Integer> arrList = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        findCombination(arr,sum,arrList,ans,0);
        System.out.println(ans);
       System.out.println("-----------Printing 4------");
         List<Integer> arrList4 = new ArrayList<>();
         List<List<Integer>> ans4 = new ArrayList<>();
        findCombination4(arr,sum,arrList4,ans4,0);
        System.out.println(ans4);
    }
    private static void findCombination(int[] arr, int sum, List<Integer> arrList, List<List<Integer>> ans,int idx) {
        if(sum == 0){
            ans.add(new ArrayList<>(arrList));
        }
        if (idx == arr.length || sum < 0) {
            return;
        }
        if (sum >= arr[idx]) {
            arrList.add(arr[idx]);
            findCombination(arr, sum - arr[idx], arrList, ans, idx);
            arrList.remove(arrList.size() - 1);
            findCombination(arr, sum, arrList, ans, idx + 1);
        }

    }

    public static void findCombination4(int[] arr, int sum, List<Integer> arrList, List<List<Integer>> ans,int idx){
        if(sum == 0){
            ans.add(new ArrayList<>(arrList));
        }
        if(idx == arr.length || sum < 0){
            return;
        }

        if(sum >=arr[idx]){
            arrList.add(arr[idx]);
            findCombination4(arr,sum-arr[idx],arrList,ans,idx);
            arrList.remove(arrList.size()-1);
            findCombination4(arr,sum,arrList,ans,idx+1);
        }
    }
}
