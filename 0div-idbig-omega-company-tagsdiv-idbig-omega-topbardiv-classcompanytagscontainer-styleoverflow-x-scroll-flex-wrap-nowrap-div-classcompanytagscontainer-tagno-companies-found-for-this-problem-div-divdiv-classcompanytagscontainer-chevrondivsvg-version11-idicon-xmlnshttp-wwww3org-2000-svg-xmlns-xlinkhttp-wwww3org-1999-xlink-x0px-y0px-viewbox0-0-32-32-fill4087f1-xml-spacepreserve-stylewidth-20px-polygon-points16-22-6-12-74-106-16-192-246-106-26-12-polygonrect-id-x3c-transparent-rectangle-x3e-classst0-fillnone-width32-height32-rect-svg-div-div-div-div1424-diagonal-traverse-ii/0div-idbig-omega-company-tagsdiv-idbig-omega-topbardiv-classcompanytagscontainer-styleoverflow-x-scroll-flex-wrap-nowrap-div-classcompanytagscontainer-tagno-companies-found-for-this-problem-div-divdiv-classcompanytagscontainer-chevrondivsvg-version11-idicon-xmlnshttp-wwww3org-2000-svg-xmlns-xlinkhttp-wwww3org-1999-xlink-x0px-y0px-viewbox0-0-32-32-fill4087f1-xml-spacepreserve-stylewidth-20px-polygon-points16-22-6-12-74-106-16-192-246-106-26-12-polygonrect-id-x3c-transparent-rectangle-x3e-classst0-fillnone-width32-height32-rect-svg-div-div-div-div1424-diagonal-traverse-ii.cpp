class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& nums) {
        vector<int> res;
        int maxSum =0;
        
        unordered_map<int,vector<int>> map ;
        int n =nums.size(); 
        for(int j =n-1; j>=0; j --){
            for(int i = 0; i < nums[j].size(); i++){
                maxSum = max(maxSum,i+j);
                map[i+j].push_back(nums[j][i]);
            }
        }
        
        for(int i = 0; i<=maxSum; i++){
            for(auto elm:map[i]){
                res.push_back(elm);
            }
        }
        return res;
        
    }
};