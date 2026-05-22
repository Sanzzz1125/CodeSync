// User function Template for Java

class Solution {

    int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};

    public int countCoordinates(int[][] mat) {

        int n = mat.length;
        int m = mat[0].length;

        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];

        // Pacific -> top row and left column
        for(int i = 0; i < m; i++) {
            dfs(0, i, mat, pacific);
        }

        for(int i = 0; i < n; i++) {
            dfs(i, 0, mat, pacific);
        }

        // Atlantic -> bottom row and right column
        for(int i = 0; i < m; i++) {
            dfs(n - 1, i, mat, atlantic);
        }

        for(int i = 0; i < n; i++) {
            dfs(i, m - 1, mat, atlantic);
        }

        // Count cells reachable from both oceans
        int count = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(int r, int c, int[][] mat, boolean[][] vis) {

        int n = mat.length;
        int m = mat[0].length;

        vis[r][c] = true;

        for(int[] d : dirs) {

            int nr = r + d[0];
            int nc = c + d[1];

            // Reverse flow condition
            if(nr >= 0 && nc >= 0 && nr < n && nc < m
               && !vis[nr][nc]
               && mat[nr][nc] >= mat[r][c]) {

                dfs(nr, nc, mat, vis);
            }
        }
    }
}