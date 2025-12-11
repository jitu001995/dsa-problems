package org.dsa.array;

public class printPrimeNumbers {
    public static void main(String[] args){
        int n = 100;
        printPrime(n);
    }
    public static void printPrime(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }

        }
    }
    public static boolean isPrime(int n){
       if(n<2) return false;

       for(int i=2; i*i<=n; i++){
           if(n%i==0) return false;
       }

      return true;
    }
}
