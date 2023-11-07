class Solution {
    public void solve(List<List<Integer>> res,List<Integer> tempList,int[] candidates,int target,int start){
        if (target< 0){
            return;
        }
        else if(target == 0){
            res.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = start; i < candidates.length ; i++) {
                if(i > start && candidates[i] == candidates[i-1]) continue;
                tempList.add(candidates[i]);
                solve(res,tempList,candidates,target-candidates[i],i+1);
                tempList.remove(tempList.size() -1);

            }
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        solve(list, new ArrayList<>(), nums, target, 0);
        return list;
    }
}