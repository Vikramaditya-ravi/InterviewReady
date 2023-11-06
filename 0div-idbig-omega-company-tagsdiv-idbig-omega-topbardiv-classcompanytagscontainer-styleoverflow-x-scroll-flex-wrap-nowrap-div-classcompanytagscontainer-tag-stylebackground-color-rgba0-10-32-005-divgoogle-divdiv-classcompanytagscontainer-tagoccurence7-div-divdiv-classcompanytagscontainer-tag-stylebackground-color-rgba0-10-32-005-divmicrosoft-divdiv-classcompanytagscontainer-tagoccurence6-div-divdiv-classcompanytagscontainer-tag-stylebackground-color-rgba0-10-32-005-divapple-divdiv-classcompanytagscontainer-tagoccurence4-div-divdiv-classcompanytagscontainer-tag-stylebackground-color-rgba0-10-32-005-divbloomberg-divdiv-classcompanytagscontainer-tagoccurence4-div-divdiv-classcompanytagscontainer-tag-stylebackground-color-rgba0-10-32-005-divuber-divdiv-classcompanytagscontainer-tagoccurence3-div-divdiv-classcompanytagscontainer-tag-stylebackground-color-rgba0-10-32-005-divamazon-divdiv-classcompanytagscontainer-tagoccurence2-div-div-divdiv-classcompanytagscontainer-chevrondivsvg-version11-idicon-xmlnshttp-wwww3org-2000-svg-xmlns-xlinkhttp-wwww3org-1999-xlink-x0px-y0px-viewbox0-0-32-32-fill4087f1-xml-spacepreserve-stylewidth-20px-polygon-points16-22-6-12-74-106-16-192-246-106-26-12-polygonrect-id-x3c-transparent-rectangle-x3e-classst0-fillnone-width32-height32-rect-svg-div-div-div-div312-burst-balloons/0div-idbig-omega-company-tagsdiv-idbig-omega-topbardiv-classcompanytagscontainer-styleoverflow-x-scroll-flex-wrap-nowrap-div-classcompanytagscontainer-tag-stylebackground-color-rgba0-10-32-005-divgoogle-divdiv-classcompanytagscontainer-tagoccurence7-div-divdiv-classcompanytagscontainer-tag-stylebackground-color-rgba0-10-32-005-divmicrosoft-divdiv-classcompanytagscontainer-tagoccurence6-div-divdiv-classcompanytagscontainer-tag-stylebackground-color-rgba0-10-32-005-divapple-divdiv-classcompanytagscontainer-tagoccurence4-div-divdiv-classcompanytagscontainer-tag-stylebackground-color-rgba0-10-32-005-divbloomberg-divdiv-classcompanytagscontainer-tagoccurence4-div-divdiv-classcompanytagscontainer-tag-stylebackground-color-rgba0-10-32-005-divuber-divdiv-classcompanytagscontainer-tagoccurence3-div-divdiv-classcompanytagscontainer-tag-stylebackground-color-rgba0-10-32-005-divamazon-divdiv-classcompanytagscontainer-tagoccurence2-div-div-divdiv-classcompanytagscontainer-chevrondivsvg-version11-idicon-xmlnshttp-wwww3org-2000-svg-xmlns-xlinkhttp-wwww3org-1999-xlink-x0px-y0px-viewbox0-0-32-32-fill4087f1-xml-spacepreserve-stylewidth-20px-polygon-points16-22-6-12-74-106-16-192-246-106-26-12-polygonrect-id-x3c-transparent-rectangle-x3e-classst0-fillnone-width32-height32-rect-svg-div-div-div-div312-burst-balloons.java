class Solution {
//      public int utility(int i, int j, ArrayList<Integer> list, int[][] dp) {
//         if (i > j) {
//             return 0;
//         }
//         if (dp[i][j] != -1) {
//             return dp[i][j];
//         }
//         int maxi = Integer.MIN_VALUE;
//         for (int ind = i; ind <= j; ind++) {
//             int cost = list.get(i - 1) * list.get(ind) * list.get(j + 1)
//                     + utility(i, ind - 1, list, dp)
//                     + utility(ind + 1, j, list, dp);
//             maxi = Math.max(cost, maxi);
//         }

//         return dp[i][j] = maxi;
//     }

//     public int maxCoins(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();

//         list.add(1);
//         int n = nums.length;
//         for (int num : nums) {
//             list.add(num);
//         }
//         list.add(1);

//         int[][] dp = new int[n + 1][n + 1];
//          for (int[] ints : dp) {
//             Arrays.fill(ints, -1);
//         }

//         return utility(1, n, list, dp);


//     }
     public int maxCoins(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        int n = nums.length;
        for (int num : nums) {
            list.add(num);
        }
        list.add(1);
        int[][] dp = new int[n + 2][n + 2];
        for (int[] ints : dp) {
            Arrays.fill(ints, 0);
        }

        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= n; j++) {

                if (i > j) {
                    continue;
                }
                int maxi = Integer.MIN_VALUE;
                for (int ind = i; ind <= j; ind++) {
                    int cost = list.get(i - 1) * list.get(ind) * list.get(j + 1)
                            + dp[i][ind - 1]
                            + dp[ind + 1][j];
                    maxi = Math.max(cost, maxi);
                }
                dp[i][j] = maxi;
            }
        }
        return dp[1][n];
    }
}