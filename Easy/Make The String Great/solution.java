class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!stk.isEmpty()){
                if(Math.abs(stk.peek() - ch) == 32){
                    stk.pop();
                }else{
                    stk.push(ch);
                }
            }
            else stk.push(ch);
        }

        String str = "";
        for(char ch: stk){
            str += ch;
        }
        return str;
    }
}