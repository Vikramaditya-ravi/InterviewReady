class Solution {
          
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int[][] dp = new int[n][n + 1];

        for (int[] temp : dp) {
            Arrays.fill(temp, -1);
        }
        return solve(-1, 0, nums, dp);
    }
     public int solve(int prev, int curr, int[] nums, int[][] dp) {
        if (curr >= nums.length) {
            return 0;
        }

        if (dp[curr][prev + 1] != -1) {
            return dp[curr][prev + 1];
        }

        //take
        int take = 0, noTake;

        if (prev == -1 || nums[curr] > nums[prev]) {
            take = 1 + solve(curr, curr + 1, nums, dp);
        }
        //
        noTake = solve(prev, curr + 1, nums, dp);
        return dp[curr][prev + 1] = Math.max(take, noTake);

    }

}