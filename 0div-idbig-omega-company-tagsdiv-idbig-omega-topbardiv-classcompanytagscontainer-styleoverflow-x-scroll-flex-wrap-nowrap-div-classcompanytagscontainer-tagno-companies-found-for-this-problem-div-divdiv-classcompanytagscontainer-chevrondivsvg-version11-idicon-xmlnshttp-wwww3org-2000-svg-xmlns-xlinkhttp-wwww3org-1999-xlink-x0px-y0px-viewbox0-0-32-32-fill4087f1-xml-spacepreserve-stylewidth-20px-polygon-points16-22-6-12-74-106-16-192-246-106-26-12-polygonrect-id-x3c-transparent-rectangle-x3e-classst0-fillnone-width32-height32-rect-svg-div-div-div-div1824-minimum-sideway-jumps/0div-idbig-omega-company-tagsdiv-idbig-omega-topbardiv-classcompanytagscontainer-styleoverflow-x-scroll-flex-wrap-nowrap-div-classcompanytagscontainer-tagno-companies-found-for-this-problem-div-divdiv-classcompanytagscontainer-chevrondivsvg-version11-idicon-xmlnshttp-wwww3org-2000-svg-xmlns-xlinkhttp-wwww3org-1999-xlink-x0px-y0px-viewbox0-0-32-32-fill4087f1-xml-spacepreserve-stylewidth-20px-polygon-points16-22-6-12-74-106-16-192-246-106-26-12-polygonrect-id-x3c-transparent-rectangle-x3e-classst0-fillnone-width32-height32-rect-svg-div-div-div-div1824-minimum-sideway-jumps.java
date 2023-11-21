class Solution {
     int solve(int idx, int lane, int[] obstacles, int[][] dp) {
        int n = obstacles.length - 1;
        if (idx >= n) {
            return 0;
        }
        if (dp[lane][idx] != -1) {
            return dp[lane][idx];
        }


        if (lane != obstacles[idx + 1]) {
            return solve(idx + 1, lane, obstacles, dp);
        } else {
            int count = Integer.MAX_VALUE;
            for (int i = 1; i <= 3; i++) {
                if (lane != i && i != obstacles[idx]) {
                    count = Math.min(count, 1 + solve(idx, i, obstacles, dp));
                }
            }
            dp[lane][idx] = count;
            return dp[lane][idx];
        }
    }

    public int minSideJumps(int[] obstacles) {
        int[][] dp = new int[4][obstacles.length + 1];
        for (int[] temp : dp) {
            Arrays.fill(temp, -1);
        }

        return solve(0, 2, obstacles, dp);
    }
}