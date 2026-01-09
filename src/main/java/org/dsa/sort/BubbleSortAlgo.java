package org.dsa.sort;

import java.util.Arrays;

/**
 * Bubble Sort Algorithm
 *
 * Idea:
 * - Repeatedly compare adjacent elements
 * - Swap them if they are in the wrong order
 * - After each pass, the largest element "bubbles up" to the end
 *
 * Time Complexity:
 * - Best Case (already sorted, with optimization): O(n)
 * - Average Case: O(n^2)
 * - Worst Case (reverse sorted): O(n^2)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 *
 * Characteristics:
 * - Stable sorting algorithm
 * - Very easy to understand
 * - Inefficient for large datasets
 */
public class BubbleSortAlgo {

    public static void main(String[] args) {
        // Input array
        int[] arr = {4, 2, 3, 5, 1};

        // Perform bubble sort
        bubbleSort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts the array using Bubble Sort
     *
     * @param arr input array
     */
    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Outer loop for number of passes
        for (int i = 0; i < n - 1; i++) {

            // Flag to check if any swap happened in this pass
            boolean swapped = false;

            // Inner loop for comparing adjacent elements
            // Last i elements are already sorted
            for (int j = 1; j < n - i; j++) {

                // Swap if elements are in wrong order
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    // Mark that a swap occurred
                    swapped = true;
                }
            }

            // If no swaps occurred, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
