package org.dsa.dp.string.BU;

public class String_Edit_Distance_2 {
    public static void main(String[] args) {
        String s = "food";
        String t = "money";

      int res  =   editString(s,t);
      System.out.println("Result :: "+res);
    }

    public static int editString(String s, String t){
      int n = s.length();
      int m = t.length();
      int[][] dp = new int[n+1][m+1];

      // for column
        for(int i=0; i<m; i++){
            dp[0][i]=i;
        }
        // for col
        for(int i=0; i<dp.length; i++){
            dp[i][0] = i;
        }

        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    int delete = dp[i-1][j];
                    int insert = dp[i][j-1];
                    int replace = dp[i-1][j-1];
                    dp[i][j] = 1+Math.min(replace,Math.min(delete,insert));
                }
            }
        }
        return dp[n][m];

    }
}
