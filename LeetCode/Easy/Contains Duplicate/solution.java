class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
        // for (int i = 0; i < n; i++) {
        //     int cnt = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (nums[j] == nums[i])
        //             cnt++;
        //     }
        //     if (cnt >= 2)
        //         return true;
        // }
        // return false;
    }
}