class Solution {
    public int maxDepth(String s) {
        int open=0,cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(') open++;
            if(open>cnt) cnt=open;
            else if(s.charAt(i) == ')') open--;
        }
        return cnt;
    }
}