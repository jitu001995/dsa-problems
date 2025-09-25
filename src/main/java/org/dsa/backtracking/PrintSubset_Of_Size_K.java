package org.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintSubset_Of_Size_K {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        int n=2;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateSubSets(arr,n,0,current,result);
        for(List<Integer> subsets : result){
            System.out.println(subsets);
        }
    }

    private static void generateSubSets(int[] arr, int n, int idx, List<Integer> current, List<List<Integer>> result) {
       if(current.size()==n){
           result.add(new ArrayList<>(current));
           return;
       }

       for(int i=idx; i<arr.length; i++){
           current.add(arr[i]);
           generateSubSets(arr,n,i+1,current,result);
           current.remove(current.size()-1);
       }
    }
}
