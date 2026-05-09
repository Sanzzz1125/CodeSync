class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        int unique = 9;
        int avail = 9;
        int sum =10;
        if(n==0){
            sum = 1;
        }
        for(int i=1;i<n;i++){
            unique = unique*avail;
            sum+=unique;
            avail--;
        }
        return sum;
    }
}