class Solution {
    public int[] countBits(int n) {
        int [] ans = new int[n+1];
        for(int i=0;i<=n;i++){
            int temp = i, cnt=0;
            ans[i] = ans[i/2] + (i % 2);
        }
        // for(int i=0;i<=n;i++){
        //     int res = 0;
        //     String temp = Integer.toBinaryString(i);
        //     int m = Integer.parseInt(temp);
        //     while(m!=0){
        //         if(m%10==1) res++;
        //         m/=10;
        //     }
        //     ans[i] = res;
        // }
        return ans;
    }
}