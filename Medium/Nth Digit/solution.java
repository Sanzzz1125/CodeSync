class Solution {
    public int findNthDigit(int n) {
        long digitLen = 1;
        long count = 9;
        long start = 1;
        while (n > digitLen * count) {
            n -= digitLen * count;
            digitLen++;
            count *= 10;
            start *= 10;
        }
        long number = start + (n - 1) / digitLen;
        int index = (int)((n - 1) % digitLen);
        return String.valueOf(number).charAt(index) - '0';
    }
}
