package org.dsa.permutation;

public class Permutation1 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,5};
        int amount = 4;
        permutation(arr,amount,"");
    }

    private static void permutation(int[] arr, int amount,String ans) {
        if(amount == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(amount >= arr[i]){
                permutation(arr,amount-arr[i],ans+arr[i]);
            }
        }
    }
}
