class Solution {
        public int binarySearch(int i, int j, int[] nums, int target) {
        if (i > j) {
            return i;
        }
        int mid = i + (j - i) / 2;

        if (nums[mid] == target) {
            return mid;
        }
        if (target < nums[mid]) {
           j = mid - 1;
        } else {
            i = mid + 1;
        }

        return binarySearch(i, j, nums, target);


    }

    public int searchInsert(int[] nums, int target) {


        return binarySearch(0, nums.length - 1, nums, target);


    }
}