class Solution {
    public int calculate(String s) {
        
        Stack<Integer> stk = new Stack<>();
        char sign = '+';
        int num = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            if((!Character.isDigit(ch) && ch != ' ') || i == s.length() - 1){

                if(sign == '*'){
                    stk.push(stk.pop() * num);
                }else if(sign == '/'){
                    stk.push(stk.pop() / num);
                }else if(sign == '-'){
                    stk.push(-num);
                }else{
                    stk.push(num);
                }
                sign = ch;
                num = 0;
            }
        }
        num = 0;
        while(!stk.isEmpty()){
            num += stk.pop();
        }
        return num;
    }
}