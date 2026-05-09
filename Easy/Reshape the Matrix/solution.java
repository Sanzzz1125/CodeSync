class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int res[][] = new int[r][c], m = mat.length, n = mat[0].length;
        if(m*n != r*c){
            return mat;
        }
        int k=0, l=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                res[k][l] = mat[i][j];
                l++;
                if(l==c){
                    l = 0;
                    k++;
                }
            }
        }
        return res;
    }
}