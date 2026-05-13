class Solution {
    public int numberOfWays(int n) {
        
        int a = 0, b = 1;
        for (int i = 2; i <= n + 1; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        
        return b;
    }
};