class Solution {
    
    public int findLength(int[] nums1, int[] nums2) {
        int n  = nums1.length;
        int m = nums2.length;
        int res = Integer.MIN_VALUE;
        
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){               
                if(nums1[i] == nums2[j]){
                    int currMax = 0;
                    int x = i;
                    int y = j;
                    while(x < n && y < m){
                        if(nums1[x] == nums2[y] ){
                            currMax++;
                            x++;
                            y++;
                        }
                        else{
                            break;
                        }
                    }
                    res = Math.max(res,currMax);
                    
                }                
                
            }
        }
        
        return res == Integer.MIN_VALUE?0:res;
        
        
    }
}