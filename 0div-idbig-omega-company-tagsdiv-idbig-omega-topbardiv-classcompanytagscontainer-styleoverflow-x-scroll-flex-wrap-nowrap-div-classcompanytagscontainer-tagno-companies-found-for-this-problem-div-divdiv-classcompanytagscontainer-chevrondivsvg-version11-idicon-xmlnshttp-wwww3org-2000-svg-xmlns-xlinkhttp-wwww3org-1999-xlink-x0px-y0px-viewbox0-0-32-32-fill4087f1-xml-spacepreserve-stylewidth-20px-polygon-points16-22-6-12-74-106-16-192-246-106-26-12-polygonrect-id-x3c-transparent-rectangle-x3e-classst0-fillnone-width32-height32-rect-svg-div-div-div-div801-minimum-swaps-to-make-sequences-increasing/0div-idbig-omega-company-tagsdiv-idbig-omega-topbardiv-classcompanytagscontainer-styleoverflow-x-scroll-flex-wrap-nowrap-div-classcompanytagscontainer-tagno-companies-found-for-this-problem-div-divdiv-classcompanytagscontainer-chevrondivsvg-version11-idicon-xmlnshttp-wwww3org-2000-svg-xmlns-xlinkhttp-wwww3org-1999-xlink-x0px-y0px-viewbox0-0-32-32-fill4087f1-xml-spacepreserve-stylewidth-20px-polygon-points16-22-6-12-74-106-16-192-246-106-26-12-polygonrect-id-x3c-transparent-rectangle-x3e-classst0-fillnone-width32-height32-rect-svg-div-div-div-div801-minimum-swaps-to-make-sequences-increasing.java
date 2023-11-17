class Solution {
    public int minSwap(int[] nums1, int[] nums2) {
         ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int n = nums1.length;

        list1.add(-1);
        list2.add(-1);
        
        for (int i = 0; i < n; i++) {
            list1.add(nums1[i]);
            list2.add(nums2[i]);
        }
        n= list1.size();
        int[][] dp = new int[n + 1][2];



        for (int index = n - 1; index >= 1; index--) {
            for (int swapped = 1; swapped >= 0; swapped--) {

                int prev1 = list1.get(index - 1);
                int prev2 = list2.get(index - 1);

                if (swapped == 1) {
                    int temp = prev2;
                    prev2 = prev1;
                    prev1 = temp;
                }
                int ans = Integer.MAX_VALUE;
                //noSwap

                if (list1.get(index) > prev1 && list2.get(index) > prev2) {
                    ans = dp[index + 1][0];
                }
                //swapped

                if (list1.get(index) > prev2 && list2.get(index) > prev1) {
                    ans = Math.min(ans, 1 + dp[index + 1][1]);
                }
                dp[index][swapped] = ans;

            }
        }
        return dp[1][0];
    }
}