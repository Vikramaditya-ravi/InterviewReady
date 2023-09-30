class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        int j = 0;
        int N = nums.length;
        while (j < N) {
            sum += nums[j];
            while (sum >= target) {
                ans = Math.min(j - i + 1, ans);
                sum -= nums[i];
                i++;
            }
            j++;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}