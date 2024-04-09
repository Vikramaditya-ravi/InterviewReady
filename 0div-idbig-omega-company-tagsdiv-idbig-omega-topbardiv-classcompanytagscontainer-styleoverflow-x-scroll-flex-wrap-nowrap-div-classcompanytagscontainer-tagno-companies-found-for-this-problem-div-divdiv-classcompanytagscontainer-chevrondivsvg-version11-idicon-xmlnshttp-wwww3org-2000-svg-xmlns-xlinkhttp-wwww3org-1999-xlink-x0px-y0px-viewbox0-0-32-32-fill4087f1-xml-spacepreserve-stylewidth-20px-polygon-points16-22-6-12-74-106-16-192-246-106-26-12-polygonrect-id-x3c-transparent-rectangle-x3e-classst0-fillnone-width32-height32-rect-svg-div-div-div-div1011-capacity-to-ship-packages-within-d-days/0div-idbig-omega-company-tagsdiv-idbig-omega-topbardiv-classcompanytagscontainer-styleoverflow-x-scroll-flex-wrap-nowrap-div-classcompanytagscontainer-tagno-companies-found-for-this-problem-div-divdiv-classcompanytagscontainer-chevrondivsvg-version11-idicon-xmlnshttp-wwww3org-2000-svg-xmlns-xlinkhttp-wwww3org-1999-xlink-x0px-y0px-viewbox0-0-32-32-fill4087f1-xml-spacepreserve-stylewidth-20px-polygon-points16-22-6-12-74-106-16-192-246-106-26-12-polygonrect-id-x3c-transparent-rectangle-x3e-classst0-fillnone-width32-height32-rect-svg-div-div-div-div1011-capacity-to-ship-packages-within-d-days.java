class Solution {
    public int daysrequired(int[] weights,int  maxValue){
        int dayCount = 1;
        
        int sum = 0;
        for(int i = 0; i < weights.length; i++){
            if(sum+weights[i] <= maxValue){
                sum+= weights[i];
            }
            else{
                dayCount++;
                sum= weights[i];
            }
        }
        
        return dayCount;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low =0;
        int high = 0;
        
        for(int val: weights){
            high+=val;
            low = Math.max(low,val);
        }
        
        while(low<= high){
            int mid = low+(high-low)/2;
            
            int requireDays= daysrequired(weights,mid);
            if(requireDays > days){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            
        }
        return low;
        
        
    }
}