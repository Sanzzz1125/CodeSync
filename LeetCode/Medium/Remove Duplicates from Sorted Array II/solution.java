class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int cnt=2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[cnt-2]){
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        return cnt;
    }
}