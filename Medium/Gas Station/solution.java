class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int res =0;
        int tank =0;
        int idx=0;
        for(int i=0;i<n;i++){
            res += gas[i]-cost[i];
            tank += gas[i] - cost[i];
            if(res<0){
                res=0;
                idx=i+1;
            }
        }
        return (tank<0)?-1:idx;
    }
}