class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        return combinationSum(k, n);

    }

    public void solve(List<List<Integer>> res, List<Integer> tempList, int[] candidates, int target, int start, int k) {
        if (target < 0 || tempList.size() > k) {
            return;
        } else if (target == 0 && tempList.size() == k) {
            res.add(new ArrayList<>(tempList));

        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                solve(res, tempList, candidates, target - candidates[i], i + 1, k);
                tempList.remove(tempList.size() - 1);

            }
        }
    }


    public List<List<Integer>> combinationSum(int k, int target) {
        int[] candidates = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> res = new ArrayList<>();
        solve(res, new ArrayList<>(), candidates, target, 0, k);
        return res;
    }
}