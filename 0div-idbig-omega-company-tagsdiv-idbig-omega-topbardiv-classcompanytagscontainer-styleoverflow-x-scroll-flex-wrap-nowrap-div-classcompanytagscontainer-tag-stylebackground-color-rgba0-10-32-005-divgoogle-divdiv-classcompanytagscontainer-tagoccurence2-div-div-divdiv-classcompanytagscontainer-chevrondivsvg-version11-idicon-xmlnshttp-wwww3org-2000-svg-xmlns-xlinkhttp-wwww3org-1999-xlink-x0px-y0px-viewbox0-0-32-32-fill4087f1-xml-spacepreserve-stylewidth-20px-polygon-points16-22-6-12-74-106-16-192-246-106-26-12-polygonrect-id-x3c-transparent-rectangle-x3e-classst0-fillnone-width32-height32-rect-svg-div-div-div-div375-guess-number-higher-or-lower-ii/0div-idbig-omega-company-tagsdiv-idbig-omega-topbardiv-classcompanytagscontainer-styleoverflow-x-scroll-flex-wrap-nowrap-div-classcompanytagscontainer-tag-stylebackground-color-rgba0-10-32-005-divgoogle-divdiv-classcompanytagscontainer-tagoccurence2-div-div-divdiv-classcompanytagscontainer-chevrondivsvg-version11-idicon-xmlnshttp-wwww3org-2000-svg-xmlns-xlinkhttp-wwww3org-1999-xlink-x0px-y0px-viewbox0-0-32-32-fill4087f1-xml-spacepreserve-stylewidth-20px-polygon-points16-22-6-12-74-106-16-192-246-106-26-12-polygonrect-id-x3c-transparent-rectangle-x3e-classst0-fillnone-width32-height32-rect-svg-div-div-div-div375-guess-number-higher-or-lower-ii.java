class Solution {
     public int solve(int start, int end, int[][] dp) {
        if (start >= end) {
            return 0;
        }
        if (dp[start][end] != 0) {
            return dp[start][end];
        }
        int ans = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            ans = Math.min(ans, i + Math.max(solve(start, i - 1, dp),
                    solve(i + 1, end, dp)));
        }
        return dp[start][end] = ans;

    }

    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 1][n + 1];

        for (int[] ints : dp) {
            Arrays.fill(ints, 0);
        }


        return solve(0, n, dp);


    }
}