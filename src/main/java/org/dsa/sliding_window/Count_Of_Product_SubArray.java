package org.dsa.sliding_window;

public class Count_Of_Product_SubArray {
    public static void main(String[] args) {
        int [] arr = {10,5,2,6};

        int k = 100;

        int countProductSubArray = countProduct_subArray(arr,k);
        System.out.println("Product SubArray :: "+countProductSubArray);
    }

    private static int countProduct_subArray(int[] arr, int k) {
        int si= 0;
        int ei = 0;

        int p =  1;
        int ans = 0;
        while(ei < arr.length){
            p *= arr[ei];

            while(p >=k && si<=ei){
                p /=arr[si];
                si++;
            }
            ans += (ei-si+1);
            ei++;
        }
        return ans;

    }
}
