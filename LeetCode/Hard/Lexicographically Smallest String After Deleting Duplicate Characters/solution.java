class Solution {
    public String lexSmallestAfterDeletion(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }
        StringBuilder stk = new StringBuilder();

        for(char ch : s.toCharArray()){

            while(stk.length() > 0){
                char top = stk.charAt(stk.length() - 1);

                if(top > ch && freq[top - 'a'] > 1){
                    stk.deleteCharAt(stk.length() - 1);
                    freq[top - 'a']--;
                }else{
                    break;
                }
            }
            stk.append(ch);
        }

        StringBuilder res = new StringBuilder();
        int[] count = new int[26];

        while (stk.length() > 0) {
            char top = stk.charAt(stk.length() - 1);

            if (freq[top - 'a'] > 1) {
                stk.deleteCharAt(stk.length() - 1);
                freq[top - 'a']--;
            } else {
                break;
            }
        }
        return stk.toString();
    }
}