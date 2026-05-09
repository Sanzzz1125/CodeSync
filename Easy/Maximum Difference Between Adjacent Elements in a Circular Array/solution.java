class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int cnt = 0;
        int n = nums.length;
        int diff = 0, max = 0;
        for(int i = 0;i<n-1;i++){
            diff = Math.abs(nums[i] - nums[i+1]);
            if(diff>max){
                max = diff;
            }
        }

        if(Math.abs(nums[0] - nums[n-1])>max){
            max = Math.abs(nums[0] - nums[n-1]);
        }
        return max;
    }
}