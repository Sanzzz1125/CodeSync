class Solution {
    public String toHex(int num) {
        StringBuilder sb = new StringBuilder();
        boolean neg = num<0;
        if(num==0) return String.valueOf(num);
        long n = num & 0xffffffffl;

        while(n!=0){
            long rem = n%16;
            if(rem==10) sb.append("a");
            else if(rem==11) sb.append("b");
            else if(rem==12) sb.append("c");
            else if(rem==13) sb.append("d");
            else if(rem==14) sb.append("e");
            else if(rem==15) sb.append("f");
            else sb.append(rem);
            n/=16;
        }
        // if(neg) sb.append("-");
        return sb.reverse().toString();
    }
}