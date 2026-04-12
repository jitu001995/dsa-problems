package org.dsa.Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_Median_From_Stream {

    PriorityQueue<Integer> maxHeap; // stores smaller half
    PriorityQueue<Integer> minHeap; // stores larger half

    Find_Median_From_Stream() {

        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }

    public void add(int num) {

        // Step 1: always add to maxHeap first
        maxHeap.offer(num);

        // Step 2: ensure ordering property
        if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
            minHeap.offer(maxHeap.poll());
        }

        // Step 3: balance heap sizes
        if (maxHeap.size() - minHeap.size() >= 2) {
            minHeap.offer(maxHeap.poll());
        } else if (minHeap.size() > maxHeap.size()) {
            maxHeap.offer(minHeap.poll());
        }
    }

    public double findMedian() {

        if (maxHeap.size() == minHeap.size()) {
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
        } else {
            return maxHeap.peek();
        }
    }

    public static void main(String[] args) {

        Find_Median_From_Stream stream = new Find_Median_From_Stream();

        int[] nums = {1, 2, 3, 4, 5, 6};

        for (int num : nums) {
            stream.add(num);
            System.out.println("Inserted: " + num +
                    " | Current Median: " + stream.findMedian());
        }
    }
}