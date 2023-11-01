class Solution {
   public String longestPalindrome(String s) {
      int n = s.length();
        String sb = "";

        if (n < 2) {
            return s;
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            //odd length.
            int j = i;
            int k = i;
            while ((j >= 0) && (k < n) &&
                    (s.charAt(j) == s.charAt(k))) {
                j--;
                k++;
            }
            String temp = s.substring(j + 1, k);
            if (max < temp.length()) {
                max = temp.length();
                sb = temp;
            }
            // even length.

            j = i;
            k = i + 1;
            while (j >= 0 && k < n &&
                    (s.charAt(j) == s.charAt(k))) {
                j--;
                k++;
            }
            temp = s.substring(j + 1, k);
            if (max < temp.length()) {
                max = temp.length();
                sb = temp;
            }
        }
        return sb;

    }  
     
}