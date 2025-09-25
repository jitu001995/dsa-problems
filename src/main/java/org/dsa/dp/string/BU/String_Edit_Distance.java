package org.dsa.dp.string.BU;

public class String_Edit_Distance {
    public static void main(String[] args) {
        String s = "food";
        String t = "money";
        int result = editInsertString(s,t);
        System.out.println("Ways :: "+result);

       int result2 =  editDistanceString2(s,t);
        System.out.println("Result 2  :: "+result2);

      int result3 =   editInsertString3(s,t);
        System.out.println("Result 3  :: "+result3);

    }

    public static int editInsertString(String s,String t){
        int n = s.length();
        int m = t.length();
        int[][] dp = new int[n + 1][m + 1];

        // column
        for(int i=1; i<dp[0].length; i++){
            dp[0][i] = i;
        }
        // row
        for(int i=1; i< dp.length; i++) {
            dp[i][0] = i;
        }

        for(int i=1; i< dp.length; i++){
            for(int j=1; j<dp[0].length; j++){

                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }else{
                    int delete = dp[i-1][j];
                    int insert = dp[i][j-1];
                    int replace = dp[i-1][j-1];
                    dp[i][j] = 1 + Math.min(replace, Math.min(delete, insert));
                }
            }
        }
        return dp[n][m];
    }

    public static int editDistanceString2(String s, String t){
        int m = s.length();
        int n = t.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=1; i<dp[0].length; i++){
            dp[0][i] = i;
        }
        for(int j=1; j<dp.length; j++){
            dp[j][0] = j;
        }

        for(int i=1; i<dp.length; i++){
          for(int j=1; j<dp[0].length; j++){
              if(s.charAt(i-1)==t.charAt(j-1)){
                  dp[i][j] = dp[i-1][j-1];
              }else{
                  int delete = dp[i-1][j];
                  int insert = dp[i][j-1];
                  int replace = dp[i-1][j-1];
                  dp[i][j] = 1+Math.min(replace,Math.min(insert,delete));
              }
          }
        }
     return dp[m][n];
    }



    public static int editInsertString3(String s, String t){
        int n= s.length();
        int m = t.length();
        int[][] dp = new int[n+1][m+1];

        // column
        for(int i=1; i<dp[0].length; i++){
            dp[0][i] = i;
        }

        //row
        for(int i=1; i<dp.length; i++){
            dp[i][0] = i;
        }
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
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
