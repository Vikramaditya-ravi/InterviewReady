class Solution {
    public int longestConsecutive(int[] nums) {
         Arrays.sort(nums);
        int N = nums.length;
	   int count = 0;
	   int result = 0;
	   
	   for(int i = 0; i < N; i++){
	       if( i > 0 && nums[i] == nums[i-1]+1){
	           count++;
	       }
	       else if(  i > 0  && nums[i] == nums[i-1]){
	           continue;
	           
	       }
	       else{
	           count = 1;
	       }
	       result = Math.max(result,count);
	       
	   }
	   return result;
    }
}