class Solution {
    static int max(int maxprofit, int n){
        if(maxprofit>n) return maxprofit;
        return n;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(prices[i]<min){
                min = prices[i];
            }else{
                maxProfit = max(maxProfit,prices[i]-min);
            }
        }
        return maxProfit;
    }
}

// int n = prices.length;
        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;
        // int minidx=0, maxidx=0;
        // for(int i=0;i<n;i++){
        //     if(prices[i]<min){
        //         min = prices[i];
        //         minidx = i;
        //     }
        // }
        // for(int i=minidx;i<n;i++){
        //     if(prices[i]>max){
        //         max = prices[i];
        //         maxidx = i;
        //     }
        // }
        // if(minidx<maxidx){
        //     return max - min;
        // }
        // return 0;