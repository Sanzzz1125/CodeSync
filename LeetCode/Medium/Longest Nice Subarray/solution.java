class Solution {
    public int longestNiceSubarray(int[] nums) {
        int sum = 0;
        int maxLen = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++){
            while((sum & nums[right]) != 0){
                sum -= nums[left];
                left++;
            }

            sum += nums[right];
            maxLen = Math.max(maxLen, right-left +1);
        }

        return maxLen;
    }
}