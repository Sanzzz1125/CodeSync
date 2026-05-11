class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String temp = new StringBuilder(words[i]).reverse().toString();
            if(temp.equals(words[i])){
                return words[i];
            }
        }
        return "";
    }
}