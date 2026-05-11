class Solution {
    public int[] transformArray(int[] nums) {
        int e = 0, c = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]%2==0){
                e++;
            }else if(nums[i]%2!=0){
                c++;
            }
        }
        int k = 0;
        while(e!=0){
            nums[k] = 0;
            e--;
            k++;
        }
        while(c!=0){
            nums[k] = 1;
            c--;
            k++;
        }
        return nums;
    }
}