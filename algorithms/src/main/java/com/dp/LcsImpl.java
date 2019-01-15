package com.dp;

public class LcsImpl {

   public static int lcs(char[] s1, char[] s2, int i, int j){
        if(i == 0 || j == 0){
            return 0;
        }
        if(s1[i-1] == s2[j-1]){
            return 1+lcs(s1,s2,i-1,j-1);
        }
        return Math.max(lcs(s1,s2,i-1,j),lcs(s1,s2,i,j-1));
    }


    public static int lcsDp(char[] s1, char[] s2){
       int m = s1.length;
       int n = s2.length;
       int[][] dp = new int[m+1][n+1];

        for (int i = 0; i <=m; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <=n; i++) {
            dp[0][i] = 0;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n ; j++) {
                if(s1[i-1] == s2[j-1]){
                    dp[i][j] = dp[i-1][j-1]  + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }

        }
        return dp[m][n];

    }

}
