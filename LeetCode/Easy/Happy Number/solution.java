class Solution {
    public boolean isHappy(int num) {
        int sum = 0;
        int digit = 0;
        boolean valid  = false;
        if(num==1 || num==7){
            valid = true;
        }else{
        while(num!=0){
            int rem = num%10;
            sum += rem*rem;
            num/=10;
            if(num==0){
                if(sum==1|| sum==100 || sum==10){
                    valid = true;
                }
                else if(sum==4){
                    valid = false;
                    break;
                }else{
                    num = sum;
                    sum=0;
                }
            }
        }
    }
        return valid;
    }
}