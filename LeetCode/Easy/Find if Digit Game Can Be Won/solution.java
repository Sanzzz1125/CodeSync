class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum1 = 0, sum2 = 0, temp = 0;
        boolean res = false;
        for(int i = 0;i<nums.length;i++){
            temp = nums[i];
            if(temp<=9){
                sum1 += temp;
            }else if(temp>9){
                sum2 += temp;
            }
        }
        if(sum1==sum2){
            res = false;
        }else{
            res = true;
        }
        return res;
    }
}