class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int result = 0;        
        int mod = 1000000007;
        int[] power = new int[n];
        
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        Arrays.sort(nums);

        
        while (left <= right) {
            if (nums[left] + nums[right] > target) {
                right--;
            } else {
                result = (result + power[right - left++]) % mod;
            }
        }
        return result;
    }
}