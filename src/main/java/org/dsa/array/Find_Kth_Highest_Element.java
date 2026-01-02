package org.dsa.array;

import java.util.PriorityQueue;

public class Find_Kth_Highest_Element {
    public static void main(String[] args) {
        int [] arr = {2,4,1,5,6};
        int k = 2;
        int KthHighest = findKthHighest(arr,k);
        System.out.println("Find Second Highest :: "+KthHighest);
    }

    public static int findKthHighest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (Integer no : arr){
            pq.add(no);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static int findKthHighest2(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Integer no : arr){
            pq.add(no);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();

    }


    public static int findKthHighest3(int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(Integer no : arr){
            pq.add(no);
            if(pq.size() > k){
                pq.poll();
            }
        }
        return pq.peek();
    }
}
