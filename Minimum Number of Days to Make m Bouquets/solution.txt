class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<((long)m*k)){
            return -1;
        }

        int low=bloomDay[0],high=0;
        for(int ele : bloomDay){
            low = Math.min(low,ele);
            high = Math.max(high,ele);
        }

        int res = 0;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(isPossible(bloomDay, m,k,mid)){
                res = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }

    public boolean isPossible(int[] bloom, int m, int k, int day){
        int cnt=0;
        int bouq=0;

        for(int ele : bloom){
            if(ele <= day){
                cnt++;
            }else{
                bouq += cnt/k;
                cnt=0;
            }
        }

        bouq += cnt/k;
        if(bouq >= m) return true;
        return false;
    }
}