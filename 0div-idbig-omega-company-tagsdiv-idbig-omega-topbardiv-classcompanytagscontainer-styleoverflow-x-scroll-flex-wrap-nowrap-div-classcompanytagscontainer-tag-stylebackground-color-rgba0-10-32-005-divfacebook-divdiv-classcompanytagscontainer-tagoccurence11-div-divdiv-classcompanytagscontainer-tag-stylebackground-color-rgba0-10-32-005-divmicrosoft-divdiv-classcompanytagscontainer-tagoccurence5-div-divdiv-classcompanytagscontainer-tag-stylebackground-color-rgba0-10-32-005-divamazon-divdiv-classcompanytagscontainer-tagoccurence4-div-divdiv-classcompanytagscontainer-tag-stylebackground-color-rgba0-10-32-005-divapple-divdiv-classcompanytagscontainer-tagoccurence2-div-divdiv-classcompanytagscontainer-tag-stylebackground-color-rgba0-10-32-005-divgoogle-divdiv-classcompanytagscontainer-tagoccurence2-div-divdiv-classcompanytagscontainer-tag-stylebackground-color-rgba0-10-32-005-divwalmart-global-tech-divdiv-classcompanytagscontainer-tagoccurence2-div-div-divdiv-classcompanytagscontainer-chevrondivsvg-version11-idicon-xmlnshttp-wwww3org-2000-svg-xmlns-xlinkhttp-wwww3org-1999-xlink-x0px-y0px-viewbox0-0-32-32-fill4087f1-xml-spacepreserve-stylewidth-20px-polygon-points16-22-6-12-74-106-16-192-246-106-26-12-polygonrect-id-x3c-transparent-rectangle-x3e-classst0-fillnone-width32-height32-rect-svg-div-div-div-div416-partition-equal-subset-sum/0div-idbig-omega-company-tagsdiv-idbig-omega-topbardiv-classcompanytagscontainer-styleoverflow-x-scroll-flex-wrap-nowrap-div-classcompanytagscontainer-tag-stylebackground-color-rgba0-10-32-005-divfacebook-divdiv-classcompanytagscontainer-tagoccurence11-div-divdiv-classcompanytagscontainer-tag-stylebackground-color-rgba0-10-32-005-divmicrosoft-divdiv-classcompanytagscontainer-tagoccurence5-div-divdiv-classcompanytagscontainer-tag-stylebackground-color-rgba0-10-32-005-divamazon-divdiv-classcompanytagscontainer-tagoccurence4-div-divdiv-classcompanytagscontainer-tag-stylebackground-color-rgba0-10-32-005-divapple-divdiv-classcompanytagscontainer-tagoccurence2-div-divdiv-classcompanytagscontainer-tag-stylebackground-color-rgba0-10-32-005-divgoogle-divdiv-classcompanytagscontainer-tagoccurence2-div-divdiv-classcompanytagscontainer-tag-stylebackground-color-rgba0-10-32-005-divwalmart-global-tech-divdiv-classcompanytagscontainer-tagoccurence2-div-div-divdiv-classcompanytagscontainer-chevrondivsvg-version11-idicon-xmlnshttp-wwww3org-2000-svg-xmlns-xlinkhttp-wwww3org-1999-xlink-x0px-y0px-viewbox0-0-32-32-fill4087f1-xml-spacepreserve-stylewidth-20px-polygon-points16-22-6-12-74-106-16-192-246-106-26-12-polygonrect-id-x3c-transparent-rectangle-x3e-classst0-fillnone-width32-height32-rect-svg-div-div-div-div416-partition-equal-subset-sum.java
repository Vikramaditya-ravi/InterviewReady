class Solution {
     static Boolean isSubsetSumTabulation(int N, int[] arr, int sum) {
        int[][] dp = new int[N + 1][sum + 1];
        for (int[] num : dp) {
            Arrays.fill(num, -1);
        }
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                if (i == 0) {
                    dp[i][j] = j == 0 ? 1 : 0;
                } else if (j == 0) {
                    dp[i][j] = 1;
                } else if (j < arr[i - 1])
                    dp[i][j] = dp[i - 1][j];
                else {
                    if (dp[i - 1][j - arr[i - 1]] == 0 && dp[i - 1][j] == 0) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = 1;
                    }
                }

            }
        }
        return dp[N][sum] == 1;
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        return isSubsetSumTabulation(nums.length, nums,sum/2);


    }
}