class Solution {
     public boolean isAP(int[] nums, int start, int end) {
        int n = end - start+1;
        if (n < 2) {
            return false;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = start; i < end+1; i++) {
            temp[j] = nums[i];
            j++;
        }

        Arrays.sort(temp);
        int d = temp[1] - temp[0];
        for (int i = 1; i < n - 1; i++) {

            if (temp[i + 1] - temp[i] != d) {
                return false;
            }
        }
        return true;

    }

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        int n = l.length;
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(isAP(nums, l[i], r[i]));
        }
        return result;

    }
}