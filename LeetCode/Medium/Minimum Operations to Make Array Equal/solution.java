class Solution {
    public int minOperations(int n) {
        int cnt = 0;
        int equal = n;
        for(int i = 1;i<=n;i+=2){
            if(i%2!=0){
                cnt = cnt + (equal - i);
            }
        }
        return cnt;
    }
}