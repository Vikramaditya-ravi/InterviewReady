class Solution {
     public int longestPalindrome(String s) {
        int[] count = new int[128];
        Arrays.fill(count, 0);

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        int result = 0;

        for (int j = 0; j < count.length; j++) {
            if (count[j] % 2 == 0) {
                result += count[j];
                count[j] = 0;
            } else {
                if (count[j] > 1){
                result += count[j] - 1;
                count[j] = 1;                    
                }
            }
        }
        for (int num : count) {
            if (num > 0) {
                return result+1;
            }
        }
        return result;
    }
}