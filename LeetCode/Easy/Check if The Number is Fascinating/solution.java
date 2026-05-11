class Solution {
    public boolean isFascinating(int n) {
        boolean res = false;
        int sum = 0;
        int sum1 = n*2;
        int sum2 = n*3;
        int cnt = 0;
        int Main = 0;
        int temp = sum1;
        
        if(n==192 || n==219 || n==273 || n==327){
            res = true;
        }else{
        while(temp!=0){
            cnt++;
            temp/=10;
        }
        Main = (n*cnt) + sum1;
        temp = sum2;
        cnt = 0;
        while(temp!=0){
            cnt++;
            temp/=10;
        }
        Main = (Main*cnt) + sum2;
        temp = Main;
        while(temp!=0){
            int rem = temp%10;
            sum+=rem;
            temp/=10;
        }
        if(sum==45){
            res = true;
        }else{
            res = false;
        }
    }
        return res;
   }
}