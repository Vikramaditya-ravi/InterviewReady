class Solution {


     public int maxProfit(int[] prices) {
        int n = prices.length;
        List<List<Integer>> dp = new ArrayList<>();
        for (int i = 0; i < n + 1; i++) {
            List<Integer> row = new ArrayList<>();
            row.addAll(Arrays.asList(-1, -1));
            dp.add(row);
        }

        dp.get(n).add(0, 0);
        dp.get(n).add(1, 0);

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                int profit = 0;
                if (buy == 1) {
                    profit = Math.max(-prices[ind] + dp.get(ind+1).get(0),
                            dp.get(ind+1).get(1));
                } else {
                    profit = Math.max(prices[ind] + dp.get(ind+1).get(1),
                            dp.get(ind+1).get(0));
                }
                dp.get(ind).add(buy,profit);
            }

        }
        return dp.get(0).get(1);
    }
}