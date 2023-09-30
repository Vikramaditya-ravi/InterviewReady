class Solution {
    public double findMaxAverage(int[] nums, int k) {
           int n = nums.length;

    double result = Integer.MIN_VALUE;;
// avg;
       double sum =0;
               for (int i = 0; i < n; i++) {

        if( i < k){
        sum+=nums[i];
        }
        else {
        sum = sum+nums[i] - nums[i-k];
        }
       if(i>=k-1) {
           double avg = sum/k;
        result = Math.max(result,avg);
       }
               }

        
        return result;

    }
}