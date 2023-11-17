class Solution {
   int solve(ArrayList<Integer> list1, ArrayList<Integer> list2, int index, int swapped, int[][] dp) {
        if (index >= list1.size()) {
            return 0;
        }

        if (dp[index][swapped] != -1) {
            return dp[index][swapped];
        }

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
            ans = solve(list1, list2, index + 1, 0, dp);
        } 
       
       if(list1.get(index) > prev2 && list2.get(index) > prev1){
            ans = Math.min(ans, 1 + solve(list1, list2, index + 1, 1, dp));
            
        }
        return dp[index][swapped] = ans;
    }

    public int minSwap(int[] nums1, int[] nums2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        int[][] dp = new int[nums1.length+1][2];
        for (int[] num : dp) {
            Arrays.fill(num, -1);
        }

        list1.add(-1);
        list2.add(-1);

        for (int i = 0; i < nums1.length; i++) {
            list1.add(nums1[i]);
            list2.add(nums2[i]);
        }
        return solve(list1, list2, 1, 0, dp);
    }
}