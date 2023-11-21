class Solution {
   public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int result = 0;
        int curr;
        for (int i = 0; i < n; i++) {

            int sum = 0;
            curr = 1;
            for (int j = i; j < n; j++) {
                sum += curr * satisfaction[j];
                curr++;
            }
            result = Math.max(result, sum);

        }
        return result;

    }
}