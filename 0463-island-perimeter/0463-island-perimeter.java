class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    int count = 4;
                    if (isValid(i - 1, j, grid.length, grid[0].length)) {
                        if (grid[i - 1][j] == 1) {
                            count--;
                        }
                    }
                    if (isValid(i + 1, j, grid.length, grid[0].length)) {
                        if (grid[i + 1][j] == 1) {
                            count--;
                        }
                    }
                    if (isValid(i, j - 1, grid.length, grid[0].length)) {
                        if (grid[i][j - 1] == 1) {
                            count--;
                        }
                    }
                    if (isValid(i, j + 1, grid.length, grid[0].length)) {
                        if (grid[i][j + 1] == 1) {
                            count--;
                        }

                    }
                    result+=count;
                }
            }
        }
        return result;

    }

    public boolean isValid(int i, int j, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return false;
        } else {
            return true;
        }
    }
}