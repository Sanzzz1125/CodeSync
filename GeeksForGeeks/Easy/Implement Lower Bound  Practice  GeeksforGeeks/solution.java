class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int l=0,h=arr.length-1, ans=arr.length;
        
        while(l<=h){
            int m = l+(h-l)/2;
            if(arr[m]>=target){
                ans = m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        
        return ans;
    }
}