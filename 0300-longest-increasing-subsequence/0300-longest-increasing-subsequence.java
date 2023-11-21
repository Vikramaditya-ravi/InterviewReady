class Solution {
          
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] currRow = new int[n + 1];
        int[] nextRow = new int[n + 1];


        for (int curr = n - 1; curr >= 0; curr--) {
            for (int prev = curr - 1; prev >= -1; prev--) {
                //take
                int take = 0, noTake;

                if (prev == -1 || nums[curr] > nums[prev]) {
                    take = 1 + nextRow[curr + 1];
                }
                //
                noTake = nextRow[prev + 1];
                currRow[prev + 1] = Math.max(take, noTake);
            }
            nextRow = currRow;

        }

        return nextRow[0];
    }
    
}