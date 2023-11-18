class Solution {
 
       public int solve(int[] nums, int index, int d) {

        if (index < 0) {
            return 0;
        }


        int ans2 = 0;

        for (int i = index - 1; i >= 0; i--) {
            if ((nums[index] - nums[i]) == d) {
                ans2 = Math.max(ans2, 1 + solve(nums, i, d));
            }
        }
        return ans2;

    }

    public int longestArithSeqLength(int[] A) {
       int res = 2, n = A.length;
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        for (int j = 0; j < A.length; j++) {
            dp[j] = new HashMap<>();
            for (int i = 0; i < j; i++) {
                int d = A[j] - A[i];
                dp[j].put(d, dp[i].getOrDefault(d, 1) + 1);
                res = Math.max(res, dp[j].get(d));
            }
        }
        return res;

    }
}