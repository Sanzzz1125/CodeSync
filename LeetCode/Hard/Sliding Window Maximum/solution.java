class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        int n = nums.length;
        int[] result = new int[n - k + 1];

        Deque<Integer> deque = new ArrayDeque<Integer>();
        for(int i=0;i<n;i++){
            while(!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.pollLast();
            }
            deque.add(i);
            if(!deque.isEmpty() && i - k >= deque.peekFirst()){
                deque.pollFirst();
            }
            if(i >= k-1){
                result[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}