class Solution {
    
    public int utility(int[] nums, int maxValue){
        int count = 1;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(sum+nums[i] <= maxValue){
                sum+=nums[i];
                
            }
            else{
                count++;
                sum = nums[i];
            }
        }
        return count;
    }
    public int splitArray(int[] nums, int k) {     
        int n = nums.length;       
        int high = 0;
        int low = nums[0];
        for(int val : nums){
            high += val;
            low = Math.max(low,val);
        }
        
        while(low < high){
            int mid = low+ (high-low)/2;
            int ans = utility(nums,mid);
            
            if(ans > k){
                low = mid+1;
            }
            else{
                high = mid;
            }
            
        }
        return low;
        
    }
}