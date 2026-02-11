 package org.dsa.array;

public class FindFirstMissingPositive {
    public static void main(String[] args){
       int[] nums ={1, -1,3,4};
      // int missingNum = getFirstMissingPositive(nums);
        int missingNum  = getFirstMissingPositive2(nums);
       System.out.println("First missing Positive :: "+missingNum);
    }

    private static int getFirstMissingPositive(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n; i++){
            while(arr[i] > 0 && arr[i] < n &&  arr[arr[i] - 1] != arr[i]){
                int correctIndex = arr[i]-1;
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] !=i+1){
                return i+1;
            }
        }
       return n+1;
    }



    public static int getFirstMissingPositive2(int[] arr){
        int n= arr.length;

        for(int i=0; i<n; i++){
            while(arr[i]>0 && arr[i]<n && arr[arr[i]-1] !=arr[i]){
                int correctIdx = arr[i]-1;
                int temp = arr[i];
                 arr[i] = arr[correctIdx];
                 arr[correctIdx] = temp;
            }
        }
        for(int i=0; i<n; i++){
            if(arr[i] !=i+1){
                return i+1;
            }
        }
        return n+1;
    }

}
