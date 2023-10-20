class Solution {
    public int minPairSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] res = new int[n/2];
        int i = 0;
        int j = n - 1;
        while (i < j) {
            res[i] = nums[i++] + nums[j--];
        }
        int max = res[0];
        for (int k = 0; k < res.length ; k++) {
            if (max < res[k]) {
                max = res[k];
            }
            
        }
        return max;
    }
}