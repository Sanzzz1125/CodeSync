class Solution {
    public int longestBalanced(String s) {
        int n = s.length();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) 
            a[i] = s.charAt(i) - 'a';

        int result = 0;
        for (int l = 0; l < n; l++) {
            if (n - l <= result) 
                break;

            int[] cnt = new int[26];
            int uniq = 0, maxfreq = 0;
            for (int r = l; r < n; r++) {
                int i = a[r];
                if (cnt[i] == 0) 
                    uniq++;

                cnt[i]++;
                if (cnt[i] > maxfreq) 
                    maxfreq = cnt[i];
                int cur = r - l + 1;
                if (uniq * maxfreq == cur && cur > result)
                    result = cur;
            }
        }
        return result;
    }
}