class Solution {
    public void utility(List<List<Integer>> res,List<Integer> tempList,int[] candidates,int target,int start){
        if (target< 0){
            return;
        }
        else if(target == 0){
            res.add(new ArrayList<>(tempList));
        }
        else {
            for (int i = start; i < candidates.length ; i++) {
                tempList.add(candidates[i]);
                utility(res,tempList,candidates,target-candidates[i],i);
                tempList.remove(tempList.size() -1);

            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        utility(res,new ArrayList<>(),candidates,target, 0);
        return res;
    }
}