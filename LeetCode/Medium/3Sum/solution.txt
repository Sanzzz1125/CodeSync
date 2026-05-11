
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length-2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                } 
                else if (sum < 0) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return res;
    }
}



// class Solution {
//     public List<List<Integer>> threeSum(int[] nums) {
//         List<List<Integer>> res = new ArrayList<>();

//         Arrays.sort(nums);
//         for(int i=0;i<nums.length-2;i++){
//             if (i > 0 && nums[i] == nums[i - 1]) continue;
//             for(int j=i+1;j<nums.length-1;j++){
//                 if (j > i + 1 && nums[j] == nums[j - 1]) continue;
//                 for(int k=j+1;k<nums.length ;k++){
//                     if (k > j + 1 && nums[k] == nums[k - 1]) continue;
//                     if(nums[i]+nums[j]+nums[k] == 0){
//                         List<Integer> list = new ArrayList<>();
//                         list.add(nums[i]);
//                         list.add(nums[j]);
//                         list.add(nums[k]);
                        
//                         res.add(list);
//                     }
//                 }
//             }
//         }
//         return res;
//     }
// }