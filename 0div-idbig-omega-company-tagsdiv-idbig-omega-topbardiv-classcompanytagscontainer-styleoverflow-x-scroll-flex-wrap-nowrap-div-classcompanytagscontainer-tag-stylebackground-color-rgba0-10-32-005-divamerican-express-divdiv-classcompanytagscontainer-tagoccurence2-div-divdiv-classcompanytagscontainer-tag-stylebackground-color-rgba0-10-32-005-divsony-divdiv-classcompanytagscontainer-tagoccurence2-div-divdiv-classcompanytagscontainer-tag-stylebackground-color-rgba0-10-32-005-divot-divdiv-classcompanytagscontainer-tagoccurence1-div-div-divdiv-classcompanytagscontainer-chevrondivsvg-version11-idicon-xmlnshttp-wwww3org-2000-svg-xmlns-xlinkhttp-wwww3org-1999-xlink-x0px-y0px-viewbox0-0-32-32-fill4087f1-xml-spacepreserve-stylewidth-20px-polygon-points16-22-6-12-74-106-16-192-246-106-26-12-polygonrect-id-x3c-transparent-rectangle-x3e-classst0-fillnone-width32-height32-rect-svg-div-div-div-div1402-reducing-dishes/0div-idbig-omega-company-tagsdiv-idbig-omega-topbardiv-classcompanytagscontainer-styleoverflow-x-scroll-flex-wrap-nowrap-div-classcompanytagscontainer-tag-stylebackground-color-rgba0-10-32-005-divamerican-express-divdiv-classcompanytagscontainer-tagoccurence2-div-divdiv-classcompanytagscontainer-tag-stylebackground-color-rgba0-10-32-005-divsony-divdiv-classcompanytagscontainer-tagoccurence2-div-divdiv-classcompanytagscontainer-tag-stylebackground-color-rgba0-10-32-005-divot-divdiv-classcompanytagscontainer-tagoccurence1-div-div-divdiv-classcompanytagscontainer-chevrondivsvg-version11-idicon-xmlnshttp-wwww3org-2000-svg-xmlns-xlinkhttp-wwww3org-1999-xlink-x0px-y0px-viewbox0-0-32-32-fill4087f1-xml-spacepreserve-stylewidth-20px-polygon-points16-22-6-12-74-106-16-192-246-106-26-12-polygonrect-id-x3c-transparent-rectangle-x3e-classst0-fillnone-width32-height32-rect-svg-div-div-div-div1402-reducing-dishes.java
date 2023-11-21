class Solution {
   public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n = satisfaction.length;
        int result =0;
        int sum =0;
        for (int i = n-1; i >=0 && satisfaction[i] > -sum; i--) {
            sum+=satisfaction[i];
            result+=sum;
        }
        return result;

    }
}