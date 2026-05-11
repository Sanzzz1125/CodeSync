class Solution {
    public boolean lemonadeChange(int[] digits) {
        int n=digits.length;
        if(digits[0]!=5) return false;
        int sum5 = 0;
        int sum10 = 0;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(digits[i]==5){
                sum5+=5;
                cnt++;
                continue;
            }else if(digits[i]==10){
                if(sum5>0){
                    cnt++;
                    sum10+=10;
                    sum5-=5;
                }
                continue;
            }else if(digits[i]==20 && sum5>0 && sum10>0){
                    cnt++;
                    sum5-=5;
                    sum10-=10;
                continue;
            }
            else if(digits[i]==20 && sum5>10 && sum10==0){
                cnt++;
                sum5-=15;
                continue;
            }
        }
        // for(int i=0;i<n;i++){
        //     if(digits[i]==5) cnt++;
        // }
        if(cnt==n){
            return true;
        }
        return false;
    }
}