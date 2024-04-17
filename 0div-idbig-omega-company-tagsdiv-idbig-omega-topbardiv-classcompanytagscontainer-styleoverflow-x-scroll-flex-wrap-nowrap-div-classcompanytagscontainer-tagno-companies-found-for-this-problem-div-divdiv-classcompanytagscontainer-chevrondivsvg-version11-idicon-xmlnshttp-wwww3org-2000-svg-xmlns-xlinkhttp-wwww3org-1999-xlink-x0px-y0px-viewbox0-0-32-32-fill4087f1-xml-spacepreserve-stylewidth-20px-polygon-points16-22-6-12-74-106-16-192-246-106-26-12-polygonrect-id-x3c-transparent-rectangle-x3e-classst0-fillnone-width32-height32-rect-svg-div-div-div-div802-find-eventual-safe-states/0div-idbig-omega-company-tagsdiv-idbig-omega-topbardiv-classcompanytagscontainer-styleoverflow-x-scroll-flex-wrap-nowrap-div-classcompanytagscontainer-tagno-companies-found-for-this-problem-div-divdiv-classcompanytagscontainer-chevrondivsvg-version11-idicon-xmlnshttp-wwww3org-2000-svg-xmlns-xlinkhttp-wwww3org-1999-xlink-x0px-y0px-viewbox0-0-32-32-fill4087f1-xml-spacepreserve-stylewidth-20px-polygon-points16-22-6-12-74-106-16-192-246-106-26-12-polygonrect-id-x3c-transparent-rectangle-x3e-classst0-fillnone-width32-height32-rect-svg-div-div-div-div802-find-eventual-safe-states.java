class Solution {
    public boolean dfsUtility(ArrayList<ArrayList<Integer>> list,int[] vis,int current){
        
        vis[current] = 2;
        for(int val:list.get(current)){
            if(vis[val] == 2){
                return true;
            }
            else if(vis[val] == 0 && dfsUtility(list,vis,val) ){
                return true;
            }
           
        }
        vis[current]  =1;
        return false;
        
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> result = new ArrayList<>();
        int n =graph.length;        
        ArrayList<ArrayList<Integer>> list  = new ArrayList<>();

        for(int i = 0 ; i <= n;i++){
            list.add(new ArrayList<>());
        }
        
        for(int i = 0; i < n; i++){
            for(int  j =0; j < graph[i].length; j++){
                list.get(i).add(graph[i][j]);
            }
        }        
        
        for(int i= 0; i < n; i++ ){
            int[] vis = new int[n];
                if(!dfsUtility(list,vis,i)){
                    result.add(i);
                }
            
        }

        return result;
        
        
        
    }
}