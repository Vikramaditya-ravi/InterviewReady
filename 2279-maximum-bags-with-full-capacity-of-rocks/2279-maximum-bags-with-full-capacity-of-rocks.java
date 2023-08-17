class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
         int n = capacity.length;
         int res = 0;
         for (int i = 0; i <n; i++) {
             if (capacity[i] - rocks[i] == 0){
                 res++;
             }
             else {
                 pq.offer(capacity[i] - rocks[i]);
             }

         }
         while (additionalRocks > 0 && !pq.isEmpty()){
             int temp = pq.poll();
             if (additionalRocks-temp >= 0 ){
                 additionalRocks = additionalRocks-temp;
                 res++;
             }
             else{
                 break;
             }
             
         }
         return res;
    }
}