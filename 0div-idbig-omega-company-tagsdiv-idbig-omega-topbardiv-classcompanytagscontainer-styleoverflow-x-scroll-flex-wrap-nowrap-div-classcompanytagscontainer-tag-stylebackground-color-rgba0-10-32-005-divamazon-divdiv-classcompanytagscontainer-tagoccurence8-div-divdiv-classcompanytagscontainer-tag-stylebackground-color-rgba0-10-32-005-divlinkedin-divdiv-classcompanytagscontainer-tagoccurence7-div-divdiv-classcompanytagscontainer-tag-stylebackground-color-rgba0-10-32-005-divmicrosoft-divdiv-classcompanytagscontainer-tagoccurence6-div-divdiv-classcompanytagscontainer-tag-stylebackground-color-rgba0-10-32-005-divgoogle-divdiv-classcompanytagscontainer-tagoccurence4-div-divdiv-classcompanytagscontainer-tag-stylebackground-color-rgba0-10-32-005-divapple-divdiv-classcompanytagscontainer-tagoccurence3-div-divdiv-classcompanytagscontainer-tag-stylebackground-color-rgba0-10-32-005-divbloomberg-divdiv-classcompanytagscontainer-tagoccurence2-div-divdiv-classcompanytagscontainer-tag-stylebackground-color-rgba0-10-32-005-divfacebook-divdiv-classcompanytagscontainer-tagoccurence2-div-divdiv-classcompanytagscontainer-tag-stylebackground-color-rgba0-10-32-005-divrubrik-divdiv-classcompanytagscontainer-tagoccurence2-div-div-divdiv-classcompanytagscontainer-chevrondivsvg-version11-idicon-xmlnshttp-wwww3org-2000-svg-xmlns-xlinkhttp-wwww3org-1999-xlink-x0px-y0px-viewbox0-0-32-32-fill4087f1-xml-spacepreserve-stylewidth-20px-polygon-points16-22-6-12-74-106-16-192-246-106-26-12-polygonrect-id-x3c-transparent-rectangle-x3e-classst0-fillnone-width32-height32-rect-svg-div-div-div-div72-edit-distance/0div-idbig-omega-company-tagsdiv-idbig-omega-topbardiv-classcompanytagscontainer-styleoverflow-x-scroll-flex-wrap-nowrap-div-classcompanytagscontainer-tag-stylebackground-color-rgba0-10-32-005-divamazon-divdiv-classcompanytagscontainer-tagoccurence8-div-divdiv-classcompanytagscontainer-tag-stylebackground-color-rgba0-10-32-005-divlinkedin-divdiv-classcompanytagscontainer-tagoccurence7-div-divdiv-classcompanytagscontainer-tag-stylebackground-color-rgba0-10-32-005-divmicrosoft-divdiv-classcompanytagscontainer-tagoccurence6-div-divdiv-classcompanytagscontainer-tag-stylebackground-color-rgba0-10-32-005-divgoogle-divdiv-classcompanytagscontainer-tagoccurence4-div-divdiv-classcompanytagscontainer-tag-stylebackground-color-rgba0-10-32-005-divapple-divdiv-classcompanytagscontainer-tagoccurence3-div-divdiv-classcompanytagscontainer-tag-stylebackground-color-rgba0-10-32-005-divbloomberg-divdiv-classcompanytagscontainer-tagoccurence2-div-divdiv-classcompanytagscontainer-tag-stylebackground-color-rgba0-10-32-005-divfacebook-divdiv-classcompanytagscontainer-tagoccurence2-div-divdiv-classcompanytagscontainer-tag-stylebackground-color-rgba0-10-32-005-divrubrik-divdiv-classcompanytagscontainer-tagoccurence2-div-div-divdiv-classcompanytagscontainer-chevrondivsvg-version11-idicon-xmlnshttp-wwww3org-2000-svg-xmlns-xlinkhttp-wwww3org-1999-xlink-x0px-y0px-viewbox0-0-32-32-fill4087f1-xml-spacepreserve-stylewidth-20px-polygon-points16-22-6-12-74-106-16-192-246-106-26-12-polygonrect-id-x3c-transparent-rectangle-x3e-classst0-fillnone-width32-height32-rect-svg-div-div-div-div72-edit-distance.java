class Solution {
    public int minDistance(String S, String T) {
         int m = S.length();
        int n = T.length();

        int[][] cost = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++)
            cost[i][0] = i;
        for (int i = 1; i <= n; i++)
            cost[0][i] = i;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (S.charAt(i) == T.charAt(j))
                    cost[i + 1][j + 1] = cost[i][j];
                else {
                    int a = cost[i][j];
                    int b = cost[i][j + 1];
                    int c = cost[i + 1][j];
                    cost[i + 1][j + 1] = a < b ? (Math.min(a, c)) : (Math.min(b, c));
                    cost[i + 1][j + 1]++;
                }
            }
        }
        return cost[m][n];
        
    }
}