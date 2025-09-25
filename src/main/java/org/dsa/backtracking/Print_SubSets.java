package org.dsa.backtracking;

import java.util.ArrayList;
import java.util.List;

public class Print_SubSets {

    public static void main(String[] args){
        int[] arr ={1,2,3};

        List<Integer> currentSet = new ArrayList<>();

        List<List<Integer>> subSets = new ArrayList<>();
       // backTrack(arr,0,currentSet,subSets);
        System.out.println("SubSets :: "+subSets);

        generateSubSets2(arr,0,currentSet,subSets);
        System.out.println("SubSets :: "+subSets);

    }

    private static void generateSubSets(int[] arr, int index,
                                        List<Integer> current,
                                        List<List<Integer>> result) {
        // Base case: if we have processed all elements
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // add copy of current set
            return;
        }

        // Case 1: Don't include arr[index]
        generateSubSets(arr, index + 1, current, result);

        // Case 2: Include arr[index]
        current.add(arr[index]);
        generateSubSets(arr, index + 1, current, result);

        // Backtrack (remove last added element)
        current.remove(current.size() - 1);
    }
 public static void generateSubSets2(int[] arr,int index, List<Integer> current,List<List<Integer>> result){
        if(index == arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        generateSubSets2(arr,index+1,current,result);
        current.add(arr[index]);
        generateSubSets2(arr,index+1,current,result);
        current.remove(current.size()-1);
 }

}
