class Solution {
    // public int maximumProduct(int[] nums) {
    //     int n = nums.length;
    //     Arrays.sort(nums);
    //     int max1 = (nums[0]*nums[1]*nums[n-1]), max2 = (nums[n-1]*nums[n-2]*nums[n-3]);
    //     if(max1>max2) return max1;
    //     return max2;
    // }

    public int maximumProduct(int[] nums) {
        int n = nums.length;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(nums[i]>max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if(nums[i]>max2){
                max3 = max2;
                max2 = nums[i];
            }else if(nums[i]>max3){
                max3 = nums[i];
            }

            if(nums[i]<min1){
                min2 = min1;
                min1 = nums[i];
            }else if(nums[i]<min2){
                min2 = nums[i];
            }
        }
        int prod1 = max1*max2*max3;
        int prod2 = min1*min2*max1;
        if(prod1>prod2) return prod1;
        return prod2;
    }
}