class Solution {
    public int[][] rotate(int [][] mat){
        int n = mat.length;
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = mat[n-j-1][i];
            }
        }
        return matrix;
    }
    public boolean check_eql(int [][] mat, int [][] target){
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j] != target[i][j]) return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(check_eql(mat,target)) return true;
            mat = rotate(mat);
        }
        return false;
    }
}