class Solution {
    public int arrangeCoins(int n) {
        int coins = n;
        int full = 0;
        for(int i = 1;i<=n;i++){
            coins = coins - i;
            if(coins<0){
                full = i-1;
                break;
            }else if(coins==0){
                full = i;
                break;
            }
        }
        return full;
    }
}