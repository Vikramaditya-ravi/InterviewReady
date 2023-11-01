class Solution {
   public String longestPalindrome(String s) {
    int N = s.length();
        String result = "";
        if (N < 2) {
            return s;
        }
        int max = 0;

        for (int i = 0; i < N; i++) {
            int j = i;
            int k = i;

            while ((j >= 0) && (k < N) && s.charAt(j) == s.charAt(k)) {
                j--;
                k++;
            }
            String temp = s.substring(j + 1, k);
            if (max < temp.length()) {
                max = temp.length();
                result = temp;
            }
            j = i;
            k = i + 1;
            while ((j >= 0) && (k < N) && s.charAt(j) == s.charAt(k)) {
                j--;
                k++;

            }
            temp = s.substring(j + 1, k);
            if (max < temp.length()) {
                max = temp.length();
                result = temp;
            }
        }
        return result;

    }  
     
}