class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 1000000000;
        while(low< high){
            int mid = low+(high-low)/2;
            int sum = 0;
            for(int val: piles){
                sum+=(val+mid-1)/mid;
            }
            if(sum > h){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}