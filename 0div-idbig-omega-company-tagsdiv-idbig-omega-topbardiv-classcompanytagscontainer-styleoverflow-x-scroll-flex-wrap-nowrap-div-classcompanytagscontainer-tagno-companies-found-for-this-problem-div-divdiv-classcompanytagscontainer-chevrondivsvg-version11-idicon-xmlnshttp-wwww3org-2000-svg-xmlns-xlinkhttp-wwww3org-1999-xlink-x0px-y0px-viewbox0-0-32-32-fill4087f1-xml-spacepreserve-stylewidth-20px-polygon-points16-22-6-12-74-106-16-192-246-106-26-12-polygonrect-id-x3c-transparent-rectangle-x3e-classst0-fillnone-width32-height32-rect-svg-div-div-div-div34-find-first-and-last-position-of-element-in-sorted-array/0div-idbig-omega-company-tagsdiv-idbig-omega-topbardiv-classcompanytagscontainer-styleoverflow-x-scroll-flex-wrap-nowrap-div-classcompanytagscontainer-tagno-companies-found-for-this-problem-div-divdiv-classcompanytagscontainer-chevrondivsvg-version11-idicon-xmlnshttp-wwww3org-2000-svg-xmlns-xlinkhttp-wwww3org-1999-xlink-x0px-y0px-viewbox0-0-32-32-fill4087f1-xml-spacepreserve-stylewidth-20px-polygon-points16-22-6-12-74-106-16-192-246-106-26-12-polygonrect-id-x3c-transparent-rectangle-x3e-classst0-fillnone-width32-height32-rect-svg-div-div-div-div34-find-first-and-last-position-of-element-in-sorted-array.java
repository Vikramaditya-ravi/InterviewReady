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
                l = mid;
                r = mid;
                while (l >= 0) {
                    if ( l-1 > -1 && target == nums[l - 1]) {
                        l--;
                    } else {
                        break;
                    }
                }
                while (r < nums.length) {
                    if (r+1 < nums.length &&  target == nums[r + 1]) {
                        r++;
                    } else {
                        break;
                    }
                }
                result[0] = l;
                result[1] = r;
                return result;


            } else if (target > nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return result;
    }
}