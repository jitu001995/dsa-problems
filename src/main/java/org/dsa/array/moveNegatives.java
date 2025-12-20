package org.dsa.array;

import java.util.Arrays;

public class moveNegatives {
    public static void main(String[] args){
        int[] arr = {1, -2, 3, -4, -1, 4, -6};
        moveNegatives(arr);
        System.out.println(Arrays.toString(arr));

       // moveNegativesStableWithOrder(arr);
    }

    // below method doesn't maintain order
    public static void moveNegatives(int[] arr){

        int j=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                if(i!=j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

  // this method mentaind order
    public static void moveNegativesStableWithOrder(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        // Copy negatives
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy positives
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                temp[index++] = arr[i];
            }
        }

        // Copy back
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

}
