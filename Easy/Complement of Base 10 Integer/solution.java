class Solution {
    public int bitwiseComplement(int n) {
        String num = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='0') sb.append("1");
            else sb.append("0");
        }
        num = sb.toString();
        return Integer.parseInt(num, 2);
    }
}