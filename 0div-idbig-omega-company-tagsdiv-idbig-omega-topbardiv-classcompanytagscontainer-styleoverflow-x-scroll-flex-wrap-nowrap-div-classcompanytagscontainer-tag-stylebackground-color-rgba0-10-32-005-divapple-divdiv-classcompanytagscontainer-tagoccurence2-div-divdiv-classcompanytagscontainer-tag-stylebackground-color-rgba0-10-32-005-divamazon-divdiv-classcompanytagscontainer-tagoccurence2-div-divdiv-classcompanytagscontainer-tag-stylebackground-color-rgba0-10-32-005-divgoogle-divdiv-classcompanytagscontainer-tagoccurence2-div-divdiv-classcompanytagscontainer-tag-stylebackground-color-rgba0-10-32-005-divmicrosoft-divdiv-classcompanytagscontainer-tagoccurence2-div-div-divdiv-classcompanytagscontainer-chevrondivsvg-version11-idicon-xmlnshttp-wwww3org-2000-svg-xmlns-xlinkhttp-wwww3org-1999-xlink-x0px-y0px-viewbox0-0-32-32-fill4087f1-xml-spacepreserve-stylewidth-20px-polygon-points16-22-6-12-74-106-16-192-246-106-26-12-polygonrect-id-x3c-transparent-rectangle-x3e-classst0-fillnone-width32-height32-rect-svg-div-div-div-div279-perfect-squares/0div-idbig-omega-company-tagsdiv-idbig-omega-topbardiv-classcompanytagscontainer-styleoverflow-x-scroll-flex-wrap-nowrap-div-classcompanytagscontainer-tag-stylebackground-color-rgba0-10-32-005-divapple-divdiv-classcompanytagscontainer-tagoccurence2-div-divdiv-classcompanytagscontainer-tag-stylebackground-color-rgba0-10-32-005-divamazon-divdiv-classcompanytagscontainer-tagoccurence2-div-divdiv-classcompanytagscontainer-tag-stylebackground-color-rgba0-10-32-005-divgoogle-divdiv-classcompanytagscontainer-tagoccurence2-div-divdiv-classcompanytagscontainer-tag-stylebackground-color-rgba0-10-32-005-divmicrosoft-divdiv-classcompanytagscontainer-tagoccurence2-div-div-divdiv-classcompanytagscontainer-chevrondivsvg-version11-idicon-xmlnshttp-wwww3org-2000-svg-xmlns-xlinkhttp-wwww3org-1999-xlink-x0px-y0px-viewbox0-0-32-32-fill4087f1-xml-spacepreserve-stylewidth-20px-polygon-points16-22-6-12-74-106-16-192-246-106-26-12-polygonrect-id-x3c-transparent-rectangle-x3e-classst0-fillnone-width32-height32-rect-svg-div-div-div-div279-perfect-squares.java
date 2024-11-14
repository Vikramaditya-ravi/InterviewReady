class Solution {
    public int solveMem2(int n, int[] dp) {
        int count = (int) Math.sqrt(n);
        if (count * count == n) {
            return 1;
        }
        if (dp[n] != -1) {
            return dp[n];
        }
        int mini = Integer.MAX_VALUE;
        for (int i = 1; i <= count; i++) {
            mini = Math.min(mini,1+solveMem2(n - i * i, dp));
        }
        return dp[n] = mini;
    }

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        return solveMem2(n, dp);


    }
}