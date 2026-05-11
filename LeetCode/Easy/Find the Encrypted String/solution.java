class Solution {
    public String getEncryptedString(String s, int k) {
        int n = s.length();
        k = k % n;
        return s.substring(k) + s.substring(0, k);
        // int cnt=0;
        // for (int i = 0; i < s.length(); i++) {
        //     cnt++;
        //     if(cnt!=k){
        //         s = s.substring(1) + s.charAt(0);
        //     }
        // }
        // return s;
    }
}