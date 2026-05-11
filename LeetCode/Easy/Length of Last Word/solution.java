class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        boolean valid = true;
        int cnt=0, i=s.length()-1;
        while(valid && i>=0){
            if(s.charAt(i)!=' '){
                cnt++;
            }else if(s.charAt(i)==' ') valid = false;
            i--;
        }
        return cnt;
    }
}