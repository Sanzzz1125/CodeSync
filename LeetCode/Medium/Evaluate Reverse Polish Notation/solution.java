class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                stk.push(stk.pop()+stk.pop());
            }else if(tokens[i].equals("*")){
                stk.push(stk.pop()*stk.pop());
            }else if(tokens[i].equals("/")){
                int num1 = stk.pop();
                int num2 = stk.pop();
                stk.push(num2/num1);
            }else if(tokens[i].equals("-")){
                int num1 = stk.pop();
                int num2 = stk.pop();
                stk.push(num2-num1);
            }else{
                stk.push(Integer.parseInt(tokens[i]));
            }
        }
        int num = stk.pop();
        return num;
    }
}