class WordDictionary {
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isEnd=false;
    }

    TrieNode root=new TrieNode();
    public WordDictionary() {
    }
    
    public void insert(String word){
        TrieNode curr=root;
        for(char ch:word.toCharArray()){
            if(curr.children[ch-'a']==null){
                curr.children[ch-'a']=new TrieNode();
            }
            curr=curr.children[ch-'a'];
        }
        curr.isEnd=true;
    }
    
    public void addWord(String word) {
        insert(word);
    }
    
    public boolean search(String word) {
        TrieNode curr=root;
        return dfs(word,0,curr);
    }
    
    public boolean dfs(String word,int index,TrieNode curr){
        if(index==word.length())
            return curr.isEnd;
        char ch=word.charAt(index);
        if(ch!='.'){
            if(curr.children[ch-'a']==null)
                return false;
            curr=curr.children[ch-'a'];
            return dfs(word,index+1,curr);
        }else{
            for(int i=0;i<26;i++){
                if(curr.children[i]!=null){
                    if(dfs(word,index+1,curr.children[i])){
                        return true;
                    }
                }
            }
            return false;
        }
    }
}