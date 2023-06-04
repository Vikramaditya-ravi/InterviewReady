class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        int[] list = new int[length];
        Arrays.fill(list,0);
        int result = 0;
        
        for (int i = 0; i < length; i++) {
            if (list[nums[i]] == 0){
                list[nums[i]]++;
            }
            else {
                result =  nums[i];
                break;
            }
             
        }
        return result;
    }
}