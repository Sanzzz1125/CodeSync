class Solution {
    public boolean canThreePartsEqualSum(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int t = sum/3;
        if(sum%3==0){
            sum = 0;
            for(int i=0;i<n;i++){
                sum+=nums[i];
                if(sum==t){
                    cnt++;
                    sum = 0;
                    if(cnt==3) return true;
                }
            }
        }
        return false;
    }
}