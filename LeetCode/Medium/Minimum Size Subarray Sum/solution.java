class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;

        int sum=0;
        int CurrLen = 0;
        int minLen = Integer.MAX_VALUE;
        for(int right = 0; right < nums.length; right+=1){
            sum += nums[right];
            while(sum >= target){
                int currLen = right - left + 1;
                minLen = Math.min(minLen, currLen);
                sum -= nums[left];
                left += 1;
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}