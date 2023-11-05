class Solution {
    public int getWinner(int[] arr, int k) {
        int i = 0; int j =1;
        int win_count = 0;
        int n  = arr.length;
        while(i<n && j < n){            
            if(arr[i] > arr[j]){
                win_count++;
                j++;
                
            }
            else{
                i = j;
                j++;
                win_count = 1;
                
            }
            
            if (win_count == k){
                return arr[i];
            }
        }            
        
        return arr[i];
    }
}