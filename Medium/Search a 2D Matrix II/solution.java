class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int n = mat.length, i=0, j=mat[0].length-1;
            while(i<n && j>=0){
                if(mat[i][j]==target) return true;
                else if(target>mat[i][j]){
                    i++;
                    continue;
                }else j--;
            }
        return false;
    }
}