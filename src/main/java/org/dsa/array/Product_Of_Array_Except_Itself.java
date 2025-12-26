package org.dsa.array;

import java.util.Arrays;

public class Product_Of_Array_Except_Itself {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};

        int [] productArr = productExceptItself(arr);

        System.out.println("Proudct of Array :: "+ Arrays.toString(productArr));

      int[] result =  productItself2(arr);
        System.out.println("Second call Proudct of Array :: "+ Arrays.toString(result));

        int[] result6 = productArrayExceptItself6(arr);
        System.out.println("Product Array 6 :: "+Arrays.toString(result6));

        int[] result8 = productArrayExceptItself8(arr);
        System.out.println("Product Array 7 :: "+Arrays.toString(result8));

        int[] result9 = productExceptIteself9(arr);
        System.out.println("product Array :: "+Arrays.toString(result9));
    }

    private static int[] productExceptItself(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        output[0]=1;
        int prefix = 1;

        for(int i=1; i<n; i++){
            output[i] = output[i-1]*arr[i-1];
        }
        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            output[i] = output[i]*suffix;
            suffix *=arr[i];
        }
        return output;
    }


    public static int[] productItself2(int[] arr){
        int n = arr.length;
        int [] output = new int[n];
        output[0]=1;
        int prefix = 1;
        for(int i=1; i<n; i++){
            output[i] = output[i-1]*arr[i-1];
        }
        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            output[i] *=suffix;
            suffix *=arr[i];
        }
        return output;
    }

    public static int[] productArrayExpectItself4(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        output[0]=1;
        int prefix = 1;
        for(int i=1; i<=n; i++){
            output[i] = output[i-1]*arr[i-1];
        }
        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            output[i] *=suffix;
            suffix *=arr[i];
        }
        return output;
    }

    public static int[] productArrayExceptItself6(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        output[0] = 1;
        int prefix =1;
        for(int i=1; i<n; i++){
            output[i] = output[i-1]*arr[i-1];
        }
        int suffix=1;
        for(int i=n-1; i>=0; i--){
            output[i] *=suffix;
            suffix *=arr[i];
        }
         return output;
    }


    public static int[] productArrayExceptItself8(int[] arr){
        int n=arr.length;
        int [] output=new int[n];
        output[0] = 1;
        for(int i=1; i<n; i++){
            output[i] = output[i-1]*arr[i-1];
        }
        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            output[i] = output[i]*suffix;
            suffix *=arr[i];
        }
        return output;
    }

    public static int[] productExceptIteself9(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        output[0]=1;
        for(int i=1; i<n; i++){
            output[i]=output[i-1]*arr[i-1];
        }
        int suffix = 1;
        for(int i=n-1; i>=0; i--){
            output[i] = output[i]*suffix;
            suffix *=arr[i];
        }
        return output;
    }
}
