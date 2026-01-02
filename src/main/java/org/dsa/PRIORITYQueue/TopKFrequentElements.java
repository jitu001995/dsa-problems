package org.dsa.PRIORITYQueue;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int k=2;
        int[] result = topKFrequent(arr,k);
    }

    public static int[] topKFrequent(int[] arr,int k){
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int no : arr){
            freqMap.put(no,freqMap.getOrDefault(no,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)->a.getValue()-b.getValue());

        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            minHeap.offer(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
        int i=0;
        int[] result = new int[k];
        while(!minHeap.isEmpty()){
            result[i++]=minHeap.poll().getKey();
        }
        return result;
    }



}
