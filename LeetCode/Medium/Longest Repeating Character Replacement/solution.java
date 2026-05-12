class Solution {
    public int characterReplacement(String s, int k) {
        int[] Freq = new int[26];
        int maxLen = 0;
        int maxFreq = 0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);

            Freq[ch - 'A']++;

            maxFreq = Math.max(maxFreq,Freq[ch - 'A']);

            while((right - left + 1) - maxFreq > k){
                Freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}