class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        int[] result = new int[2];
        Arrays.fill(result, -1);

        while (l <= r) {
            int mid = (l + r) / 2;

            if (target == nums[mid]) {
                //return the answer.
                ans = mid;
                r = mid - 1;

            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        result[0] = ans;
        l = 0;
        r = nums.length - 1;


        while (l <= r) {
            int mid = (l + r) / 2;

            if (target == nums[mid]) {
                //return the answer.
                ans = mid;
                l = mid + 1;

            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        result[1] = ans;

        return result;
    }
}