class Solution {
    static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
    public int findGCD(int[] nums) {
        int max = nums[0], min = nums[0];
        int res = 0;
        for(int i = 0;i<nums.length;i++){
            if(min<nums[i]){
                min = nums[i];
            }
            if(max>nums[i]){
                max = nums[i];
            }
        }
        res = gcd(min,max);
        
    return res;
    }
}