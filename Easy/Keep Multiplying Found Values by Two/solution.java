class Solution {
    public int findFinalValue(int[] nums, int original) {
        int m = original;
        int n=nums.length;
        int res = 0;
        for(int i=0;i<n;i++){
            if(m == nums[i]){
                m*=2;
                i = -1;
                continue;
            }
        }
        return m;
    }
}