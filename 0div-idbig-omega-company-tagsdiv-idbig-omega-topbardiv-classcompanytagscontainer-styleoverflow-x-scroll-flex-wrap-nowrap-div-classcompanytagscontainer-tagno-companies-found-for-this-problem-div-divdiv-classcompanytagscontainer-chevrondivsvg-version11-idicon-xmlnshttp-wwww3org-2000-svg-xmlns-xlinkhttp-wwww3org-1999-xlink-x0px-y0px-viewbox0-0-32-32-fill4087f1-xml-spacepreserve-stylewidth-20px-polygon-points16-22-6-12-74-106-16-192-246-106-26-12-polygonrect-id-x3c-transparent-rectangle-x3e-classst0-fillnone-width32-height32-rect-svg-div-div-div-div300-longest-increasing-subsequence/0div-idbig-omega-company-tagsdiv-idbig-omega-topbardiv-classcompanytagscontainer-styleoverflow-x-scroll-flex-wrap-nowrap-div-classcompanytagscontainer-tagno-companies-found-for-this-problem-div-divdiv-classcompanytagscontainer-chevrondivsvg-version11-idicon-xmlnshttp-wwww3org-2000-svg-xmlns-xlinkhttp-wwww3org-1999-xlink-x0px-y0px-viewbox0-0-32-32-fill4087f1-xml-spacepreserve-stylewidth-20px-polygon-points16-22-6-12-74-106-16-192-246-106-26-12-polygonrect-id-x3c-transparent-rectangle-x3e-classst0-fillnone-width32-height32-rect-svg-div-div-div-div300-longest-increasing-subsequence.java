class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
            int[] lis = new int[n];
            Arrays.fill(lis,1);
            int max = 1;

            for (int i = 1; i < n; i++) {
                for (int j = 0; j < i; j++) {
                    
                    if (nums[i] > nums[j] &&  lis[i] < lis[j]+1){
                        lis[i]+=1;                        
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                max = Math.max(max,lis[i]);
            }
            return max;
    }
}