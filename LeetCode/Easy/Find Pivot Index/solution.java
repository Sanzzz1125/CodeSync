class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int sum1=0, sum2=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        sum2 = 0;
        for(int i=0;i<n;i++){
            sum -= nums[i];
            if(sum==sum2){
                return i;
            }
            sum2 += nums[i];
        }
        return -1;
    }
}