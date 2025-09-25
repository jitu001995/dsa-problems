package org.dsa.array;

public class FindClosest_Element {

    public static void main(String[] args){
       int[] arr = {4, 2, 1, 7, 10};
        int x = 5;
       int closet= findClosest(arr,x);
       System.out.println("Closest :: "+closet);

    }
    public static int findClosest(int[] arr, int x) {
            int closest = arr[0];

            for (int num : arr) {
                // If current number is closer, or equally close but smaller
                if (Math.abs(num - x) < Math.abs(closest - x) ||
                        (Math.abs(num - x) == Math.abs(closest - x) && num < closest)) {
                    closest = num;
                }
            }

            return closest;
        }
}
