class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];

    for (int i = 0; i < s.length(); i++) {
        char a = s.charAt(i);
        char b = t.charAt(i);

        if (map1[a] == 0 && map2[b] == 0) {
            map1[a] = b;
            map2[b] = a;
        } else {
            if (map1[a] != b || map2[b] != a)
                return false;
        }
    }
    return true;
    }
}