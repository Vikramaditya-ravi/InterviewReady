class Solution {
    public int utility(int i,int j,int[] nums1,int[] nums2, int[][] dp){
        if( i >= nums1.length || j >= nums2.length ){
            return 0;
        }
        if (dp[i][j]!= -1){
            return dp[i][j];
        }
        int count = 0;
        if(nums1[i] == nums2[j]){
            count= 1+utility(i+1,j+1,nums1,nums2,dp);
        }
        else{
            count = Math.max(utility(i,j+1,nums1,nums2,dp),utility(i+1,j,nums1,nums2,dp));

        }
        return dp[i][j]= count;
    }
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dp[i][j] = -1;
            }
        }

        return utility(0,0,nums1,nums2,dp);

    }
}