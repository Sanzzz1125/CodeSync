class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        int[] nums = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(k==n) break;
            if(arr[i]!=0){
                nums[k] = arr[i];
                k++;
            }else if(arr[i]==0){
                nums[k] = arr[i];
                k++;
                if(k==n) break;
                nums[k] = arr[i];
                k++;
            }
        }
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
        }
    }
}