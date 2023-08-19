class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {

         int[] graph = new int[26];
         int size = s1.length();

         for (int i = 0; i < graph.length ; i++) {
             graph[i] = i;
         }
         for (int i = 0; i < size; i++) {
             int a = s1.charAt(i) - 'a';
             int b = s2.charAt(i) - 'a';
             int x = find(graph,b);
             int y = find(graph,a);

             if ( x < y){
                graph[y] =x;
             }
             else {
                 graph[x] = y;

             }
         }
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < baseStr.length(); i++) {
                          char c = baseStr.charAt(i);

                          sb.append((char)('a'+find(graph, c-'a')));

         }
         return sb.toString();


    }
    public int find(int[] graph,int index){
         while (graph[index] != index){
             index = graph[index];
         }
         return index;
    }
}