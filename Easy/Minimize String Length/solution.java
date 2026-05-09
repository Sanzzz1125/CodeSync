class Solution {
    public int minimizedStringLength(String s) {
        int freq[] = new int[26], cnt=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=1) cnt++;
        }
        return cnt;
    }
}