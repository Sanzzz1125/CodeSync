class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ){
                stk.push(ch);
            }else{
                if(stk.isEmpty()) return false;
                char peek = stk.pop();
                if(ch==')' && peek!='(') return false;
                if(ch==']' && peek!='[') return false;
                if(ch=='}' && peek!='{') return false;
            }
        }
        return(stk.isEmpty());
    }
}