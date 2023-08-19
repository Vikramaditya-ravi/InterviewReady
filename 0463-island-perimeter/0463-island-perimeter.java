class Solution {
      public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    result += helper(i, j, grid);
                }
            }
        }
        return result;

    }

    public int helper(int i, int j, int[][] grid) {
        int count = 4;
        if (i - 1 >= 0 && grid[i - 1][j] == 1  ) {
            count--;
        }
        if (i + 1 < grid.length && grid[i + 1][j] == 1 ) {
            count--;
        }
        if (  j - 1 >= 0 && grid[i][j - 1] == 1) {
            count--;
        }
        if ( j+1 < grid[0].length && grid[i][j + 1] == 1 ) {
            count--;
        }
        return count;

    }
}