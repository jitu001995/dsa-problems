package org.dsa.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Fruits_In_Basket {
    public static void main(String[] args){
        int[] fruits = {1,2,1};
        int max =  findMax(fruits);
        System.out.println("Max fruits :: "+max);

    }

    private static int findMax(int[] fruits) {
        int left =0; int maxLen=0;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int right=0; right < fruits.length; right++){
            freq.put(fruits[right], freq.getOrDefault(fruits[right],0)+1);
            while(freq.size()>2){
                freq.put(fruits[left],freq.get(fruits[left])-1);
                if(freq.get(fruits[left])==0){
                    freq.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
