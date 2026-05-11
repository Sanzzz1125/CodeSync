class Solution {
    static boolean isPrime(int n) {
        if (n <2) return false;
        for (int i = 2; i<n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public boolean checkPrimeFrequency(int[] nums) {
        int n = nums.length;
        boolean res = false;
        for (int i = 0; i < n; i++) {
        int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]){
                    cnt++;
                }
            }
            if(isPrime(cnt)){
                res = true;
            }
        }
        return res;
    }
}