class Solution {
    public int findMiddleIndex(int[] nums) {
        int n =nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int sum2=0;
        for(int i=0;i<n;i++){
            sum -=nums[i];
            if(sum==sum2){
                return i;
            }
            sum2 += nums[i];
        }
        return -1;
    }
}