class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int hero1 = 0, hero2 = 0, cnt1 = 0, cnt2 = 0;
        int n = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(hero1==nums[i]){
                cnt1++;
            }else if(hero2==nums[i]){
                cnt2++;
            }else if(cnt1==0){
                hero1 = nums[i];
                cnt1++;
            }else if(cnt2==0){
                hero2=nums[i];
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(hero1==nums[i]) cnt1++;
            else if(hero2==nums[i]) cnt2++;
        }
        if(cnt1>n/3) res.add(hero1);
        if(cnt2>n/3) res.add(hero2);
        
        return res;
    }
}