class Solution {
    public boolean hasAlternatingBits(int n) {
        String num = Integer.toBinaryString(n);

        for(int i=1;i<num.length();i++){
            if(num.charAt(i-1)==num.charAt(i)){
                return false;
            }
        }
        return true;
    }
}