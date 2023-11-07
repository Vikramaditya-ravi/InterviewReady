class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];

        Arrays.fill(dp, -1);
        dp[0] = 1;
        solve(nums, target, dp);
        return dp[target];
    }
      public int solve(int[] nums, int target, int[] dp) {
        if(dp[target] != -1){
            return dp[target];
        }
        int res = 0;
        for (int num : nums) {
            if (target >= num) {
                res += solve(nums, target - num, dp);
            }
        }
        return dp[target] = res;
    }
}