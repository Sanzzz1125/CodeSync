class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        long cnt=0;
        for(int i=0;i<n;i++){
            if(nums[i]==max1 || nums[i]==max2 || nums[i]==max3) continue;
            cnt++;
            if(nums[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i]>max2 && nums[i]!=max1){
                max3 = max2;
                max2 = nums[i];
            }
            else if(nums[i]>max3 && nums[i]!=max2 && nums[i]!=max1){
                max3 = nums[i];
            }
        }
        if(max3 == Long.MIN_VALUE) return (int)max1;
        return (int)max3;
    }
}