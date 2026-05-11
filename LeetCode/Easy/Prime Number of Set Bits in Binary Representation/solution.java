class Solution {
    static boolean isPrime(int cnt){
        if(cnt<2) return false;
        for(int i=2; i*i<=cnt; i++){
            if(cnt%i==0)return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int cnt = 0;
        for(int i=left;i<=right;i++){
            int ones = Integer.bitCount(i);
            if(isPrime(ones)) cnt++;
        }
        return cnt;
    }
}