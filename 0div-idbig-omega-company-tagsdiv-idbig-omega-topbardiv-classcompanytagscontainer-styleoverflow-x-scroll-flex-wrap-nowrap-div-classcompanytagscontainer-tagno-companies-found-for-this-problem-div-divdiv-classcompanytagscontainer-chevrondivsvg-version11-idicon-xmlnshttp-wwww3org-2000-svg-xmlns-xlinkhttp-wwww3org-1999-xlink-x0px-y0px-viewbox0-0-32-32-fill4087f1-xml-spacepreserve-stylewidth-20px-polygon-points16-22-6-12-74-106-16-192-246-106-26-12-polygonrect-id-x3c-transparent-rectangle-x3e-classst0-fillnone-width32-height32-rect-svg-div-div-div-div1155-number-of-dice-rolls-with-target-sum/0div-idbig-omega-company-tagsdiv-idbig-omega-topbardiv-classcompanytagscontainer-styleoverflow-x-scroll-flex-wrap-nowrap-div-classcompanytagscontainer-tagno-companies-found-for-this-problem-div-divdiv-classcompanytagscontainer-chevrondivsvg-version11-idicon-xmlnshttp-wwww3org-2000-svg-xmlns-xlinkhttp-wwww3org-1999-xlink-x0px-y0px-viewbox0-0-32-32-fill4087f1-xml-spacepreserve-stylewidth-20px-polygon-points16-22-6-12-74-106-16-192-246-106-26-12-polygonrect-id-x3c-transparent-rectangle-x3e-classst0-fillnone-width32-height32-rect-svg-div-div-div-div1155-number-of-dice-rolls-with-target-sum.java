class Solution {
   int mod = 1000000007;

    public int solve(int n, int k, int target, int[][] dp) {
        if (n == 0 && target == 0) {
            return 1;
        }
        if (target <= 0 || n <= 0) {
            return 0;
        }
        if (dp[n][target] != -1) {
            return dp[n][target];
        }
        int ans = 0;
        for (int i = 1; i <= k; i++) {
            ans = ((ans) % mod + solve(n - 1, k, target - i, dp) % mod) % mod;
        }
        return dp[n][target] = ans;
    }

    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp = new int[n + 1][target + 1];
        for (int[] temp : dp) {
            Arrays.fill(temp, -1);
        }
        return solve(n, k, target, dp);
    }
}