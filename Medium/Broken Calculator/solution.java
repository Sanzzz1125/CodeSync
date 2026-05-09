class Solution {
    public int brokenCalc(int startValue, int target) {
        int cnt=0;
        int temp = target;
        while(temp > startValue){
            if(temp%2 == 0){
                temp /= 2;
            }else{
                temp++;
            }
            cnt++;
        }
        return cnt + (startValue - temp);
    }
}