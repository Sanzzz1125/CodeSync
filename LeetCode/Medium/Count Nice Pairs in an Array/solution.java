class Solution {
    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            rev=rev*10 + (n%10);
            n/=10;
        }
        return rev;
    }

    public int countNicePairs(int[] nums) {
        int MOD = 1_000_000_007;
        Map<Integer, Integer> map = new HashMap<>();
        long cnt = 0;

        for (int num : nums) {
            int key = num - reverse(num);
            int freq = map.getOrDefault(key, 0);
            cnt = (cnt + freq) % MOD;
            map.put(key, freq + 1);
        }
        return (int) cnt;
    }
}

// class Solution {
//     static int reverse(int n){
//         int rev = 0;
//         while(n!=0){
//             int rem = n%10;
//             rev = rev*10 + rem;
//             n/=10;
//         }
//         return rev;
//     }
//     public int countNicePairs(int[] nums) {
//         int n = nums.length;
//         int cnt = 0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(nums[i] + reverse(nums[j]) == nums[j] + reverse(nums[i])){
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }
// }