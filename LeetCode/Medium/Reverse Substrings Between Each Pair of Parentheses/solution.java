class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == ')'){
                StringBuilder temp = new StringBuilder();

                while(!stk.isEmpty() && stk.peek()!='('){
                    temp.append(stk.pop());
                }
                stk.pop();
                for(char c: temp.toString().toCharArray()){
                    stk.push(c);
                }
            }else{
                stk.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder(); 
        while(!stk.isEmpty()){
            sb.append(stk.pop());
        }
        return sb.reverse().toString();
    }
}