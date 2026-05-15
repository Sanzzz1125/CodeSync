class Solution {
    public String lexSmallestAfterDeletion(String s) {
        if(s.length() == 1) return s;

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 1; i++) {

            if (sb.charAt(i) > sb.charAt(i + 1)) {
                sb.deleteCharAt(i);
                return sb.toString();
            }
        }

        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}