class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        int n = nums.length;

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i <= n-k; i++) {

            int max = Integer.MIN_VALUE;

            for(int j = i; j < i+k; j++) {
                max = Math.max(max, nums[j]);
            }

            list.add(max);
        }

        int[] ans = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}