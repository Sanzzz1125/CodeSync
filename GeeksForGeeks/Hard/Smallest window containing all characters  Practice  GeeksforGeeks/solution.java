class Solution {
    public static String minWindow(String s, String t) {
        // code here
        if(t.length()>s.length()) return "";

        int left = 0, start = 0, found = 0, minLen = Integer.MAX_VALUE;
        HashMap<Character, Integer> tFreq = new HashMap<>();
        HashMap<Character, Integer> sFreq = new HashMap<>();

        for (char ch : t.toCharArray()) {
            tFreq.put(ch, tFreq.getOrDefault(ch, 0) + 1);
        }

        for(int right=0; right<s.length(); right++){
            char ch = s.charAt(right);
            sFreq.put(ch,sFreq.getOrDefault(ch,0)+1);

            if(tFreq.containsKey(ch) && sFreq.get(ch).intValue() == tFreq.get(ch).intValue()){
                found++;
            }

            while(found == tFreq.size()){
                if(minLen > right - left + 1){
                    minLen = right - left + 1;
                    start = left;
                }

                sFreq.put(s.charAt(left),sFreq.get(s.charAt(left)) - 1);
                if (tFreq.containsKey(s.charAt(left)) && sFreq.get(s.charAt(left)) < tFreq.get(s.charAt(left))) {
                    found--;
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start + minLen);
    }
}