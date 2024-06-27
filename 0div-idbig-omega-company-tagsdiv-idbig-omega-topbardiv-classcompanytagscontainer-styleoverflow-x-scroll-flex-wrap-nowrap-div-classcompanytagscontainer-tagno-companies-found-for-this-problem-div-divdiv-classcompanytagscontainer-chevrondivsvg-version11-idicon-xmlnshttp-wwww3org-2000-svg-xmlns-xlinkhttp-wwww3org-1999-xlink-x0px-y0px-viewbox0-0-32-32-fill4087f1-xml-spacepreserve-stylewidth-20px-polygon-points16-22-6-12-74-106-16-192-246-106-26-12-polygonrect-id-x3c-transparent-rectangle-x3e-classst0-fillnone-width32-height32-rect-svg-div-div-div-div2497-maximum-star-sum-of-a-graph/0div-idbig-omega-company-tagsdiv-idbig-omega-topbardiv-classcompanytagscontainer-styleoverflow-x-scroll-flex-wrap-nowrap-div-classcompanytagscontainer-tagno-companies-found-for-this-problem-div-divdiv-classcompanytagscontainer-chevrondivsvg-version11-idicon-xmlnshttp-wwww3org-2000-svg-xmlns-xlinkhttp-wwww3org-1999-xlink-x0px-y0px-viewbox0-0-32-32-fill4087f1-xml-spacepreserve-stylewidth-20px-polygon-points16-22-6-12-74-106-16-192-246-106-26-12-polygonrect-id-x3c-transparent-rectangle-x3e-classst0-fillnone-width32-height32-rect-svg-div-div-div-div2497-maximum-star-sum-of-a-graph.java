class Solution {
   public int maxStarSum(int[] vals, int[][] edges, int k) {
        int res = vals[0];
        if (k == 0) { // corner case
            for (var x : vals) res = Math.max(res, x);
            return res;
        }
        int n = vals.length;
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int first = edge[0];
            int second = edge[1];
            if (vals[second] > 0) {
                list.get(first).add(vals[second]);
            }
            if (vals[first] > 0) {
                list.get(second).add(vals[first]);
            }
        }
        for(int i = 0; i < n; i++){
            res = Math.max(res,utility(vals,vals[i],list.get(i),k));

        }
        return res;
    }
    public  int utility( int[] vals,int result,List<Integer> tempList,int k){
        Queue<Integer> q = new PriorityQueue<>();
        for (int x : tempList) {
            if (q.size() < k) q.offer(x);
            else if (x > q.peek()) {
                q.poll();
                q.offer(x);
            }
        }

        while (!q.isEmpty()) result += q.poll();

        return result;

    }
}