class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = true, dec = true;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]) continue;
            inc = false;
            break;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]) continue;
            dec = false;
            break;
        }
        if(inc || dec) return true;
        return false;
    }
}