class Solution {
    public int orangesRot(int[][] grid) {
        int fresh=0;
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j] == 2) q.offer(new int[]{i, j});
                else if(grid[i][j] == 1) fresh++;
            }
        }
        if(fresh == 0) return 0;
        int mins = 0;
        while(!q.isEmpty()){
            int size = q.size();
            boolean inf = false;
            for(int s=0;s<size;s++){
                int[] cell = q.poll();
                int i = cell[0];
                int j = cell[1];

                if(i-1>= 0 && grid[i-1][j] == 1){
                    grid[i-1][j] = 2;
                    fresh--;
                    inf = true;
                    q.offer(new int[]{i-1, j});
                }

                if(i+1 < row && grid[i+1][j] == 1){
                    grid[i+1][j] = 2;
                    fresh--;
                    inf = true;
                    q.offer(new int[]{i+1, j});
                }

                if(j-1>=0  && grid[i][j-1] == 1){
                    grid[i][j-1] = 2;
                    fresh--;
                    inf = true;
                    q.offer(new int[]{i, j-1});
                }

                if(j+1 < col  && grid[i][j+1] == 1){
                    grid[i][j+1] = 2;
                    fresh--;
                    inf = true;
                    q.offer(new int[]{i, j+1});
                }
            }
            if(inf) mins++;
        }
        return fresh == 0 ? mins : -1;
    }
}