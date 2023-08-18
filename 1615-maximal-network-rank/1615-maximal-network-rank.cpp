class Solution {
public:
//     bool check(int a,int b,vector<vector<int>>& roads){
//         int m=roads.size();
//         for(int i=0;i<m;i++){
//             if(roads[i][0]==a && roads[i][1]==b ) return true;
//             if(roads[i][0]==b && roads[i][1]==a) return true;

//         }
//         return false;
//     }

    int maximalNetworkRank(int n, vector<vector<int>>& roads) {
//            map<int,int>mp;
//         int m=roads.size();
//         for(int i=0;i<m;i++){
//             mp[roads[i][0]]++;
//             mp[roads[i][1]]++;
//         }
        
//         // 0-2
//         // 1-3
//         // 2-1
//         // 3-2
        
        
//         int ans=0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(check(i,j,roads)) ans=max(ans,mp[i]+mp[j]-1);
//                 else ans=max(ans,mp[i]+mp[j]);
//             }
//         }
//         return ans;
              if(roads.size()==1) return 1;    
        vector<vector<bool>>connect(n,vector<bool>(n,false));
        vector<int>v(n,0);
        for(int i=0;i<roads.size();i++){
            int f=roads[i][0];
            int s=roads[i][1];
            v[f]++;
             v[s]++;
            connect[f][s]=true;
            connect[s][f]=true; 
               }
        
        int maxi=0;
        for(int i=0;i<n-1;i++){
             
             for(int j=i+1;j<n;j++){
                int ans=v[i]+v[j];
                 if(connect[i][j]==true )
                     ans--;
            maxi=max(maxi,ans);     
        }
        }
        return  maxi;


    }
};