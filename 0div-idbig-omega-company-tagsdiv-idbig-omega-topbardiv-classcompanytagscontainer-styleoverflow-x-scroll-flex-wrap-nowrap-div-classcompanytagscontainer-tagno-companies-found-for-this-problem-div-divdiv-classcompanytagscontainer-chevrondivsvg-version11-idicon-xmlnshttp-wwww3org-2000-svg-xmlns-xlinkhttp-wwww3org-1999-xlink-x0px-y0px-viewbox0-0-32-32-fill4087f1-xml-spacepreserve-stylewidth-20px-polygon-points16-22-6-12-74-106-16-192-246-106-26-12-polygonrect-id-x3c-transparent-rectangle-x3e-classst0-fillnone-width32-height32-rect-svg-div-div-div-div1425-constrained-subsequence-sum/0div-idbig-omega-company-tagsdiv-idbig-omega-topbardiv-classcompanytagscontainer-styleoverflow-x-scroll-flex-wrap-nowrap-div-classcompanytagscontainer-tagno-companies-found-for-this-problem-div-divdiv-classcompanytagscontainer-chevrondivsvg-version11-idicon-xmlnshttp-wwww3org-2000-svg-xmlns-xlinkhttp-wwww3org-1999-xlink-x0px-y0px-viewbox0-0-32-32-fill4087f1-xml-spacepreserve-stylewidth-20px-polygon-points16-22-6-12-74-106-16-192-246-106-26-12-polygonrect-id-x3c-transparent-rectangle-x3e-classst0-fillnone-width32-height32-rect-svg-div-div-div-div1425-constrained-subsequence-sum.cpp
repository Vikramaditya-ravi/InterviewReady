class Solution {
public:
    int constrainedSubsetSum(vector<int>& nums, int k) {
         int n=nums.size();
        priority_queue<pair<int,int>>pq;
        int ans=nums[0];
        pq.push({nums[0],0});
        for(int i=1;i<=k;i++){
           int temp=max(nums[i],pq.top().first+nums[i]);
            ans=max(ans,temp);
            pq.push({temp,i});
        }
        for(int i=k+1;i<n;i++){
            while(i-pq.top().second>k) pq.pop();
           int temp=max(nums[i],pq.top().first+nums[i]);
            ans=max(ans,temp);
            pq.push({temp,i});
        }
        return ans;
        
    }
};