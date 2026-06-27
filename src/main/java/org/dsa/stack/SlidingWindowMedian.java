package org.dsa.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    class DualHeap {

        PriorityQueue<Integer> small;
        PriorityQueue<Integer> large;

        Map<Integer, Integer> delayed;

        int k;

        int smallSize;
        int largeSize;

        public DualHeap(int k) {

            this.k = k;

            small = new PriorityQueue<>((a, b) -> b - a);
            large = new PriorityQueue<>();

            delayed = new HashMap<>();
        }

        // insert number
        public void add(int num) {

            if (small.isEmpty() || num <= small.peek()) {
                small.offer(num);
                smallSize++;
            } else {
                large.offer(num);
                largeSize++;
            }

            balance();
        }

        // lazy remove
        public void remove(int num) {

            delayed.put(num,
                    delayed.getOrDefault(num, 0) + 1);

            if (num <= small.peek()) {
                smallSize--;

                if (num == small.peek()) {
                    prune(small);
                }

            } else {

                largeSize--;

                if (!large.isEmpty() && num == large.peek()) {
                    prune(large);
                }
            }

            balance();
        }

        // rebalance heaps
        private void balance() {

            // small can have only one extra
            if (smallSize > largeSize + 1) {

                large.offer(small.poll());

                smallSize--;
                largeSize++;

                prune(small);
            }

            else if (smallSize < largeSize) {

                small.offer(large.poll());

                smallSize++;
                largeSize--;

                prune(large);
            }
        }

        // remove delayed elements
        private void prune(PriorityQueue<Integer> heap) {

            while (!heap.isEmpty()) {

                int num = heap.peek();

                if (delayed.containsKey(num)) {

                    delayed.put(num,
                            delayed.get(num) - 1);

                    if (delayed.get(num) == 0) {
                        delayed.remove(num);
                    }

                    heap.poll();

                } else {
                    break;
                }
            }
        }

        // get median
        public double getMedian() {

            if (k % 2 == 1) {
                return (double) small.peek();
            }

            return ((double) small.peek()
                    + (double) large.peek()) / 2.0;
        }
    }

    public double[] medianSlidingWindow(int[] nums, int k) {

        DualHeap dh = new DualHeap(k);

        int n = nums.length;

        double[] result = new double[n - k + 1];

        // first window
        for (int i = 0; i < k; i++) {
            dh.add(nums[i]);
        }

        result[0] = dh.getMedian();

        // sliding window
        for (int i = k; i < n; i++) {

            dh.add(nums[i]);

            dh.remove(nums[i - k]);

            result[i - k + 1] = dh.getMedian();
        }

        return result;
    }
}
