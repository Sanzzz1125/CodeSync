class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);

        for(int i=2;i*i<=n;i+=1){
            if(primes[i]){
                for(int j=i*i;j<=n;j+=i){
                    primes[j] = false;
                }
            }
        }

        for(int i=2;i<=n/2;i+=1){
            if(primes[i] && primes[n-i]){
                List<Integer> curr = new ArrayList<Integer>();
                curr.add(i);
                curr.add(n-i);
                res.add(curr);
            }
        }
        
        return res;
    }
}