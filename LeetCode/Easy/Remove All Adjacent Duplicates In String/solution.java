class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stk = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(stk.length() > 0 && ch == stk.charAt(stk.length() - 1)){
                stk.deleteCharAt(stk.length() - 1);
            }else{
                stk.append(ch);
            }
        }
        return stk.toString();
    }
}