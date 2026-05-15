class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int remove = nums.length - k;
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<nums.length;i++){
            while(!stk.isEmpty() && nums[i] < stk.peek() && remove> 0){
                stk.pop();
                remove--;
            }
            stk.push(nums[i]);
        }
        while (stk.size() > k) {
            stk.pop();
        }
        int[] res = new int[stk.size()];
        int i=stk.size()-1;
        while(!stk.isEmpty()){
            res[i] = stk.pop();
            i--;
        }
        return res;
    }
}