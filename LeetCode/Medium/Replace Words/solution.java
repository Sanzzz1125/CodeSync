class Solution {
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isEnd=false;
    }

    TrieNode root = new TrieNode();
    public void insert(String word){
        TrieNode curr=root;
            for(char ch:word.toCharArray()){
            if(curr.children[ch-'a']==null) curr.children[ch-'a']=new TrieNode();
            curr=curr.children[ch-'a'];
        }
        curr.isEnd=true;
    }

    public String search(String word) {
        TrieNode curr = root;
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()) {
            if (curr.children[ch - 'a'] == null) {
                return word;
            }
            sb.append(ch);
            curr = curr.children[ch - 'a'];
            if (curr.isEnd) {
                return sb.toString();
            }
        }
        return word;
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        root=new TrieNode();
        for(String st:dictionary){
            insert(st);
        }

        StringBuilder result=new StringBuilder();
        for(String word:sentence.split(" ")){
            String value=search(word);
            result.append(value);
            result.append(" ");
        }
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}