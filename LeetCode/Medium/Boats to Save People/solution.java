class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int start = 0, end = n-1;
        int cnt = 0;
        Arrays.sort(people);
        while(start<=end){
            if(people[start] + people[end] <= limit){
                start++;
            }
            cnt++;
            end--;
        }
        return cnt;


        // int n = nums.length;
        // int cnt = 0;
        // int find = 0;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(nums[j] <= find){
        //             if(nums[j]<find){
        //                 cnt++;
        //                 nums[j] = 0;
        //             }if(nums[j]==find){
        //                 cnt++;
        //                 nums[j] = 0;
        //             }
        //         }else if(nums[j]==0){
        //             continue;
        //         }else if(nums[j]==limit){
        //             cnt++;
        //             nums[j] = 0;
        //         }else if(nums[j]<limit){
        //             find = limit - nums[j];
        //             nums[j] = 0;
        //             break;
        //         }
        //     }
        // }
        // return cnt;
    }
}