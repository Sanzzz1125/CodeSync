class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,high=piles[0];

        for(int ele : piles){
            high = Math.max(high,ele);
        }

        int result = high;
        while(l<=high){
            int m = l+(high-l)/2;

            if(isPossible(piles,h,m)){
                result = m;
                high=m-1;
            }else{
                l=m+1;
            }
        }
        return result;
    }

    public boolean isPossible(int piles[], int h, int mid){
        long hours = 0;
        for(int ele : piles){
            hours += (ele + mid -1)/mid;
            // if(ele<=mid) hours++;
            // else{
            //     hours+= (ele/mid)+(ele % mid == 0 ? 0:1);
            // }
        }
        return hours <= h;
    }
}