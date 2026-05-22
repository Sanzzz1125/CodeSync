class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length,n=heights[0].length;
        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic=new boolean[m][n];
        for(int i=0;i<n;i++){
            dfs(0,i,heights,pacific);
        }
        for(int i=0;i<m;i++){
            dfs(i,0,heights,pacific);
        }
        
        for(int i=0;i<m;i++){
            dfs(i,n-1,heights,atlantic);
        }
        for(int i=0;i<n;i++){
            dfs(m-1,i,heights,atlantic);
        }
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> curr=new ArrayList<Integer>();
                    curr.add(i);
                    curr.add(j);
                    result.add(new ArrayList<Integer>(curr));
                }
            }
        }
        return result;
    }
    public void dfs(int row,int col,int[][] heights,boolean[][] visited){
        int m=heights.length,n=heights[0].length;
        visited[row][col]=true;
        int[][] directions={{-1,0},{0,1},{1,0},{0,-1}};
        for(int[] dir:directions){
            int nr = row + dir[0];
            int nc = col + dir[1];
            if(nr >= 0 && nc >= 0 && nr < m && nc < n && !visited[nr][nc] &&
               heights[row][col]<=heights[nr][nc]) {
                dfs(nr, nc, heights,visited);
            }
        }
    }
}