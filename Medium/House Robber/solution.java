class Solution {
    public int rob(int[] nums) {
        // if(nums.length==1){
        //     return nums[0];
        // }
        // if(nums.length==2){
        //     return Math.max(nums[0],nums[1]);
        // }
        // if(nums.length==3){
        //     return Math.max(nums[2]+nums[0],nums[1]);
        // }
        // int[] dp=new int[nums.length];
        // dp[0]=nums[0];
        // dp[1]=Math.max(nums[0],nums[1]);
        // for(int i=2;i<nums.length;i++){
        //     dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
        // }
        // return dp[dp.length-1];
        int prev1 =0,prev2=0;
        for(int i=0;i<nums.length;i++){
            int temp = Math.max(prev1, prev2+nums[i]);
            prev2 = prev1;
            prev1 = temp;
        }
        return prev1;
    }
}