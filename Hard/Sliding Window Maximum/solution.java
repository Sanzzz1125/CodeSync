class Solution {

    public int findMax(int[] nums, int start, int end) {
        int max = Integer.MIN_VALUE;
        for(int i = start; i <= end; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= n-k; i++) {
            int max = findMax(nums, i, i+k-1);
            list.add(max);
        }
        int[] ans = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}