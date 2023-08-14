class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1  < o2 ){
                    return 1;
                }
                if (o1 > o2){
                    return -1;
                }
                return 0;
            }
            
        });
          for (int i = 0; i < nums.length; i++) {
            priorityQueue.add(nums[i]);
        }
        for (int i = 0; i <k-1; i++) {
            priorityQueue.poll();
        }
        return  priorityQueue.poll();
    }
}