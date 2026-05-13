class Solution {
    public long countPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long ans=0;

        for(int num : nums){
            int g = gcd(num,k);

            for(int prevGcd: map.keySet()){
                if(((long)g * prevGcd) % k == 0){
                    ans += map.get(prevGcd);
                }
            }
            map.put(g,(map.getOrDefault(g,0)+1));
        }

        return ans;
    }

    public int gcd(int a, int b){
         while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        return a;
    }
}