class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = Arrays.stream(nums).sum();
         
         if(sum < target){
             return 0;
         }
         int res = Integer.MAX_VALUE;
         int currentSum =0;
         int pre= 0, next =0;         
         for(int val:nums){
             
             currentSum+=val;
             while (currentSum >= target){
                 res = Math.min(res,next-pre+1);
                 currentSum-= nums[pre];
                 pre++;
             }
             next++;
         }
         return  res;
    }
}