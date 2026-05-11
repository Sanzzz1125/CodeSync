class Solution {
    public int splitArray(int[] nums, int k) {
        int l=nums[0], h=0;
        for(int ele: nums){
            l = Math.max(l,ele);
            h += ele;
        }

        int res=0;
        while(l<=h){
            int mid = l+(h-l)/2;

            if(isPossible(nums,k,mid)){
                res = mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }

    public boolean isPossible(int nums[], int k, int mid){
        int cnt=1;
        int sum=0;
        for(int ele: nums){
            sum += ele;
            if(sum>mid){
                cnt += 1;
                sum = ele;
            }
        }
        return cnt<=k;
    }
}