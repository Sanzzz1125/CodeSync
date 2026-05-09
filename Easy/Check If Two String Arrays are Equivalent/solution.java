class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        if(word1.length>1){
            for(int i=0;i<word1.length;i++){
                s1+=word1[i];
            }
        }else{
            s1 = word1[0];
        }
        String s2="";
        if(word2.length>1){
            for(int i=0;i<word2.length;i++){
                s2+=word2[i];
            }
        }else{
            s2 = word2[0];
        }
        return (s1.equals(s2));
    }
}