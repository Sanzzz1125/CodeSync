class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(i==j || i+j==mat.length-1){
                    sum+=mat[i][j];
                }
                // if(i+j == 2){
                //     if(i==j) break;
                //     sum += mat[i][j];
                // }
            }
        }
        return sum;
    }
}