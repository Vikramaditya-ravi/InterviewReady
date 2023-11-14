class Solution {
    public int numTilings(int N) {
 if(N<1){
            throw new IllegalArgumentException();
        }
        if(N<3){
            return N;
        }
        int[] dp=new int[N+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        int M=1000000007;
        for(int i=3;i<=N;i++){
            dp[i]=(dp[i-1]%M+dp[i-2]%M)%M;
            for(int j=3;j<=i;j++){
                dp[i]=((dp[i]%M)+((dp[i-j]<<1)%M))%M;
            }
        }
        return dp[N];
    }
}