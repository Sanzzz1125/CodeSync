class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        String s1="", s2="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='#'){
                st.push(s.charAt(i));
                continue;
            }
            if(st.isEmpty()) continue;
            st.pop();
        }
        while(!st.isEmpty()){
            s1 = st.pop()+s1;
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)!='#'){
                st.push(t.charAt(i));
                continue;
            }
            if(st.isEmpty()) continue;
            st.pop();
        }
        while(!st.isEmpty()){
            s2 = st.pop()+s2;
        }
        return s1.equals(s2);
    }
}