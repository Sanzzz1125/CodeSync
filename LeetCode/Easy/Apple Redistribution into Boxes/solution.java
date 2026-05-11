class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0;
        for(int i=0;i<apple.length;i++){
            sum+=apple[i];
        }
        int cnt=0,temp=0,res=0;
        Arrays.sort(capacity);
        for(int i=capacity.length-1;i>=0;i--){
            temp += capacity[i];
            cnt++;
            if(temp>=sum){
                return cnt;
            }
        }
        return -1;
    }
}