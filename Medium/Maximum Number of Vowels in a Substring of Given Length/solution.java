class Solution {
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int n = s.length();

        int cnt=0;
        int maxCnt = cnt;

        for(int i=0;i<n;i++){
            if(isVowel(s.charAt(i))){
                cnt++;
            }

            if(i >= k && isVowel(s.charAt(i-k))){
                cnt--;
            }

            if(i >= k-1){
                maxCnt = Math.max(maxCnt,cnt);
            }
        }
        return maxCnt;
    }
}

// class Solution {
//     public int maxVowels(String s, int k) {
//         int cnt=Integer.MIN_VALUE;
//         for(int i=0;i<=s.length()-k;i++){
//             int temp=0;
//             for(int j=i;j<i+k;j++){
//                 char ch = s.charAt(j);
//                 if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') temp++;
//             }
//             cnt = Math.max(cnt,temp);
//         }
//         return cnt;
//     }
// }