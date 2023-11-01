class Solution {
    public int lcsUtility(int i,int j,String text1,String text2,int[][] dp){
        if (i >= text1.length() || j>= text2.length()){
            return 0;
        }
        int count  = 0;
        if (dp[i][j] != -1){
            return dp[i][j];
        }
        
        if (text1.charAt(i) ==text2.charAt(j) ){
            count=1+lcsUtility(i+1,j+1,text1,text2,dp);
        }
        else {
            count = Math.max(lcsUtility(i+1,j,text1,text2,dp),
                    lcsUtility(i,j+1,text1,text2,dp));
        }
        
        return dp[i][j] = count;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m = text2.length();
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }
        return lcsUtility(0,0,text1,text2,dp);
        
        
    }
}