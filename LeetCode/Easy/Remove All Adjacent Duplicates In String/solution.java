class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stk = new StringBuilder();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(stk.length() > 0 && ch == stk.charAt(stk.length() - 1)){
                stk.deleteCharAt(stk.length() - 1);
            }else{
                stk.append(ch);
            }
        }
        return stk.toString();
    }
}