class Solution {
    void dfs(int i, int j, char [][]mat){
        if(i<0 || j<0 || i>= mat.length|| j>=mat[0].length || mat[i][j] == '0') return;
        
        mat[i][j] = '0';
        dfs(i+1,j,mat);
        dfs(i-1,j,mat);
        dfs(i,j-1,mat);
        dfs(i,j+1,mat);
    }
    public int numIslands(char[][] grid) {
        int cnt=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    dfs(i,j,grid);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}