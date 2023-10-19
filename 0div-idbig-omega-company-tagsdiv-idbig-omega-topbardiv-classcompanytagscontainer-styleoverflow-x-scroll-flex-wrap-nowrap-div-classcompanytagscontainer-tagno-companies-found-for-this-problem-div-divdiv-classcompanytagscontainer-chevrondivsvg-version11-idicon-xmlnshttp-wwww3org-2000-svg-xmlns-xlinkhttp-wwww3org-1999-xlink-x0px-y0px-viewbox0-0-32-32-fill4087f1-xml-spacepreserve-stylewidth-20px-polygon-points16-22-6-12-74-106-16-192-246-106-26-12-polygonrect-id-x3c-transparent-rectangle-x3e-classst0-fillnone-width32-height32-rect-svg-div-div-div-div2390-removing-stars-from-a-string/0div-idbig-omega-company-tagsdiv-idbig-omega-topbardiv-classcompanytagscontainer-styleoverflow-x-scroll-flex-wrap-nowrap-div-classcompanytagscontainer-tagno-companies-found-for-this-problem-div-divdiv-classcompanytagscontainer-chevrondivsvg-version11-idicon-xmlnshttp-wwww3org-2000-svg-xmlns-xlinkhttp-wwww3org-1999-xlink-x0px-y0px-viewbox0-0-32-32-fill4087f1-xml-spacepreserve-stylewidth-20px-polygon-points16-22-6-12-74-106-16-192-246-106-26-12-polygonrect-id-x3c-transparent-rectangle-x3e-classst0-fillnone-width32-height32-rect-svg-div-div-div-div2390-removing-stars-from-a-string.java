class Solution {
    public String removeStars(String str) {
         int n = str.length();
        if (n == 0) {
            return "";
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            if (str.charAt(i) != '*') {
                if (count > 0) {
                    count--;
                } else {
                    sb.append(str.charAt(i));
                }

            } else {
                count++;
            }
        }
        sb.reverse();
        return sb.toString();
        
    }
}