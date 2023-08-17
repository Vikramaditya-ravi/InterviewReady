class Solution {
   public  int daysRequired(int[] weights,int capacity){
        int days = 1;
        int sum = 0;

        for (int weight:weights){
            
            if (sum+weight > capacity){
                sum = weight;
                days+=1;
            }
            else {
            sum+=weight;                
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int end = 0;
        int start = weights[0];
        
        for (int weight : weights) {
            end += weight;
            if (start < weight) {
                start = weight;
            }
        }
        int res = -1;
        
        
        while (start <= end){
            int mid = start+(end-start)/2;
            int daysRequires = daysRequired(weights,mid);
            
            if (daysRequires > days){
                start = mid+1;

            }
            else {
                end  = mid-1;
                res = mid;
                
            }
             


        }
        return res;
    }
}