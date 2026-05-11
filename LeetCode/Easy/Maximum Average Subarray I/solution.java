class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=Integer.MIN_VALUE;
        for(int i=0;i<=nums.length-k;i++){
            int temp=0;
            for(int j=i;j<i+k;j++){
                temp += nums[j];
            }
            sum = Math.max(temp,sum);
        }
        return sum/k;
    }
}