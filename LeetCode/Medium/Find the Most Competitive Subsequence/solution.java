class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        int n=nums.length;
        int [] answer=new int[k];
        int index=0;

        for(int i=0;i<n;i++){
            while(index>0 && nums[i]<answer[index-1] && n-i+index-1>=k){
                index--;
            }
            if(index<k){
                answer[index++]=nums[i];
            }
        }

        return answer;
    }
}