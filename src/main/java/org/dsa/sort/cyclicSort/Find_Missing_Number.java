package org.dsa.sort.cyclicSort;

public class Find_Missing_Number {
   public static void main(String[] args){
       int[] arr={3,0,1};
       System.out.println(findMissingNumber(arr));
   }
    public static int findMissingNumber(int[]arr){
        int n = arr.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;

        for(int num : arr){
            actual += num;
        }

        return expected - actual;
    }
}
