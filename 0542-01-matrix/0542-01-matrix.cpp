class Solution {
public:
    vector<vector<int>> updateMatrix(vector<vector<int>>& mat) {
        
       queue<pair<int,int>> q;
       vector<vector<int>> res(mat.size(),vector<int>(mat[0].size(),-1));
        
        for(int i = 0; i < mat.size(); i++){
            for(int j = 0; j < mat[0].size();j++){
                if(mat[i][j] == 0){
                    q.push({i,j});
                    res[i][j] = 0;
                }
            }
        }
        int n = mat.size();
        int m = mat[0].size();
        
        while(!q.empty()){
            int i  = q.front().first;
            int j = q.front().second;
            
            if(isValid(i+1,j,n,m) && res[i+1][j] == -1){
                
                res[i+1][j] = res[i][j]+1;
                q.push({i+1,j});
                
            }
             if(isValid(i-1,j,n,m) && res[i-1][j] == -1){
                 res[i-1][j] = res[i][j]+1;
                 q.push({i-1,j});
                
            } if(isValid(i,j+1,n,m) && res[i][j+1] == -1){
                 res[i][j+1] = res[i][j]+1;
                q.push({i,j+1});
                
            } if(isValid(i,j-1,n,m) && res[i][j-1] == -1){
                 res[i][j-1] = res[i][j]+1;
                q.push({i,j-1 });
                
            }
            q.pop();
            
            
        }
        return res;
        
        
    }
    
    bool isValid(int i,int j,int n,int m){
        if(i < 0 || j < 0 || i >= n || j >= m){
            return false;
            
        }
        else{
            return true;
        }
    }
};