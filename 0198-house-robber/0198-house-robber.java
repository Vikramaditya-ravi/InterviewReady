class Solution {
    public int rob(int[] nums) {
      int n = nums.length;
        
        if(n == 1){

            return nums[0];
        }
        
        int maxi = Math.max(nums[0],nums[1]);
        int preMax = nums[0];
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        for (int i = 2; i < n; i++) {
            dp[i] = preMax+nums[i];
            maxi = Math.max(maxi,dp[i]);
            preMax = Math.max(preMax,dp[i-1]);

        }
        return maxi;  
    }
}