class Solution {
    public void sortColors(int[] nums) {
            int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1){
                b+=1;
            }
            else if(nums[i] == 0){
                a+=1;
            }
            else {
                c+=1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(a > 0){
                nums[i] = 0;
                a--;
            }
            else if(b > 0){
                nums[i] = 1;
                b--;
            }
            else if(c > 0){
                nums[i] = 2;
                c--;
            }
            
        }
    }
}