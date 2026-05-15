class Solution {
    public String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";

        Stack<Character> stk = new Stack<>();
        int cnt = 0;
        for(char ch : num.toCharArray()){
            while(!stk.isEmpty() && ch < stk.peek() && cnt < k){
                stk.pop();
                cnt++;
            }
            stk.push(ch);
        }

        while(cnt < k){
            stk.pop();
            cnt++;
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