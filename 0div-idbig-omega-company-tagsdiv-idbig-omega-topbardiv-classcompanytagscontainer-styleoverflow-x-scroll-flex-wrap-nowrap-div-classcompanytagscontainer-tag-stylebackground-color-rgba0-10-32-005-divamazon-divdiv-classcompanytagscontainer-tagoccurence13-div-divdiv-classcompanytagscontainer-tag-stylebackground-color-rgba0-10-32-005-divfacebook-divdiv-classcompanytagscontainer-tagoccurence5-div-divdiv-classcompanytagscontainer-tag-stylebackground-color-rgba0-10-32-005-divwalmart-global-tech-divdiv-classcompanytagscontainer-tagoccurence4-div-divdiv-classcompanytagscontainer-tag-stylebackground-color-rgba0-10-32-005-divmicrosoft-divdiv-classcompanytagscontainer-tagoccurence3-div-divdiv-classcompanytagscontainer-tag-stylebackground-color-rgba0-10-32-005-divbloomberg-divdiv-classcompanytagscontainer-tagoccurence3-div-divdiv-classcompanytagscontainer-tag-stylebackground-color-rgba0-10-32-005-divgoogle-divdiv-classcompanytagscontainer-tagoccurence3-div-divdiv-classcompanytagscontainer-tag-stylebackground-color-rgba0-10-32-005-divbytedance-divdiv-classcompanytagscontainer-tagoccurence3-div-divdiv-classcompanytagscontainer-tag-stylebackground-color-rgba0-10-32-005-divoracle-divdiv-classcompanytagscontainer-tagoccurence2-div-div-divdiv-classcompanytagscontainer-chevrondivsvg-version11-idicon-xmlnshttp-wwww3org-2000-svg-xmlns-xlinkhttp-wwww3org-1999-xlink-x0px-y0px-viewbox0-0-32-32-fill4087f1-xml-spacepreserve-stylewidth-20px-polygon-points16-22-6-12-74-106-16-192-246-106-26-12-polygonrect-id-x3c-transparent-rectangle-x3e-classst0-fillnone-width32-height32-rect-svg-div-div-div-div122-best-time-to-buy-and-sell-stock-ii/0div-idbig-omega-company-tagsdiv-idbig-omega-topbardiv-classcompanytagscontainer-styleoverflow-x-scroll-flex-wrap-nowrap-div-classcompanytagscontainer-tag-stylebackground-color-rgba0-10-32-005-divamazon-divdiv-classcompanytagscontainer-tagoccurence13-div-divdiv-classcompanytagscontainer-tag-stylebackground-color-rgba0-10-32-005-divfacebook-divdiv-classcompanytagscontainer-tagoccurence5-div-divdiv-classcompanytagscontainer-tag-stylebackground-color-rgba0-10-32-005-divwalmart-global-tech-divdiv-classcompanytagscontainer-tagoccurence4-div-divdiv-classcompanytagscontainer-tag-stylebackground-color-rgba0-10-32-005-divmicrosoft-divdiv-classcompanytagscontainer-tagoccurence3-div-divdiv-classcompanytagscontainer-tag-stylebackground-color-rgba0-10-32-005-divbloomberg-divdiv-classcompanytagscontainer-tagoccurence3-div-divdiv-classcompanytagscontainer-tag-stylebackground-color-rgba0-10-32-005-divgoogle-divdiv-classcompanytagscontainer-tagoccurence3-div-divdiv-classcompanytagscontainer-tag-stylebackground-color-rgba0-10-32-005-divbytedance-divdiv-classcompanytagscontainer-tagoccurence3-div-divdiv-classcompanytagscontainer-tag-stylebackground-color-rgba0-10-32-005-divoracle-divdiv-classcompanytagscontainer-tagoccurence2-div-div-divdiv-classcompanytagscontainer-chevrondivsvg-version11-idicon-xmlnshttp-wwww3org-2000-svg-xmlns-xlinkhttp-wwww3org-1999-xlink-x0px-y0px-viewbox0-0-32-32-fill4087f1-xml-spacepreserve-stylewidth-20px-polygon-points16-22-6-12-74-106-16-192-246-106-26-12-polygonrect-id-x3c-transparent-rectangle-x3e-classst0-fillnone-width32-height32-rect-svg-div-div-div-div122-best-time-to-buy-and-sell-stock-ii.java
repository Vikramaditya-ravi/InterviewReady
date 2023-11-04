class Solution {
    public int utility(int ind, int buy, List<List<Integer>> dp,int[] prices){
        if (ind == prices.length){
            return 0;
        }
        if (dp.get(ind).get(buy) != -1){
            return dp.get(ind).get(buy);
        }
        int profit = 0;
        if (buy == 1){
            profit= Math.max(-prices[ind]+utility(ind+1,0,dp,prices),
                    utility(ind + 1, 1, dp, prices));
        }
        else {
            profit= Math.max(prices[ind]+utility(ind+1,1,dp,prices),
                    utility(ind + 1, 0, dp, prices));

        }
        dp.get(ind).add(buy,profit);
        return profit;
    }


     public int maxProfit(int[] prices) {
        int n = prices.length;
        List<List<Integer>> dp = new ArrayList<>();
         for (int i = 0; i < n; i++) {
             List<Integer> row = new ArrayList<>();
             row.addAll(Arrays.asList(-1,-1));
             dp.add(row);
         }
         if ( n < 1){
             return 0;
         }
         return utility(0,1,dp,prices);
    }
}