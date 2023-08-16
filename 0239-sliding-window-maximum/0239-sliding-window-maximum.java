class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
               int n = nums.length;
        int result[] = new int[n-k+1];
        int ri = 0;
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            if(!q.isEmpty() && q.peek() == i-k){
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]){
                q.pollLast();
            }
            q.offer(i);
            if(i >= k-1){
                result[ri++] = nums[q.peek()];
            }
            
        }
        return result;
            
            
        
    }
}