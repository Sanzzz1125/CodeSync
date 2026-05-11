class Solution {
    public int integerBreak(int n) {
        if(n<=3){
            return n-1;
        }
        if(n%3==0){
            return (int)Math.pow(3,n/3);
        }
        if((n%3)%2!=0){
            int thp=(n/3)-1;
            int top=2;
            return (int)Math.pow(3,thp)*(int)Math.pow(2,2);
        }
        else{
            int thp=(n/3);
            int top=2;
            return (int)Math.pow(3,thp)*(int)Math.pow(2,1);
        }
    }
}