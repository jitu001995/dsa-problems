package org.dsa.sort;

import java.util.Arrays;

public class Count_Sort {
        public static void main(String[] args) {
            int[] arr = {0,1,2,3,4,2,1,0,3,4};

            countingSort(arr, 5);

            System.out.println(Arrays.toString(arr));
        }

        public static void countingSort(int[] arr, int k) {
            int[] count = new int[k];

            // count frequency
            for (int num : arr) {
                count[num]++;
            }

            // rebuild array
            int index = 0;
            for (int i = 0; i < k; i++) {
                while (count[i] > 0) {
                    arr[index++] = i;
                    count[i]--;
                }
            }
        }

}
