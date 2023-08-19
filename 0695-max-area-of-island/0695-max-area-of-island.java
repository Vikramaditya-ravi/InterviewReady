class Solution {
     public int maxAreaOfIsland(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int maxi = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    maxi = Math.max(maxi, AreaOfIsland(i, j, grid));
                }
            }
        }
        return maxi;

    }
     public int AreaOfIsland(int i,int j,int[][] grid){
        if(i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
        
        return 1+AreaOfIsland(i-1,j,grid)+AreaOfIsland(i+1,j,grid)+
                AreaOfIsland(i,j-1,grid)+AreaOfIsland(i,j+1,grid);
        }
         return 0;
     }
}