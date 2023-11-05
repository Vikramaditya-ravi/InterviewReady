class Solution {
    public int utility(int ind, int buy, int[] prices, ArrayList<ArrayList<Integer>> list) {
        if (ind >= prices.length) {
            return 0;
        }
        if (list.get(ind).get(buy) != -1) {
            return list.get(ind).get(buy);
        }
        int profit = 0;
        if (buy == 1) {
            profit = Math.max(-prices[ind] + utility(ind + 1, 0, prices, list),
                    utility(ind + 1, 1, prices, list));

        } else {
            profit = Math.max(prices[ind] + utility(ind + 2, 1, prices, list),
                    utility(ind + 1, 0, prices, list));

        }
        list.get(ind).set(buy, profit);
        return profit; 

    }

    public int maxProfit(int[] prices) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = prices.length;
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.addAll(Arrays.asList(-1, -1));
            list.add(row);
        }

        return utility(0, 1, prices, list);


    }
}