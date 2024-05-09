class Solution {
    public int firstMissingPositive(int[] nums) {
        int arraySize = nums.length;
        for(int index = 0; index<arraySize; index++){
            int currentElement = nums[index];
            
            if(currentElement>=1 && currentElement <= arraySize){
                int chair = currentElement-1;
                
                if(nums[chair] != currentElement){
                    int temp = nums[chair];
                    nums[chair] = currentElement;
                    nums[index] = temp;
                    index--;
                }
            }
        }
        for(int index = 0; index< arraySize;index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }
        
 
        return arraySize+1;
        
        
    }
}