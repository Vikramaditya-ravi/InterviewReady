class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int val:nums){
            priorityQueue.offer(val);
            if(priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }
        return  priorityQueue.peek();
    }
}