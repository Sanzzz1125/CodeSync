class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s = s.replace("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            if(++cnt==k && i>0){
                sb.append('-');
                cnt=0;
            }
        }
        return sb.reverse().toString();
        // String res = "";
        // int cnt = 0;
        // for(int i=s.length()-1;i>=0;i--){
        //     res = s.charAt(i) + res;
        //     cnt++;
        //     if(cnt==k && i!=0){
        //         res = "-" + res;
        //         cnt = 0;
        //     }
        // }
        // return res;
    }
}