class Solution {
    static int minimum(int nums[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n =  nums.length;
        while(k!=0){
            int min = minimum(nums);
            for(int i=0;i<n;i++){
                if(nums[i] == min){
                    nums[i] = nums[i]*multiplier;
                    break;
                }
            }
            k--;
        }
        return nums;
    }
}