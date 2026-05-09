class Solution {
    public void dfs(int i, int j, int oldColor, int newColor, int [][] image){
        if(i<0 || j<0 || i>=image.length || j>=image[0].length || image[i][j] == newColor || image[i][j] != oldColor)return;
        
        image[i][j] = newColor;
        dfs(i+1,j,oldColor,newColor,image);
        dfs(i-1,j,oldColor,newColor,image);
        dfs(i,j-1,oldColor,newColor,image);
        dfs(i,j+1,oldColor,newColor,image);
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if(oldColor == color) return image;
        dfs(sr,sc,oldColor,color,image);
        return image;
    }
}