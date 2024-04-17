class Solution {
    public boolean dfsUtility(int[][] graph,int[] vis,int current){        
        vis[current] = 2;
        
        for(int val:graph[current]){
            if(vis[val] == 2){
                return true;
            }
            else if(vis[val] == 0 && dfsUtility(graph,vis,val) ){
                return true;
            }
           
        }
        vis[current]  =1;
        return false;
        
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        int n =graph.length;
             
        
        for(int i= 0; i < n; i++ ){
            int[] vis = new int[n];
                if(!dfsUtility(graph,vis,i)){
                    result.add(i);
                }           
        }

        return result;        
        
        
    }
}