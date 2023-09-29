class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        List<Integer> list = new ArrayList<>();
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp+=nums[n-1-i];
            list.add(nums[n-1-i]);
            sum  = sum-nums[n-1-i];
            if(temp > sum){
                break;
            }
        }
        return list;
    }
}