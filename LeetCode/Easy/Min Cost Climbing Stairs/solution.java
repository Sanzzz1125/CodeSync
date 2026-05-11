class Solution {
    int find(int dp[], int idx, int arr[]){
        if(idx >= arr.length) return 0;

        if(dp[idx] != -1) return dp[idx];

        return dp[idx] = arr[idx] + Math.min(find(dp,idx+1,arr), find(dp,idx+2,arr));
    }
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(find(dp, 0, cost), find(dp, 1, cost));
    }
}