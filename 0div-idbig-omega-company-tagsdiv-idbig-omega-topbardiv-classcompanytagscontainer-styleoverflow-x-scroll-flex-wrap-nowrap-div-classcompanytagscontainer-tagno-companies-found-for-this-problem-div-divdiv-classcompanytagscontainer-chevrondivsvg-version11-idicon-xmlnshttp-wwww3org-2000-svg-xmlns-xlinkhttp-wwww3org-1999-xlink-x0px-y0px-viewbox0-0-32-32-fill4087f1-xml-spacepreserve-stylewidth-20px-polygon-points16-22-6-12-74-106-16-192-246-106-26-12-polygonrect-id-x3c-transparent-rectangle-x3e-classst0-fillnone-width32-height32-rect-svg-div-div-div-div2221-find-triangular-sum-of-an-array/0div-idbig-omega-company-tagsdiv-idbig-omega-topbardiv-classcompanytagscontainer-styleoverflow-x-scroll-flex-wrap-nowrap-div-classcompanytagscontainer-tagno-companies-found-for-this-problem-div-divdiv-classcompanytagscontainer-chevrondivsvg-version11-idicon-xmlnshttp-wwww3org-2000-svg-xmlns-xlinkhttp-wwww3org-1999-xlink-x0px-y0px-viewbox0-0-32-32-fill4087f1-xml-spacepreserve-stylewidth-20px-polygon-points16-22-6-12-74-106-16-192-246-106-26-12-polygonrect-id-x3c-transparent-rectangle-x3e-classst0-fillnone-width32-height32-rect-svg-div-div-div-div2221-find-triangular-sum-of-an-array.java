class Solution {
    public int triangularSum(int[] nums) {
        int[] row, prev = nums;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            row = new int[n - 1];
            for (int j = 0; j < i; j++) {
                int temp = (prev[j] + prev[j + 1])%10;
                row[j] = temp;

            }
            prev = row;
        }
        return prev[0];
    }
}