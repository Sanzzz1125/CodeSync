class Solution {
    public int[][] generateMatrix(int n) {
        int matrix[][] = new int[n][n];
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        int num=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                matrix[top][i] = num;
                num++;
            }
            top++;

            for(int j=top;j<=bottom;j++){
                matrix[j][right] = num;
                num++;
            }
            right--;

            if(top<=bottom){
                for(int k = right;k>=left;k--){
                    matrix[bottom][k] = num;
                    num++;
                }
                bottom--;
            }

            if(left<=right){
                for(int l=bottom;l>=top;l--){
                    matrix[l][left] = num;
                    num++;
                }
                left++;
            }
        }
        return matrix;
    }
}