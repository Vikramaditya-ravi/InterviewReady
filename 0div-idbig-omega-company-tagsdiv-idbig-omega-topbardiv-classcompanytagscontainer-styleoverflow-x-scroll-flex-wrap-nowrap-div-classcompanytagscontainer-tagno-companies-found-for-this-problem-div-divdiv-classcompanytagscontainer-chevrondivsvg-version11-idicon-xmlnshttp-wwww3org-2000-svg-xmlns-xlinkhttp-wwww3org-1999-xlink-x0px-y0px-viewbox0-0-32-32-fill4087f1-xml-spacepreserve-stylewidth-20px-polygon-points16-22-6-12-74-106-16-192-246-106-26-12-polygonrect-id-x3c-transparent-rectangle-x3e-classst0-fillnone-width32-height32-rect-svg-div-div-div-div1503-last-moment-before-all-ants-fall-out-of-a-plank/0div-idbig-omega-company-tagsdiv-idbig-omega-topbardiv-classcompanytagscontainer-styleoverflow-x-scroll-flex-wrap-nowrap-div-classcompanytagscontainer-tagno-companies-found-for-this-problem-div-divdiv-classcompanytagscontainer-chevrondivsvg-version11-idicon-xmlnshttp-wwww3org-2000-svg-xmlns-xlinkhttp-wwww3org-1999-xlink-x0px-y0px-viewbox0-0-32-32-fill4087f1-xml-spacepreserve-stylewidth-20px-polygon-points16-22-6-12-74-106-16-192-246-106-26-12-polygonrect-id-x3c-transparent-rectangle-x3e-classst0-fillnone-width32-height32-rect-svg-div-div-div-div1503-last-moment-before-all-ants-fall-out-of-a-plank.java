class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < left.length;i++){
            ans = Math.max(ans,left[i]);
        }
        if(ans == n){
            return n;
        }
        for(int i = 0; i < right.length; i++){
            ans = Math.max(ans,n-right[i]);
        }
        return ans;
        
    }
}