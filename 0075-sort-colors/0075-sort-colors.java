class Solution {
       public void swap(int[] nums,int x,int y){
         int temp = nums[x];
         nums[x] = nums[y];
         nums[y] = temp;
     }
    
    public void sortColors(int[] nums) {
            int start = 0;
         int end = nums.length-1;
         for (int i = 0; i < nums.length ; i++) {
             while (nums[i] == 2 && i < end){
                 swap(nums,i,end);
                 end--;
             }
             while (nums[i] == 0 && i > start){  
                 swap(nums,i,start);
                 start++;
             }

         }
    }
}