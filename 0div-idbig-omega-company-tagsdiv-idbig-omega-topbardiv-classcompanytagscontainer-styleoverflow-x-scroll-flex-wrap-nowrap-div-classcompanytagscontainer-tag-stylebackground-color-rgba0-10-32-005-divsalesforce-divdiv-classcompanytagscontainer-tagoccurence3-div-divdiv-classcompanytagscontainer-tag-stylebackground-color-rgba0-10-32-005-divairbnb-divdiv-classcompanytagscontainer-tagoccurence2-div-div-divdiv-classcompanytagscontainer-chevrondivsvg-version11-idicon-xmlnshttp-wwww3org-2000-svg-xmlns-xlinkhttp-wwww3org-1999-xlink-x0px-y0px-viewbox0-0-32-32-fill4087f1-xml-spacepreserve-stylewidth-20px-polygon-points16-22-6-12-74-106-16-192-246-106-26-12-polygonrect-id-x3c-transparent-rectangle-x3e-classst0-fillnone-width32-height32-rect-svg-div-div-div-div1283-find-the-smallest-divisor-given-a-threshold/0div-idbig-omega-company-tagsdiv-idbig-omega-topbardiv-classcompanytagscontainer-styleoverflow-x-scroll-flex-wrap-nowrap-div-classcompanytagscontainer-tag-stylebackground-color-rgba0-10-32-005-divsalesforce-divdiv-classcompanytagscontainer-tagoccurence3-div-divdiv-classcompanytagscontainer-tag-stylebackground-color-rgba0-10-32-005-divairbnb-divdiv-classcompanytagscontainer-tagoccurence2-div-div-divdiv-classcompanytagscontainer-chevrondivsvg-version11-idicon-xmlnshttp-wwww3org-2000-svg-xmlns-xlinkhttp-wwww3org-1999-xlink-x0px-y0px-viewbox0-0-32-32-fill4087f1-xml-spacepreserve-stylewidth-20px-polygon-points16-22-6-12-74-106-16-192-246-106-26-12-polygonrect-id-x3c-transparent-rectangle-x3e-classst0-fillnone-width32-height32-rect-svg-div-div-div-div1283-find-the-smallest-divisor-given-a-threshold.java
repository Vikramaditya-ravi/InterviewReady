class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 1000000;
        while(low < high){
            int mid = low+(high-low)/2;
            int sum =0;
            for(int val:nums){
               sum+=(val+mid-1)/mid; 
            }
            if(sum > threshold){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}