class Solution {
    public void swapUtility(int[] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int partitionUtility(int[] nums,int low, int high){
        
       int pivot = nums[high];

        // Index of smaller element and indicates
        // the right position of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller than the pivot
            if (nums[j] < pivot) {

                // Increment index of smaller element
                i++;
                swapUtility(nums, i, j);
            }
        }
        swapUtility(nums, i + 1, high);
        return (i + 1);
        
    }
    
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        k = n-k;
        int low = 0;
        int high = n-1;
        
       while(low < high) {
            int pivot = partitionUtility(nums,low,high);
           
            if(pivot <  k){
                low = pivot+1;
            }
            else if( pivot > k){
                                high = pivot-1;

            }
            else{
                break;
            }
            
        }
        
        return nums[k];
        
    }
}