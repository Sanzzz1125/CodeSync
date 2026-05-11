class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=weights[0],h=0;
        for(int i=0;i<weights.length;i++){
            h+=weights[i];
            l=Math.max(l,weights[i]);
        }

        int res = 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            if(isPossible(weights,days,mid)){
                res = mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }
        return res;
    }

    public boolean isPossible(int weights[], int days, int mid){
        int minDays = 1;
        int sum = 0;
        for(int ele : weights){
            if(sum +ele <= mid){
                sum+=ele;
            }else{
                minDays++;
                sum = ele;
            }
        }
        return minDays <= days;
    }
}