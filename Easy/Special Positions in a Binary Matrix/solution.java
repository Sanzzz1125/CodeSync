class Solution {
    public int numSpecial(int[][] mat) {
        int spcl = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1 && rowSum(mat,i)==1 && colSum(mat,j)==1){
                    spcl++;
                }
            }
        }
        return spcl;
    }
    public int rowSum(int[][] mat, int r){
        int sum=0;
        for(int i=0;i<mat[r].length;i++){
            sum += mat[r][i];
        }
        return sum;
    }
    public int colSum(int[][] mat, int c){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][c];
        }
        return sum;
    }
}