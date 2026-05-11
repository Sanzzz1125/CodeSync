class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(rowMin(matrix,i,matrix[i][j]) && colMax(matrix,j,matrix[i][j])){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
    public boolean rowMin(int[][] matrix, int r, int tar){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix[r].length;i++){
            if(matrix[r][i]<min) min = matrix[r][i];
        }
        return (min==tar);
    }
    public boolean colMax(int[][] matrix, int c, int tar){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            if(matrix[i][c]>max) max = matrix[i][c];
        }
        return (max==tar);
    }

}