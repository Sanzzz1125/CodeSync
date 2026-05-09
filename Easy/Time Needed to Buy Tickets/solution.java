class Solution {
    int cnt = 0;
    public int timeRequiredToBuy(int[] nums, int k) {
        int n = nums.length;
        int time = 0;
        while(nums[k]!=0){
            for(int i=0;i<n;i++){
                if(nums[i]==0) continue;
                nums[i]-=1;
                time++;
                if(nums[k]==0) break;
            }
        }
        return time;
    }
}