class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Union uf = new Union(n);
        for (int[] edge : edges) {
            uf.union(edge[0], edge[1]);
        }
        int x = uf.find(source);
        int y = uf.find(destination);
        if(x == y){
            return true;
        }
        else {
            return false;
        }
    }
}
class Union{
    int[] parent;

    public Union(int n ) {
        parent = new int[n];
           for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
    }

    public int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    public void union(int a, int b){
        int x = find(a);
        int y = find(b);
        if(x != y){
            parent[x] = y;
        }
        else {
            return;
        }

    }

}