class Solution {
    public int[] separateDigits(int[] nums) {
        int n = nums.length;
        for(int i=0;i<nums.length;i++){
            int temp = nums[i];
            int cnt=0;
            while(temp!=0){
                cnt++;
                temp = temp/10;
            }
            n += cnt-1;
        }

        int arr[] = new int[n];
        n=n-1;

        for(int i=nums.length-1;i>=0;i--){
            int temp = nums[i];
            int cnt=0;
            while(temp!=0){
                arr[n--] = temp%10;
                temp /= 10;
            }
        }
        return arr;
    }
}