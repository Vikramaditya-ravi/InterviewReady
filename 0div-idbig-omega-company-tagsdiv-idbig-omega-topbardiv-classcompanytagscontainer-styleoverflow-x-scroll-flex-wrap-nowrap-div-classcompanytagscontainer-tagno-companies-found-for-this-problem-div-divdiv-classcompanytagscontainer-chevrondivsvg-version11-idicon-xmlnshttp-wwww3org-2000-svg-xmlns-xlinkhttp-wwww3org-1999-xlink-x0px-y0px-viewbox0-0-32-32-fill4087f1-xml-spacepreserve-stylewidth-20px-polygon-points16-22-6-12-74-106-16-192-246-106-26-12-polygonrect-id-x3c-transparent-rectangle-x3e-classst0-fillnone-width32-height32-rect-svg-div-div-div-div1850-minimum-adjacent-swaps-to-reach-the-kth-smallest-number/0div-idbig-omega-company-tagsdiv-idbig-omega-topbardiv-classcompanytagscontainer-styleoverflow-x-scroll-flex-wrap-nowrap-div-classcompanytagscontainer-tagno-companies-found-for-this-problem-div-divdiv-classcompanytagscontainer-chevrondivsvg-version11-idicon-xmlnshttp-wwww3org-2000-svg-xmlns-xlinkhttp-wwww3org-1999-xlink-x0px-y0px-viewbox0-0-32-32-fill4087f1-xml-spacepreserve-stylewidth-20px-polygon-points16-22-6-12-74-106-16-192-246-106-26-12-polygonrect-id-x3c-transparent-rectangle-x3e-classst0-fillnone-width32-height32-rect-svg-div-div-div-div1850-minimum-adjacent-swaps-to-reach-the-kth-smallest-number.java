class Solution {
    public static  void nextPermutations(int[] nums){
        int n = nums.length;
        int  i = n-2;
        while (i >= 0 && nums[i]>= nums[i+1]){
            i--;
        }
        if (i>=0){
            int j = n-1;
            while (nums[j] <= nums[i] ){
                j--;
            }
        swap(nums,i,j);

        }
        reverse(nums,i+1,n-1);

    }

    public static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums,int i,int j){
        while (i < j){
            swap(nums,i++,j--);
        }
    }   
     public int getMinSwaps(String num, int k) {
         int n = num.length();
         int[] nums= new int[n];
         int[] origin= new int[n];
         for (int i = 0; i < n; i++) {
             nums[i] = num.charAt(i)-'0';
              origin[i] = num.charAt(i)-'0';
         }
         while (k -- > 0){
             nextPermutations(nums);
         }
         int res = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != origin[i]) {
                int j = i;
                while (nums[j] != origin[i]) j++;
                for (int x = j; x > i; x--) {
                    swap(nums, x, x - 1);
                    res++;
                }
            }
        }
        return res;
    }
}