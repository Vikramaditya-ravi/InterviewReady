class Solution {
    public int maxProfit(int[] prices) {
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int n = prices.length;
        for (int i = 0; i < n + 2; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            row.addAll(Arrays.asList(0, 0));
            list.add(row);
        }
        list.get(n).add(0, 0);
        list.get(n).add(1, 0);


        for (int ind = n - 1; ind >= 0; ind--) {
            for (int buy = 0; buy <= 1; buy++) {
                int profit = 0;
                if (buy == 1) {
                    profit = Math.max(-prices[ind] + list.get(ind + 1).get(0),
                            list.get(ind + 1).get(1));

                } else {
                    profit = Math.max(prices[ind] + list.get(ind + 2).get(1),
                            list.get(ind + 1).get(0));


                }
                list.get(ind).set(buy, profit);
            }
        }
        return list.get(0).get(1);


    }
}