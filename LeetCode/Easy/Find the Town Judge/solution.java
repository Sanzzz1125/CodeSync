class Solution {
    public int findJudge(int n, int[][] trust) {

        int[] in = new int[n + 1];
        int[] o = new int[n + 1];

        for(int[] t : trust){
            int a = t[0];
            int b = t[1];

            o[a]++;
            in[b]++;
        }

        for(int i = 1; i <= n; i++){
            if(in[i] == n - 1 && o[i] == 0){
                return i;
            }
        }

        return -1;
    }
}