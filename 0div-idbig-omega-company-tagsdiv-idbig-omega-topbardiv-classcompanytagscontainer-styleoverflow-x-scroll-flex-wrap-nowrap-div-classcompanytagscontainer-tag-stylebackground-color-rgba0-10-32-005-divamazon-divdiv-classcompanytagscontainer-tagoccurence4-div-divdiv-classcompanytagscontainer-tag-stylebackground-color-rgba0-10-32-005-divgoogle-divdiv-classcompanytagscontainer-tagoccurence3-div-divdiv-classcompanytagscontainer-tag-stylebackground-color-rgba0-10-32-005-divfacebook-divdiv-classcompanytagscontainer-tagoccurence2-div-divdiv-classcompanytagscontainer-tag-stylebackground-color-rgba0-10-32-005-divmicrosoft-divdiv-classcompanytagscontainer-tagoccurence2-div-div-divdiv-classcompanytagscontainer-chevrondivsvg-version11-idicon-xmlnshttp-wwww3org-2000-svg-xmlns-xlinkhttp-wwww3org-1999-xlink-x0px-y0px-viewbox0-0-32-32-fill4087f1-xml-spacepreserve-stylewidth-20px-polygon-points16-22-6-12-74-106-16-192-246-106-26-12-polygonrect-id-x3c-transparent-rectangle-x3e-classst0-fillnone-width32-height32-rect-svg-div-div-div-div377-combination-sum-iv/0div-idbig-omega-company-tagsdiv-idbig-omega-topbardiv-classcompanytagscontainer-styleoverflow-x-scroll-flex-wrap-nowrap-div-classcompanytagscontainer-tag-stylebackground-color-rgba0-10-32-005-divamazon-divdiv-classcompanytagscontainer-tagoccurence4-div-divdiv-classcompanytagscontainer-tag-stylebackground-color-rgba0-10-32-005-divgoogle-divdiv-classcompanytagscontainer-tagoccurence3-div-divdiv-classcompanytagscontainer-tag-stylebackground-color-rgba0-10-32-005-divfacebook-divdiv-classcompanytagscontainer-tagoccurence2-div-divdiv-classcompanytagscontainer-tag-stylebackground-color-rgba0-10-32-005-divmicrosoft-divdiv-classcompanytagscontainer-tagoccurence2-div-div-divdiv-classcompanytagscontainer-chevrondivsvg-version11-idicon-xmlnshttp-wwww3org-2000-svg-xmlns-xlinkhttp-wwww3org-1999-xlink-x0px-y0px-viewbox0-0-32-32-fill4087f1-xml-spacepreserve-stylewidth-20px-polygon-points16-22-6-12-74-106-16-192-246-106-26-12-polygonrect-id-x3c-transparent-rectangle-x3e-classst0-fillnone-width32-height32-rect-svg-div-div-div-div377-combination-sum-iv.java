class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[target + 1];

        Arrays.fill(dp, -1);
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            int res = 0;
            for (int num : nums) {
                if (i >= num) {
                    res += dp[i - num];
                }
            }
            dp[i] = res;
        }
        return dp[target];
    }
}