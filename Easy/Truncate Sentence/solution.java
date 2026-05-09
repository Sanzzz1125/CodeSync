class Solution {
    public String truncateSentence(String s, int k) {
        // String words[] = s.split(" ");
        // StringBuilder sb = new StringBuilder();

        // for(int i=0;i<k;i++){
        //     sb.append(words[i]+" ");
        // }
        // return sb.toString().trim();
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                cnt++;
                if(cnt==k){
                    return s.substring(0,i);
                }
            }
        }
        return s;
    }
}