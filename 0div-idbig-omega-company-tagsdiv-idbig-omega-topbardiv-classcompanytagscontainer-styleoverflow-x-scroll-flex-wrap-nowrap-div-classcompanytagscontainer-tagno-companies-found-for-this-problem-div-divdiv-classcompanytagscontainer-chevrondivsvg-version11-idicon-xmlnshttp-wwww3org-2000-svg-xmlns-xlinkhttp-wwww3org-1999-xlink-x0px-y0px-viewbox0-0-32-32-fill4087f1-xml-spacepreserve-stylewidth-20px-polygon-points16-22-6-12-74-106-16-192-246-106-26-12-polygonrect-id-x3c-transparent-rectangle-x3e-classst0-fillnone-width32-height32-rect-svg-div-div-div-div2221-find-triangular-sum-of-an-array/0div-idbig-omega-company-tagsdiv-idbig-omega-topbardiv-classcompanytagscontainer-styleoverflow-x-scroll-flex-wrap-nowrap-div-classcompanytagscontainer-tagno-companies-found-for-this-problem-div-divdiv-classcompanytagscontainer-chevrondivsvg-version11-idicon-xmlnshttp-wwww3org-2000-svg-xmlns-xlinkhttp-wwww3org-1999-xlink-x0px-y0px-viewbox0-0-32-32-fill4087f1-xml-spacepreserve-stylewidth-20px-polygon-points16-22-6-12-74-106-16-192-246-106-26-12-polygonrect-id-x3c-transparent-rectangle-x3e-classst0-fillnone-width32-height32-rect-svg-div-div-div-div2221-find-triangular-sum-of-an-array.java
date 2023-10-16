class Solution {
    public int triangularSum(int[] nums) {
        int[] row;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            row = new int[n - 1];
            for (int j = 0; j < i; j++) {
                int temp = (nums[j] + nums[j + 1])%10;
                row[j] = temp;

            }
            nums = row;
        }
        return nums[0];
    }
}