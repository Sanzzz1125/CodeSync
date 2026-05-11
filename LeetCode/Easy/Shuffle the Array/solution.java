class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len=nums.length;
        int[] arr = new int[len];
        int m=1;
        for(int i=1;i<len;i+=2){
            arr[i] = nums[i+n-m];
            arr[i-1] = nums[i-m];
            m++;
        }
        return arr;
    }
}