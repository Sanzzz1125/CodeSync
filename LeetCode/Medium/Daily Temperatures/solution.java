class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];

        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<len;i++){
            while(!stk.isEmpty() && temperatures[i] > temperatures[stk.peek()]){
                int prevIdx = stk.pop();
                res[prevIdx] = i - prevIdx;
            }
            stk.push(i);
        }
        return res;
    }
}