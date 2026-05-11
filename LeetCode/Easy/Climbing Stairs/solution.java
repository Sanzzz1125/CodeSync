class Solution {
    int cnt=0;
    int climb(int n,int dp[]){
        if(n<0) return 0;
        if(dp[n]!=-1) return dp[n];
        if(n==0) return 1;
        return dp[n] = climb(n-1,dp)+climb(n-2,dp);
    }
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n, dp);
    }
}
