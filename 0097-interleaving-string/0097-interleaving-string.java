class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        char[] str1 = s1.toCharArray();
         char[] str2 = s2.toCharArray();
         char[] str3 = s3.toCharArray();
        
      boolean T[][] = new boolean[str1.length +1][str2.length +1];
        
        if(str1.length + str2.length != str3.length){
            return false;
        }
        
        for(int i=0; i < T.length; i++){
            for(int j=0; j < T[i].length; j++){
                int l = i + j -1;
                if(i == 0 && j == 0){
                    T[i][j] = true;
                }
                else if(i == 0){
                    if(str3[l] == str2[j-1]){
                        T[i][j] = T[i][j-1];
                    }
                }
                else if(j == 0){
                    if(str1[i-1] == str3[l]){
                        T[i][j] = T[i-1][j];
                    }
                }
                else{
                    T[i][j] = (str1[i-1] == str3[l] ? T[i-1][j] : false) || (str2[j-1] == str3[l] ? T[i][j-1] : false);
                }
            }
        }
        return T[str1.length][str2.length];
    }
}