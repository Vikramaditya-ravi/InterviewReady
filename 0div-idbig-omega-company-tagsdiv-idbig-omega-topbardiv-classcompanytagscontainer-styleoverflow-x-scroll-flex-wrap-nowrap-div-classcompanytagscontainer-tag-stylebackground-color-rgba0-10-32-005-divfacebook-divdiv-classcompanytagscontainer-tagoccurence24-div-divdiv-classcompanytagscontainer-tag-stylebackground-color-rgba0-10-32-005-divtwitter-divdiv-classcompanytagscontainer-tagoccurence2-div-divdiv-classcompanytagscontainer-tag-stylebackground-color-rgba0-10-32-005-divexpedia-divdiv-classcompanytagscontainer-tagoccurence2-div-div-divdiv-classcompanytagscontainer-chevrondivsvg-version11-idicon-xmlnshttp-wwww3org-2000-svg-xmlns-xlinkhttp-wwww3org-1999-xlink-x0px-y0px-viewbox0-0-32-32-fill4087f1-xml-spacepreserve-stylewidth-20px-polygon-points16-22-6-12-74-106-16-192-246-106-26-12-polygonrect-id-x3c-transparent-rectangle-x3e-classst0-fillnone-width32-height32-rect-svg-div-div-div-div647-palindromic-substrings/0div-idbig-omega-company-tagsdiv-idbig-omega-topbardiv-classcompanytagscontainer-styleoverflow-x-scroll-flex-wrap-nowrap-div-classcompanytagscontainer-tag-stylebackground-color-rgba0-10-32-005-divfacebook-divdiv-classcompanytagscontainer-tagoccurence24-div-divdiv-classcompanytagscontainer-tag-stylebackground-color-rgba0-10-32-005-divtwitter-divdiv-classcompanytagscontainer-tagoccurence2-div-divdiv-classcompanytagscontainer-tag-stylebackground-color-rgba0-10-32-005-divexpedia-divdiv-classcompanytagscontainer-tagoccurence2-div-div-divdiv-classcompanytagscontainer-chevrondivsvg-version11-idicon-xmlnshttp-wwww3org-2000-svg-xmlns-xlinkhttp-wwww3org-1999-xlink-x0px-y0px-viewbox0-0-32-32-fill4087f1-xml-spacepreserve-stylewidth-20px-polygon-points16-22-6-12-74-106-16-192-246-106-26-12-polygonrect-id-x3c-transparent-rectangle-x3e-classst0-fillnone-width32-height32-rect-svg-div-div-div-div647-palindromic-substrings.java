class Solution {
    public int countSubstrings(String s) {
         int n = s.length();
         if(n == 0){
             return 0;
         }
         int count = 0;
         for (int i = 0; i < n; i++) {
             count+=expandAroundCenter(s,i,i);
             count+=expandAroundCenter(s,i,i+1);
         }
         return count;


    }
    public int expandAroundCenter(String s,int left,int right){
         int count = 0;
         while (left>=0 && right < s.length() && (s.charAt(left) == s.charAt(right))){
             left--;
             right++;
             count++;
         }
         return count;
    }
}