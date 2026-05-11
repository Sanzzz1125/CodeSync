class Solution {
    public int countAsterisks(String s) {
        int bars = 0;
        int ash = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                bars++;
            }
            else if(bars%2==0){
                if(s.charAt(i)=='*'){
                    ash++;
                }
            }
        }
        return ash;
    }
}