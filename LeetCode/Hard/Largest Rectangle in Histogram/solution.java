class Solution {
    public int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stk = new Stack<Integer>();
        for(int i=0;i<=heights.length;i++){
            int currHeight  = i == heights.length ? 0 : heights[i];
            while(!stk.isEmpty() && currHeight < heights[stk.peek()]){
                int idx = stk.pop();

                int width = stk.isEmpty() ? i : (i - stk.peek() - 1);

                int area = heights[idx] * width;

                maxArea = Math.max(area,maxArea);
            }
            stk.push(i);
        }
        return maxArea;
    }
}