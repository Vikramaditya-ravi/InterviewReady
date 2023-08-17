class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int maxi = 0;
         for (int[] trip : trips) {
             maxi = Math.max(maxi, trip[2]);
         }
         int[] dp = new int[maxi+1];
         for (int[] trip : trips) {
             int start = trip[1];
             int end = trip[2];
             dp[start] += trip[0];
             dp[end] -= trip[0];
         }
         if(dp[0] > capacity){
             return false;
         }
         for (int i = 1; i < dp.length; i++) {
            dp[i]+=dp[i-1];
            if(dp[i] > capacity){
                return false;
            }
         }
         return true;
    }
}