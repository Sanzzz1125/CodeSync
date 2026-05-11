class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a' + 1;
            while (value > 0) {
                sum += value % 10;
                value /= 10;
            }
        }

        k--;
        int temp = sum;

        while (k > 0) {
            sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            temp = sum;
            k--;
        }

        return temp;
    }
}