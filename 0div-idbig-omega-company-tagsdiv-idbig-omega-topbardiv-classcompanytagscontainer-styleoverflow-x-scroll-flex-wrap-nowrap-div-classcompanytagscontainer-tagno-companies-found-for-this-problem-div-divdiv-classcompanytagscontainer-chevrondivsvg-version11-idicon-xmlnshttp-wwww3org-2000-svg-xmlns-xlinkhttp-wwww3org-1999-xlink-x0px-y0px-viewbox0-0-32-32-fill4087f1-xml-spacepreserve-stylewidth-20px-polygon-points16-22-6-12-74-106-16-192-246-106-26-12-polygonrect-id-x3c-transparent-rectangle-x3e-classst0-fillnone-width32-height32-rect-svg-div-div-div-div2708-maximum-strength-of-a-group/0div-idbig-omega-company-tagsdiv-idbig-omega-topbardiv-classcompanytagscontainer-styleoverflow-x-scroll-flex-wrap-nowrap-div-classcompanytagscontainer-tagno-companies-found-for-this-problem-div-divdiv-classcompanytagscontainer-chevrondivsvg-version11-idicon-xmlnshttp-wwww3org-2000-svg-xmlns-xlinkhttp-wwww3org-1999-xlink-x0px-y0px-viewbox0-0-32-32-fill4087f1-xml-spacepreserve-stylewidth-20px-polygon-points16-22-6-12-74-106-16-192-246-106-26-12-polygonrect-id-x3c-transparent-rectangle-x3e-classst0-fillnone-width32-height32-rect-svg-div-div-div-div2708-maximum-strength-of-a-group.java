class Solution {
    public long maxStrength(int[] nums) {
        int negativeCount = 0;
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        long prod = 1;
        int largest = Integer.MIN_VALUE;
        int largestNegative = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num != 0) {
                prod *= num;
            }
            if (num < 0) {
                largestNegative = Math.max(largestNegative, num);
                negativeCount++;
            }
            largest = Math.max(largest, num);
        }

        if (largest == 0 && (negativeCount == 1 || negativeCount == 0)) return 0;
        if (prod > 0) return prod;
        return prod / largestNegative;
                  
    }
}