class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {

            addEdge(adj, prerequisites[i][0], prerequisites[i][1]);
        }

        boolean[] visited = new boolean[numCourses];
        boolean[] recS = new boolean[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if(!visited[i]){
                if (dfs(i,-1,adj,visited,recS)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean dfs(int start, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] recS) {
        visited[start] = true;
        recS[start] = true;

        for (Integer neighbor : adj.get(start)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, start, adj, visited, recS)) {
                    return true;
                }

            } else if (recS[neighbor]) {
                return true;
            }
        }
        recS[start] = false;
        return false;
    }

    public void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
    }
}