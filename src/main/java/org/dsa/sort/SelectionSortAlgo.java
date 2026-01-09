package org.dsa.sort;

import java.util.Arrays;

/**
 * Selection Sort Algorithm
 *
 * Idea:
 * - Repeatedly find the minimum element from the unsorted part
 * - Move it to the beginning of the array
 *
 * Time Complexity:
 * - Best / Average / Worst: O(n^2)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 *
 * Characteristics:
 * - Not stable
 * - Simple but inefficient for large datasets
 */
public class SelectionSortAlgo {

    public static void main(String[] args) {
        // Input array to be sorted
        int[] arr = {64, 25, 12, 22};

        // Perform selection sort
        selectionSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts the array using Selection Sort
     *
     * @param arr input array
     */
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through the array except last element
        for (int i = 0; i < n - 1; i++) {

            // Assume current index has the minimum element
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first unsorted element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
