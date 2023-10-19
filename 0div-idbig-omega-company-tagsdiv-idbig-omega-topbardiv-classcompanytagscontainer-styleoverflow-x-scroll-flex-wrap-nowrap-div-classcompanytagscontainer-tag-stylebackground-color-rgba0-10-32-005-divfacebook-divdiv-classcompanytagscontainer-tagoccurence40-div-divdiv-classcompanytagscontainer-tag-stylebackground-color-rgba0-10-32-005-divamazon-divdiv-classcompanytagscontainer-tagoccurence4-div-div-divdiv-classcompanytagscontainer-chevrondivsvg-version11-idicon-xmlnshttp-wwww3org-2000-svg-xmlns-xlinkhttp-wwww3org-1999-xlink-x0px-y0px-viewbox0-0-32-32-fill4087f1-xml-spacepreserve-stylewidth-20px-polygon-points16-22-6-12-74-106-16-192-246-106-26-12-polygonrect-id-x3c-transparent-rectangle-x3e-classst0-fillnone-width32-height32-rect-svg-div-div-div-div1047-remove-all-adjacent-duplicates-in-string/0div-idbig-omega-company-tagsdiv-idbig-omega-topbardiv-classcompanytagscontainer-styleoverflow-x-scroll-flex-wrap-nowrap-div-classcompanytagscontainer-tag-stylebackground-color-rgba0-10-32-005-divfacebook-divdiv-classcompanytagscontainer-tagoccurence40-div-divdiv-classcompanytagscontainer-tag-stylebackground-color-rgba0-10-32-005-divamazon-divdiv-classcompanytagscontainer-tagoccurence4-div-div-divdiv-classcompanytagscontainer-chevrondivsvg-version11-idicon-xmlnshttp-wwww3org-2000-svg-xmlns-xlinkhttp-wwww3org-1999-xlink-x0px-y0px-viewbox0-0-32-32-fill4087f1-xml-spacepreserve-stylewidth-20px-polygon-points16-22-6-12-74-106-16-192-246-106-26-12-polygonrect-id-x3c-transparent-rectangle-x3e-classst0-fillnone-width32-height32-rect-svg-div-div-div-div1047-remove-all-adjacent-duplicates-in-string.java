class Solution {
    public String removeDuplicates(String str) {
        int i = 0;
         int n = str.length();
         char[] s = str.toCharArray();
         for (int j = 0; j <n ; j++,i++) {
             s[i] = s[j];
             if(i>0 &&  s[j] == s[i-1]){
                 i-=2;
             }

         }
         return new String(s, 0, i);
        
    }
}