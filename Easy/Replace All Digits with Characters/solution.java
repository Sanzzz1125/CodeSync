class Solution {
    public String replaceDigits(String s) {
        char[] arr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i);
        }
        for(int i=1;i<s.length();i+=2){
            int shift = arr[i] - '0';
            arr[i] = (char)(arr[i - 1] + shift);
        }
        return new String(arr);
    }
}