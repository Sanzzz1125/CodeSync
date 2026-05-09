class Solution {
    public int numSquares(int n) {
        if(psqr(n))
            return 1;
        if(twosqr(n))
            return 2;
        if(foursqr(n))
            return 4;
        return 3;
    }

    public boolean psqr(int n){
        int sqr = (int)Math.sqrt(n);

        return sqr*sqr == n;
    }

    public boolean twosqr(int n){
        for(int i =1; i*i<=n; i++){
            int rem = n - i*i;
            if(psqr(rem))
                return true;
        }
        return false;
    }

    public boolean foursqr(int n){
        while(n%4 == 0)
            n /= 4;
        return n%8 == 7;
    }
}