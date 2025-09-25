package org.dsa.array;

public class binarySearch_KthRoot {
    public static void main(String[] args) {
        int n= 87;
        int k = 3;
       int result =  KthRoot(n,k);

       System.out.println("Result :: "+result);
    }

    public static int KthRoot(int n, int k){
        int lo=1;
        int hi=n;
        int ans = 0;
        while(lo <= hi){
            int mid = lo+(hi-lo)/2;

            if(Math.pow(mid,k) <= n){
                ans = mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return ans;
    }
}
