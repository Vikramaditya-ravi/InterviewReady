class Solution {
public:
    int solve(vector<int>& arr,int left,int right,
              vector<vector<int>>&dp,map<pair<int,int>,int> &map)
    {
        if(left == right){
            return 0;
        }
        if(dp[left][right] != -1){
            return dp[left][right] ;
            
        }
        int ans = INT_MAX;
        
        for(int i = left;i<right;i++){
            ans = min(ans, map[{left,i}]*map[{i+1,right}]
                      +solve(arr,left,i,dp,map)
                      +solve(arr,i+1,right,dp,map));
            
        }
        
        
       return dp[left][right] = ans;
        
        
    }
    int mctFromLeafValues(vector<int>& arr) {
        int n = arr.size();
        vector<vector<int>> dp(n+1,vector<int>(n+1,-1));
        map<pair<int,int>,int> map;
        for(int i = 0;i < n;i++){
            map[{i,i}] = arr[i];
            for(int j =i+1; j <n;j++){
                map[{i,j}] = max(arr[j],map[{i,j-1}]);
            }
        }
        return solve(arr,0,n-1,dp,map);
        
    }
};