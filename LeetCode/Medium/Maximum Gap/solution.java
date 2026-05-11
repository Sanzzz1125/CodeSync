class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=0;
        for(int i=0;i<n;i++){
            int cnt=0;
            if(i<=n-1 && i+1<=n-1){
                cnt = max;
                max = nums[i+1]-nums[i];
                max = Math.max(max,cnt);
            }
        }
        return max;
    }
}