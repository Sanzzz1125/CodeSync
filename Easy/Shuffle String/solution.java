class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];
        for(int i=0;i<res.length;i++){
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);
        // String arr[] = s.split("");
        // String[] res = new String[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        //     res[indices[i]] = arr[i];
        // }
        // s="";
        // for(int i=0;i<arr.length;i++){
        //     s+=res[i];
        // }
        // return s;
    }
}