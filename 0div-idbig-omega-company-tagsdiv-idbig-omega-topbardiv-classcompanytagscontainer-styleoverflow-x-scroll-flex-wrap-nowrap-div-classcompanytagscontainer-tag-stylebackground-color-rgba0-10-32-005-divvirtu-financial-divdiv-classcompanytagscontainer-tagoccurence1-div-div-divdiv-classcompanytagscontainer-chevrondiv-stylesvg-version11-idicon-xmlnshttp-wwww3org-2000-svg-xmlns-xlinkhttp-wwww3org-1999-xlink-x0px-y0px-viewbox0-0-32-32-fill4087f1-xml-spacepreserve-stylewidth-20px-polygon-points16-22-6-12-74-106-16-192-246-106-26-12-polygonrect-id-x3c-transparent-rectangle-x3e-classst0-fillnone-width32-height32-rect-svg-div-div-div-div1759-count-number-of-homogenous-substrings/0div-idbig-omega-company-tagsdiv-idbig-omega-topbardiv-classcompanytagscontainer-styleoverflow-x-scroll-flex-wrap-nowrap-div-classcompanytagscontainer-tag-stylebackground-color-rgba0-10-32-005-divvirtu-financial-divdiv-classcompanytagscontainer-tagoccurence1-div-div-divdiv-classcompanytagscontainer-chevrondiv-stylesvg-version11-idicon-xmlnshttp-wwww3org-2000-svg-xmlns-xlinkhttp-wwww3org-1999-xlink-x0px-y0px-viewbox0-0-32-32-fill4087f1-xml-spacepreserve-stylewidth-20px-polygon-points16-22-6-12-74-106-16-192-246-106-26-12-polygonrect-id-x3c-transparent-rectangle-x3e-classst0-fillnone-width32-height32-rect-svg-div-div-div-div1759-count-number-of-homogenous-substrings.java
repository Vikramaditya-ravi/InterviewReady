class Solution {
     public int countHomogenous(String s) {         
        int mod = 1000000007;
        long res = 0;
        int count = 1;
        
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else {
                res= (res + ((long) (count) % mod *(count+1)%mod)/2)%mod;
                count= 1;
            }
        }
         res= (res + ((long) (count) % mod *(count+1)%mod)/2)%mod;
        
        return (int) (res%mod);


    }
}