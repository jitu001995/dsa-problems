package org.dsa.sort;

import java.util.Arrays;

/**
 * Insertion Sort Algorithm
 *
 * Idea:
 * - Build the sorted array one element at a time
 * - Pick the current element (key)
 * - Shift all larger elements to the right
 * - Insert the key at its correct position
 *
 * Time Complexity:
 * - Best Case (already sorted): O(n)
 * - Average Case: O(n^2)
 * - Worst Case (reverse sorted): O(n^2)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 *
 * Characteristics:
 * - Stable sorting algorithm
 * - Efficient for small datasets
 * - Commonly used when array is partially sorted
 */
public class InsertionSortAlgo {

    public static void main(String[] args) {
        // Input array
        int[] arr = {8, 3, 5, 2};

        // Perform insertion sort
        insertionSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts the array using Insertion Sort
     *
     * @param arr input array
     */
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element
        // because a single element is already considered sorted
        for (int i = 1; i < n; i++) {

            // Element to be placed at correct position
            int key = arr[i];

            // Index of the last element in the sorted part
            int j = i - 1;

            // Shift elements of sorted part that are greater than key
            // one position ahead to make space for key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key at its correct position
            arr[j + 1] = key;
        }
    }
}
