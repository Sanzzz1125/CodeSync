class Solution {
    public int clumsy(int n) {
        int idx = 1;
        Stack<Integer> stk = new Stack<>();
        stk.push(n);
        for(int i=n-1;i>=1;i--){
            if(idx == 1){
                stk.push(i*stk.pop());
                idx++;
            }else if(idx == 2){
                stk.push(stk.pop()/i);
                idx++;
            }else if(idx == 3){
                stk.push(i);
                idx++;
            }else if(idx == 4){
                stk.push(-1*i);
                idx = 1;
            }
        }
        int num = 0;
        while(!stk.isEmpty()){
            num += stk.pop();
        }
        return num;
    }
}