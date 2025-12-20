package org.dsa.array;

public class FindClosest_Element {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 7, 10};
        int x = 5;

        int closest1 = findClosestSimple(arr, x);
        System.out.println("Closest (Simple) :: " + closest1);

        int closest2 = findClosestWithTie(arr, x);
        System.out.println("Closest (With Tie Rule) :: " + closest2);
    }

    // --------------------------------------------------
    // Method 1: Simple closest element
    // Finds the element with minimum distance from x
    // Does NOT handle tie case explicitly
    // --------------------------------------------------
    public static int findClosestSimple(int[] arr, int x) {

        // Assume first element is the closest initially
        int closest = arr[0];

        // Traverse array from second element
        for (int i = 1; i < arr.length; i++) {

            // If current element is closer to x than previous closest
            if (Math.abs(arr[i] - x) < Math.abs(closest - x)) {
                closest = arr[i];
            }
        }

        // Return the closest element found
        return closest;
    }

    // --------------------------------------------------
    // Method 2: Closest element with tie handling
    // If two numbers are equally close, return the smaller one
    // --------------------------------------------------
    public static int findClosestWithTie(int[] arr, int x) {

        // Assume first element is the closest initially
        int closest = arr[0];

        // Traverse array from second element
        for (int i = 1; i < arr.length; i++) {

            // Distance of current element from x
            int diffCurrent = Math.abs(arr[i] - x);

            // Distance of closest element from x
            int diffClosest = Math.abs(closest - x);

            // Update closest if:
            // 1. Current element is closer
            // 2. Distance is same but current element is smaller
            if (diffCurrent < diffClosest ||
                    (diffCurrent == diffClosest && arr[i] < closest)) {
                closest = arr[i];
            }
        }

        // Return the closest element found
        return closest;
    }
}
