class Solution {
    public int binaryGap(int n) {
        String s = Integer.toBinaryString(n);
        int prev=-1, maxGap = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                if(prev!=-1){
                    int gap = i - prev;
                    maxGap = Math.max(gap,maxGap);
                }
                prev = i;
            }
        }
        return maxGap;
    }
}