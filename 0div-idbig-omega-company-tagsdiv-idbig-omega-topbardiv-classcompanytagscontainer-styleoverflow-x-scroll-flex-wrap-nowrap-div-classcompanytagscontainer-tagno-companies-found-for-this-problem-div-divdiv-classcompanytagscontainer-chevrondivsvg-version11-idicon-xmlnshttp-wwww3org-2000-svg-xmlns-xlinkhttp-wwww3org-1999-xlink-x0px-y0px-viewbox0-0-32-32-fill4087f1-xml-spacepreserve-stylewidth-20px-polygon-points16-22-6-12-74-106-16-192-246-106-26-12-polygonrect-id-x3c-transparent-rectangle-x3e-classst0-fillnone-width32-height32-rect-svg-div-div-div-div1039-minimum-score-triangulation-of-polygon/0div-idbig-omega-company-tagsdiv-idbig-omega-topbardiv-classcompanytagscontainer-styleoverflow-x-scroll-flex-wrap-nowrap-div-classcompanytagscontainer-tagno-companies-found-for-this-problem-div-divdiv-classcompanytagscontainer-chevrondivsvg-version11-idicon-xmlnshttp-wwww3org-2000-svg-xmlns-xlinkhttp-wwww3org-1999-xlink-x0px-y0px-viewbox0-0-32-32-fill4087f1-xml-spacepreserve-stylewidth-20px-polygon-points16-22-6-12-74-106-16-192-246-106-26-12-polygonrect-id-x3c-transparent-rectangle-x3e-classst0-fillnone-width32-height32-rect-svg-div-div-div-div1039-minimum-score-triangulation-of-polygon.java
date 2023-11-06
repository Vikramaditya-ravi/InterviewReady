class Solution {
    
    public int solve(int[] values,int i,int j,int[][] dp){
        if(i+1 == j){
            return 0;
        }
        if( dp[i][j] != 0){
            return dp[i][j];
        }
        int ans = Integer.MAX_VALUE;
        for(int k = i+1; k < j; k++){
            dp[i][k] = solve(values,i,k,dp);
            dp[k][j] = solve(values,k,j,dp);
            ans = Math.min(ans,values[i]*values[j]*values[k]+dp[i][k]+dp[k][j]);
        }
        return ans;
    }
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];
        return solve(values,0,n-1,dp);
        
    }
}