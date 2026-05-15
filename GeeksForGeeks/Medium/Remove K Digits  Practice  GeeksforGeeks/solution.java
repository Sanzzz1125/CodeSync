class Solution {
    public String removeKdig(String num, int k) {
        // code here
        if(num.length()==k) return "0";

        Stack<Character> stk = new Stack<>();
        
        for(char ch : num.toCharArray()){
            while(!stk.isEmpty() && ch < stk.peek() && k > 0){
                stk.pop();
                k--;
            }
            stk.push(ch);
            
        }
        while(k > 0){
            stk.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : stk){
            sb.append(ch);
        }
        
        while(sb.length() > 0 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.length() == 0 ? "0" : sb.toString();
    }
}