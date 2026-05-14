class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stk = new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<>();
        
        int[] res = new int[arr.length];
        Arrays.fill(res,-1);
        
        for(int i=0;i<arr.length;i++){
            while(!stk.isEmpty() && arr[i] > arr[stk.peek()]){
                res[stk.pop()] = arr[i];
            }
            stk.push(i);
        }
        
        for(int ele : res){
            list.add(ele);
        }
        return list;
    }
}