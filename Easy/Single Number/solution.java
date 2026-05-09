class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int res = 0;
        // for (int i = 0; i < n; i++) {
        //     int cnt = 0;
        //     for (int j = 0; j < n; j++) {
        //         if (nums[j] == nums[i]){
        //             cnt++;
        //         }
        //     }
        //     if(cnt == 1){
        //         res = nums[i];
        //     }
        // }
        for(int i=0;i<n;i++){
            res^=nums[i];
        }
        return res;
    }
}