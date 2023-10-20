class Solution {
    public int minimumLength(String s) {
        int n = s.length();
         int i = 0;
         int j = n-1;
         int result = 0;
        //it will only work for the prefix or suffix having only 1 as thelength;
         
         while (i < j){
             if(s.charAt(i)!= s.charAt(j)){
                 return (j-i+1);
             }
             else {
                 //"cabaabac"
                 char temp = s.charAt(i);
                 i++;
                 j--;
                 while (i <= j && temp == s.charAt(i)){
                     i++;
                 }
                 while (j >= i && temp == s.charAt(j)){
                     j--;
                 }
             }
         }
         return j-i+1;
    }
}