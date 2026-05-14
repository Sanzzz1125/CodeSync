class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']++;
        }

        boolean[] visited = new boolean[26];
        Stack<Character> stk = new Stack<>();

        for(int i=0;i<s.length();i++){
            
            char ch = s.charAt(i);
            freq[ch - 'a']--;
            if(visited[ch - 'a']) continue;

            while(!stk.isEmpty() && ch < stk.peek() && freq[stk.peek() - 'a'] > 0){
                visited[stk.pop() - 'a'] = false;
            }
            stk.push(ch);

            visited[ch - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : stk) {
            sb.append(ch);
        }
        return sb.toString();
    }
}