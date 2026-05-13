class Solution {
    public int longestKSubstr(String s, int k) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        int maxLen = -1, left = 0;
        
        for(int right = 0;right<s.length(); right++){
            
            char ch = s.charAt(right);
            
            map.put(ch,map.getOrDefault(ch,0)+1);
            
            while(map.size() > k){
                char lChar = s.charAt(left);
                
                map.put(lChar, map.get(lChar)-1);
                
                if(map.get(lChar) == 0) map.remove(lChar);
                
                left++;
            }
            if(map.size() == k){
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        
        return maxLen;
    }
}