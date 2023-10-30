class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
       int n = nums.length;
        int[] res = new int[k];

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            pq.add(num);
        }

        for (int i = 0; i < k; i++) {
            int temp = pq.poll();
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        int j = 0;

        for (int i = 0; i < n && j < k; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i],map.get(nums[i] )-1);
                if (map.get(nums[i]) ==0){
                    map.remove(nums[i]);
                }                
                res[j] = nums[i];
                j++;
            }
        }

        return res;
    }
}