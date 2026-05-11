class Solution {
    public int tribonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2) return 1;
        int f1 = 0,f2 = 1, f3 = 1, f4 = 0; 
        for(int i=3;i<=n;i++){
            f4 = f1+f2+f3;
            f1 = f2;
            f2 = f3;
            f3 = f4;
        }
        return f4;
    }
}