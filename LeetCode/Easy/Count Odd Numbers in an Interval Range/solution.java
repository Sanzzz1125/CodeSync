class Solution {
    public int countOdds(int low, int high) {
        int cnt = 0;
        if(low%2==0 && high%2==0){
            cnt = (high - low)/2;
        }else{
            cnt = (high-low)/2 + 1;
        }
        return cnt;
    }
}