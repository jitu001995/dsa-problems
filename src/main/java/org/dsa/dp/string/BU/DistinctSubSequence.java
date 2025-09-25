package org.dsa.dp.string.BU;

public class DistinctSubSequence {
    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        int result = distinctSubSequence(s, t);

        System.out.println("Result " + result);
    }

    public static int distinctSubSequence(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[][] dp = new int[n + 1][m + 1];

        // if t is empty
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return (int) dp[n][m];
    }
}
