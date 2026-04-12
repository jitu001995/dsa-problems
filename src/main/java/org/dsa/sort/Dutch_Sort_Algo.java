package org.dsa.sort;

import java.util.*;

public class Dutch_Sort_Algo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,1,2,0,2,0,0,0,1,0};

        sort012(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort012(int[] arr) {
        int low = 0, mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            }
            else if (arr[mid] == 1) {
                mid++;
            }
            else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
