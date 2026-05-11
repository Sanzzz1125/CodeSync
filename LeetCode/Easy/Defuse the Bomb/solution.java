class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int res[] = new int[n];
        if(k==0) return res;
        if(k>0){
            for(int i=1;i<=k;i++){
                res[0]+=code[i % n];
            }

            for(int i=1;i<n;i++){
                res[i] = res[i-1] - code[i] + code[(i+k)%n];
            }
            return res;
        }
        k=-k;
        for(int i=n-k;i<n;i++){
            res[0] += code[i];
        }

        for(int i=1;i<n;i++){
            res[i] = res[i-1] -code[(i-k-1+n)%n] + code[i-1];
        }
        return res;
    }
}