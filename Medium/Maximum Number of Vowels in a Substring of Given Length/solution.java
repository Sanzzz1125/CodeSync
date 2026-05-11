class Solution {
    public int maxVowels(String s, int k) {
        int cnt=Integer.MIN_VALUE;
        for(int i=0;i<=s.length()-k;i++){
            int temp=0;
            for(int j=i;j<i+k;j++){
                char ch = s.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') temp++;
            }
            cnt = Math.max(cnt,temp);
        }
        return cnt;
    }
}