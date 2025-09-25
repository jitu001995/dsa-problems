package org.dsa.dp.string.BU;

public class LomgestSubSequence {
    public static void main(String[] args) {
      String s = "abcde";
      String t = "ace";

     int result =  lcsBU(s, t);
     System.out.println("Result : "+result);

       int result2 =  lcsBU2(s,t);
       System.out.println("Resullt 2 ::"+result2);
    }

    public static int lcsBU(String s, String t){
        int n=s.length();
        int m = t.length();
        int[][] dp = new int[n+1][m+1];

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
               // int ans =0;
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }else {
                    int a = dp[i - 1][j];
                    int b = dp[i][j - 1];
                    dp[i][j] = Math.max(a, b);
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

    public static int lcsBU2(String s, String t){
        int [][] dp = new int[s.length()+1][t.length()+1];
        for(int i=1; i<dp.length; i++){
             for(int j=1; j<dp[0].length; j++){
                 if(s.charAt(i-1) == t.charAt(j-1)){
                 dp[i][j] = 1+dp[i-1][j-1];
                 }else{
                     int a = dp[i-1][j];
                     int b = dp[i][j-1];
                     dp[i][j] = Math.max(a,b);
                 }
             }
        }
        return dp[dp.length-1][dp[0].length-1];
    }

}
