package org.dsa.sort;

import java.util.Arrays;

/**
 * Cycle Sort (Cyclic Sort for 1..N)
 *
 * Idea:
 * - Each element has a correct index: value - 1
 * - Keep swapping elements until every number is at its correct position
 *
 * Preconditions:
 * - Array contains numbers from 1 to N
 * - No duplicates
 *
 * Time Complexity:
 * - Best / Average / Worst: O(n)
 *
 * Space Complexity:
 * - O(1) (In-place sorting)
 *
 * Characteristics:
 * - Very efficient when constraints are met
 * - Not a general-purpose sorting algorithm
 * - Commonly used in problems involving missing / duplicate numbers
 */
public class CycleSortAlgo {

    public static void main(String[] args) {
        // Input array (values must be in range 1..N)
        int[] arr = {3, 1, 4, 2, 5};

        // Perform cyclic sort
        sort(arr);

        // Print sorted array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts the array using Cyclic Sort
     *
     * @param arr input array containing numbers from 1 to N
     */
    static void sort(int[] arr) {
        int i = 0;

        // Iterate until all elements are placed at correct index
        while (i < arr.length) {

            // Correct index for current value
            int correctIndex = arr[i] - 1;

            // If element is not at its correct position, swap it
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            // Move to next index if current element is correct
            else {
                i++;
            }
        }
    }
}
