class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i =0; i < edges.length; i++){
            int first = edges[i][0];
            int second = edges[i][1];
            map.put(first, map.getOrDefault(first,0)+1);
            if(map.get(first) > 1){
                return first;
            }
            map.put(second, map.getOrDefault(second,0)+1);
            if(map.get(second) > 1){
                return second;
            }
            
            
            
        }
        return -1;
        
        
    }
}