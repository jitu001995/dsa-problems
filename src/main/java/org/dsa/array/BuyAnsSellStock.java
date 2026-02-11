package org.dsa.array;

public class BuyAnsSellStock {
    public static void main(String[]args){
        int[] arr = {7,1,5,3,6,4};
        int result = maxProfitSoFar(arr);
        System.out.print("Profit :: "+result);
    }

    private static int maxProfitSoFar(int[] arr) {
        int minSoFar = arr[0];  //lowest stock price seen till now This represents the best day to buy so far
        int ans = 0;
        for(int i=1; i<arr.length; i++){
            int profit = arr[i]-minSoFar;    // arr[i] → price on current day (sell day)
                                               //minSoFar → lowest price before today (buy day)
            if(profit > ans){
                ans = profit;
            }
            minSoFar = Math.min(arr[i],minSoFar);
        }
        return ans;

    }

    private static int maxProfitSofar(int[] arr){
        int minSoFar=arr[0];
        int ans =0;
        for(int i=1; i<arr.length; i++){
            int profit = arr[i]-minSoFar;
            if(profit > ans){
                ans = profit;
            }
            minSoFar = Math.min(arr[i],minSoFar);
        }
        return ans;
    }

}
