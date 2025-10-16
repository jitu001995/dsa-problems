package org.dsa.dp.array.BU;

public class PalinDromeSubSequenceCount {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(countPalindromicSubseq(s)); // 4
    }
    public static int countPalindromicSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];

        // Base case: single letters
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }

        // Fill DP table
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] + 1;
                } else {
                    dp[i][j] = dp[i+1][j] + dp[i][j-1] - dp[i+1][j-1];
                }
            }
        }

        return dp[0][n-1];
    }


}
