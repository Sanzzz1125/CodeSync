class Solution {
    public int reverse(int x) {
        long rev = 0;
        int temp = x;
        
        while(temp!=0){
            int rem = temp%10;
            rev = rev*10 + rem;
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0;
            }
            temp/=10;
        }
        
        return (int)rev;
    }
}