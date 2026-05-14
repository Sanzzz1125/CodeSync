class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        int len = operations.length;
        for(int i = 0;i<len;i++){
            if(operations[i].equals("C")){
                stk.pop();
            }else if(operations[i].equals("D")){
                stk.push(stk.peek()*2);
            }else if(operations[i].equals("+")){
                int n1 = stk.pop();
                int n2 = stk.pop();
                stk.push(n2);
                stk.push(n1);
                stk.push(n1+n2);
            }else{
                stk.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        for (int x : stk) {
            sum += x;
        }
        return sum;
    }
}