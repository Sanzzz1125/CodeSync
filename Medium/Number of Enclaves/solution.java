class Solution {
    public void dfs(int[][] grid, int i, int j){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j] == 0 || grid[i][j] == 2 || grid[i][j]!= 1) return;

        grid[i][j] = 2;
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
    public int numEnclaves(int[][] grid) {
        if(grid == null || grid.length == 0) return 0; 
        int rows = grid.length;
        int cols = grid[0].length;

        for(int j = 0; j < cols; j++){
            dfs(grid, 0, j);
            dfs(grid, rows - 1, j);
        }

        for(int i = 0; i < rows; i++){
            dfs(grid, i, 0);
            dfs(grid, i, cols - 1);
        }

        int cnt=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j] == 1) cnt++;
            }
        }
        return cnt;
    }
}