class Solution {
    public int getWinner(int[] arr, int k) {
                int n  = arr.length;

        if(k == 1){
            return Math.max(arr[0],arr[1]);
        }
        if( k >= n){
            return Arrays.stream(arr).max().getAsInt();
        }     
        
        int temp = arr[0];
        int win_count = 0;
        
        for(int i = 1; i < n; i++){
           if(temp > arr[i]){
               win_count++;
           }
            else{
                temp = arr[i];
                win_count = 1;
            }
             if (win_count == k){
                return temp;
            }
        }
        
        return temp;
    }
}