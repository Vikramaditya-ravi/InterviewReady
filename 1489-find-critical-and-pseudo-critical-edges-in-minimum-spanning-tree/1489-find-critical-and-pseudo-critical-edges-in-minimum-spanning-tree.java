// package com.ravi.codeChef.August.aug14.aug19;

import java.util.*;
class Unionfind{
    int count;
    int[] parent;

    public Unionfind(int n ) {
        parent = new int[n];
        reset();
    }
    public void reset(){
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        count = parent.length;
    }
    public int find(int x){
        if(parent[x] != x){
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }
    public boolean union(int a, int b){
        int x = find(a);
        int y = find(b);
        if(x != y){
            count--;
            parent[y] = x;
            return true;
        }
        else {
            return false;
        }
    }

}

public class Solution {
    public List<List<Integer>> findCriticalAndPseudoCriticalEdges(int n, int[][] edges) {
        List<Integer> critical = new ArrayList<>();
        List<Integer> pseudo = new ArrayList<>();
        HashMap<int[], Integer> map = new HashMap<>();
        for (int i = 0; i < edges.length;i++) {
            map.put(edges[i],i);
        }
        Arrays.sort(edges, Comparator.comparingInt(e -> e[2]));
        int minCost = builtMST(n,edges,null,null);

        for (int[] edge : edges) {
            int index = map.get(edge);
            int costWithout = builtMST(n, edges, null, edge);
            if (costWithout > minCost) {
                critical.add(index);
            } else {
                int costWith = builtMST(n, edges, edge, null);
                if (costWith == costWithout) {
                    pseudo.add(index);
                }

            }
        }   
        return Arrays.asList(critical,pseudo);
    }
    private int builtMST(int n, int[][] edges, int[] pick,int[] skip){
        Unionfind uf = new Unionfind(n);
        int cost = 0;

        if (pick!= null){
            uf.union(pick[0],pick[1]);
            cost+=pick[2];

        }
        for (int[] edge:edges){
            if (edge != skip && uf.union(edge[0],edge[1])){
                cost+=edge[2];
            }
        }
        if (uf.count == 1){
            return cost;
        }
        else {
            return Integer.MAX_VALUE;
        }

    }
}
