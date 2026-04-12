package org.dsa.sort;

import java.util.ArrayList;
import java.util.List;

public class CountSmaller {

    static int[] count;
    static int[] index;  // tracks original indices

    public static void main(String[] args) {

        // ✅ Static input
        int[] nums = {5, 2, 6, 1};

        List<Integer> result = countSmaller(nums);

        System.out.println(result);  // Expected: [2, 1, 1, 0]
    }

        public static List<Integer> countSmaller(int[] nums) {
            int n = nums.length;
            count = new int[n];
            index = new int[n];

            // initialize index array
            for (int i = 0; i < n; i++) {
                index[i] = i;
            }

            mergeSort(nums, 0, n - 1);

            // convert to List
            List<Integer> result = new ArrayList<>();
            for (int c : count) {
                result.add(c);
            }
            return result;
        }

        private static void mergeSort(int[] nums, int left, int right) {
            if (left >= right) return;

            int mid = left + (right - left) / 2;

            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            merge(nums, left, mid, right);
        }

        private static void merge(int[] nums, int left, int mid, int right) {
            int[] temp = new int[right - left + 1];

            int i = left;
            int j = mid + 1;
            int k = 0;
            int rightCount = 0;

            while (i <= mid && j <= right) {
                if (nums[index[j]] < nums[index[i]]) {
                    temp[k++] = index[j++];
                    rightCount++;  // found smaller element on right
                } else {
                    count[index[i]] += rightCount;
                    temp[k++] = index[i++];
                }
            }

            // remaining left elements
            while (i <= mid) {
                count[index[i]] += rightCount;
                temp[k++] = index[i++];
            }

            // remaining right elements
            while (j <= right) {
                temp[k++] = index[j++];
            }

            // copy back
            for (int p = 0; p < temp.length; p++) {
                index[left + p] = temp[p];
            }
        }

}
