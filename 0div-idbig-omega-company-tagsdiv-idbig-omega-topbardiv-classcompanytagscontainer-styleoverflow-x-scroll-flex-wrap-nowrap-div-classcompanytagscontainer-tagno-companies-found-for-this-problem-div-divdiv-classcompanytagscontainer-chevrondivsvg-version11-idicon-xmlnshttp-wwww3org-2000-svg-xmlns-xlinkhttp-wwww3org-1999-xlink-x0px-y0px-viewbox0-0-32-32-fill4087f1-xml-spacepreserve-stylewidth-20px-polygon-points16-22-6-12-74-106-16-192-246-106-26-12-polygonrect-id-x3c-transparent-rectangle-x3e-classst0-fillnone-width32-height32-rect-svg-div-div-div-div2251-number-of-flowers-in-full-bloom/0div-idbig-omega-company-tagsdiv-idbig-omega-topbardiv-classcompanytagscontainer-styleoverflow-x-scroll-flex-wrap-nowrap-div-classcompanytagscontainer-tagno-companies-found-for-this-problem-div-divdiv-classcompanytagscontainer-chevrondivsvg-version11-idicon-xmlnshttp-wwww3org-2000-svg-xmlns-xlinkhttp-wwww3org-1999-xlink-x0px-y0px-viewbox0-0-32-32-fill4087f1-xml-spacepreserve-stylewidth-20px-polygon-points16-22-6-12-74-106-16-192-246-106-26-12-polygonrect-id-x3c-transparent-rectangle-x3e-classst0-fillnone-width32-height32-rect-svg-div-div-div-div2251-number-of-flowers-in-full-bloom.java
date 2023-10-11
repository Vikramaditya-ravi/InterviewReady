class Solution {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        
          int n = people.length;
         int[] res = new int[n];
         PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->a[0] == b[0] ? a[1]-b[1]:a[0]-b[0]);
         for (int i = 0; i <n ; i++) {
             pq.offer(new int[]{people[i],1,i});
         }
         for (int[] flower:flowers){
             pq.offer(new int[]{flower[0],0});
             pq.offer(new int[]{flower[1],2});
         }

         int blossoms = 0;
         int numEvents = pq.size();
         for (int i = 0; i < numEvents; i++) {
             int[] temp = pq.poll();
             if(temp[1] == 0){
                 blossoms++;
             }
             else if (temp[1] == 2){
                 blossoms--;

             }
             else {
                 res[temp[2]] = blossoms;
             }
         }
         return res;
        
    }
}