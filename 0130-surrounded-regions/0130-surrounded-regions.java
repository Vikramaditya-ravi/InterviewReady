class Solution {
    private  int n;
    private  int m;
    public void solve(char[][] board) {
        n = board.length;
        if(n == 0){
            return;
        }
        m = board[0].length;
        boolean[][] visited = new boolean[n][m];


        for (int i = 0; i < m; i++) {
            if (board[0][i] == 'O'){
                dfs(board,visited,0,i);
            }
            if (board[n-1][i]== 'O'){
                dfs(board,visited,n-1,i);
            }

        }
        
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O'){
                dfs(board,visited,i,0);
            }
            if (board[i][m-1]== 'O'){
                dfs(board,visited,i,m-1);
            }

        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < m; j++) {
                if (!visited[i][j]){
                    board[i][j] = 'X';
                }
            }
        }


    }

    public void dfs(char[][] grid,boolean[][] visited,int i, int j) {

        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 'X' || visited[i][j]) {
            return;
        }
        visited[i][j] = true;
        dfs(grid,visited, i + 1, j);
        dfs(grid,visited, i - 1, j);
        dfs(grid,visited, i, j + 1);
        dfs(grid,visited, i, j - 1);

    }
}