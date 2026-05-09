class Solution {
    public String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        String row1 = "qwertyuiopQWERTYUIOP", row2="asdfghjklASDFGHJKL",row3 ="zxcvbnmZXCVBNM";
        for(int i=0;i<words.length;i++){
            int r1=0,r2=0,r3=0;
            for(int j=0;j<words[i].length();j++){
                char ch = words[i].charAt(j);
                if(row1.indexOf(ch)!=-1){
                    r1++;
                }else if(row2.indexOf(ch)!=-1){
                    r2++;
                }else if(row3.indexOf(ch)!=-1){
                    r3++;
                }
            }
            if(r1==words[i].length()) res.add(words[i]);
            else if(r2==words[i].length()) res.add(words[i]);
            else if(r3==words[i].length()) res.add(words[i]);
        }
        return res.toArray(new String[0]);
    }
}