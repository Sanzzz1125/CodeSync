class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt=0;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)) cnt++;
        }
        if(cnt==word.length() || cnt==1 && Character.isUpperCase(word.charAt(0)) || cnt==0){
            return true;
        }
        return false;
    }
}