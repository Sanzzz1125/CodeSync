class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        boolean neg = num<0;
        if(num==0) return String.valueOf(num);
        if(num<0){
            num = Math.abs(num);
        }
        while(num!=0){
            int rem = num%7;
            sb.append(rem);
            num/=7;
        }
        if(neg) sb.append("-");
        return sb.reverse().toString();
    }
}