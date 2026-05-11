class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n=grid.length;
        int cnt = 0, c=0;
        int len = grid.length*grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if(i==j || i+j==grid.length-1){
                    if(grid[i][j]==0) return false;
                }
                else if(grid[i][j]!=0) return false;
            }
        }
        return true;
    }
}