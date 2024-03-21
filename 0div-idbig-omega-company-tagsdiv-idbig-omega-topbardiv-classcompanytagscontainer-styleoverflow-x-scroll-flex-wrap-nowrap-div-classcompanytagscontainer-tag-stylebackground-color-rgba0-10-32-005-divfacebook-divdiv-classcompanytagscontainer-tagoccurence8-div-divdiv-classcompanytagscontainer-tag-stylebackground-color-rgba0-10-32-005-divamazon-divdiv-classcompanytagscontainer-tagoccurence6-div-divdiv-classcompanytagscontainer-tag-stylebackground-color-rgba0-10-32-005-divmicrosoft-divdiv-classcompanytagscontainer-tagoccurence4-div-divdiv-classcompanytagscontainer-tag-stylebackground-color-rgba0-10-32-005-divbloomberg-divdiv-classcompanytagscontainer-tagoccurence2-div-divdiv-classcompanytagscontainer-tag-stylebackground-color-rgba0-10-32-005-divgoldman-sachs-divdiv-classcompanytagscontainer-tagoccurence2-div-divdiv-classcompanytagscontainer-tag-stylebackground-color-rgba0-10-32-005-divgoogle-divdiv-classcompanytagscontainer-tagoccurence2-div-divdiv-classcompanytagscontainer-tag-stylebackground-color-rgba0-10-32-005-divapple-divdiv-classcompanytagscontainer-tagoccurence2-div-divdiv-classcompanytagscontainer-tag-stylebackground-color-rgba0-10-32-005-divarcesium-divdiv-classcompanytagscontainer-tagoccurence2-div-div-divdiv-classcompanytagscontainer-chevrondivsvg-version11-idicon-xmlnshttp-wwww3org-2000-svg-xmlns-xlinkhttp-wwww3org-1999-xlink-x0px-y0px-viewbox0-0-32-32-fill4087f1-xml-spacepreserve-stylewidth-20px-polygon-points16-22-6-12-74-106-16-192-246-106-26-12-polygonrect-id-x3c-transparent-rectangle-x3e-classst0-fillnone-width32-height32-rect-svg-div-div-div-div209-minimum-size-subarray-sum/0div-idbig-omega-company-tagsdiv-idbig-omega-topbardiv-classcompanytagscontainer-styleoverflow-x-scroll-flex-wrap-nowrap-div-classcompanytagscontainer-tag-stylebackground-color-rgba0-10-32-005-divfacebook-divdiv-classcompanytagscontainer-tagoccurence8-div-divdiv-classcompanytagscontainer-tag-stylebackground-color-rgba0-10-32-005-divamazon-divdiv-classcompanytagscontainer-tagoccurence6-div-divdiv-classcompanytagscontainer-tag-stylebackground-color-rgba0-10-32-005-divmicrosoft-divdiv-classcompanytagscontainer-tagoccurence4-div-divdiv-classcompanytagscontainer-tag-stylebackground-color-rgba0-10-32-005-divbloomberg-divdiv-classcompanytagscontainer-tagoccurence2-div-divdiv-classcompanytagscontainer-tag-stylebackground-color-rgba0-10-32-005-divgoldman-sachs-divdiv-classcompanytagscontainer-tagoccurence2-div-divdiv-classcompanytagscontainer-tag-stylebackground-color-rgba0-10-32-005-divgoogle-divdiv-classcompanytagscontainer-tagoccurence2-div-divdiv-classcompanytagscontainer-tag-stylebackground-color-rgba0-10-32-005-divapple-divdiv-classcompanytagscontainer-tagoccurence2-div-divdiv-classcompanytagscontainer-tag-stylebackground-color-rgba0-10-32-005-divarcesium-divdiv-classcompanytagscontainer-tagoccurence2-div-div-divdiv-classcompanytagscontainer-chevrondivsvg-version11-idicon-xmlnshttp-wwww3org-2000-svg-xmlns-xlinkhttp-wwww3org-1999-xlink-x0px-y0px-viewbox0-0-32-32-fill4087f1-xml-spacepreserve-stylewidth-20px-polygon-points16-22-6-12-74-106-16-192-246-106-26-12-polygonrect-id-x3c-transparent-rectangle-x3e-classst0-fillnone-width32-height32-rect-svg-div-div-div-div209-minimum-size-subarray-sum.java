class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int res = Integer.MAX_VALUE;
         int currentSum =0;
         int pre= 0, next =0;
         int N = nums.length;
         while(next <  N){
             currentSum+= nums[next];
             while (currentSum >= target){
                 res = Math.min(res,next-pre+1);
                 currentSum -= nums[pre];
                 pre++;
             }
             next++;
         }
         return  res == Integer.MAX_VALUE ? 0: res;
    }
}