class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] sweep = new int[1001];
        int max = 0;

        for(int[] trip:trips){
            int l = trip[1];
            int r = trip[2];
            max = Math.max(max,r);
            sweep[l] += trip[0];
            sweep[r] -= trip[0];
        }

        if(sweep[0]>capacity) return false;
        
        for(int i=1;i<=max;i++){
            sweep[i]+=sweep[i-1];
            if(sweep[i]>capacity) return false;
        }
        return true;
    }
}