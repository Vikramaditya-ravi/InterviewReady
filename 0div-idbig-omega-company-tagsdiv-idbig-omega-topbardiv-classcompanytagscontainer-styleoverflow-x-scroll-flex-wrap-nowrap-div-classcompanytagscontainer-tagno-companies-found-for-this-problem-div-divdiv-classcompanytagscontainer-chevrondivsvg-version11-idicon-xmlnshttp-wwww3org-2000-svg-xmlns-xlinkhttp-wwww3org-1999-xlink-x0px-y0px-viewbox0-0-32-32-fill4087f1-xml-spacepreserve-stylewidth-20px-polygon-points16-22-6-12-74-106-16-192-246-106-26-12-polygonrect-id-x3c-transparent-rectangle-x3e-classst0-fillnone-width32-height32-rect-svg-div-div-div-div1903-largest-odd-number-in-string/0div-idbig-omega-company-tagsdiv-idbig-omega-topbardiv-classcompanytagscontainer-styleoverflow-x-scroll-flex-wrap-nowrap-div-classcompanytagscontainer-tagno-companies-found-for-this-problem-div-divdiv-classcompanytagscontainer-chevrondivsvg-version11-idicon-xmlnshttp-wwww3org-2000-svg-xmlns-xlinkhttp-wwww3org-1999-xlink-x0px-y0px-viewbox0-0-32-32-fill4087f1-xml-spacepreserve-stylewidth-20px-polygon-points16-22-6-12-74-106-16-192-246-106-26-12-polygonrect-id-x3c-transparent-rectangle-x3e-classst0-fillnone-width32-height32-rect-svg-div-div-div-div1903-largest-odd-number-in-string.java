class Solution {
    public String largestOddNumber(String num) {
         String res = "";
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            int temp = num.charAt(i);
            if (temp % 2 == 1) {
                res = num.substring(0, i+1);
                break;
            }
        }
        return res;
        
    }
}