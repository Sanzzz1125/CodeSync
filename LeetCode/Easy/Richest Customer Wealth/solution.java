class Solution {
    public int maximumWealth(int[][] accounts) {
        int n = accounts.length;
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            int s=0;
            for(int j=0;j<accounts[i].length;j++){
                s+=accounts[i][j];
            }
            arr[i] = s;
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
}