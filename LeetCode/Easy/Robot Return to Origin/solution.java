class Solution {
    public boolean judgeCircle(String moves) {
        int c1=0,c2=0;
        for(int i=0;i<moves.length();i++){
            char ch = moves.charAt(i);
            if(ch == 'U') c1++;
            else if(ch == 'D') c1--;
            else if(ch == 'L') c2++;
            else if(ch == 'R') c2--;
        }
        return (c1 == 0 && c2 == 0);
    }
}