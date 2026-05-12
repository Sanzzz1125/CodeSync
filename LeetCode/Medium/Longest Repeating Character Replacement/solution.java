class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLen = 0;
        int maxFreq = 0;
        int left=0;
        for(int right=0;right<s.length();right++){
            char ch = s.charAt(right);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            int window = right-left+1;

            maxFreq = Math.max(maxFreq,map.get(ch));

            if(window - maxFreq > k){
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar)-1);

                left++;

                window = right - left + 1;
            }
            maxLen = Math.max(maxLen, window);
        }
        return maxLen;
    }
}