class Solution {
public:
     bool findifkthbitset(int k ,uint32_t n ){
        if(((1 << (k-1))&n)!=0){
            return true;
        }
        return false;
    }
    int hammingWeight(uint32_t n) {
        int count = 0;
        for(int i = 1; i <=32 ; i ++ ){
            if(findifkthbitset(i,n)){
                count++;
            }
        }
        return count;
        
    }
};