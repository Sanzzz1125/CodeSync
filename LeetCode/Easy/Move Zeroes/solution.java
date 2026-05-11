class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int k=0;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                arr[k] = nums[i];
                k++;
            }else if(nums[i]==0){
                cnt++;
            }
        }
        while(k<n){
            nums[k] = 0;
            k++;
        }
        for(int i =0;i<n;i++){
            nums[i]=arr[i];
        }
    }
}