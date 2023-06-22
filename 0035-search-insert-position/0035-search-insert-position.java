class Solution {
        public int searchInsert(int[] nums, int target) {
        return binaryS(nums, 0, nums.length-1, target);
    }
    private int binaryS(int[] nums, int s, int e, int t) {
        if(s > e)
            return s;
        int mid = s + (e-s)/2;
        if(t == nums[mid])
            return mid;
        if(t < nums[mid])
            e = mid-1;
        else
            s = mid+1;
        return binaryS(nums, s, e, t);
    }
}