class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        if( n == 1){
            return nums[0];
        }
        
        int dp[] = new int[n];
        dp[0] = nums[0];
        dp[1] = nums[1];
        
        int maxi = Math.max(nums[0],nums[1]);
        
        int preMax = nums[0];
        
        for(int i = 2; i < n; i++){
            dp[i] = preMax+nums[i];
            maxi = Math.max(dp[i],maxi);
            preMax = Math.max(dp[i-1],preMax);
        }
        return maxi;
        
//         int n=nums.length;
//         if(n==1) return nums[0];
//         if(n==2) return Math.max(nums[0],nums[1]);
//        int dp[]=new int[n];
//         dp[0]=nums[0];
//         dp[1]=Math.max(nums[0],nums[1]);
        
//         for(int i=2;i<n;i++){
//             dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
//         }
//         return Math.max(dp[n-1],dp[n-2]);
    }
}